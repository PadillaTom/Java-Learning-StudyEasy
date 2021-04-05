package org.stuyeasy;

import java.io.IOException;
import java.io.PrintWriter;

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

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.getWriter().print(request.getParameter("name")+"<br>");
		response.getWriter().print(request.getParameter("gender")+ "<br>");
		
		PrintWriter out = response.getWriter();
		String[] languages = request.getParameterValues("language");
		if(languages != null){
			for(int i=0; i<languages.length; i++){
				
				out.print(languages[i]);
				out.print("<br>");
			}
		} else {
			out.print("No Language Selected");
			out.print("<br>");
		} 
		
		response.getWriter().print(request.getParameter("country")+"<br>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().print(request.getParameter("name"));
	}

}
