package loginform.servlet;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoginAction {
	Logger log = LogManager.getLogger(LoginAction.class);
	
	
	public boolean LoginData(String username,String userpassword) {
		boolean status=false;
		
	
		try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            Connection con = DriverManager.getConnection(
                    "jdbc:sqlserver://192.168.168.12:1433;databaseName=New_joinee_2022", "NewJoinee2022", "P@ssw0rd");

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("select*from REGISTERJSP where username='"+username+"' and userpassword='"+userpassword+"'");
            log.info("true");
            		 if(rs.next()) {
            			 log.info("true");
                  	 status=true;
                  	 
                     }
		}
		catch(ClassNotFoundException e) {
			log.error(e);
			e.printStackTrace();
			}
		catch(SQLException e) {
			e.printStackTrace();
		}
		log.info(status);
		return status;
	
	}

}

