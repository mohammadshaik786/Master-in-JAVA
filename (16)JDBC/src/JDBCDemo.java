import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {

	public static void main(String[] args) {
		
		String url = "JDBC:mysql://127.0.0.1:3306/employees_database";
		
		try {
			
			//Establish a connection object
			Connection con = DriverManager.getConnection(url,"root","ALLAH786");
			
			//Create a statement object to send to the database
			Statement stmt = con.createStatement();
			
			//Execute the statement object i.e insert,update,delete
			ResultSet result = stmt.executeQuery("select * from employees_tbl");
			
			int totalResult = 0;
			//Process the result
			while(result.next()){
				totalResult += result.getInt("salary");
				//System.out.println(result.getString("name"));
			}
			System.out.println(totalResult);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
