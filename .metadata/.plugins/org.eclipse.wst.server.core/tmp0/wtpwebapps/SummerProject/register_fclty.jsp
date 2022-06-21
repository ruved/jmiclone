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

<title>REGISTER</title>
<style type="text/css">

li a:hover, .dropdown:hover .dropbtn {
    background-color: white;
}

li.dropdown {
    display: inline-block;
}

.dropdown-content {
    display: none;
    position: absolute;
    background-color: #f9f9f9;
    min-width: 160px;
    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
    z-index: 1;
}

.dropdown-content a {
    color: black;
    padding: 12px 16px;
    text-decoration: none;
    display: block;
    text-align: left;
}

.dropdown-content a:hover {background-color: #f1f1f1}

.dropdown:hover .dropdown-content {
    display: block;
}
</style>
</head>
<body style="background-color: #eaeaea;">
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
            <li class="dropdown"><a href="javascript:void(0)" class="dropbtn"><span class="glyphicon glyphicon-log-in"></span>&nbsp;&nbsp;VIEW</a>
            <div class="dropdown-content">
      			<a href="View_stu.jsp">View Student</a>
      			<a href="View_fclty.jsp">View Faculty</a>
      		</div>
            </li>
            <li class="dropdown"><a href="javascript:void(0)" class="dropbtn"><span class="glyphicon glyphicon-time"></span>&nbsp;&nbsp;UPDATE</a>
            <div class="dropdown-content">
      			<a href="update.jsp">Update Student</a>
      			<a href="update_fclty.jsp">Update Faculty</a>
      		</div>
            </li>
            <li class="dropdown"><a href="javascript:void(0)" class="dropbtn"><span class="glyphicon glyphicon-trash"></span>&nbsp;&nbsp;DELETE</a>
            <div class="dropdown-content">
      			<a href="delete.jsp">Delete Student</a>
      			<a href="delete_fclty.jsp">Delete Faculty</a>
      		</div>
      		</li>
            <li class="dropdown"><a href="javascript:void(0)" class="dropbtn"><span class="glyphicon glyphicon-edit"></span>&nbsp;&nbsp;REGISTER</a>
            <div class="dropdown-content">
      			<a href="register.jsp">Register Student</a>
      			<a href="register_fclty.jsp">Register Faculty</a>
      		</div>
            </li>
           

    </ul>
    <ul class="nav navbar-nav navbar-right">
        <li ><a href="profile.jsp" style="background-color: #eaeaea ; border-radius: 20px;" id="qwe"><span class="glyphicon glyphicon-user" style="font-size: 18px;"></span>&nbsp;&nbsp;<%=session.getAttribute("user_name")%><br></a></li>&nbsp; 
        <a href="index.jsp" style="padding: 10px; text-decoration: none; color: #ffffff;" id="off"><button class="btn btn-danger" style="padding: 13px; border-radius: 20px;"><span class="glyphicon glyphicon-off" style="font-size: 18px; color: white;"></span><span style="color: white; font-size:20px; padding: 5px;">&nbsp;&nbsp;Sign Out</span></button></a>&nbsp; &nbsp;
    </ul>
 </div>
</body>
</html>