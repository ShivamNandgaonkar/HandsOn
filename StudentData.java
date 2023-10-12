package Jdbc;
/*create crud operation for students details accepting the input from user for confirming the operations 
 * 1.enter the student details, 
 * 2.retrieve the students details, 
 * 3.delete the students details, 
 * 4.edit the students details. */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.Scanner;
public class StudentData {
public static void main(String[] args) throws ClassNotFoundException, SQLException
			{
				
				Class.forName("com.mysql.cj.jdbc.Driver"); //step 1
				
				//step 2
				Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "3306");

				//PreparedStatement pstmt=con.prepareStatement("insert into employee values(?,?,?,?)");
				
				Scanner sc=new Scanner(System.in);
				System.out.println("Available operations:");

		        System.out.println("1. Enter student details");

		        System.out.println("2. retrieve the students details");

		        System.out.println("3. delete the students details");

		        System.out.println("4. edit the students details.");

		        System.out.print("Enter the operation number: ");
		        int operation = sc.nextInt();
		        switch(operation)
		        {
		        case 1:
		        	PreparedStatement pstmt=con.prepareStatement("insert into students values(?,?,?,?,?)");
		        	System.out.println("Please enter the Student ID");
		    		int id=sc.nextInt();
		    		
		    		System.out.println("Please enter the Name");
		    		String name=sc.next();
		    		
		    		System.out.println("Please enter the class");
		    		int cls=sc.nextInt();
		    		
		    	
		    		System.out.println("Please enter the Section");
		    		String sec=sc.next();
		    		
		    		System.out.println("Please enter the fees");
		    		int fees=sc.nextInt();
		    		
		    		
		    		
		    		pstmt.setInt(1,id);
		    		pstmt.setString(2,name);
		    		pstmt.setInt(3, cls);
		    		
		    	    pstmt.setString(4, sec); // create statement // 3 step
		    	    pstmt.setInt(5, fees);
		    		
		    		int i=pstmt.executeUpdate(); // 4 step // execute query
		    		System.out.println("Student data added successfully");
		    	break;
		    	
		        case 2:
		        	PreparedStatement stmt1=con.prepareStatement("select * from students where stdid = ?");
		        	System.out.println("Please enter the Student ID");
		    		int id1=sc.nextInt();
		    		stmt1.setInt(1, id1);
		        	ResultSet rs = stmt1.executeQuery();
		        	int cls1,fees1;
		    		String name1 ,sec1;
		    		System.out.println("Students Details");
		    		System.out.println("================");
		    		while(rs.next())
		    		{
		    			   id1=rs.getInt(1);
		      	        name1=rs.getString(2);
		    			   cls1=rs.getInt(3);

		    			  sec1= rs.getString(4);
		    			  fees1=rs.getInt(5);
		    			//System.out.println(id+"  "+name+"  "+desig+"  "+dept+"  "+salary );
		    			System.out.println(id1+" "+name1+" "+cls1+" "+sec1+" "+fees1);
		    		}
		    		
		        break;	
		        case 3:
		        	PreparedStatement stmt=con.prepareStatement("delete from students where stdid=?");
		        	System.out.println("Please enter the Student ID");
		        	int id2=sc.nextInt();
		    		

		    		
		    		
		    		stmt.setInt(1,id2);
		    
		    		int a=stmt.executeUpdate(); // 4 step // execute query
		    		System.out.println("Student data deleted successfully");
		    	break;
		        case 4:
		        	 //String sql = "UPDATE employee SET salary = ? WHERE empid = ?";
		        	 PreparedStatement statement = con.prepareStatement("UPDATE students SET section = ? WHERE stdid = ?");
		              
		           	 System.out.println("Please enter the Section");
		    		 String sec2=sc.next();
		    		 System.out.println("Please enter the Student ID");
		           	 int id3=sc.nextInt(); 
		    		
		    		
		    	 	statement.setString(1, sec2);
		    		statement.setInt(2, id3);
		    		int b=statement.executeUpdate(); // 4 step // execute query
		    		System.out.println("Employee data updated successfully");
		    	break;
		        	   
		        default:

		            System.out.println("Error: Invalid operation number.");

		             break;
		        }

		        //input for operation

		        
				
				
			    con.close();
				
				
			}

			

		}
	


