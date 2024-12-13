// package Client;

import Banque.*;
import org.omg.CORBA.*;
import org.omg.CosNaming.*;
public class CORBAClient {
    public static void main(String[] args) {
        try {
            // Initialisation de l'ORB
            ORB orb = ORB.init(args, null);

            // Récupération du service de nommage
            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

            // Résolution de l'objet "Conseiller"
            NameComponent[] path = ncRef.to_name("Conseiller");
            Conseiller conseiller = ConseillerHelper.narrow(ncRef.resolve(path));

            // Utilisation de l'objet Conseiller
            Compte compte = conseiller.newCompte(12345);
            System.out.println("Compte créé avec le code: " + compte.code());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
