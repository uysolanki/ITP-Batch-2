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
		
		String query="insert into emp values(3,'Chris',900.0)";
		String query1="insert into emp values(4,'David',900.0)";
		String query2="insert into emp values(5,'Elcid',900.0)";
		String query3="insert into emp values(6,'Frank',900.0)";
		String query4="insert into emp values(7,'George',900.0)";
		
		st.addBatch(query);
		st.addBatch(query1);
		st.addBatch(query2);
		st.addBatch(query3);
		st.addBatch(query4);							//	0	1	2	3	4
		int rows[]=st.executeBatch();					//  1   1   1   1   1
		if(rows.length>0)
			System.out.println(rows.length +" Records Inserted");
		else
			System.out.println("Record Not Inserted");
		
		st.close();
		con.close();
	}

}
