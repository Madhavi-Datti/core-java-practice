package jdbc;
import java.sql.*;

public class ResultSetMetaData {

	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/employee_db";
		String uname = "root";
		String pass = "madhavi@08";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		java.sql.PreparedStatement ps = con.prepareStatement("select * from emp");
		
		//column data
		ResultSet rs=ps.executeQuery();  
		java.sql.ResultSetMetaData rsmd=rs.getMetaData();  
		  
		System.out.println("Total columns: "+rsmd.getColumnCount());  
		System.out.println("Column Name of 1st column: "+rsmd.getColumnName(1));  
		System.out.println("Column Type Name of 1st column: "+rsmd.getColumnTypeName(1));  

		//Database data
		DatabaseMetaData dbmd=con.getMetaData();  
		  
		System.out.println("Driver Name: "+dbmd.getDriverName());  
		System.out.println("Driver Version: "+dbmd.getDriverVersion());  
		System.out.println("UserName: "+dbmd.getUserName());  
		System.out.println("Database Product Name: "+dbmd.getDatabaseProductName());  
		System.out.println("Database Product Version: "+dbmd.getDatabaseProductVersion());  
		con.close();
		ps.close();
	}

}
