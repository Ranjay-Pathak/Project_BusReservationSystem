package Front_page;

import java.sql.*;

import javax.swing.JFrame;

import oracle.jdbc.OracleDriver;

public class jdbc_connect {

	public static void main(String[] args) throws SQLException , ClassNotFoundException {
		// TODO Auto-generated method stub
		ResultSet rs;
		Statement st;
		Connection con;
				 
		DriverManager.registerDriver(new OracleDriver());    //This is for loading the ojdbc driver
		System.out.println("Driver loaded Successfully");  
		con =DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE","system","Sp#30082"); //connecting to the database
		st = con.createStatement();
	     System.out.println("Connection Successful");
		 
		 rs = st.executeQuery("Select * from AVAILABLE_CITIES");
		 
		 adminLogin login=new adminLogin();
		    
		     
		      st.close();
		      con.close();     
	}

}
