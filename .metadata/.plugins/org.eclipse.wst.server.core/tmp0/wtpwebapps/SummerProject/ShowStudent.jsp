<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.utility.*"%>
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
 <%StuGeterSeter std=(StuGeterSeter)request.getAttribute("std");
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
            <li><a href="View_stu.jsp"><span class="glyphicon glyphicon-log-in"></span>&nbsp;&nbsp;VIEW</a></li>
            <li><a href="update.jsp"><span class="glyphicon glyphicon-time"></span>&nbsp;&nbsp;UPDATE</a></li>
            <li><a href="delete.jsp"><span class="glyphicon glyphicon-trash"></span>&nbsp;&nbsp;DELETE</a></li>
            <li><a href="register.jsp"><span class="glyphicon glyphicon-edit"></span>&nbsp;&nbsp;REGISTER</a></li>

    </ul>
    <ul class="nav navbar-nav navbar-right">
        <li ><a href="profile.jsp" style="background-color: #eaeaea ; border-radius: 20px;" id="qwe"><span class="glyphicon glyphicon-user" style="font-size: 18px;"></span>&nbsp;&nbsp;<span><%=session.getAttribute("user_name")%></span></a></li>&nbsp; 
        <a href="index.jsp" style="padding: 10px; text-decoration: none; color: #ffffff;" id="off"><button class="btn btn-danger" style="padding: 13px; border-radius: 20px;"><span class="glyphicon glyphicon-off" style="font-size: 18px; color: white;"></span><span style="color: white; font-size:20px; padding: 5px;">&nbsp;&nbsp;Sign Out</span></button></a>&nbsp; &nbsp;
    </ul>
 </div>

 <div id="printThis" align="center"><b>Student Details</b><br/>
		<table  align="center" border=1  style="border-color:black; border-style:solid; border-width: thick;">
			<tr>
				<th>Personal Details</th><th>Contact Details</th><th>School Details</th>
			</tr>
			<tr>
				<td align="center">
					<img src="IMG/stu_photo/<%=std.getStu_Id()%>.png" name="img" height="100" width="100" id="mar2"></img><br/><br/>
					<label>Student ID: </label><b><%=std.getStu_Id()%></b><br/>
					<label>Batch: </label><br/>
					<label>Name:  </label><%=std.getFirst_name()%><br/>
					<label>Gender:</label><br/>
					<label>DOB:   </label><%=std.getStu_DOB()%>
				</td>
				<td align="left">
					<label>Address:  </label><br/><br/>
					<label>State:    </label><br/><br/>
					<label>Pin Code:    </label><br/><br/>
					<label>Phone No: </label><br/><br/>
					<label>Email Id: </label><br/><br/>
				</td>
				<td align="left">
					<label>School Name:  </label><br/><br/>
					<label>Course:  </label><br/><br/>
					<label>Total Fee Amt: <img src="img/logo/rupee.jpg" height="15" width="15" id="mar2"></img>
					</label><br/><br/>
				</td>
				
			</tr>
		</table>
	</div>

</body>
</html>