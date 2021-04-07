package org.studyeasy.servlets;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MemberAreaController
 */
@WebServlet("/MemberAreaController")
public class MemberAreaController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public MemberAreaController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		COOKIES:
		String action = request.getParameter("action");
		switch(action) {
		case "destroy":
			// Request Session to be "invalidated" :
			request.getSession().invalidate();
			
//			Using COOKIES:
			// Request Cookies that match the one we want to set to null (erase).
			// Cookie[] cookies = request.getCookies();
			// for(Cookie cookie: cookies) {
			//	if(cookie.getName().equals("username")) {
			//		cookie.setValue(null);
			//		cookie.setMaxAge(0);
					// Add the new cookie completely erased.
			//		response.addCookie(cookie);
			//	}
			//}
			
			
//			Using SESSIONS: Invalidate is more than enough.
			
			
			// Redirect after Session and Cookie erased.
			response.sendRedirect("login.jsp");
			break;
		default:
			break;		
		}
		
//		SESSIONS:
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
