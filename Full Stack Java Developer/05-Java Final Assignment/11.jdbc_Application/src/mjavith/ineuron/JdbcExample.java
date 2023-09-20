package mjavith.ineuron;
import java.sql.*;
//Add MYSQL jar file

public class JdbcExample {
	public static void main(String[] args) {
		// Database credentials
		String url = "jdbc:mysql:///mjavith_ineuron";
		String username = "root";
		String password = "root";

		// Connection and statement variables
		Connection conn = null;
		Statement stmt = null;

		try {
			// Register the JDBC driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Open a connection
			System.out.println("Connecting to the database...");
			conn = DriverManager.getConnection(url, username, password);

			// Create a statement
			System.out.println("Creating statement...");
			stmt = conn.createStatement();

			// Execute the query
			String sql = "SELECT * FROM students_table";
			ResultSet rs = stmt.executeQuery(sql);

			// Process the result set
			while (rs.next()) {
				// Assuming the table has two columns: "id" and "name"
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String address = rs.getString("address");
				int age = rs.getInt("age");

				// Display the data
				System.out.println("ID      : " + id);
				System.out.println("Name	: " + name);
				System.out.println("Address	: " + address);
				System.out.println("Age     : " + age);
				System.out.println("------------------");
			}

			// Clean up
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			// Close resources in a finally block to ensure they are always closed
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
				se2.printStackTrace();
			}
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
	}
}
