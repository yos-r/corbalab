package Banque;


/**
* Banque/CompteOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Banque.idl
* Monday, December 2, 2024 12:26:30 AM WAT
*/


// Interface Compte
public interface CompteOperations 
{
  int code ();
  double solde ();
  void depot (int montant);
  void retrait (int montant);
} // interface CompteOperations