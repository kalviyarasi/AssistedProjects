package assistedprojects;

public class TypeCasting {
	public static void main(String[] args) {
		
		//Implicit type casting, conversion of smaller data type into larger data type size
		System.out.println("Implicit type casting");
		char a='K';
		System.out.println("The value of a= "+a);
		int b=a;
		System.out.println("The value of b= "+b);
		float c=a;
		System.out.println("The value of c= "+c);
		long d=a;
		System.out.println("The value of d= "+d);
		double e=a;
		System.out.println("The value of e= "+e);
		
		//Narrowing or Explicit type casting, conversion of larger to smaller data type
		System.out.println("Explicit type casting");
		double f=65.53;
		int g=(int)f;  //double to integer
		System.out.println("The value of f= "+f);
		System.out.println("The value of g= "+g);
		char h=(char)f; // double to char
		System.out.println("The value of h= "+h);
	}

}
