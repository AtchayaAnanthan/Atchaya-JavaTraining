package jdbccon;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBCdemo {

	public static void main(String[] args)throws SQLException{
	
		String url="jdbc:mysql://localhost:3306/employee";
		String username="root";
		String password="Agarna!10";
		
		String query="select emp_name from employeedetail";
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Connection con=DriverManager.getConnection(url,username,password);
		Statement st=con.createStatement();
		st.executeQuery(query);
		ResultSet rs=st.executeQuery(query);
		rs.next();
		System.out.println(rs.getString("e 6 mp_name"));
		while (rs.next()){
		System.out.println(rs.getString(1));}
		st.close();
		con.close();

	}

}
