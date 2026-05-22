package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.Employee;

public class EmployeeDAO extends DAO{
	
	public List<Employee>findAll()throws Exception{
		
		List<Employee>list=new ArrayList<>();
		
		Connection con=getConnection();

		String sql="select * from employees";
		
		PreparedStatement st=con.prepareStatement(sql);
		
		ResultSet rs=st.executeQuery();
		
		while(rs.next()) {
			Employee e=new Employee();
			e.setId(rs.getInt("id"));
			e.setName(rs.getString("name"));
			e.setAge(rs.getInt("age"));
			list.add(e);
		}
		
		rs.close();
		st.close();
		con.close();

		return list;

		
	}

}
