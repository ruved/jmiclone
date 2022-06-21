<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="CSS/practice.css">
<link rel="stylesheet" type="text/css" href="bootstrap-3.3.6-dist/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="bootstrap-3.3.6-dist\font-awesome-4.7.0\css\font-awesome.css">
<link rel="stylesheet" type="text/css" href="bootstrap-3.3.6-dist\font-awesome-4.7.0\css\font-awesome-min.css">
<script type="text/javascript" src="bootstrap-3.3.6-dist/js/jquery-2.2.3.min.js"></script>
<script type="text/javascript" src="bootstrap-3.3.6-dist/js/bootstrap.min.js"></script>

<title>SIGNUP</title>
</head>
<body style="background-color: #eaeaea;">
<div class="row">
    <div class="col-sm-2">
        <a href="index.jsp"><center><img  src="IMG/150px-Jamia_Millia_Islamia_Logo.svg.png" style="height: 100px; width: 100px; margin-top: 20px;"></center></a>
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

<div class="navbar">

    <h3 style="font-weight: bolder;"><center><span class="glyphicon glyphicon-lock"></span>&nbsp;SIGN-UP</center></h3>
</div>

<form> 
    <div class="form-group container" style=" font-weight: bold;">
        <div class="input-group">
            <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
            <input type="text" placeholder="First-Name" class="form-control" style="width: 50%;">
            <input type="text" placeholder="Last Name" class="form-control" style="width: 50%;">
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
            <input type="number" placeholder="Id-no" class="form-control" style="width: 50%;">
            <label class="input-group-addon"><span style="font-weight: bolder;">MOBILE</span></label>
            <input type="number" class="form-control" placeholder="00000000001" style="width: 50%;">
        </div>
<br>       
         <div class="input-group">
            <label class="input-group-addon"><span style="font-weight: bolder;">EMAIL:</span></label>
            <input type="text" placeholder="Id     ex ( acb@xyz.com  )" class="form-control" style="width: 50%;">
        </div>
        <br><br><br>
        <div style="border-top: dotted 3px grey; padding: 20px;">
            <center><button type="submit" class="btn btn-success">SUBMIT</button>
                    <button type="reset" class="btn btn-danger">RESET</button>
            </center>
        </div>
    </div>
</form>
<!-- 
<div class="fotter"> 
        <p>&copy 2017&nbsp;Jamia Millia Islamia.&nbsp;All rights reserved<br>
        Site Designed & Developed by MNSR</p> 
</div>
 -->
 



</body>
</html>