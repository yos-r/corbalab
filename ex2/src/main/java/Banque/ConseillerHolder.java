package Banque;

/**
* Banque/ConseillerHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Banque.idl
* Friday, December 13, 2024 10:43:05 AM WAT
*/


// Interface Conseiller
public final class ConseillerHolder implements org.omg.CORBA.portable.Streamable
{
  public Banque.Conseiller value = null;

  public ConseillerHolder ()
  {
  }

  public ConseillerHolder (Banque.Conseiller initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = Banque.ConseillerHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    Banque.ConseillerHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return Banque.ConseillerHelper.type ();
  }

}
