package chapter19;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import tool.Page;

/**
 * Servlet implementation class SetNotice
 */
@WebServlet(urlPatterns= {"/chapter19/setNotice"})
public class SetNotice extends HttpServlet {
	
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		Page.header(out);
		
		String notice=request.getParameter("notice");
		
		ServletContext context=getServletContext();
		
		context.setAttribute("notice", notice);
		
		out.println("<p>");
		out.println("お知らせを設定しました。");
		out.println("</p>");
	}

}
