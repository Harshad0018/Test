package DEMO1;
import java.sql.*;
public class CreateTable {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException   {
		Connection con = null;
		Statement stm = null;
		try{
			String Username = "system";
			String password = "orcl";
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			String url = "jdbc:mysql://localhost:3306/practice";
			con = DriverManager.getConnection(url,Username,password);
					stm= con.createStatement();
		String sql = "Update COURSE set duration = 5 where Name = 'Harshad'";
 
			       stm.execute(sql);
	         System.out.println("Updated from Course table "); 
		}
		catch(SQLException ex)
		{
		System.out.println("SQLException: "+ex.getMessage());
		System.out.println("SQLState: "+ex.getSQLState());
		System.out.println("VendorError: "+ex.getErrorCode());
		}	
	}
	}