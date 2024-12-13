package jdbc;
import javax.sql.rowset.*;
public class RowSet {
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();  
        rowSet.setUrl("jdbc:mysql://localhost:3306/employee_db");  
        rowSet.setUsername("root");  
        rowSet.setPassword("madhavi@08");                 
        rowSet.setCommand("select * from emp where eno = 1");  
        rowSet.execute();                  
    while (rowSet.next()) {   
                        System.out.println("eNo: " + rowSet.getInt(1));  
                        System.out.println("eName: " + rowSet.getString(2));    
                }  
                 
        }  

	}
