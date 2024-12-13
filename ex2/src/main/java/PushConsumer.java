import java.rmi.Remote;
import java.rmi.RemoteException;

public interface PushConsumer extends Remote {
    // Méthode pour recevoir un message
    void push(String message) throws RemoteException;

    // Méthode pour se déconnecter du consommateur
    void disconnect_push_consumer() throws RemoteException;
}
