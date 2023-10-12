package Jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class DeleteOperation {
public static void main(String[] args) throws ClassNotFoundException, SQLException
			{
				
				Class.forName("com.mysql.cj.jdbc.Driver"); //step 1
				
				//step 2
				Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "3306");

				PreparedStatement pstmt=con.prepareStatement("delete from employee where empid=?");
				
				Scanner sc=new Scanner(System.in);
				
				System.out.println("Please enter the ID");
				int id=sc.nextInt();
				

				
				
				pstmt.setInt(1,id);
			
				int i=pstmt.executeUpdate(); // 4 step // execute query
				System.out.println("Employee data deleted successfully");
			    con.close();
				
				
			}

			

		}
	

