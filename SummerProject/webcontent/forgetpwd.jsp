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
<title>Forget Password</title>
</head>
<body style="background-color: #f1f1f1; font-size: 18px;">
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
				<li ><a href="index.jsp"><span class="glyphicon glyphicon-home" style="font-style: none; font-size: 19px; color:black;"></span>&nbsp;Home</a></li>&nbsp;  &nbsp; 
				<li><a href="aboutus.jsp" ><span class="fa fa-bullhorn" style="font-style: none; font-size: 19px;  color:black; color:black;"></span>&nbsp;About us </a></li> &nbsp;  &nbsp;
				<li><a href="faculty.jsp"><span class="fa fa-building-o" style="font-style: none; font-size: 19px;  color:black;"></span> &nbsp;Faculty</a></li>&nbsp; &nbsp;
				<li><a href="contact.jsp" ><span class="glyphicon glyphicon-phone-alt" style="font-style: none; font-size: 19px;  color:black;"></span> &nbsp;Contact us </a></li> &nbsp; &nbsp;
			</ul>
	</div>
<div style="width: 500px; color: #000000; border-style:solid; border-color: #293D3D;border-width:thin;margin-left: 30%;margin-top:40px;" align="center" >

<form  id="forgotPwd" method="post" action="ForgotPasswordServ">
<label ><h3>Let&#x27;s access your account</h3></label>
<center><table>
	
		<tr>
			<td>
        	<label for="username">What is your email address?</label>
        	
            <input name="inputEmail" type="email" class="form-control" id="inputEmail" placeholder="Enter Email" data-error="Enter valid Email" required>
            </td>
        </tr>
        <tr>
			<td align="center"><br>
            <button type="submit" value="Continue">Continue</button>
            </td>
        </tr>
    
</table> </center><br>             
</form>
</div>

</body>
</html>