package com.model;


import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.utility.DBConnection;
import com.utility.StuGeterSeter;

public class StudentModel {
	public static ResultSet RS=null;
	public int AddStudent(StuGeterSeter std) throws SQLException, ClassNotFoundException {
		DBConnection db=new DBConnection();
		int check=0;
		try{
			
			System.out.println("In Model2");
			String dob=std.getStu_DOB();
			StringBuffer Query1 = new StringBuffer();
			Query1.append("insert into orddata.STUDENT_MST values(");	
			Query1.append("stu_id_seq.nextval");
			Query1.append(",'"+ std.getFirst_name()+"'");
			//Query1.append(std.getFirst_name());
			System.out.println("Student Name:"+std.getFirst_name() );
			Query1.append(",to_date('"+dob+"','dd-mm-yyyy')");
			System.out.println("Student date of birth:"+dob );
			Query1.append(")");
			db.st=db.con.createStatement();
			check = db.st.executeUpdate(Query1.toString());
			
			
			if (check >0)
			{
				System.out.println("Insertion successful");
			    int stu_Id=0;
			    System.out.println("Student DOB:" +std.getStu_DOB());
			String Query6="select Student_Id from Orddata.student_mst where DATE_OF_BIRTH=to_date('"+std.getStu_DOB()+"','dd-mm-yyyy')";
			RS=db.st.executeQuery(Query6);
			while(RS.next())
			{
				stu_Id=RS.getInt("Student_Id");
			}
			std.setStu_Id(stu_Id);
			System.out.println("Student ID Generated:"+stu_Id);
			}

			
		}
		catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.getMessage();
		}

		finally
		{
		    if(db.con!=null)
		    {
		    db.st.close();
		    db.con.close();
		    }
		}
			return check;	
		
	}
	
	public int SearchStudent(String sid) throws SQLException, ClassNotFoundException
	{
		ResultSet RS1=null;
		DBConnection db=new DBConnection();
		Integer ssid=Integer.parseInt(sid);
		int i=0;
		try{	
			System.out.println("SID:"+ssid);
			String QueryS="select * from orddata.student_MST where STUDENT_ID='"+ssid+"'";
			db.st=db.con.createStatement();
			RS1=db.st.executeQuery(QueryS);
			while(RS1.next())
			{
				i++;
			}
			
		}
		catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.getMessage();
		}

		finally
		{
		    if(db.con!=null)
		    {
		    	RS1.close();
		    	
		    db.st.close();
		    db.con.close();
		    }
		}
			return i;
		
	}
	
	
	//View an Student Detail
		public StuGeterSeter ViewStudent(String sid) throws SQLException, ClassNotFoundException
		{
			//ResultSet RS1=null;
			ResultSet RS3=null;
			StuGeterSeter std=new StuGeterSeter();
			System.out.println("In Add Student DB");
			DBConnection db=new DBConnection();
			Integer ssid=Integer.parseInt(sid);
			System.out.println("view student"+ssid);
			int check=0;
			try{
				
				int i=0,j=0;
				Blob image = null;
				byte[] imgData = null;
				System.out.println("SID:"+ssid);
				String QueryS="select STUDENT_ID, FIRST_NAME,DATE_OF_BIRTH from orddata.student_MST where STUDENT_ID='"+ssid+"'";
				db.st=db.con.createStatement();
				RS3=db.st.executeQuery(QueryS);
				
				
				while(RS3.next())
				{
					i++;
					j++;
					System.out.println(RS3.getString("FIRST_NAME"));
					//std.setStu_photo(RS3.getBlob("STU_PHOTO"));
					std.setStu_Id(RS3.getInt("STUDENT_ID"));
					std.setFirst_name(RS3.getString("FIRST_NAME"));
					std.setStu_DOB(RS3.getDate("DATE_OF_BIRTH").toString());
					//System.out.println("Student Status:"+std.getStu_Status() );
					//image = std.setStu_photo(RS3.getRAW((RAW)cast_to_raw("STU_PHOTO")));
					//imgData = image.getBytes(1, (int) image.length());
					//OutputStream o = response.getOutputStream();
					//response.setContentType("image/gif");
					
				}
				
								
				System.out.println("check"+check);
				if (i >0)
				{
					System.out.println(" successful");
				}	
				else 
					System.out.println(" not successful");

				
			}
			catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.getMessage();
			}

			finally
			{
			    if(db.con!=null)
			    {
			    	//RS1.close();
			    	RS3.close();
			    db.st.close();
			    db.con.close();
			    }
			}
				return std;
			
		}

}
