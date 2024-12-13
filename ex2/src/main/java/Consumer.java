import CosEvents.*;
import org.omg.CORBA.*;

public class Consumer extends PushConsumerPOA {
    @Override
    public void push(String message) {
        System.out.println("Message reçu : " + message);
    }

    @Override
    public void disconnect_push_consumer() {
        System.out.println("Déconnexion du consommateur.");
    }

    public static void main(String[] args) {
        try {
            ORB orb = ORB.init(args, null);
            POA rootpoa = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
            rootpoa.the_POAManager().activate();

            Consumer consumer = new Consumer();
            org.omg.CORBA.Object ref = rootpoa.servant_to_reference(consumer);
            PushConsumer href = PushConsumerHelper.narrow(ref);

            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);
            ncRef.rebind(ncRef.to_name("PushConsumer"), href);

            System.out.println("Consommateur prêt à recevoir les messages.");
            orb.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
