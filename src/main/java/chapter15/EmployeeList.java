package chapter15;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import bean.Employee;
import dao.EmployeeDAO;

/**
 * Servlet implementation class EmployeeList
 */
@WebServlet(urlPatterns= {"/chapter15/employeelist"})
public class EmployeeList extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			
			EmployeeDAO dao=new EmployeeDAO();
			
			List<Employee>list=dao.findAll();
			
			request.setAttribute("list", list);
			
			request.getRequestDispatcher("/chapter15/employeelist.jsp")
			.forward(request,response);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
