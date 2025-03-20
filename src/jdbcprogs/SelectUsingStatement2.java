package jdbcprogs;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectUsingStatement2 {

	public static void main(String[] args) throws Exception
	{
		Connection con=MySQLConnectionITP.getConnection();
		//display name and salary of emps having sal>=1000
		
		String query="select ename,sal from emp where sal>=1000";
		//String query="select sal,ename from emp where eno=8";
		
		Statement st=con.createStatement();
		
		ResultSet rs=st.executeQuery(query);
		System.out.println(String.format("%-15s", "Employee Name") + String.format("%-15s", "Employee Salary"));
		while(rs.next())
			System.out.println(String.format("%-15s", rs.getString("ename")) + String.format("%-15s", rs.getDouble("sal")));
		
		st.close();
		con.close();
		
	}

}
