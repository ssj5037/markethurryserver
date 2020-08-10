package com.test.main;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/usertemplate.do")
public class UserTemplate extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// jdbc test
		Connection conn = new DBUtil().open();
		PreparedStatement stat = null;
		ResultSet rs = null;
		String test = "";
		try {
			String sql = "select * from member";
			stat = conn.prepareStatement(sql);
			
			rs = stat.executeQuery();
			
			if(rs.next()) {
				test = rs.getString("Seq");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/usertemplate.jsp");
		req.setAttribute("test", test);
		dispatcher.forward(req, resp);
	}
}
