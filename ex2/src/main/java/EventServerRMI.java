import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class EventServerRMI {
    public static void main(String[] args) {
        try {
            PushConsumerImpl pushConsumer = new PushConsumerImpl();
            PullConsumerImpl pullConsumer = new PullConsumerImpl();

            // Créer le producteur et lier les consommateurs
            EventProducer producer = new EventProducer(pushConsumer, pullConsumer);

            // Créer un registre RMI et enregistrer les objets
            Registry registry = LocateRegistry.createRegistry(1099);

            // Enregistrer les objets dans le registre RMI
            registry.rebind("PushConsumer", pushConsumer);
            registry.rebind("PullConsumer", pullConsumer);
            registry.rebind("EventProducer", producer);

            System.out.println("Serveur RMI prêt...");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
