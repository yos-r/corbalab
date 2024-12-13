import CosEvents.*;
import org.omg.CORBA.*;

public class Supplier {
    public static void main(String[] args) {
        try {
            ORB orb = ORB.init(args, null);
            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

            PushConsumer consumer = PushConsumerHelper.narrow(ncRef.resolve_str("PushConsumer"));
            consumer.push("Événement généré par le Supplier");
            System.out.println("Événement envoyé au consommateur.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
