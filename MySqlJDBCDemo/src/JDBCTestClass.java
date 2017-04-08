import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;




public class JDBCTestClass {

	public static void main(String[] args) {
		
		
		//Step1: Register The Driver Class
		/*try {
			Class.forName("com.mysql.jdbc.Driver");  //Loading JDBC Driver Class
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} */ 
		
		
		try {
			//Step1: Register The Driver Class
			Class.forName("com.mysql.jdbc.Driver");  //Loading JDBC Driver Class
		
			//Step2:Creating Connection
			//https =jdbc:mysql
			//www.google.com =localhost:3306/tech_engineering_college
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/tech_engineering_college","root","");
		//Step3: Creating Statement -->sending SQL quries to MySQL
		Statement stmt= conn.createStatement();	
		
		//ResultSet rs=stmt.executeQuery("SELECT * FROM student_information");
		//ResultSet rs=stmt.executeQuery("SELECT * FROM student_information where StudentId=555555555 or StudentId=55555551");
		//ResultSet rs=stmt.executeQuery("SELECT * FROM student_information where StudentId=555555555 or Name=\"Micheal\" ");
		//ResultSet rs=stmt.executeQuery("INSERT INTO student_information(StudentId, Name, Address, Mobile)Values(55555558,\"Andrew\",\"Jamaica,New Yoek\", 347857896)");
		
		int nofRowModified=stmt.executeUpdate("Insert Into Student_Information(StudentId,Name,Address,Mobile)Values(555558,\"ABC\",\"GHI\",44432)");
		int nofRowModified1=stmt.executeUpdate("Update Student_Information Set Name=\"Ana\" where StudentID=555558" );
		int nofRowModified2=stmt.executeUpdate("Delete Student_Information Set Name=\"Ana\" where StudentID=555558" );
		
		System.out.println("No of Rows Modified:  "+nofRowModified);
		System.out.println("No of Rows Modified:  "+nofRowModified1);
		System.out.println("No of Rows Modified:  "+nofRowModified2);
		//while(rs.next()){
		//System.out.println("StudentID: "+rs.getString(1)+" Name: "+rs.getString(2)+" Address: "+rs.getString(3)+" Mobile: "+rs.getString(4));
		//System.out.println("************************Printing Second Query Result*****************************************************");
		//System.out.println("StudentID: "+rs.getString(1)+" Name: "+rs.getString(2)+" Address: "+rs.getString(3)+" Mobile: "+rs.getString(4));
    	//System.out.println("************************Printing Third Query Result*****************************************************");
		//System.out.println("StudentID: "+rs.getString(1)+" Name: "+rs.getString(2)+" Address: "+rs.getString(3)+" Mobile: "+rs.getString(4));
		
	//	}
		
		
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
