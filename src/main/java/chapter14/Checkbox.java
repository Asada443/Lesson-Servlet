package chapter14;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import tool.Page;

/**
 * Servlet implementation class Checkbox
 */
@WebServlet(urlPatterns="/chapter14/checkbox")
public class Checkbox extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		

		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		request.setCharacterEncoding("UTF-8");
		String[] genre = request.getParameterValues("genre");

		Page.header(out);
		
		
		if(genre !=null) {
			try {
				InitialContext ic=new InitialContext();
				DataSource ds=(DataSource)ic.lookup(
				"java:comp/env/jdbc/book"		);
				Connection con=ds.getConnection();
				
				PreparedStatement st= con.prepareStatement(
						"insert into genre(name) values(?)");
				
				for(String item:genre) {
					
				st.setString(1,item);
				
				st.executeUpdate();
				
				out.println(" [" + item + "] ");
				
				
				}
				
				out.println("に関するお買いもの情報をお送りいたします。");
				
				st.close();
				con.close();
				
				}catch(Exception e) {
					e.printStackTrace(out);
				}
		}else {
			out.println("お買いもの情報をお送りいたしません。");
		}
		Page.footer(out);
		}

	}


