package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.User;

@WebServlet("/controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String uid=	request.getParameter("uid");
		String pwd=	request.getParameter("pwd");
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String email=request.getParameter("email");
		String contact=request.getParameter("contact");
		String area=request.getParameter("area");
		String city=request.getParameter("city");
		String pincode=request.getParameter("pincode");
		
		String [] s=request.getParameterValues("hobby");
		List<String> l=new ArrayList<>();
		for (String h : s)
		{
			l.add(h);
		}
		
		request.setAttribute("hobbylist", l);
		
		User u=new User(uid, pwd, fname, lname, email, contact, area, city, pincode);
		request.getSession().setAttribute("userinfo", u);

		Cookie c=new Cookie("namecookie",fname);
		response.addCookie(c);
		
		RequestDispatcher rd=request.getRequestDispatcher("/view.jsp");
		rd.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}

}
