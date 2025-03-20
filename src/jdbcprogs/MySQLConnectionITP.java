package jdbcprogs;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLConnectionITP {
	static Connection con;
	public static Connection getConnection() throws Exception
	{
		
		String driverName="com.mysql.jdbc.Driver";
		String dbUrl="jdbc:mysql://localhost:3306/itpb2db";
		String dbUserName="root";
		String dbPassword="";
		
		Class.forName(driverName); 		
		con=DriverManager.getConnection(dbUrl,dbUserName,dbPassword);
		return con;
	}
}
