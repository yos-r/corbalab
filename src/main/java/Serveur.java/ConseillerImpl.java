import Banque.*;
import org.omg.CORBA.*;
import org.omg.CosNaming.*;
import org.omg.PortableServer.*;

public class ConseillerImpl extends ConseillerPOA {

    @Override
    public Compte newCompte(long code) {
        return new CompteImpl(code);
    }

    @Override
    public Compte getCompte(long code) {
        return new CompteImpl(code);
    }

    @Override
    public void virement(Compte source, Compte cible, long montant) {
        source.retrait(montant);
        cible.depot(montant);
    }
}

