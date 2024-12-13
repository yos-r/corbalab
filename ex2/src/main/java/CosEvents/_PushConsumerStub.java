package CosEvents;


/**
* CosEvents/_PushConsumerStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
<<<<<<< HEAD:src/main/java/CosEvents/_PushConsumerStub.java
* from CosEvents.idl
* Friday, December 13, 2024 11:26:10 AM WAT
=======
* from Banque.idl
* Friday, December 13, 2024 10:43:05 AM WAT
>>>>>>> a241886f8fd13735066abd48ffa06efa570d4040:src/main/java/Banque/_CompteStub.java
*/

public class _PushConsumerStub extends org.omg.CORBA.portable.ObjectImpl implements CosEvents.PushConsumer
{

  public void push (String message)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("push", true);
                $out.write_string (message);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                push (message        );
            } finally {
                _releaseReply ($in);
            }
  } // push

  public void disconnect_push_consumer ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("disconnect_push_consumer", true);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                disconnect_push_consumer (        );
            } finally {
                _releaseReply ($in);
            }
  } // disconnect_push_consumer

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:CosEvents/PushConsumer:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _PushConsumerStub
