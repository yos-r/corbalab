import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import CosEvents.*;

public class EventBridge extends UnicastRemoteObject implements PushConsumer {
    private PushConsumer corbaConsumer;

    public EventBridge(PushConsumer corbaConsumer) throws RemoteException {
        this.corbaConsumer = corbaConsumer;
    }

    @Override
    public void push(String message) throws RemoteException {
        try {
            // Appel à la méthode CORBA pour envoyer l'événement
            corbaConsumer.push(message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void disconnect_push_consumer() throws RemoteException {
        try {
            corbaConsumer.disconnect_push_consumer();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            // Connexion au serveur CORBA pour obtenir le consommateur
            org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init(args, null);
            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
            CosNaming.NamingContextExt ncRef = CosNaming.NamingContextExtHelper.narrow(objRef);
            PushConsumer corbaConsumer = PushConsumerHelper.narrow(ncRef.resolve_str("PushConsumer"));

            // Création du pont RMI pour relier RMI et CORBA
            EventBridge bridge = new EventBridge(corbaConsumer);

            // Enregistrement du pont dans le registre RMI
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("EventBridge", bridge);

            System.out.println("Serveur RMI prêt...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
