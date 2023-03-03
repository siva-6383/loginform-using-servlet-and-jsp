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

import Bean.RegisterAction;
import Bean.RegisterBean;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	Logger log = LogManager.getLogger(RegisterServlet.class);
	private static final long serialVersionUID = 1L;
   
    public RegisterServlet() {
    	
        super();
        log.info("application started");
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username1=request.getParameter("username");
		String userpassword1=request.getParameter("userpassword");
		System.out.println(request.getParameter("userpassword"));
		String email1=request.getParameter("email");
		String Phonenum1=request.getParameter("phonenum");
		RegisterBean Rs=new RegisterBean();
		Rs.setUsername(username1);;
		Rs.setUserpassword(userpassword1);
		Rs.setEmail(email1);
		Rs.setPhonenum(Phonenum1);
		RegisterAction Ra=new RegisterAction();
		boolean status=Ra.Registerdetails(Rs);
		if(status) {
			 RequestDispatcher rd=getServletContext().getRequestDispatcher("/RegisterSucess.jsp");
			 rd.forward(request, response);
		 }
		 else {
			 response.sendRedirect("RegisterUnsucess.jsp");
		 }
	}

}
