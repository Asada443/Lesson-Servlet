package servletTest;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Content
 */
@WebServlet(urlPatterns= {"/servletTest/contact"})
public class Contact extends HttpServlet {
	/*private static final long serialVersionUID = 1L;*/
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	/*public Contact() {
	    super();
	    // TODO Auto-generated constructor stub
	}*/

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	/*protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}*/

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*doGet(request, response);*/
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		/*資料請求がYESの場合に遷移*/
		request.getParameter("yes");
		if("yes"!=null) {
			request.getRequestDispatcher("/servletTest/download.jsp")
			.forward(request, response);
		
		}
	
		
		
		/*何にチェックが入っているか資料請求を希望しているかが表示されるjspページに遷移*/
		request.getRequestDispatcher("/servletTest/data.jsp") 
		.forward(request,response);
		
		
	
		
		
	}

}
