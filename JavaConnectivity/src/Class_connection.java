import java.sql.*;

/* 1.	import the package
 * 2.	Load and register driver
 * 3.	set a connection
 * 4.	create a statement
 * 5.	execute the query
 * 6.	process the result
 * 7.	close
 */

public class Class_connection {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		String url = "";
		String uname = "";
		String pass = "";
		Connection con = DriverManager.getConnection(url,uname,pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("Select * from Student");
		while(rs.next())
		{
			System.out.println(rs.getInt(1) + " " + rs.getString(2));
		}
		st.close();
		con.close();
	}

}
