package jdbcprogs;

import java.sql.Connection;
import java.sql.Statement;

public class DeleteUsingStatement {

	public static void main(String[] args) throws Exception
	{
		Connection con=MySQLConnectionITP.getConnection();
		//delete record of employee no 1
		
		String query="delete from emp where eno=1";
		
		Statement st=con.createStatement();
		
		int rows=st.executeUpdate(query);
		
		if(rows>0)
			System.out.println(rows +" Records Deleted");
		else
			System.out.println("Record Not Deleted");
	}

}
