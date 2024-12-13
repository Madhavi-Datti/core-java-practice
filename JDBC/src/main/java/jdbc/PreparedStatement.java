package jdbc;
import java.sql.*;
import java.util.Scanner;
public class PreparedStatement
{
	public static void main(String[] args) throws Exception 
	{
		String url = "jdbc:mysql://localhost:3306/employee_db";
		String uname = "root";
		String pass = "madhavi@08";
		String query = "insert into emp values(?,?)";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		java.sql.PreparedStatement ps = con.prepareStatement(query);
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter eno");
			int eno = sc.nextInt();
			System.out.println("Enter ename");
			String ename = sc.next();
			ps.setInt(1, eno);
			ps.setString(2, ename);
			ps.executeUpdate();
			System.out.println("Records added succesully");
			System.out.println("want to insert more?[yes/no]");
			String option = sc.next();
			if(option.equalsIgnoreCase("no"))
			{
				break;
			}

	}
		con.close();
		ps.close();
		sc.close();	

}
}

