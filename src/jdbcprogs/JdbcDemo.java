package jdbcprogs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");       //5.1.15
		//Class.forName("com.mysql.cj.jdbc.Driver");  //8 onwards
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/itpb2db","root","");
		
		String query="create table emp(\r\n"
				+ "eno int(5) primary key,\r\n"
				+ "ename varchar(10),\r\n"
				+ "sal decimal(6,2));\r\n"
				+ "\r\n"
				+ "";
		
		Statement st=con.createStatement();
		
		st.execute(query);
		
		System.out.println("Table Created");
		
		st.close();
		con.close();

	}

}
