package com.controller;

import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.ResultSet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpSession;

import com.model.LoginModel;

//@WebServlet("/LoginServ")
public class LoginServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private String user_id;
    private String pass_word;
    private String utype;
    private String user_name;
    public static ResultSet RS=null;
          
    public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getPass_word() {
		return pass_word;
	}

	public void setPass_word(String pass_word) {
		this.pass_word = pass_word;
	}

	public String getUtype() {
		return utype;
	}

	public void setUtype(String utype) {
		this.utype = utype;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

    /**
     * @see HttpServlet#HttpServlet()
  
     */


public LoginServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		
		response.setHeader("Cache-Control","no-store");
	    response.setHeader("Pragma","no-cache");
	    response.setDateHeader ("Expires", 0);
	    request.getParameter("regtration");
        // login...........  
		String user_id = request.getParameter("user_id");
		System.out.println("user_id:"+user_id );
		String pass_wordd = request.getParameter("pass_word");
		System.out.println("pass_wordd:"+pass_wordd );
		String U_type = request.getParameter("utype");
		System.out.println("U_type:"+U_type );
		 
		try{
			
			HttpSession session = request.getSession();
			session.setAttribute("user_id",null);
			session.setAttribute("pass_word",null);
			//session.setAttribute("USER_NAME",null);
		    
			LoginModel LDB=new LoginModel();
	        LoginServ l=LDB.connectDB(user_id);
	        
	        if((l.getPass_word().toString().equals(pass_wordd.toString()))&& (l.getUser_id().equalsIgnoreCase(user_id)) && (l.getUtype().equalsIgnoreCase(U_type)))
	        {	
	        	System.out.println(l.getUser_name()+" "+l.getUser_id()+" "+l.getPass_word()+" "+l.getUtype());
	        	session.setAttribute("user_id",l.getUser_id());
	        	session.setAttribute("invalidlogin",null);
				session.setAttribute("pass_word",l.getPass_word());
				session.setAttribute("user_name",l.getUser_name());
				if(l.getUtype().equalsIgnoreCase("admin"))
				{
					response.sendRedirect("profile.jsp");
				}
				else if(l.getUtype().equalsIgnoreCase("student"))
				{
					response.sendRedirect("StudentProfile.jsp");
				}
				else if(l.getUtype().equalsIgnoreCase("faculty"))
				{
					response.sendRedirect("FacultyProfile.jsp");
				}
					
				
			    
	        }
	        else
	        {
	        	System.out.println("Not Matching");
	        	session.setAttribute("invalidlogin","Invalid  Credentials !!");
				RequestDispatcher view1 = request.getRequestDispatcher("/index.jsp");
				view1.forward(request, response);
	        }
	        
		}catch(Exception e)
		{
			
		}
		
	}

}

