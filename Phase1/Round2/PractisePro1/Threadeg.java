package round2_assisted_pro;

public class Threadeg extends Thread{
	public void run()
 	{
  		System.out.println("concurrent thread started running..");
}

	public static void main( String args[] )
 	{
  		Threadeg mt = new Threadeg();
  		mt.start();
 	}


}
