package round2_assisted_pro;

//implementaion of multilevel inheritance
class Parent1{
	int a=10,b=20;
	void add(){
		System.out.println("addition result= "+(a+b));
	}	
}
class Child1 extends Parent1{
	int c=30,d=40;
	int f=a-b;
	void sub() {
		System.out.println("subtraction result="+f);
	}	
}

class Child2 extends Child1{
	int g=c*d;
	void mul() {
		System.out.println("print values of c*d= "+g);
	}	
}

public class Inheritance {
	public static void main(String[] args) {
		Child2 obj1 =new Child2();
		//Child1 obj2=new Child1();
		//Parent1 obj3=new Parent1();
		obj1.mul();
		obj1.sub();
		obj1.add();
	}

}
