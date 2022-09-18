package Sample;
import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet; 
import java.sql.SQLException; 
import java.sql.Statement;
import java.util.Scanner;

public class Assisgnment {
	public static int count=0;
	 private static final String url = "jdbc:mysql://localhost:3306/db_world";
	    private static final String user = "root";
	    private static final String password = "root";
	    
	    Connection con;
	    PreparedStatement prSt;
	    Statement stmt;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Assisgnment pse = new Assisgnment();
Scanner input = new Scanner(System.in);
    	
        System.out.println("=============PREPARED STATEMENT MENU=================");
        System.out.println("1. Insert the new employee Record"); 
        System.out.println("2. Update the employee Record");
        System.out.println("3. Delete the employee Record");
        System.out.println("====================================================");
    	System.out.println("Enter your choice from (1-3): ");
    	int number = input.nextInt();
    	System.out.println("You entered option" + number);
    	switch(number)
    	{
    	case 1: pse.insertPSRecord();
    			
    	        break;
    	
    	case 2: pse.updatePSRecord();
    	        break;
    	        
    	case 3: pse.deletePSRecord();
    			
    	        break;
    	}	
	}

public void insertPSRecord()
{  
	String query = "insert into student(studentid,studentname,age) values(?,?,?)";
	
      try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
           
            prSt = con.prepareStatement(query);
            
            // Take user input for insertion
            Scanner input = new Scanner(System.in);	
            
            System.out.print("Enter the studentid:  ");
            int eid = input.nextInt();
            System.out.println();
            
            System.out.print("Enter the student age:  ");
            int esal = input.nextInt();
            System.out.println();
            
            System.out.print("Enter the student name:  ");
            String ename = input.next();
            System.out.println();
            
            prSt.setInt(1, eid);
            prSt.setString(2, ename);
            prSt.setInt(3, esal);
            
            int count = prSt.executeUpdate();
            
            //show the number of records
            stmt = con.createStatement();
            
            String query1 = "select * from student";
            ResultSet rs =  stmt.executeQuery(query1);
            System.out.println("Id    Name    Age");
            
            while (rs.next()) {
            	count++;
               int id = rs.getInt("studentid");
               String name = rs.getString("studentname");
               String sal = rs.getString("age");
               System.out.println(id + "    " + name+"    "+sal);
            }    
            System.out.println(count-1+" row are in set");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally{
            try{
                if(prSt != null) prSt.close();
                if(con != null) con.close();
            } catch(Exception ex){}
        }
}

public void updatePSRecord()
{ 
	String sqlUpdate = "UPDATE student SET age = ? WHERE studentid = ?";
	
	try {
        try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
        prSt = con.prepareStatement(sqlUpdate);
        
        // Take user input for insertion
        Scanner input = new Scanner(System.in);	
        
        System.out.print("Enter the studentid:  ");
        int eid = input.nextInt();
        System.out.println();
        
        System.out.print("Enter the student Age:  ");
        int esal = input.nextInt();
        System.out.println();
        
        prSt.setInt(1, esal);
        prSt.setInt(2, eid);

        int rowAffected = prSt.executeUpdate();
        System.out.println(String.format("Row affected %d", rowAffected));  
	}
	catch (SQLException ex) {
        System.out.println(ex.getMessage());
    }		

}
public void deletePSRecord()
{ 
	String sqlUpdate = "DELETE from student where studentid=?";
	
	try {
        try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
        prSt = con.prepareStatement(sqlUpdate);
        
        // Take user input for insertion
        Scanner input = new Scanner(System.in);	
        
        System.out.print("Enter the studentid:  ");
        int eid = input.nextInt();
        System.out.println();
        
        prSt.setInt(1, eid);
        prSt.executeUpdate();  
        
        System.out.println("Record deleted successfully");
     
	}
	catch (SQLException ex) {
        System.out.println(ex.getMessage());
    }				
}

}