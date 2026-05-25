package chapter17;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class NameInputServlet
 */
@WebServlet(urlPatterns= {"/chapter17/nameInput"})
public class NameInputServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=request.getParameter("name");
		
		HttpSession session=request.getSession();
		
		session.setAttribute("name", name);
		
		request.getRequestDispatcher("/chapter17/output.jsp")
		.forward(request, response);
	}

}
