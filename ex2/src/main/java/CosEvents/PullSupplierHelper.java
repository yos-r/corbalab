package CosEvents;


/**
* CosEvents/PullSupplierHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
<<<<<<< HEAD:src/main/java/CosEvents/PullSupplierHelper.java
* from CosEvents.idl
* Friday, December 13, 2024 11:26:10 AM WAT
=======
* from Banque.idl
* Friday, December 13, 2024 10:43:05 AM WAT
>>>>>>> a241886f8fd13735066abd48ffa06efa570d4040:src/main/java/Banque/CompteHelper.java
*/

abstract public class PullSupplierHelper
{
  private static String  _id = "IDL:CosEvents/PullSupplier:1.0";

  public static void insert (org.omg.CORBA.Any a, CosEvents.PullSupplier that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static CosEvents.PullSupplier extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (CosEvents.PullSupplierHelper.id (), "PullSupplier");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static CosEvents.PullSupplier read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_PullSupplierStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, CosEvents.PullSupplier value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static CosEvents.PullSupplier narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof CosEvents.PullSupplier)
      return (CosEvents.PullSupplier)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      CosEvents._PullSupplierStub stub = new CosEvents._PullSupplierStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static CosEvents.PullSupplier unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof CosEvents.PullSupplier)
      return (CosEvents.PullSupplier)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      CosEvents._PullSupplierStub stub = new CosEvents._PullSupplierStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
