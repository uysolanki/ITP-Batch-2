package jdbcprogs;

import java.sql.Connection;
import java.sql.Statement;

public class UpdateUsingStatement {

	public static void main(String[] args) throws Exception
	{
		Connection con=MySQLConnectionITP.getConnection();
		//update salary to 1000 and EmployeeName Alex of employee no 1
		
		String query="update emp set sal=1000,ename='Alex' where eno=1";
		
		Statement st=con.createStatement();
		
		int rows=st.executeUpdate(query);
		
		if(rows>0)
			System.out.println(rows +" Records Updated");
		else
			System.out.println("Record Not Updated");
	}

}
