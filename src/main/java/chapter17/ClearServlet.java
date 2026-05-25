package chapter17;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class ClearServlet
 */
@WebServlet(urlPatterns= {"/chapter17/clear"})
public class ClearServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();
		
		session.removeAttribute("favoriteList");
		
		request.getRequestDispatcher("/chapter17/favorites.jsp")
		.forward(request, response);
	}

}
