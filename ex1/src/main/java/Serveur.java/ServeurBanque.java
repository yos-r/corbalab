import Banque.*;
import org.omg.CORBA.*;
package Serveur;
public class ServeurBanque {
    public static void main(String[] args) {
        try {
            ORB orb = ORB.init(args, null);
            POA rootpoa = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
            rootpoa.the_POAManager().activate();

            CompteImpl compteImpl = new CompteImpl();
            org.omg.CORBA.Object ref = rootpoa.servant_to_reference(compteImpl);
            Banque.Compte href = CompteHelper.narrow(ref);

            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);
            ncRef.rebind(ncRef.to_name("Compte"), href);

            System.out.println("Serveur prêt...");
            orb.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
