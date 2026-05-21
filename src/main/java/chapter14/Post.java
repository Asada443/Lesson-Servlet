package chapter14;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Post
 */
@WebServlet(urlPatterns= {"/chapter14/post"})
public class Post extends HttpServlet {
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		try {
			InitialContext ic=new InitialContext();
			DataSource ds=(DataSource)ic.lookup(
			"java:comp/env/jdbc/book"		);
			Connection con=ds.getConnection();
			
			String name =
					request.getParameter("name");

			String mainText =
					request.getParameter("mainText");

			
			PreparedStatement st =
					con.prepareStatement(
					"insert into posts(name, content) values(?, ?)");

			st.setString(1, name);

			st.setString(2, mainText);

			st.executeUpdate();

			
			
			
			st.close();
			con.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		response.sendRedirect("index.jsp");
	}

	
	
}
