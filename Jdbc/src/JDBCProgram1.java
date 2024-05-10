import java.sql.*;
public class JDBCProgram1 {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/myjdbcdb";
		String username="root";
		String password="root";
		String query="Insert into Student1 values(2,'Soumya')";
		try {
		
		Connection con=DriverManager.getConnection(url, username, password);
		System.out.println("Connection is established");
		Statement stmt=con.createStatement();
		stmt.execute(query);
		System.out.println("Query is established");
		}
		catch(Exception e){
			e.printStackTrace();
		}
   
	}

}
