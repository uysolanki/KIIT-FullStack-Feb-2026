package day22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) throws SQLException {
		 String url = "jdbc:mysql://localhost:3306/kiitdb";
		 String username = "root";
		 String password = "";
		 Connection con = DriverManager.getConnection(url, username, password);	//open state
		 System.out.println(con.isClosed()); //false
		 
		 String query="create table emp1(\r\n"
		 		+ "eno int(5) primary key,\r\n"
		 		+ "ename varchar(10) not null,\r\n"
		 		+ "salary numeric(6,2))";
		 
		 Statement st=con.createStatement();
		 st.execute(query);
		 
		 System.out.println("Table created");
		 
		 st.close();
		 con.close();

	}

}
