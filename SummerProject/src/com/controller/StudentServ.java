package com.controller;

import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import jakarta.servlet.RequestDispatcher;


import com.model.StudentModel;
import com.utility.StuGeterSeter;


//@WebServlet("/StudentServ")
public class StudentServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	private static String type; 
    public StudentServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at:ruved ").append(request.getContextPath());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		response.setContentType("text/html");
		//PrintWriter out = response.getWriter();
		type=request.getParameter("student");
		StuGeterSeter std;
		StudentModel sdb;
		//Adding a New Student
		if(type.equals("addstudent"))
		{
			std=new StuGeterSeter();
			sdb=new StudentModel();
			
			String syear = null, smonth = null, sdate = null, stoday = null;
			int imonth, idate;
			//Getting System Date
			java.util.Date d = new java.util.Date();
			try {
			    syear = String.valueOf(d.getYear() + 1900);
			    imonth = d.getMonth() + 1;
			    if (imonth < 10) {
			        smonth = "0" + String.valueOf(imonth);
			    } else {
			        smonth = String.valueOf(imonth);
			    }
			    idate = d.getDate();
			    if (idate < 10) {
			        sdate = "0" + String.valueOf(idate);
			    } else {
			        sdate = String.valueOf(idate);
			    }
			} catch (Exception e) {
			    
			}
			stoday=sdate + "-" +smonth + "-" + syear;
			System.out.println("Date in Servlet:"+stoday);
			//Set All values in Student Object
			std.setFirst_name(request.getParameter("first_name"));
			String DOB=request.getParameter("stu_DOB");
			std.setStu_DOB(DOB);
			
			/*
			std.setStu_RegDate(stoday);
			std.setStu_Status("Active");
			std.setSTU_UPDATE_DATE(stoday);
			std.setStu_photo(cast_to_raw(request.getParameter("stu_photo")));
			
			InputStream inputStream = null; // input stream of the upload file
	       
	        Part filePart = request.getPart("stu_photo");
	        if (filePart != null) {
	            // prints out some information for debugging
	            System.out.println(filePart.getContentType());
	             
	            // obtains input stream of the upload file
	            inputStream = filePart.getInputStream();
	        }*/
	        try{
				//Calling Add Student Method in StudentModel
				int result=sdb.AddStudent(std);
				//HttpSession session = request.getSession();
				if(result>0)
				{
					Integer sid=std.getStu_Id();
					System.out.println("Id generated:"+sid);
					String res="Registerd Successfully.Student ID:"+sid;
								
					request.setAttribute("reg", res);
					RequestDispatcher reg = request.getRequestDispatcher("register.jsp");
					reg.forward(request, response);
					System.out.println("student reg");
					//response.sendRedirect("StudentRegGUI.jsp");
				}
				else
				{
					request.setAttribute("reg", "Registration Failed.");
					RequestDispatcher reg = request.getRequestDispatcher("register.jsp");
					reg.forward(request, response);
					System.out.println("Error");
				}
					
			}
			catch(Exception e)
			{
				
			}
			
		}
		
		
		//Search a Student Based on Student Id by admin
		if(type.equals("viewstudent"))
		{
			sdb=new StudentModel();
			try{
				int j=sdb.SearchStudent(request.getParameter("sid"));
				if(j>0)
				{
					StuGeterSeter std1=sdb.ViewStudent(request.getParameter("sid"));
					
					if(std1!=null)
					{	
					request.setAttribute("std", std1);
					
					RequestDispatcher view = request.getRequestDispatcher("ShowStudent.jsp");
					view.forward(request, response);
					}	
					else
					{
						request.setAttribute("std", "Invalid Student ID.");
						RequestDispatcher view5 = request.getRequestDispatcher("View_stu.jsp");
						view5.forward(request, response);
					}
				}
				else
				{
					request.setAttribute("std", "Invalid Student ID.");
					RequestDispatcher view7 = request.getRequestDispatcher("View_stu.jsp");
					view7.forward(request, response);
				}
	
			}
			catch(Exception e)
			{
				
			}
			
				
		}
	
	}

}

