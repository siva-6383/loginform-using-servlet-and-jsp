package Bean;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RegisterAction {
	public boolean Registerdetails(RegisterBean Rb)  {
		boolean status=false;
		String username1=Rb.getUsername();
		String userpassword1=Rb.getUserpassword();
		String email1=Rb.getEmail();
		String phonenum1=Rb.getPhonenum();
		
//
////	try {
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//
//            Connection con = DriverManager.getConnection(
//                    "jdbc:sqlserver://192.168.168.12:1433;databaseName=New_joinee_2022", "NewJoinee2022", "P@ssw0rd");
//
//           
//            
////            Statement stmt = con.createStatement();
//
//           int rs = stmt.executeUpdate("insert into REGISTERJSP(username,userpassword,email,phonenum)values('"+username1+"','"+userpassword1+"','"+email1+"','"+phonenum1+"')");
//         if(rs>0) {
//        	 status=true;
//         }
//            		
//		}
//		catch(ClassNotFoundException e) {
//			e.printStackTrace();
//			}
//		catch(SQLException e) {
//			e.printStackTrace();
//		}
//		return status;
//		
//	}
//
//}
//		
		String query="exec  SP_insert_REGISTERJSP @username =? , @userpassword=?,@email=? ,@phonenum=?";
		try {
          Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

          Connection con = DriverManager.getConnection(
                  "jdbc:sqlserver://192.168.168.12:1433;databaseName=New_joinee_2022", "NewJoinee2022", "P@ssw0rd");

          PreparedStatement stmt = con.prepareStatement(query);
          stmt.setString(1, username1);
          stmt.setString(2, userpassword1);
          stmt.setString(3, email1);
          stmt.setNString(4, phonenum1);
           
          int rs=stmt.executeUpdate();
 
          if(rs>0) {
         	 status=true;
          }
             		
 		}
 		catch(ClassNotFoundException e) {
 			e.printStackTrace();
 			}
 		catch(SQLException e) {
 			e.printStackTrace();
 		}
 		return status;
 		
 	}
 
 }
		
		
