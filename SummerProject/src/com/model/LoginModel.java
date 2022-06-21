package com.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.controller.LoginServ;
import com.utility.DBConnection;

public class LoginModel {
	public static ResultSet RS=null;
	LoginServ L;
	

	public LoginServ connectDB(String user_id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		DBConnection db=new DBConnection();
		
		L=new LoginServ();
		//System.out.println("in model");

		try {
						L.setUser_id("");
						L.setPass_word("");
						L.setUtype("");
							//System.out.println(user_id);
						db.st=db.con.createStatement();
					    String s="select USER_NAME,USER_ID,PASS_WORD,UTYPE from orddata.login where USER_ID='"+user_id+"' AND STATUS='active'";
							
							RS =db.st.executeQuery(s);
						//	System.out.println(RS.user_name);
		               // System.out.println("executed");
		                while(RS.next())
		                {          
		                	System.out.println("executed query inside");
		                	String d_usrname=RS.getString("user_name"); 
		                    String d_usrid=RS.getString("user_id");
		                    String d_pass=(RS.getString("pass_word")).toString();
		                    String d_utype=(RS.getString("utype"));
		                    L.setUser_name(d_usrname);
		                    L.setUser_id(d_usrid);
		                    L.setPass_word(d_pass);
		                    L.setUtype(d_utype);
		                    System.out.println("in model");
		                    System.out.println(d_usrname+" "+d_usrid+" "+d_pass+" "+d_utype);
		                }

		        }
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
		    if(db.con!=null)
		    {
		    db.st.close();
		    db.con.close();
		    }
		}
		return L;
	}

}

