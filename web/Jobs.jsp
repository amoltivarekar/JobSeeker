<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>

<%!
    ResultSet rs=null;
%>
<%
    try{
            String jobnm=request.getParameter("jobname");
            String url="jdbc:oracle:thin:@localhost:1521:XE";
            String username="AMOL";
            String password="12345";
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection(url,username,password);
            
            PreparedStatement pst=con.prepareStatement("select jobname,jobloc,jobdesc,companyname,salaryrange from jobs where jobtype="+jobnm);
            rs = pst.executeQuery(); 
    }
    catch(Exception e){}
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<title>Jobs</title>
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
	   <div class="col-md-9 single_right">
	      <div class="but_list">
	       <div class="bs-example bs-example-tabs" role="tabpanel" data-example-id="togglable-tabs">
			<ul id="myTab" class="nav nav-tabs" role="tablist">
			  <li role="presentation" class="active"><a href="#home" id="home-tab" role="tab" data-toggle="tab" aria-controls="home" aria-expanded="true">Available jobs</a></li>			  
                        </ul>
		<div id="myTabContent" class="tab-content">
		  <div role="tabpanel" class="tab-pane fade in active" id="home" aria-labelledby="home-tab">
                        <div class="tab_grid">
			    <div class="jobs-item with-thumb">
                                <% while(rs.next()){%>
				    <div class="thumb"><a href="jobs_single.jsp"><img src="images/a2.jpg" class="img-responsive" alt=""/></a></div>
				    <div class="jobs_right">
						<div class="date_desc"><h6 class="title">Name : <a href="jobs_single.jsp"><%out.print(""+rs.getString(1));%></a></h6>
                                                    <span class="meta"><b>Location : </b><a><%out.print(""+rs.getString(2));%></a></span>
						</div>                       
                                                  <b>Description : </b><a class="description"><%out.print(""+rs.getString(3));%></a>
                                                  <br><b>Company : </b><a class="description"><%out.print(""+rs.getString(4));%></a>
                                                  <br><b>Salary Range : </b><a class="description"><%out.print(""+rs.getString(5));%></a>
                                    </div>
					<div class="clearfix"> </div><br><br>
                                        <%}%>
                                        
				</div>
                        </div>
		  </div>		  
	  </div>
                                        
     </div>
    </div>    
   </div>   
  <div class="clearfix"> </div>
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