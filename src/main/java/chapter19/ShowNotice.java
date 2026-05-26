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
 * Servlet implementation class ShowNotice
 */
@WebServlet(urlPatterns= {"/chapter19/showNotice"})
public class ShowNotice extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		Page.header(out);
		
		ServletContext context=getServletContext();
		
		String notice=(String)context.getAttribute("notice");
		
		if(notice==null || notice.isEmpty()) {
			out.println("<p>現在のお知らせはありません</p>");
		}else {
			out.println("<p>");
			out.println(
				"お知らせ : "
				+ notice);
			out.println("</p>");
		}
		
		out.println(
				"<a href='setnotice.jsp'>"
				+ "お知らせを設定する"
				+ "</a>");
		}
	}

	

