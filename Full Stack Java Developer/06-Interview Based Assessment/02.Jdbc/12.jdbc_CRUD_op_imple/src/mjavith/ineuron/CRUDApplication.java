package mjavith.ineuron;

import java.sql.*;

public class CRUDApplication {
	private static final String DB_URL = "jdbc:mysql:///mjavith_ineuron";
	private static final String DB_USER = "root";
	private static final String DB_PASSWORD = "root";

	public static void main(String[] args) {
		try {
			// Step 1: Establish connection to the database
			Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

			// Step 2: Create a statement object
			Statement statement = connection.createStatement();

			System.out.println("INSERT Record in students_table");
			// Step 3: Perform CRUD operations
			// Create a record
			String insertQuery = "INSERT INTO students_table (id, name, age , address) VALUES (1, 'Sachin', 49,'MI')";
			statement.executeUpdate(insertQuery);
			System.out.println("Record inserted successfully.\n");

			System.out.println("VIEW Record of students_table");
			// Read records
			String selectQuery = "SELECT * FROM students_table";

			ResultSet resultSet = statement.executeQuery(selectQuery);
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				int age = resultSet.getInt("age");
				String address = resultSet.getString("address");
				System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age + ", Address: " + address);
			}

			System.out.println("\nUPDATE Record of students_table");
			// Update a record
			String updateQuery = "UPDATE students_table SET age = 50 WHERE id = 1";
			statement.executeUpdate(updateQuery);
			System.out.println("Record updated successfully.");

			System.out.println("\nDELETE Record of students_table");
			// Delete a record
			String deleteQuery = "DELETE FROM students_table WHERE id = 2";
			statement.executeUpdate(deleteQuery);
			System.out.println("Record deleted successfully.");

			// Step 4: Close resources
			statement.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
