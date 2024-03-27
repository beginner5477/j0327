package t8_insa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBconn {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	String sql = "";
	public DBconn() {
		String url = "jdbc:mysql://localhost:3306/javaclass";
		String user = "root";
		String password = "1234";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void connClose() {
			try {
				if(conn != null)
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
	public void pstmtClose() {
		try {
			if(pstmt != null)
				pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void rsClose() {
		try {
			if(rs != null)
			{
				rs.close();
				pstmt.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
