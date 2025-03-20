package jdbcprogs;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectUsingStatement {

	public static void main(String[] args) throws Exception
	{
		Connection con=MySQLConnectionITP.getConnection();
		//display name and salary of eno 8
		
		String query="select ename,sal from emp where eno=8";
		//String query="select sal,ename from emp where eno=8";
		
		Statement st=con.createStatement();
		
		ResultSet rs=st.executeQuery(query);
		
		if(rs.next())
			System.out.println(rs.getString("ename") + rs.getDouble("sal"));
		
		st.close();
		con.close();
		
	}

}
