package assistedprojects;

//demo 
public class Method_demo {
		int Calculate_Area(int l, int b) {
			return l*b;
		}
	public static void main(String[] args) {
		Method_demo obj = new Method_demo();
		int Square=obj.Calculate_Area(30,20);
		System.out.println("Area of the square is calculated as = "+Square);
		 
		
	}

}
