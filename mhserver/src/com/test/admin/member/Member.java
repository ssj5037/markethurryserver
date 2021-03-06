package com.test.admin.member;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author leeho
 * 관리자 고객관리 페이지
 */
@WebServlet("/admin/member/member.do")
public class Member extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/admin/member/member.jsp");
		dispatcher.forward(req, resp);

	}
}
