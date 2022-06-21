<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="shortcut icon" href="IMG/jamia.ico" type="image/ico"/>
<link rel="stylesheet" type="text/css" href="CSS/practice.css">
<link rel="stylesheet" type="text/css" href="bootstrap-3.3.6-dist/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="bootstrap-3.3.6-dist\font-awesome-4.7.0\css\font-awesome.css">
<link rel="stylesheet" type="text/css" href="bootstrap-3.3.6-dist\font-awesome-4.7.0\css\font-awesome-min.css">
<script type="text/javascript" src="bootstrap-3.3.6-dist/js/jquery-2.2.3.min.js"></script>
<script type="text/javascript" src="bootstrap-3.3.6-dist/js/bootstrap.min.js"></script>
<title><%=session.getAttribute("user_name")%></title>
</head>
<body style="background-color: #eaeaea;">
<%response.setHeader("Cache-Control","no-store");
response.setHeader("Pragma","no-cache");
response.setDateHeader ("Expires", 0); 
%>
<%
if((session.getAttribute("user_id"))!=null&&(session.getAttribute("pass_word")!=null))
{
%>


<%
    }
    else
    {
    %>
    <jsp:forward page="index.jsp"/>
    <%
     }
    %>
<div class="row">
            <div class="col-sm-2">
                <a href=""><center><img src="IMG/150px-Jamia_Millia_Islamia_Logo.svg.png" style="height: 100px; width: 100px; margin-top: 20px;"></center></a>
            </div>
            <div class="col-sm-8">
                <center>
                <h1>JAMIA MILLIA ISLAMIA<br>
                <span style="font-size: 30px;">(A Central University)</span><br>
                <span style="font-size: 20px;">NAAC Accredited 'A' Grade</span></h1>
                </center>
            </div >
            <div class="col-sm-2">
            </div>
</div>
<div class=" list nav navbar">
    <ul class=" nav navbar-nav ">
            <li><a href="stu_update_profile.jsp"><span class="glyphicon glyphicon-time"></span>&nbsp;&nbsp;UPDATE PROFILE</a></li>
           

    </ul>
    <ul class="nav navbar-nav navbar-right">
        <li ><a href="StudentProfile.jsp"  style="background-color: #eaeaea ; border-radius: 20px;" id="qwe"><span class="glyphicon glyphicon-user" style="font-size: 18px;"></span>&nbsp;&nbsp;<span><%=session.getAttribute("user_name")%></span></a></li>&nbsp; 
        <a href="index.jsp" style="padding: 10px; text-decoration: none; color: #ffffff;" id="off"><button class="btn btn-danger" style="padding: 13px; border-radius: 20px;"><span class="glyphicon glyphicon-off" style="font-size: 18px; color: white;"></span><span style="color: white; font-size:20px; padding: 5px;">&nbsp;&nbsp;Sign Out</span></button></a>&nbsp; &nbsp;
    </ul>
 </div>
 <div class="container-fluid" id="listdown">
    <div class="row">
        <div class="col-sm-3" style="border-right: solid green 2px; height: 400px;">
        <% 
		java.sql.Connection con;
		java.sql.Statement s;
		java.sql.ResultSet rs;
		java.sql.PreparedStatement pst;

		con=null;
		s=null;
		pst=null;
		rs=null;
		
			try{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				con=java.sql.DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","SYSTEM","Ruvednisha");
	     		//System.out.println("connection success");
	     		}catch(ClassNotFoundException cnfex){
				cnfex.printStackTrace();
				}
				String sql = "select STUDENT_ID, FIRST_NAME,to_char(DATE_OF_BIRTH,'dd-MON-yyyy') from student_MST where STUDENT_ID='201701009'";
				
				try{
					s = con.createStatement();
					rs = s.executeQuery(sql);
		%>
		<%
			while( rs.next() ){
		%>
		 
        <center>
           
            <img src="IMG/stu_photo/201701009.png" name="img" height="100" width="100" id="mar2"></img><br/><br/>
					<br>
              
            <p style="margin-top: 10px; font-size:17.5px;">
                <span style=" font-weight: bold;">NAME:</span>&nbsp;&nbsp;<%=session.getAttribute("user_name")%><br>
                <span style=" font-weight: bold;">D.O.B:</span> &nbsp;&nbsp;<%=rs.getString("to_char(DATE_OF_BIRTH,'dd-MON-yyyy')")%><br>

                <span style=" font-weight: bold;">STUDENT ID:</span>&nbsp;&nbsp;<%=rs.getString("STUDENT_ID")%><br>
                <span style=" font-weight: bold;">COURSE:</span>&nbsp;&nbsp;DIPLOMA IN COMPUTER ENGG<br>

            </p>
        </center>
        
        </div>
        <div class="col-sm-6"  style="border-right: solid green 2px; height: 400px;">
            </div>
        <div class="col-sm-3"  style="height: 400px;">
                <p style="margin-top: 10px; font-size:17.5px;">
                <span style=" font-weight: bold;">ADDRESS:</span>&nbsp;F-19/14,3rd FLOOR<br>
                NAFEES ROAD,BATLA HOUSE,<br>
                JAMIA NAGAR ,<br>
                NEW DELHI-110025.<br>
                </p>
                <p>
                <center>
                    <span class="glyphicon glyphicon-phone" style="font-size: 20px;">:&nbsp;9990300465</span><br>
                    <span class="glyphicon glyphicon-envelope" style="font-size: 20px;">:&nbsp;syedshadan0513@gmail.com</span>
                </center>
                </p></span>
               <%
			}
			%>
			<%
				}
					catch(Exception e){e.printStackTrace();}
					finally{
					if(rs!=null) rs.close();
					if(s!=null) s.close();
					if(con!=null) con.close();
				}
			%>
        </div>

    </div>

</div>

<div class="fotter"> 
        <p>&copy 2017&nbsp;Jamia Millia Islamia.&nbsp;All rights reserved<br>
        Site Designed & Developed by MNSR</p> 
</div>
 

</body>
</html>