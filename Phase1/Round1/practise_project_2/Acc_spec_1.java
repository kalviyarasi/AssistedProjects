package assistedprojects;

//1.default access specifier 
class Default_Acc_Spec{
	void display() {
		System.out.println("This comes under default access specifier");
	}
}
public class Acc_spec_1 {
	public static void main(String[] args) {
		Default_Acc_Spec obj1 = new Default_Acc_Spec();
		obj1.display();
	}
}


