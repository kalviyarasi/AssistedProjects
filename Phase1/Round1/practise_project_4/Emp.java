package assistedprojects;

public class Emp {
	int empid;	
	String emp_name;
	
	Emp(int id, String name){
		empid=id;
		emp_name=name;
	}
	void display() {
		System.out.println(empid+" "+emp_name);
	}

}
