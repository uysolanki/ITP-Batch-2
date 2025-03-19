package jdbcprogs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertUsingStatement {

	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");       //5.1.15
		
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/itpb2db","root","");
		
		Statement st=con.createStatement(); //while creation statement is always Non Parameterised
		
		String query="insert into emp values(2,'Ben',900.0)";
		
		int rows=st.executeUpdate(query);//while execution we will have to pass the query as a paramtere
		if(rows>0)
			System.out.println("Record Inserted");
		else
			System.out.println("Record Not Inserted");
		
		st.close();
		con.close();
	}

}
