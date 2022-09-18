package assistedprojects;

//default constructor
class Emp_detail{
	int empid,salary;
	String emp_name,email;
	void display() {
		System.out.println(empid+" "+emp_name+" "+email+" "+salary);
	}
}
public class DefConstructor {
	public static void main (String[] args) {
		Emp_detail obj1 = new Emp_detail();
		Emp_detail obj2 = new Emp_detail();
		
		obj1.display();
		obj2.display();
	}
}
