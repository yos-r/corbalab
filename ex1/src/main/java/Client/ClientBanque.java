import Banque.*;
import org.omg.CORBA.*;

public class ClientBanque {
    public static void main(String[] args) {
        try {
            ORB orb = ORB.init(args, null);
            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

            Compte compte = CompteHelper.narrow(ncRef.resolve_str("Compte"));
            compte.depot(500);
            System.out.println("Solde après dépôt : " + compte.solde());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
