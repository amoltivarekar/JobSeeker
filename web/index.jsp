<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<title>Home</title>
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
  <div class="grid_1">
	 <h3>Featured Employers</h3>
	   <ul id="flexiselDemo3">
               <li><a href="https://www.google.com"><img src="images/c1.gif"  class="img-responsive" /></a></li>
		  <li><img src="images/c2.gif"  class="img-responsive" /></li>
		  <li><img src="images/c3.gif"  class="img-responsive" /></li>
		  <li><img src="images/c4.gif"  class="img-responsive" /></li>
		  <li><img src="images/c5.gif"  class="img-responsive" /></li>
		  <li><img src="images/c6.gif"  class="img-responsive" /></li>	
	    </ul>
	    <script type="text/javascript">
		 $(window).load(function() {
			$("#flexiselDemo3").flexisel({
				visibleItems: 6,
				animationSpeed: 1000,
				autoPlay: true,
				autoPlaySpeed: 3000,    		
				pauseOnHover: true,
				enableResponsiveBreakpoints: true,
		    	responsiveBreakpoints: { 
		    		portrait: { 
		    			changePoint:480,
		    			visibleItems: 1
		    		}, 
		    		landscape: { 
		    			changePoint:640,
		    			visibleItems: 2
		    		},
		    		tablet: { 
		    			changePoint:768,
		    			visibleItems: 3
		    		}
		    	}
		    });
		    
		});
	   </script>
	   <script type="text/javascript" src="js/jquery.flexisel.js"></script>
	 </div>
	 <div class="single">  
	   <div class="col-md-4">
	   	  <div class="col_3">
	   	  	<h3>Todays Jobs</h3>
	   	  	<ul class="list_1">
	   	  		<li><a href="#">Department of Health - Western Australia</a></li>
	   	  		<li><a href="#">Australian Nursing Agency currently require experiences</a></li>		
	   	  		<li><a href="#">Russia Nursing Agency currently require experiences</a></li>
	   	  		<li><a href="#">The Government of Western Saudi Arbia</a></li>		
	   	  		<li><a href="#">Department of Health - Western Australia</a></li>
	   	  		<li><a href="#">Australian Nursing Agency currently require experiences</a></li>		
	   	  		<li><a href="#">Russia Nursing Agency currently require experiences</a></li>
	   	  		<li><a href="#">The Scientific Publishing Services in Saudi Arbia</a></li>	
	   	  		<li><a href="#">BPO Private Limited in Canada</a></li>		
	   	  		<li><a href="#">Executive Tracks Associates in Pakistan</a></li>
	   	  		<li><a href="#">Pyramid IT Consulting Pvt. Ltd. in Pakistan</a></li>						
	   	  	</ul>
	   	  </div>
	   	  <div class="col_3">
	   	  	<h3>Jobs by Category</h3>
	   	  	<ul class="list_2">
	   	  		<li><a href="#">Railway Recruitment</a></li>
	   	  		<li><a href="#">Air Force Jobs</a></li>		
	   	  		<li><a href="#">Police Jobs</a></li>
	   	  		<li><a href="#">Intelligence Bureau Jobs</a></li>		
	   	  		<li><a href="#">Army Jobs</a></li>
	   	  		<li><a href="#">Navy Jobs</a></li>		
	   	  		<li><a href="#">BSNL Jobs</a></li>
	   	  		<li><a href="#">Software Jobs</a></li>	
	   	  		<li><a href="#">Research Jobs</a></li>								
	   	  	</ul>
	   	  </div>	   	  
	 </div>
	   <div class="col-md-8">
	      <div class="col_1">
   	        <div class="col-sm-4 row_2">
				<a href="single.jsp"><img src="images/a1.jpg" class="img-responsive" alt=""/></a>
			</div>
			<div class="col-sm-8 row_1">
				<h4><a href="single.jsp">It is a long established fact</a></h4>
				<h6>SIt is a long <span class="dot">Â·</span> Jul. 31, 2015</h6>
				<p>There are many variations of passages of Lorem Ipsum available, but the majority have suffered</p>
				<div class="social">	
					<a class="btn_1" href="#">
						<i class="fa fa-facebook fb"></i>
						<span class="share1 fb">Share</span>								
					</a>
					<a class="btn_1" href="#">
						<i class="fa fa-twitter tw"></i>
						<span class="share1">Tweet</span>								
					</a>
					<a class="btn_1" href="#">
						<i class="fa fa-google-plus google"></i>
						<span class="share1 google">Share</span>
					</a>
			   </div>
			</div>
			<div class="clearfix"> </div>
		   </div>
		   <div class="col_1">
   	         <div class="col-sm-4 row_2">
				<a href="single.jsp"><img src="images/a2.jpg" class="img-responsive" alt=""/></a>
			</div>
			<div class="col-sm-8 row_1">
				<h4><a href="single.jsp">Lorem Ipsum is simply dummy</a></h4>
				<h6>SIt is a long <span class="dot">Â·</span> Jul. 31, 2015</h6>
				<p>Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium.</p>
				<div class="social">	
					<a class="btn_1" href="#">
						<i class="fa fa-facebook fb"></i>
						<span class="share1 fb">Share</span>								
					</a>
					<a class="btn_1" href="#">
						<i class="fa fa-twitter tw"></i>
						<span class="share1">Tweet</span>								
					</a>
					<a class="btn_1" href="#">
						<i class="fa fa-google-plus google"></i>
						<span class="share1 google">Share</span>
					</a>
			   </div>
			</div>
			<div class="clearfix"> </div>
		   </div>
		   <div class="col_1">
   	        <div class="col-sm-4 row_2">
				<a href="single.jsp"><img src="images/a3.jpg" class="img-responsive" alt=""/></a>
			</div>
			<div class="col-sm-8 row_1">
				<h4><a href="single.jsp">There are many variations</a></h4>
				<h6>SIt is a long <span class="dot">Â·</span> Jul. 31, 2015</h6>
				<p>YBut I must explain to you how all this mistaken idea of denouncing pleasure.</p>
				<div class="social">	
					<a class="btn_1" href="#">
						<i class="fa fa-facebook fb"></i>
						<span class="share1 fb">Share</span>								
					</a>
					<a class="btn_1" href="#">
						<i class="fa fa-twitter tw"></i>
						<span class="share1">Tweet</span>								
					</a>
					<a class="btn_1" href="#">
						<i class="fa fa-google-plus google"></i>
						<span class="share1 google">Share</span>
					</a>
			   </div>
			</div>
			<div class="clearfix"> </div>
		   </div>
		   <div class="col_1">
   	         <div class="col-sm-4 row_2">
				<a href="single.jsp"><img src="images/a4.jpg" class="img-responsive" alt=""/></a>
			</div>
			<div class="col-sm-8 row_1">
				<h4><a href="single.jsp">Contrary to popular belief</a></h4>
				<h6>SIt is a long <span class="dot">Â·</span> Jul. 31, 2015</h6>
				<p>At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti.</p>
				<div class="social">	
					<a class="btn_1" href="#">
						<i class="fa fa-facebook fb"></i>
						<span class="share1 fb">Share</span>								
					</a>
					<a class="btn_1" href="#">
						<i class="fa fa-twitter tw"></i>
						<span class="share1">Tweet</span>								
					</a>
					<a class="btn_1" href="#">
						<i class="fa fa-google-plus google"></i>
						<span class="share1 google">Share</span>
					</a>
			   </div>
			</div>
			<div class="clearfix"> </div>
		   </div>
		   <div class="col_1">
   	         <div class="col-sm-4 row_2">
				<a href="single.jsp"><img src="images/a5.jpg" class="img-responsive" alt=""/></a>
			</div>
			<div class="col-sm-8 row_1">
				<h4><a href="single.jsp">At vero eos et accusamus</a></h4>
				<h6>SIt is a long <span class="dot">Â·</span> Jul. 31, 2015</h6>
				<p>On the other hand, we denounce with righteous indignation and dislike men.</p>
				<div class="social">	
					<a class="btn_1" href="#">
						<i class="fa fa-facebook fb"></i>
						<span class="share1 fb">Share</span>								
					</a>
					<a class="btn_1" href="#">
						<i class="fa fa-twitter tw"></i>
						<span class="share1">Tweet</span>								
					</a>
					<a class="btn_1" href="#">
						<i class="fa fa-google-plus google"></i>
						<span class="share1 google">Share</span>
					</a>
			   </div>
			</div>
			<div class="clearfix"> </div>
		   </div>
		   <div class="col_2">
   	         <div class="col-sm-4 row_2">
				<a href="single.jsp"><img src="images/a6.jpg" class="img-responsive" alt=""/></a>
			</div>
			<div class="col-sm-8 row_1">
				<h4><a href="single.jsp">On the other hand</a></h4>
				<h6>SIt is a long <span class="dot">Â·</span> Jul. 31, 2015</h6>
				<p>Contrary to popular belief, Lorem Ipsum is not simply random text.</p>
				<div class="social">	
					<a class="btn_1" href="#">
						<i class="fa fa-facebook fb"></i>
						<span class="share1 fb">Share</span>								
					</a>
					<a class="btn_1" href="#">
						<i class="fa fa-twitter tw"></i>
						<span class="share1">Tweet</span>								
					</a>
					<a class="btn_1" href="#">
						<i class="fa fa-google-plus google"></i>
						<span class="share1 google">Share</span>
					</a>
			   </div>
			  </div>
			<div class="clearfix"> </div>
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

