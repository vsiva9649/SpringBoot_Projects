package com.login.servlet;

import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;

import com.login.DAO.LoginDAO;
import com.login.DTO.LoginDTO;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#getServletConfig()
	 */
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Do GET");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("LoginServlet Do POST Starting");
		
		try {
			String LoginUserName=request.getParameter("username");
			String LoginUserPassword=request.getParameter("userpassword");;
			
			System.out.println("UserName : "+LoginUserName);
			System.out.println("UserPassword : "+LoginUserPassword);
			
			LoginDTO loginto = new LoginDTO();
			loginto.setUserName(LoginUserName);
			loginto.setUserpassword(LoginUserPassword);
			
			LoginDAO logindao = new LoginDAO();
			boolean isvalidstaff = logindao.chkLoginStaff(loginto);
			
			if(isvalidstaff) {
				request.getRequestDispatcher("Welcome.jsp").forward(request, response);
		//		response.sendRedirect("welcome.jsp"); 
			}else {
				
				//request.setAttribute("", "");// 1 or2 pages
				request.getSession().setAttribute("loginErrMsg","Invalid staff details please enter valid username or password"); // for entire page until logout
				request.getRequestDispatcher("Login.jsp").forward(request, response);

			}
			
			

		} 
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("LoginServlet Do POST Exception"+e);
		}
	
		
		System.out.println("LoginServlet Do POST ending");

	}
 
}
