package Sample;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
public class AuthorAndBook {
	static String url = "jdbc:mysql://localhost:3306/db_world";
    static String user = "root";
    static String password = "root";
    static String sql = "{procedure update_price(?,?,?)}";
    private static Connection con;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
	    	  
	    	  //STEP 2: Register JDBC driver
		      try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

		      //STEP 3: Open a connection
		      System.out.println("Connecting to database...");
		      con = DriverManager.getConnection(url, user, password);
		      
		      CallableStatement stmt=con.prepareCall(sql);
	         
	         //Set IN parameter
	         stmt.setInt(1, 2);  
	         
	         
	         stmt.setInt(2, 4); 
	         
	         //Set INOUT parameter
	         stmt.setDouble(3, 700);
	         stmt.registerOutParameter(3, Types.INTEGER);
	         stmt.registerOutParameter(2, Types.VARCHAR);
	         //Execute stored procedure
	         stmt.execute();
	         
	         // Get Out and InOut parameters
	         System.out.println("Product Name = "+stmt.getString(2));
	         System.out.println("Product Old Price = "+stmt.getDouble(3));
	         
	      } catch (SQLException e) {
	         e.printStackTrace();
	         e.getErrorCode();
	      }
	   }
	}
