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
		case "memberArea":
			// We Create the URL for this file.
			request.getRequestDispatcher("memberArea.jsp").forward(request, response);
			break;
		case "membersOnly":
			request.getRequestDispatcher("membersOnly.jsp").forward(request, response);
		case "destroy":
			// Request Session to be "invalidated" and redirect to home:
			request.getSession().invalidate();				
			response.sendRedirect(request.getContextPath()+"/SiteController?action=login");
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
