package Banque;


/**
* Banque/ConseillerOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Banque.idl
* Friday, December 13, 2024 10:43:05 AM WAT
*/


// Interface Conseiller
public interface ConseillerOperations 
{
  Banque.Compte newCompte (int code);
  Banque.Compte getCompte (int code);
  void virement (Banque.Compte source, Banque.Compte cible, int montant);
} // interface ConseillerOperations
