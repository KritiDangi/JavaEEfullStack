package com.visa.prj.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class inboxServlet
 */
@WebServlet("/inboxServlet")
public class inboxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie[] cookies=request.getCookies();
		String user="";
		if(cookies!=null) {
		for (Cookie cookie : cookies) {
			if(cookie.getName().equals("user")) {
				user=cookie.getValue();
			}
		}
		}
		if(user.length()>0) {
			response.getWriter().println("Welcome "+user);
		}
		else {
			response.getWriter().println("please Login");
			response.setHeader("refresh","5;url=index.html");
		}
		
	}

}