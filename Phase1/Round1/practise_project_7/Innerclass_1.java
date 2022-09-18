package assistedprojects;

public class Innerclass_1 {
	private String msg="hello"; 
	 
	 class Inner{  
	  void hello(){System.out.println(msg+", this program is related to inner cls");}  
	 }  


	public static void main(String[] args) {

		Innerclass_1 obj=new Innerclass_1();
		Innerclass_1.Inner in=obj.new Inner();  
		in.hello();  
	}


}
