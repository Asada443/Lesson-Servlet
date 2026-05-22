package chapter15;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import bean.Product;
import dao.ProductDAO;

/**
 * Servlet implementation class Sort2
 */
@WebServlet(urlPatterns={"/chapter15/sort2"})
public class Sort2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			
			String order=request.getParameter("order");
			
			ProductDAO dao=new ProductDAO();
			
			List<Product>list=dao.sort(order);
			
			request.setAttribute("list", list);
			
			request.getRequestDispatcher(
			"/chapter15/sort2.jsp")
			.forward(request, response);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	

}
