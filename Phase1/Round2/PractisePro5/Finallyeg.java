package round2_assisted_pro;



public class Finallyeg {
	public static void main(String[] args) {
		
		int A[]= {1,2,3,4,5};
		try {
			A[9]=6;
			System.out.println("your array insertion is sucessful");
		}
		catch(Exception e) {
			throw e;
		}
		finally{
			System.out.println("your operation has been completed");
		}
	}

}
