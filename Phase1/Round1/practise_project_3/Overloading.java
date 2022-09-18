package assistedprojects;

//overloading method
public class Overloading {
	public void Area(int a) {
		System.out.println("Area of square is caluclated as="+ (a*a));
	}
	public void Area(int l, int b) {
		System.out.println("Area of the rectangle ="+(l*b));
	}
	public static void main(String[] args) {
		Overloading a= new Overloading();
		a.Area(20);
		a.Area(10,30);
		
	}

}
