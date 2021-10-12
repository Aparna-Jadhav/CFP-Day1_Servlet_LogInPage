package com.bridgeLabz;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * 
 * @author Aparna-Jadhav
 *
 */

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/**
		 * get parameter for user and passward
		 */
		String un=request.getParameter("username");
		String pw=request.getParameter("password");
		
		/**
		 * checking the value of user and passward
		 */
		if(un.equals("admin") && pw.equals("admin"))
		{
			/**
			 * send response to success page
			 */
			response.sendRedirect("success.html");
			return;
		}
		else
		{
			/**
			 * send response to error page
			 */
			response.sendRedirect("error.html");
			return;
		}
	}

}
