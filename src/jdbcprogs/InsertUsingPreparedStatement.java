package jdbcprogs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class InsertUsingPreparedStatement {

	public static void main(String[] args) throws Exception
	{
		Connection con=MySQLConnectionITP.getConnection();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Emp No");
		int a=sc.nextInt();
		
		System.out.println("Enter Emp Name");
		String b=sc.next();
		
		System.out.println("Enter Emp Salary");
		double c=sc.nextDouble();
		
		String query="insert into emp values(?,?,?)";
		
		PreparedStatement ps=con.prepareStatement(query);
		
		ps.setInt(1, a);
		ps.setString(2, b);
		ps.setDouble(3, c);
		
		int rows=ps.executeUpdate();					//  1   1   1   1   1
		if(rows>0)
			System.out.println(rows +" Records Inserted");
		else
			System.out.println("Record Not Inserted");
		
		ps.close();
		con.close();
		
		
	}

}
