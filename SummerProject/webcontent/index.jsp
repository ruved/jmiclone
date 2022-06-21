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
<script type="text/javascript" src="bootstrap-3.3.6-dist/js/bootstrap.min.js"></script><title>WELCOME TO JMI</title>
<style>
</style>
<title></title>
</head>
<body style="background-color: #f1f1f1">
	<div class="row">
				<div class="col-sm-2">
					<a href="index.jsp"><center><img src="IMG/150px-Jamia_Millia_Islamia_Logo.svg.png" style="height: 100px; width: 100px; margin-top: 20px;"></center></a>
				</div>
				<div class="col-sm-8">
					<p>
						<center>
						<h1>JAMIA MILLIA ISLAMIA<br>
						<span style="font-size: 30px;">(A Central University)</span><br>
						<span style="font-size: 20px;">NAAC Accredited 'A' Grade</span></h1>
						</center>
					</p>
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
<div class="container-fluid">	 
	<div class="row" id="listdown">
		<div class="col-sm-2">
			<a href=""><img src="IMG/talat.jpg" style="	height: 220px;  width: 180px; margin-top: 40px;"></a>
		</div>


		 <div class="col-sm-7">
			<h3><b>Vice-Chancellor's Message :</b></h3>
			<p style="font-size: 15px;">Jamia Millia Islamia came into existence in1920 through the tireless efforts of its founders, such as Shaikhul Hind Maulana Mahmud Hasan, Maulana Muhammad Ali Jauhar, Hakim Ajmal Khan, Dr. Mukhtar Ahmad Ansari, Jenab Abdul Majeed Khwaja and Dr. Zakir Husain. It symbolizes the unflinching and resolute commitment of these great visionaries in bringing about socio-economic transformation of common masses, in general, and Muslims, in particular through the vehicle of education. The distinct identity of Jamia Millia Islamia has been eloquently explicated by Dr. Zakir Husain Sahib, and I quote,
					<br><br>
	 	 <span style="margin-left: 20px;">The movement of Jamia Millia Islamia is a struggle for education and cultural renaissance. It will prepare a blueprint for Indian Muslims which may focus on Islam but simultaneously evolve a national culture for common Indian. It will lay the foundation of the thinking that true religious education will promote patriotism and national integration among Indian Muslims, who will be proud to take part in the future progress of India, which will play its part in the comity of nations for peace and development. The objective of establishment of Jamia Millia Islamia will be to lay down the common curriculum for Indian Muslims taking into account the future challenges and will prepare the children to be masters of  future</span></p>


		</div>
		<div class="col-sm-3">
			<form  id="form" method="post" action="LoginServ">
				<div class="form-group" >
						<h2>Login</h2>	<br>	
						<label>Username&nbsp;&nbsp;<span class="glyphicon glyphicon-user"></span></label></br>
						<input class="form-control" type="text" name="user_id" placeholder="UserID"><br>
						<label>Password&nbsp;&nbsp;<span class="glyphicon glyphicon-lock"></span></label>
						<input class="form-control" type="Password" name="pass_word" placeholder="password"  "><br>
						<label>I AM</label></br>
						<select class="form-control" name="utype"><br>
							<option id="t1" value="admin">Administration</option>
							<option id="t2" value="student">Student</option>
							<option id="t3" value="faculty">faculty</option>
						</select>
						<br>
						<button class=" btn btn-info " type="submit">Sign In</button>
						</form>
						<form action="signup.jsp">
						<a href="forgetpwd.jsp"  style="text-decoration: none;">
						<span class="fa fa-cogs" style="margin-top: 15px;">&nbsp;Forget PasswoRd</span></a>
						<button class=" btn btn-danger"  type="submit" style="float: right;">Sign up</button></form>
				</div>
			</div>
	</div>

		<div style="padding: 20px;">
		<CENTER>
			<ul >
				<a href=""><img src="IMG/img1.jpg" height="180px" width="230px"></a></li>
				<a href=""><img src="IMG/img2.jpg" height="180px" width="230px"></a></li>
				<a href=""><img src="IMG/img3.jpg" height="180px" width="230px"></a></li>
				<a href=""><img src="IMG/img4.jpg" height="180px" width="230px"></a></li>
			</ul>
		</CENTER>
		</div>
	</div>
</div>
<div class="fotter"> 
		<p>&copy 2017&nbsp;Jamia Millia Islamia.&nbsp;All rights reserved<br>
		Site Designed & Developed by MNSR</p> 
</div>

</body>
</html>