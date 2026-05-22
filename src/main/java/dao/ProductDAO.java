package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.Product;

public class ProductDAO extends DAO{
	
	public List<Product> sort(String order)throws Exception{
		
		List<Product>list=new ArrayList<>();
		
		Connection con=getConnection();
		
		String sql="select * from product";
		
		if("asc".equals(order)) {
			sql+=" order by price asc ";
			
		}else if("desc".equals(order)) {
			sql+=" order by price desc ";
		}
		
		PreparedStatement st=con.prepareStatement(sql);
		
		ResultSet rs=st.executeQuery();
		
		while(rs.next()) {
			Product p=new Product();
			p.setId(rs.getInt("id"));
			p.setName(rs.getString("name"));
			p.setPrice(rs.getInt("price"));
			list.add(p);
		}
		
		rs.close();
		st.close();
		con.close();

		return list;
	}

}
