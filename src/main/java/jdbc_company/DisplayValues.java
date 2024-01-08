package jdbc_company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DisplayValues {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//load and register Driver
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				//Establish the connection
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/School", "root", "root");
				
				 Statement st = con.createStatement();
				 
				 ResultSet rs=st.executeQuery("select * from student");
				 //ResultSet rs1=st.executeQuery("select name,address from student");
				 
				 
				 while(rs.next())
				 {
					 System.out.println(rs.getInt(1)+" "+rs.getString(2));
					 
				 }

	}

}
