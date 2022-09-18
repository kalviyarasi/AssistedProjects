package assistedprojects;

public class Innercls_2 {
	private String msg="Welcome";

	 void display(){  
		 class Inner{  
			 void msg(){
				 System.out.println(msg);
			 }  
	  }  
	  
	  Inner l=new Inner();  
	  l.msg();  
	 }  	 
	public static void main(String[] args) {
		Innercls_2  a=new Innercls_2 ();  
		a.display();  
		}


}
