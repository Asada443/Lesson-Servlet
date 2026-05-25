package chapter18;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import tool.Page;

/**
 * Servlet implementation class CookieServlet
 */
@WebServlet("/CookieServlet")
public class CookieServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out=response.getWriter();
		Page.header(out);
		Cookie[] cookies=request.getCookies();
		if(cookies!=null) {
			for(Cookie cookie : cookies) {
				String name=cookie.getName();
				String value=cookie.getValue();
				out.println("<p>"+name+" : "+value+"</p>");
			}
		}else {
			out.println("クッキーは存在しません。");
		}Page.footer(out);
		
	}
	protected void doPost(
			HttpServletRequest request,
			HttpServletResponse response)
			throws ServletException, IOException {

			PrintWriter out = response.getWriter();
			
			String username = request.getParameter("username");
			Cookie cookie = new Cookie("username", username);
			
			cookie.setMaxAge(60 * 60 * 24);
			
			response.addCookie(cookie);

			out.println("クッキーを保存しました");

			


	}

}
