package jdbc_company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTableValues {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//load and register Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Establish the connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Company", "root", "root");

		System.out.println("Connection Established...");
		
		//create the statement
		 Statement st = con.createStatement();
		 st.executeUpdate("insert into employee values (102,'Raju',24,'15000','Mudhol')");
		 st.executeUpdate("insert into employee values (103,'Akash',23,'15000','Bagalkote')");
		 st.executeUpdate("insert into employee values (104,'Tarun',23,'16000','Hebbal Flyover')");
		 con.close();

	}

}
