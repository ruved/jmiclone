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

     <form> 
        <div class="form-group container" style=" font-weight: bold; border: dotted 3px green ; ">    
            <div class="input-group">
                <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                <input type="text" placeholder="First-Name" class="form-control" style="width: 50%;" disabled="disabled">
                <input type="text" placeholder="Last Name" class="form-control" style="width: 50%;" disabled="disabled">
            </div>
            <br>
            <div class="input-group">
                <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
                <input type="text" placeholder="password" class="form-control" style="width: 100%;">
                <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
                <input type="text" placeholder="Repeat-Password" class="form-control" style="width: 100%;">
            </div>
            <br>
            <div class="input-group">
                <label class="input-group-addon"><span style="font-weight: bolder;">Student_Id</span></label>
                <input type="number" placeholder="Id-no" class="form-control" disabled="disabled">
                <label class="input-group-addon"><span style="font-weight: bolder;">DATE OF BIRTH</span></label>
                <input type="date" class="form-control" disabled="disabled">
           
            </div>
            <br>
            <div >
                <div class="input-group">
                    <label class="input-group-addon" ><span style="font-weight: bolder;">Father-Name &nbsp;</span></label>
                    <input type="text" placeholder="Name" class="form-control" disabled="disabled">
                    <label class="input-group-addon" ><span style="font-weight : bolder;">Mother-Name</span></label>
                    <input type="text" placeholder="Name" class="form-control" disabled="disableds">
                </div>
            </div>
            <br>
            <div style="border-top: dotted 3px grey; padding-top: 10px;">
                <div class="input-group" >
                    <label class="input-group-addon"><span style="font-weight: bolder;">ADDRESS</span></label>
                    <input type="text" placeholder="Line 1 (BUILDING NO, STREET ,LOCALITY)" class="form-control">
                    <input type="text" class="form-control" placeholder="Line 2 (DISTRICT , LANDMARK)">
                </div>
                <div class="input-group" style="width: 80%">
                    <label class="input-group-addon"><span style="font-weight: bolder;">STATE</span></label>
                    <input type="text" class="form-control" placeholder="State-Name">

                    <label class="input-group-addon"><span style="font-weight: bolder;">COUNTRY</span></label>
                    <input type="text"  class="form-control " placeholder="dummy";> 
                
                    <label class="input-group-addon"><span style="font-weight: bolder;">PIN</span></label>
                    <input type="number" class="form-control" placeholder="00000">

                    <label class="input-group-addon"><span style="font-weight: bolder;">MOBILE</span></label>
                    <input type="number" class="form-control" placeholder="00000000001">
                </div>
            </div>
            <br>
            
            <br>
            <div class="input-group" style="border-top: dotted 3px grey; padding-top: 10px;">
                <label class="input-group-addon" ><span style="font-weight: bolder;">GUARDIAN</span></label>
                <input type="text" placeholder="Name" class="form-control" style="width: 50%;">
                <br>
            </div>
            <div >
                <div class="input-group" >
                    <label class="input-group-addon"><span style="font-weight: bolder;">G.ADDRESS</span></label>
                    <input type="text" placeholder="Line 1 (BUILDING NO, STREET ,LOCALITY)" class="form-control">
                    <input type="text" class="form-control" placeholder="Line 2 (DISTRICT , LANDMARK)">
                </div>
                <div class="input-group" style="width: 75%">
                    <label class="input-group-addon"><span style="font-weight: bolder;">STATE</span></label>
                    <input type="text" class="form-control" placeholder="State-Name">

                    <label class="input-group-addon"><span style="font-weight: bolder;">COUNTRY</span></label>
                    <input type="text"  class="form-control " placeholder="dummy";>        
                
                    <label class="input-group-addon"><span style="font-weight: bolder;">PIN</span></label>
                    <input type="number" class="form-control" placeholder="00000">

                    <label class="input-group-addon"><span style="font-weight: bolder;">MOBILE</span></label>
                    <input type="number" class="form-control" placeholder="00000000001">
                </div>
            </div>
            <br><br><br>
            <div class="input-group" style="border-top: dotted 3px grey; padding-top: 10px;">
                <label class="input-group-addon" ><span style="font-weight: bolder;">LAST SCHOOL</span></label>
                <input type="text" placeholder="Name" class="form-control" style="width: 33%;" disabled="disabled">
            </div>
            <div class="input-group">
                <label class="input-group-addon" ><span style="font-weight: bolder;">PERCENTAGE /CGPA</span></label>
                <input type="text" placeholder="value" class="form-control" style="width: 33%;" disabled="disabled">
            </div>
            <div class="input-group" style="padding-bottom: 10px;">
                <label class="input-group-addon" ><span style="font-weight: bolder;">YEAR OF PASSING</span></label>
                <input type="text" placeholder="YEAR" class="form-control" style="width: 33%;" disabled="disabled">
            </div>
            <div style="border-top: dotted 3px grey; padding: 20px;">
               <center><button type="submit" class="btn btn-success">UPDATE</button>
                </center>
            </div>
        </div>
    </form>
</div>



<div class="fotter"> 
        <p>&copy 2017&nbsp;Jamia Millia Islamia.&nbsp;All rights reserved<br>
        Site Designed & Developed by MNSR</p> 
</div>
</body>
</html>