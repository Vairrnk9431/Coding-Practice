import java.sql.*;
import java.util.Scanner;

public class EmpJdbc {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/myjdbcdb";
		String username = "root";
		String password = "root";
		Connection con = null;
		Statement stmt = null;

		try {
			con = DriverManager.getConnection(url, username, password);
			System.out.println("Connection Established");
			stmt = con.createStatement();
			System.out.println("Statement is ready");

			Scanner scan = new Scanner(System.in);
			System.out.println("Enter your Choice");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				insert(stmt);
				break;
			case 2:
				update(stmt);
				break;
			case 3:
				delete(stmt);
				break;
			case 4:
				fetchData(stmt);
				break;
			}

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	static void insert(Statement stmt) throws Exception {
		String query = "INSERT INTO employee VALUES (1, 'Vaibhav', 3500), (2, 'Soumya', 3700)";
		stmt.execute(query);
		System.out.println("Rows are inserted");
		fetchData(stmt);
	}

	static void update(Statement stmt) throws Exception {
		String query = "Update employee set Emp_Name='Ayush' Where Emp_id=1";
		stmt.executeUpdate(query);
		System.out.println("Rows are updated");
		fetchData(stmt);
	}

	static void delete(Statement stmt) throws Exception {
		String query = "Delete from employee where Emp_id=2";
		stmt.executeUpdate(query);
		System.out.println("Rows are updated");
		fetchData(stmt);
	}

	static void fetchData(Statement stmt) throws Exception {
		String query = "Select * from employee";
		ResultSet rs = stmt.executeQuery(query);
		while (rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
		}

	}
}
