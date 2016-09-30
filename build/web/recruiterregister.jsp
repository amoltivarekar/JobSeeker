<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<title>Register</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Seeking Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<link href="css/bootstrap-3.1.1.min.css" rel='stylesheet' type='text/css' />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<!-- Custom Theme files -->
<link href="css/style.css" rel='stylesheet' type='text/css' />
<link href='//fonts.googleapis.com/css?family=Roboto:100,200,300,400,500,600,700,800,900' rel='stylesheet' type='text/css'>
<!----font-Awesome----->
<link href="css/font-awesome.css" rel="stylesheet"> 
<!----font-Awesome----->
<script>
    function validateForm() {
    var a = document.forms["recruitform"]["firstName"].value;
    var b = document.forms["recruitform"]["location"].value;
    var c = document.forms["recruitform"]["country"].value;
    var d = document.forms["recruitform"]["email"].value;
    var e = document.forms["recruitform"]["userName"].value;
    var f = document.forms["recruitform"]["password"].value;
    var g = document.forms["recruitform"]["confirmpassword"].value;
    if (a == null || a == "") {
        alert("Name must be filled out");
        return false;
    }
    else if (b == null || b == "") {
        alert("location must be filled out");
        return false;
    }
    else if (c == null || c == "---Select Country---") {
        alert("select valid country");
        return false;
    }
    else if (d == null || d == "") {
        alert("email must be filled out");
        return false;
    }
    else if (e == null || e == "") {
        alert("username must be filled out");
        return false;
    }
    if (f != g) {
        alert("passwords do not match");
        return false;
    }
}
  
</script>
</head>
<body>
<nav class="navbar navbar-default" role="navigation">
	<div class="container">
	    <div class="navbar-header">
	        <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
		        <span class="sr-only">Toggle navigation</span>
		        <span class="icon-bar"></span>
		        <span class="icon-bar"></span>
		        <span class="icon-bar"></span>
	        </button>
	        <a class="navbar-brand" href="index.jsp"><img src="images/logo.png" alt=""/></a>
	    </div>
	    <!--/.navbar-header-->
	    <div class="navbar-collapse collapse" id="bs-example-navbar-collapse-1" style="height: 1px;">
	        <ul class="nav navbar-nav">		        		        
		        <li class="dropdown">
		            <a href="#" class="dropdown-toggle" data-toggle="dropdown">Jobs<b class="caret"></b></a>
		            <ul class="dropdown-menu">
			            <li><a href="Jobs.jsp?jobname='Walk-In'">Walk-ins</a></li>
			            <li><a href="Jobs.jsp?jobname='Part Time'">Part Time Jobs</a></li>
			            <li><a href="Jobs.jsp?jobname='Teaching'">Teaching Jobs</a></li>
			            <li><a href="Jobs.jsp?jobname='Internship'">Internship Jobs</a></li>
			            <li><a href="Jobs.jsp?jobname='Tech Support'">Tech Support</a></li>
                                    <li><a href="Jobs.jsp?jobname='Finance'">Finance Jobs</a></li>
		            </ul>
		        </li>                        
		        <li class="dropdown">
		            <a href="#" class="dropdown-toggle" data-toggle="dropdown">Login<b class="caret"></b></a>
		             <ul class="dropdown-menu">
			            <li><a href="login.jsp">Recruiter's Login</a></li>
			            <li><a href="login.jsp">Jobseeker's Login</a></li>			            
		             </ul>
		        </li>
                        <li class="dropdown">
		            <a href="#" class="dropdown-toggle" data-toggle="dropdown">Register<b class="caret"></b></a>
		             <ul class="dropdown-menu">
			            <li><a href="recruiterregister.jsp">Recruiter Register</a></li>
			            <li><a href="jobseekerregister.jsp">Jobseeker's Register</a></li>			            
		             </ul>
		        </li>
                        <li class="dropdown"><a href="about.jsp">About us</a></li>
                        <li class="dropdown"><a href="contact.jsp">Contact</a></li>
	        </ul>
	    </div>
	    <div class="clearfix"> </div>
	  </div>
	    <!--/.navbar-collapse-->
	</nav>
<div class="container">
    <div class="single">  
	   <div class="form-container">
        <h2>Recruiter Register Form</h2>
        <form name="recruitform" action="registerservlet" method="post" onSubmit="return validateForm()">
          <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="companyName">Company Name</label>
                <div class="col-md-9">
                    <input type="text" path="firstName" name="companyName" class="form-control input-sm" required />
                </div>
            </div>
         </div>         
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="location">Headquarters</label>
                <div class="col-md-9">
                    <input type="text" path="location" name="location" class="form-control input-sm" required />
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="founded">Founded</label>
                <div class="col-md-9">
                    <input type="date" path="founded" name="founded" class="form-control input-sm" required/>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="industry">Industry</label>
                <div class="col-md-9">
                    <input type="text" path="industry" name="industry" class="form-control input-sm" required/>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="ceo">CEO</label>
                <div class="col-md-9">
                    <input type="text" path="ceo" name="ceo" class="form-control input-sm" required/>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="website">Website</label>
                <div class="col-md-9">
                    <input type="text" path="website" name="website" class="form-control input-sm" required/>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="country">Country</label>
                <div class="col-md-9">
                    
                    <select name="countryComboBox" class="form-control input-sm">
                        <option>---Select Country---</option>
                        <option>India</option>
                        <option>USA</option>
                        <option>London</option>
                        <option>Dubai</option>
                    </select>
                </div>
            </div>
        </div>  
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="email">Email</label>
                <div class="col-md-9">
                    <input type="email" path="email" name="email" class="form-control input-sm" required/>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="userName">Username</label>
                <div class="col-md-9">
                    <input type="text" path="userName" name="userName" class="form-control input-sm" required/>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="password">Password</label>
                <div class="col-md-9">
                    <input type="password" path="password" name="password" class="form-control input-sm" required/>
                </div>
            </div>
        </div>
            
              
        <div class="row">
            <div class="form-actions floatRight">
                <input type="submit" value="Register" class="btn btn-primary btn-sm">
            </div>
        </div>
    </form>
    </div>
 </div>
</div>
<div class="footer">
	<div class="container" style="margin-left:370px;">
		<div class="col-md-3 grid_3">
			<h4>Navigate</h4>
			<ul class="f_list f_list1">
				<li><a href="index.jsp">Home</a></li>
				<li><a href="login.jsp">Sign In</a></li>
				<li><a href="login.jsp">Join Now</a></li>
				<li><a href="about.jsp">About</a></li>
			</ul>
			<ul class="f_list">
				<li><a href="features.jsp">Features</a></li>
				<li><a href="terms.jsp">Terms of use</a></li>
				<li><a href="contact.jsp">Contact Us</a></li>
				<li><a href="jobs.jsp">Post a Job</a></li>
			</ul>
			<div class="clearfix"> </div>
		</div>		
		<div class="col-md-3 grid_3">
			<h4>Seeking</h4>
			<p>There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable. </p>
		</div>		
		<div class="clearfix"> </div>
	</div>
</div>
</body>
</html>	