package CosEvents;
import org.omg.CORBA.*;
import java.lang.*;
import org.omg.PortableServer.*;
// Démarrer une POA CORBA sans bloquer
le thread du serveur
public class Orb_Run extends Thread {
public ORB orb_;
public Orb_Run(ORB o) {
orb_=o;
}
public void run() {
orb_.run();
}}