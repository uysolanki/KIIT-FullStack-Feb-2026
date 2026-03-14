package day22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertUsingStatement {

	public static void main(String[] args) throws SQLException {
		 String url = "jdbc:mysql://localhost:3306/kiitdb";
		 String username = "root";
		 String password = "";
		 Connection con = DriverManager.getConnection(url, username, password);	//open state
		 
		 String query="insert into emp1 values(1,'Alice',800.0)";
		 
		 Statement st=con.createStatement();
		 int rows= st.executeUpdate(query);
		 
		 if(rows>0)
		 System.out.println(rows+ " Records inserted");
		 
		 st.close();
		 con.close();

	}

}
