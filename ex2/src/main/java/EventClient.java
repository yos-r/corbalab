import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class EventClient {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            PushConsumer pushConsumer = (PushConsumer) registry.lookup("PushConsumer");
            PullConsumer pullConsumer = (PullConsumer) registry.lookup("PullConsumer");
            EventProducer producer = (EventProducer) registry.lookup("EventProducer");

            producer.sendEventPush("Événement via Push");
            
            producer.sendEventPull("Événement via Pull");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
