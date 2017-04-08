import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class JDBCTest4 {

	public static void main(String[] args) {
		
		Connection conn=null;
		PreparedStatement stmt=null;
		
		
		try {
			//Step1: Register The Driver Class
			Class.forName("com.mysql.jdbc.Driver");  //Loading JDBC Driver Class
		
			//Step2:Creating Connection
			
		 conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/tech_engineering_college","root","");
		//Step3: Creating Statement -->sending SQL quries to MySQL
			
		 stmt= conn.prepareStatement("Update Student_Information Set Name=? Where StudentID=?");
		
		
		stmt.setString(1, "XYZ");
		stmt.setInt(2, 6);
		
		
		int noOfRowsModified=stmt.executeUpdate();
		
		System.out.println("No of Rows Modified:  "+noOfRowsModified);
		
		//Step4: Closing the Connection
		//rs.close();
//		rs1.close();
//		rs2.close();
		
		
		
		
		} catch (Exception e) {
			
			System.out.println("Class Not Found Exception");;
		}  finally{
			try{
			stmt.close();
			}catch(Exception e)
			{
				
			}
			try{
			conn.close();
			}catch(Exception e){
				
			}
		}
		
		
		
		
		
		
		
		
		
		
	}

}
