package jdbc;
import java.sql.*;

public class JDBC {

	public static void main(String[] args) throws Exception{
		String url = "jdbc:mysql://localhost:3306/employee_db";
		String uname = "root";
		String pass = "madhavi@08";
		String query = "select*from employee1 ";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getFloat(3)+" "+rs.getInt(4));
		}
		rs.close();
		st.close();
		con.close();

	}

}
