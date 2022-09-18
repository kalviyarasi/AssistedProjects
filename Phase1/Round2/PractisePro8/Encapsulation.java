package round2_assisted_pro;

//encapsulation using getters and setters
class Librarian{
	private int lid;
	private String lname,lemail;
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getLemail() {
		return lemail;
	}
	public void setLemail(String lemail) {
		this.lemail = lemail;
	}
	@Override
	public String toString() {
		return "Librarian details = "+lid+","+lname+","+lemail;
	}
}

public class Encapsulation {
	public static void main(String[] args) {
		Librarian obj=new Librarian();
		obj.setLid(1);
		obj.setLname("Sowmiya");
		obj.setLemail("sowmiya6@gmail.com");
		System.out.println(obj);
			
		Librarian obj1=new Librarian();
		obj1.setLid(7);
		obj1.setLname("Reshma");
		obj1.setLemail("resh6@gmail.com");
		System.out.println(obj1);
	}

}
