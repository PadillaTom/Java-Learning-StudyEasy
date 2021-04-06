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
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		if(username.equals("tom") && password.equals("asdasd")) {
//			Invalidating Session If Any: Destroying any session if its there.
			request.getSession().invalidate();
//			Creating a new Session for this "TOM" user.
			HttpSession newSession = request.getSession(true);
			newSession.setMaxInactiveInterval(300);
//			Controller Creating Cookie, before redirecting:
			Cookie cUsername = new Cookie("username", username);
			response.addCookie(cUsername);
			response.sendRedirect("memberArea.jsp");
		} else {
			response.sendRedirect("login.jsp");
		}
	}

}
