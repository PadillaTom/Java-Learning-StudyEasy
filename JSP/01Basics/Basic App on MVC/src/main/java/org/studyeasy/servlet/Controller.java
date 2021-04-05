package org.studyeasy.servlet;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Controller() {
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String paramString = request.getParameter("page");
		if(paramString.equals("about")) {
			getServletContext().getRequestDispatcher("/about.jsp").forward(request, response);
		} else if(paramString.equals("login")) {
			getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
		} else if(paramString.equals("signup")) {
			getServletContext().getRequestDispatcher("/signup.jsp").forward(request, response);
		}  else {
			getServletContext().getRequestDispatcher("/notFound.jsp").forward(request, response);
		}
		
	}



}
