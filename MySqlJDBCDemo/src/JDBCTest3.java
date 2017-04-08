import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class JDBCTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			//Step1: Register The Driver Class
			Class.forName("com.mysql.jdbc.Driver");  //Loading JDBC Driver Class
		
			//Step2:Creating Connection
			
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/tech_engineering_college","root","");
		//Step3: Creating Statement -->sending SQL quries to MySQL
			
		PreparedStatement stmt= conn.prepareStatement("Update Student_Information Set Name=? Where StudentID=?");
		
		
		stmt.setString(1, "LLL");
		stmt.setInt(2, 6);
		
		
		int noOfRowsModified=stmt.executeUpdate();
		
		System.out.println("No of Rows Modified:  "+noOfRowsModified);
		
		//Step4: Closing the Connection
		//rs.close();
//		rs1.close();
//		rs2.close();
		stmt.close();
		conn.close();
		
		
		
		} catch (Exception e) {
			
			System.out.println("Class Not Found Exception");;
		}  
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
