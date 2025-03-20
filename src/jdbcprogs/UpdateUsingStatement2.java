package jdbcprogs;

import java.sql.Connection;
import java.sql.Statement;

public class UpdateUsingStatement2 {

	public static void main(String[] args) throws Exception
	{
		Connection con=MySQLConnectionITP.getConnection();
		//update salary of employee Ben to Rs 1000
		
		String query="update emp set sal=1000 where ename like 'Ben'";
		
		Statement st=con.createStatement();
		
		int rows=st.executeUpdate(query);
		
		if(rows>0)
			System.out.println(rows +" Records Updated");
		else
			System.out.println("Record Not Updated");
	}

}
