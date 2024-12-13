import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class PushConsumerImpl extends UnicastRemoteObject implements PushConsumer {

    public PushConsumerImpl() throws RemoteException {}

    @Override
    public void push(String message) throws RemoteException {
        System.out.println("Message reçu via Push : " + message);
    }

    @Override
    public void disconnect_push_consumer() throws RemoteException {
        System.out.println("Déconnexion du consommateur Push.");
    }
}
