package org.studyeasy.servlets;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class SiteController
 */
@WebServlet("/SiteController")
public class SiteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public SiteController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		switch(action) {
		case "login":
			request.getRequestDispatcher("login.jsp").forward(request, response);
			break;			
		default:
			break;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		switch(action){
		case "loginSubmit":
			authenticate(request, response);
			break;
		default:
			break;
		}
	}
	
	
//	------------------------
//	**** Public Methods ****
//	------------------------
	
	public void authenticate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		// Creating new SESSION for "tom" Username:
		if(username.equals("tom") && password.equals("asdasd")) {
		// First: Invalidate any previous session for this username.
			request.getSession().invalidate();
		// Second: Creating the new session with correspondent attributes.
			HttpSession newSession = request.getSession(true);
			newSession.setMaxInactiveInterval(300);	
			newSession.setAttribute("username", username);
		// Encode URL before redirecting (in case cookies are disabled):
			String encode = response.encodeURL(request.getContextPath());
		// Third: Make the correspondent redirects.
			response.sendRedirect(encode +"/MemberAreaController?action=memberArea");
		} else {
			response.sendRedirect(request.getContextPath()+"/SiteController?action=login");
		}
	}
	

}
