package CosEvents;


/**
* CosEvents/PullSupplierPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CosEvents.idl
* Friday, December 13, 2024 11:26:10 AM WAT
*/

public abstract class PullSupplierPOA extends org.omg.PortableServer.Servant
 implements CosEvents.PullSupplierOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("pull", new java.lang.Integer (0));
    _methods.put ("disconnect_pull_supplier", new java.lang.Integer (1));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // CosEvents/PullSupplier/pull
       {
         org.omg.CORBA.StringHolder message = new org.omg.CORBA.StringHolder ();
         message.value = in.read_string ();
         this.pull (message);
         out = $rh.createReply();
         out.write_string (message.value);
         break;
       }

       case 1:  // CosEvents/PullSupplier/disconnect_pull_supplier
       {
         this.disconnect_pull_supplier ();
         out = $rh.createReply();
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:CosEvents/PullSupplier:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public PullSupplier _this() 
  {
    return PullSupplierHelper.narrow(
    super._this_object());
  }

  public PullSupplier _this(org.omg.CORBA.ORB orb) 
  {
    return PullSupplierHelper.narrow(
    super._this_object(orb));
  }


} // class PullSupplierPOA
