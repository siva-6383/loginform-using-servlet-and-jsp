package loginform.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	Logger log = LogManager.getLogger(LoginServlet.class);
	private static final long serialVersionUID = 1L;
       
    
    public LoginServlet() {
    	
        super();
        // TODO Auto-generated constructor stub
        log.info("Applivation stated");
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String Username=request.getParameter("username");
		String Password=request.getParameter("password");
		 LoginAction la =new LoginAction();
		 boolean status=la.LoginData(Username, Password);
		 if(status) {
			 RequestDispatcher rd=getServletContext().getRequestDispatcher("/LoginSucessjsp.jsp");
			 rd.forward(request, response);
		 }
		 else {
			 response.sendRedirect("LoginUnsucess.jsp");
		 }
	}

}
