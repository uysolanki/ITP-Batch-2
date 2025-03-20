package jdbcprogs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteUsingPreparedStatement {

	public static void main(String[] args) throws Exception
	{
		//accept the employee number and delete the record
		Connection con=MySQLConnectionITP.getConnection();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Emp No");
		int a=sc.nextInt();
		
		
		String query="delete from emp where eno=?";
		
		PreparedStatement ps=con.prepareStatement(query);
		
		ps.setInt(1, a);
		
		
		int rows=ps.executeUpdate();					//  1   1   1   1   1
		if(rows>0)
			System.out.println(rows +" Records Deleted");
		else
			System.out.println("Record Not Deleted");
		
		ps.close();
		con.close();
		
		
	}

}
