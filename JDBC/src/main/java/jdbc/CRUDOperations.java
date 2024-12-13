package jdbc;

import java.sql.*;


   //Data Create Operation
//public class CRUDOperations {
//	public static void main(String[] args) throws Exception {
//			String url = "jdbc:mysql://localhost:3306/employee_db";
//			String uname = "root";
//			String pass = "madhavi@08";
//			String query = "create table Emp(eno int, ename varchar(10))";
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection con = DriverManager.getConnection(url,uname,pass);
//			Statement st = con.createStatement();
//			int rowsAffected = st.executeUpdate(query);
//			if(rowsAffected>0)
//			{
//				System.out.println("table created");
//			}
//			else
//			{
//				System.out.println("table not created");
//			}
//
//			st.close();
//			con.close();
//
//		}
//}
    

  //Data Insert Operation
//public class CRUDOperations {
//public static void main(String[] args) throws Exception {
//		String url = "jdbc:mysql://localhost:3306/employee_db";
//		String uname = "root";
//		String pass = "madhavi@08";
//		String query = "Insert into Emp(eno,ename) values(1, 'chitti')";
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection con = DriverManager.getConnection(url,uname,pass);
//		Statement st = con.createStatement();
//		int rowsAffected = st.executeUpdate(query);
//		if(rowsAffected>0)
//		{
//			System.out.println("data added");
//		}
//		else
//		{
//			System.out.println("data not added");
//		}
//
//		st.close();
//		con.close();
//
//	}
//}

   //Data Delete Operation
//public class CRUDOperations {
//public static void main(String[] args) throws Exception {
//		String url = "jdbc:mysql://localhost:3306/employee_db";
//		String uname = "root";
//		String pass = "madhavi@08";
//		String query = "delete from emp where eno=1";
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection con = DriverManager.getConnection(url,uname,pass);
//		Statement st = con.createStatement();
//		int rowsAffected = st.executeUpdate(query);
//		if(rowsAffected>0)
//		{
//			System.out.println("data deleted");
//		}
//		else
//		{
//			System.out.println("data not deleted");
//		}
//
//		st.close();
//		con.close();
//
//	}
//}

  //Data Update Operation
//public class CRUDOperations {
//public static void main(String[] args) throws Exception {
//		String url = "jdbc:mysql://localhost:3306/employee_db";
//		String uname = "root";
//		String pass = "madhavi@08";
//		String query = "update emp set ename ='madhavi' where eno=1";
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection con = DriverManager.getConnection(url,uname,pass);
//		Statement st = con.createStatement();
//		int rowsAffected = st.executeUpdate(query);
//		if(rowsAffected>0)
//		{
//			System.out.println("data updated");
//		}
//		else
//		{
//			System.out.println("data not updated");
//		}
//
//		st.close();
//		con.close();
//
//	}
//}


    //Data Read Operation
//public class CRUDOperations {
//public static void main(String[] args) throws Exception{
//	String url = "jdbc:mysql://localhost:3306/employee_db";
//	String uname = "root";
//	String pass = "madhavi@08";
//	String query = "select*from Emp ";
//	Class.forName("com.mysql.cj.jdbc.Driver");
//	Connection con = DriverManager.getConnection(url,uname,pass);
//	Statement st = con.createStatement();
//	ResultSet rs = st.executeQuery(query);
//	while(rs.next())
//	{
//		System.out.println(rs.getInt(1)+" "+rs.getString(2));
//	}
//	rs.close();
//	st.close();
//	con.close();
//
//}
//
//}
