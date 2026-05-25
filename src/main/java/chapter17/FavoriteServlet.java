package chapter17;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import bean.Favorite;

/**
 * Servlet implementation class FavoriteServlet
 */
@WebServlet(urlPatterns= {"/chapter17/favorite"})
public class FavoriteServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=request.getParameter("name");
		
		String url=request.getParameter("url");
		
		
		HttpSession session=request.getSession();
		
		List<Favorite>list=(List<Favorite>)session.getAttribute("favoriteList");
		
		if(list==null) {
			list=new ArrayList<>();
		}
		
		Favorite f=new Favorite();
		
		f.setName(name);
		f.setUrl(url);
		
		
		list.add(f);
		
		session.setAttribute("favoriteList", list);
		
		request.getRequestDispatcher("/chapter17/favorites.jsp")
		.forward(request, response);
	}

}
