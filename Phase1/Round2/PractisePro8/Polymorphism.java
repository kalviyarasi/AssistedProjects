package round2_assisted_pro;

//overloading
class Operation{
	void mul(int a,int b) {
		System.out.println("mul of a and b= "+(a*b));
	}
	void mul(int a,int b, int c) {
		System.out.println("mul of a, b and c= "+(a*b*c));
	}
	void mul(char a,char b) {
		System.out.println("enterd char is "+a+b);
	}
}

public class Polymorphism {
public static void main(String[] args) {
	Operation obj1=new Operation();
	obj1.mul(2,3);
	obj1.mul(1,2,3);
	obj1.mul('h','i');
}
}
