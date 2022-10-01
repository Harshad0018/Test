package DEMO1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class DEMO_JDCBC_Cone {
		public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException  {
			Connection conn = null;
			Statement stmt = null;			
		try{			
				String Username = "system";
				String password = "orcl";
				//Class.forName("com.mysql.cj.jdbc.Driver");
				
			    Class.forName("oracle.jdbc.driver.OracleDriver");
			    String url = "jdbc:oracle:thin:@localhost:3306:XE";
				//String url = "jdbc:mysql://127.0.0.1:5500/ORCL";						
				conn = DriverManager.getConnection(url,Username,password);
						stmt = conn.createStatement();			
						//String sql1 = "Create DATABASE practice"; 
			String sql = "CREATE TABLE input " +
	                   "(id INTEGER not NULL, " +
		                   " first VARCHAR(255), " + 
		                   " last VARCHAR(255), " + 
		                   " age INTEGER, " + 
		                   " PRIMARY KEY ( id ))"; 
				//stmt.execute(sql1);
				//System.out.println("Database has created..");
		         stmt.execute(sql);
		         System.out.println("Created table in given database..."); 
		     	conn.close();
			}
			catch(Exception ex)
			{ 
			System.out.println("SQLException: "+ex.getMessage());
			System.out.println("SQLState: "+((SQLException) ex).getSQLState());
			System.out.println("VendorError: "+((SQLException) ex).getErrorCode());
			}
		
		}
}
		