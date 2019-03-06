package com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServletDemo
 */
@WebServlet("/MyServletDemo")
public class MyServletDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServletDemo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String s=request.getParameter("username");
		String s1=request.getParameter("password");
	Login Sc=new Login();
	Sc.setUsername(s);
	Sc.setPassword(s1);
	
	
	if(Sc.check())
	
		{
			RequestDispatcher r=request.getRequestDispatcher("successful.jsp");
			request.setAttribute("user",s);
			r.forward(request, response);
		}
	else
	{
		RequestDispatcher r=request.getRequestDispatcher("faliur.jsp");
		r.forward(request, response);
	}
		
	}


	}


