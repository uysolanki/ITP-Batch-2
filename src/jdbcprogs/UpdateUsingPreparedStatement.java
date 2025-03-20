package jdbcprogs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateUsingPreparedStatement {

	public static void main(String[] args) throws Exception
	{
		Connection con=MySQLConnectionITP.getConnection();
		//accept eno and increment amount from user add the increase that emp salary by the increment amount
		//eno 1  increment 1000
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Emp No");
		int a=sc.nextInt();
		
		System.out.println("Enter Increment Salary");
		double b=sc.nextDouble();
		
		String query="update emp set sal=sal+? where eno=?";
		
		PreparedStatement ps=con.prepareStatement(query);
		
		ps.setDouble(1, b);
		ps.setInt(2, a);
		
		
		int rows=ps.executeUpdate();					//  1   1   1   1   1
		if(rows>0)
			System.out.println(rows +" Records Updated");
		else
			System.out.println("Record Not Updated");
		
		ps.close();
		con.close();
		
		
	}

}
