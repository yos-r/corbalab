import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class PullConsumerImpl extends UnicastRemoteObject implements PullConsumer {

    public PullConsumerImpl() throws RemoteException {}

    @Override
    public void pull(String message) throws RemoteException {
        System.out.println("Message récupéré via Pull : " + message);
    }

    @Override
    public void disconnect_pull_consumer() throws RemoteException {
        System.out.println("Déconnexion du consommateur Pull.");
    }
}
