package CosEvents;

/**
* CosEvents/PullSupplierHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosEvents.idl
* Friday, December 13, 2024 11:26:10 AM WAT
*/

public final class PullSupplierHolder implements org.omg.CORBA.portable.Streamable
{
  public CosEvents.PullSupplier value = null;

  public PullSupplierHolder ()
  {
  }

  public PullSupplierHolder (CosEvents.PullSupplier initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosEvents.PullSupplierHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosEvents.PullSupplierHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosEvents.PullSupplierHelper.type ();
  }

}