package assistedprojects;

public class CallbyValue {
	int a=58;
	int Subtract(int a) {
		a= a-5;
		System.out.println(a);
		return a;
	}
	public static void main(String[] args) {
		CallbyValue obj= new CallbyValue();
		System.out.println("Before performing subtraction"+" " +obj.a);
		obj.Subtract(55);
		System.out.println("After performing subtraction"+" " +obj.a);
		
	}

}
