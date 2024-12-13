import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class EventClientRMI {
    public static void main(String[] args) {
        try {
            // Connexion au registre RMI
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            PushConsumer bridge = (PushConsumer) registry.lookup("EventBridge");

            // Envoi de l'événement
            bridge.push("Événement envoyé via RMI au serveur CORBA");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
