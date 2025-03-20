package jdbcprogs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class SelectUsingPreparedStatement {

	public static void main(String[] args) throws Exception
	{
		Connection con=MySQLConnectionITP.getConnection();
		//accept eno and display name and salary of that emp
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Emp No");
		int a=sc.nextInt();
		
		String query="select ename,sal from emp where eno=?";
		
		PreparedStatement ps=con.prepareStatement(query);
		
		ps.setInt(1, a);
		
		ResultSet rs=ps.executeQuery();
		
		System.out.println(String.format("%-15s", "Employee Name") + String.format("%-15s", "Employee Salary"));
		if(rs.next())
			System.out.println(String.format("%-15s", rs.getString("ename")) + String.format("%-15s", rs.getDouble("sal")));
		
		
		ps.close();
		con.close();
		
		
	}

}
