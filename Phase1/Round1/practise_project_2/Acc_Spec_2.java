package assistedprojects;

//2.private access specifier
class Private_Acc_Spec{
	private void display() {
		System.out.println("This comes under Private access specifier");
	}
}
public class Acc_Spec_2 {
	public static void main(String[] args) {
		System.out.println("This is Private access specifier");
		Private_Acc_Spec obj= new Private_Acc_Spec();
		
		
	}

}
