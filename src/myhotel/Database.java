package myhotel;
//import java.awt.List;
import java.sql.*;
import java.util.ArrayList;

public class Database {

	public static void insert(String[] properties) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try
		{
		// Load the JDBC driver
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		String connectionUrl = "jdbc:mysql://localhost:3306/hotel?useSSL=false";
		String connectionUser = "root";
		String connectionPassword = "root";
		conn = DriverManager.getConnection(connectionUrl, connectionUser, connectionPassword);
		//stmt = conn.prepareStatement("INSERT INTO room2 (name, type, view, service, checkin, date) VALUES (?, ?, ?, ?, ?, ?)");
		stmt.setString(1, properties[0]);
		stmt.setString(2, properties[1]);
		stmt.setString(3, properties[2]);
		stmt.setString(4, properties[3]);
		stmt.setString(5, properties[4]);
		stmt.setString(6, properties[5]);
		stmt.executeUpdate();
		
		}
		catch (Exception e) {
		e.printStackTrace();
		}
	}
	
	public static ArrayList<ArrayList<String>> export(){
		ArrayList<ArrayList<String>> reservation = new ArrayList<ArrayList<String>>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try
		{
		// Load the JDBC driver
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		String connectionUrl = "jdbc:mysql://localhost:3306/hotel?useSSL=false";
		String connectionUser = "root";
		String connectionPassword = "root";
		conn = DriverManager.getConnection(connectionUrl, connectionUser, connectionPassword);
		stmt = conn.createStatement();
		rs = stmt.executeQuery("SELECT * FROM room2");
		while (rs.next()){
			ArrayList<String> singleList = new ArrayList<String>();
			singleList.add(rs.getString("name"));
			singleList.add(rs.getString("type"));
			singleList.add(rs.getString("view"));
			singleList.add(rs.getString("service"));
			singleList.add(rs.getString("checkin"));
			singleList.add(rs.getString("date"));
			reservation.add(singleList);
		}
		}
		catch (Exception e) {
		e.printStackTrace();
		}
		return reservation;
	}
}
