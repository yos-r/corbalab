import java.rmi.Remote;
import java.rmi.RemoteException;

public interface PullConsumer extends Remote {
    void pull(String message) throws RemoteException;

    void disconnect_pull_consumer() throws RemoteException;
}
