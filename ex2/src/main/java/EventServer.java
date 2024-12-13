import CosEvents.*;
import org.omg.CORBA.*;
import org.omg.PortableServer.*;

public class EventServer {
    public static void main(String[] args) {
        try {
            // Initialisation de l'ORB
            ORB orb = ORB.init(args, null);
            POA rootpoa = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
            rootpoa.the_POAManager().activate();

            // Implémentation du consommateur
            PushConsumerImpl pushConsumer = new PushConsumerImpl();
            org.omg.CORBA.Object ref = rootpoa.servant_to_reference(pushConsumer);
            PushConsumer pushConsumerRef = PushConsumerHelper.narrow(ref);

            // Enregistrement du consommateur dans le Naming Service
            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);
            ncRef.rebind(ncRef.to_name("PushConsumer"), pushConsumerRef);

            System.out.println("Serveur CORBA prêt...");

            // Lancer l'ORB
            orb.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
