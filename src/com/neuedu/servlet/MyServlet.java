package com.neuedu.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
		urlPatterns= {"/MyServlet","/MyServlet123","/test"},
		loadOnStartup=1		
		)
public class MyServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
    public MyServlet() {
        super();
        System.out.println("Construct MyServlet----------------------------------");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String str1 = request.getParameter("user");
		String str2 = request.getParameter("pwd");
		
		System.out.println("user="+str1);
		System.out.println("pwd="+str2);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}






