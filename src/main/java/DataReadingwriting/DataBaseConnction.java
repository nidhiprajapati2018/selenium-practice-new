package DataReadingwriting;

import java.sql.*;
import javax.sql.*;

public class DataBaseConnction {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		String url = "jdbc:mysql://localhost:3306/college";
		String user = "root";
		String password = "nidhishyam";

		//Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(url, user, password);

		System.out.println("Connection is successful to the database " + url);

		Statement st = connection.createStatement();
		// String str = "insert into student values(109, 'RahulR', 90, 'A','Hydrabad')";
		 String str1 = "update student set name = 'Ramsh', city='Delhi' where rollno in(103)";
		//String str2 = "DELETE from student where rollno in(111)";

		
		  int x = st.executeUpdate(str1); if(x != 0) {
		  //System.out.println("Record Inserted");
		  System.out.println("Record Updated"); 
		  //System.out.println("Record DELETED");
		  }
		 
		 

		
	/*	  ResultSet rs1 = st.executeQuery("SELECT * FROM student"); while(rs1.next()) {
		  System.out.println(rs1.getInt(1)+"  " + rs1.getString(2)+"  " +rs1.getInt(3)+
		  "  "+ rs1.getString(4) +" "+rs1.getString(5)); }*/
		 

		/*
		 * PreparedStatement ps =
		 * connection.prepareStatement("INSERT INTO student Value(?,?,?,?,?)");
		 * ps.setInt(1, 111); ps.setString(2, "Ruhi"); ps.setInt(3, 94);
		 * ps.setString(4,"A"); ps.setString(5, "Indore");
		 * 
		 * int x = ps.executeUpdate(); if(x != 0) {
		 * System.out.println("Record Inserted");
		 * //System.out.println("Record Updated");
		 * //System.out.println("Record DELETED"); }
		 */

		connection.close();

	}

}
