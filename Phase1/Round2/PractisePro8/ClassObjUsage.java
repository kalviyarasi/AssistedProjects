package round2_assisted_pro;

//usage of class and object
class StudentRecord{
	int sid;
	String sname;
	StudentRecord(int sid,String name){
		this.sid=sid;
		sname=name;
		
	}
	void display() {
		System.out.println("student data found to be = "+sid+","+sname);
	}
	
}	
public class ClassObjUsage {
	
	
	public static void main(String[] args) {
		StudentRecord obj1=new StudentRecord(1,"swe");
	    StudentRecord obj2=new StudentRecord(2,"resh");
		obj1.display();
		obj2.display();
	}
}
