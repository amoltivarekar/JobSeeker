package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE HTML>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Home</title>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<meta name=\"keywords\" content=\"Seeking Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, \n");
      out.write("Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design\" />\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("<link href=\"css/bootstrap-3.1.1.min.css\" rel='stylesheet' type='text/css' />\n");
      out.write("<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("<script src=\"js/jquery.min.js\"></script>\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("<!-- Custom Theme files -->\n");
      out.write("<link href=\"css/style.css\" rel='stylesheet' type='text/css' />\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Roboto:100,200,300,400,500,600,700,800,900' rel='stylesheet' type='text/css'>\n");
      out.write("<!----font-Awesome----->\n");
      out.write("<link href=\"css/font-awesome.css\" rel=\"stylesheet\"> \n");
      out.write("<!----font-Awesome----->\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<nav class=\"navbar navbar-default\" role=\"navigation\">\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t    <div class=\"navbar-header\">\n");
      out.write("\t        <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\n");
      out.write("\t\t        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("\t\t        <span class=\"icon-bar\"></span>\n");
      out.write("\t\t        <span class=\"icon-bar\"></span>\n");
      out.write("\t\t        <span class=\"icon-bar\"></span>\n");
      out.write("\t        </button>\n");
      out.write("\t        <a class=\"navbar-brand\" href=\"index.jsp\"><img src=\"images/logo.png\" alt=\"\"/></a>\n");
      out.write("\t    </div>\n");
      out.write("\t    <!--/.navbar-header-->\n");
      out.write("\t    <div class=\"navbar-collapse collapse\" id=\"bs-example-navbar-collapse-1\" style=\"height: 1px;\">\n");
      out.write("\t        <ul class=\"nav navbar-nav\">\t\t        \t\t        \n");
      out.write("\t\t        <li class=\"dropdown\">\n");
      out.write("\t\t            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Jobs<b class=\"caret\"></b></a>\n");
      out.write("\t\t            <ul class=\"dropdown-menu\">\n");
      out.write("\t\t\t            <li><a href=\"Jobs.jsp?jobname='Walk-In'\">Walk-ins</a></li>\n");
      out.write("\t\t\t            <li><a href=\"Jobs.jsp?jobname='Part Time'\">Part Time Jobs</a></li>\n");
      out.write("\t\t\t            <li><a href=\"Jobs.jsp?jobname='Teaching'\">Teaching Jobs</a></li>\n");
      out.write("\t\t\t            <li><a href=\"Jobs.jsp?jobname='Internship'\">Internship Jobs</a></li>\n");
      out.write("\t\t\t            <li><a href=\"Jobs.jsp?jobname='Tech Support'\">Tech Support</a></li>\n");
      out.write("                                    <li><a href=\"Jobs.jsp?jobname='Finance'\">Finance Jobs</a></li>\n");
      out.write("\t\t            </ul>\n");
      out.write("\t\t        </li>                        \n");
      out.write("\t\t        <li class=\"dropdown\">\n");
      out.write("\t\t            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Login<b class=\"caret\"></b></a>\n");
      out.write("\t\t             <ul class=\"dropdown-menu\">\n");
      out.write("\t\t\t            <li><a href=\"login.jsp\">Recruiter's Login</a></li>\n");
      out.write("\t\t\t            <li><a href=\"login.jsp\">Jobseeker's Login</a></li>\t\t\t            \n");
      out.write("\t\t             </ul>\n");
      out.write("\t\t        </li>\n");
      out.write("                        <li class=\"dropdown\">\n");
      out.write("\t\t            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Register<b class=\"caret\"></b></a>\n");
      out.write("\t\t             <ul class=\"dropdown-menu\">\n");
      out.write("\t\t\t            <li><a href=\"recruiterregister.jsp\">Recruiter Register</a></li>\n");
      out.write("\t\t\t            <li><a href=\"jobseekerregister.jsp\">Jobseeker's Register</a></li>\t\t\t            \n");
      out.write("\t\t             </ul>\n");
      out.write("\t\t        </li>\n");
      out.write("                        <li class=\"dropdown\"><a href=\"about.jsp\">About us</a></li>\n");
      out.write("                        <li class=\"dropdown\"><a href=\"contact.jsp\">Contact</a></li>\n");
      out.write("                        \n");
      out.write("\t        </ul>\n");
      out.write("\t    </div>\n");
      out.write("\t    <div class=\"clearfix\"> </div>\n");
      out.write("\t  </div>\n");
      out.write("\t    <!--/.navbar-collapse-->\n");
      out.write("\t</nav>\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("  <div class=\"grid_1\">\n");
      out.write("\t <h3>Featured Employers</h3>\n");
      out.write("\t   <ul id=\"flexiselDemo3\">\n");
      out.write("               <li><a href=\"https://www.google.com\"><img src=\"images/c1.gif\"  class=\"img-responsive\" /></a></li>\n");
      out.write("\t\t  <li><img src=\"images/c2.gif\"  class=\"img-responsive\" /></li>\n");
      out.write("\t\t  <li><img src=\"images/c3.gif\"  class=\"img-responsive\" /></li>\n");
      out.write("\t\t  <li><img src=\"images/c4.gif\"  class=\"img-responsive\" /></li>\n");
      out.write("\t\t  <li><img src=\"images/c5.gif\"  class=\"img-responsive\" /></li>\n");
      out.write("\t\t  <li><img src=\"images/c6.gif\"  class=\"img-responsive\" /></li>\t\n");
      out.write("\t    </ul>\n");
      out.write("\t    <script type=\"text/javascript\">\n");
      out.write("\t\t $(window).load(function() {\n");
      out.write("\t\t\t$(\"#flexiselDemo3\").flexisel({\n");
      out.write("\t\t\t\tvisibleItems: 6,\n");
      out.write("\t\t\t\tanimationSpeed: 1000,\n");
      out.write("\t\t\t\tautoPlay: true,\n");
      out.write("\t\t\t\tautoPlaySpeed: 3000,    \t\t\n");
      out.write("\t\t\t\tpauseOnHover: true,\n");
      out.write("\t\t\t\tenableResponsiveBreakpoints: true,\n");
      out.write("\t\t    \tresponsiveBreakpoints: { \n");
      out.write("\t\t    \t\tportrait: { \n");
      out.write("\t\t    \t\t\tchangePoint:480,\n");
      out.write("\t\t    \t\t\tvisibleItems: 1\n");
      out.write("\t\t    \t\t}, \n");
      out.write("\t\t    \t\tlandscape: { \n");
      out.write("\t\t    \t\t\tchangePoint:640,\n");
      out.write("\t\t    \t\t\tvisibleItems: 2\n");
      out.write("\t\t    \t\t},\n");
      out.write("\t\t    \t\ttablet: { \n");
      out.write("\t\t    \t\t\tchangePoint:768,\n");
      out.write("\t\t    \t\t\tvisibleItems: 3\n");
      out.write("\t\t    \t\t}\n");
      out.write("\t\t    \t}\n");
      out.write("\t\t    });\n");
      out.write("\t\t    \n");
      out.write("\t\t});\n");
      out.write("\t   </script>\n");
      out.write("\t   <script type=\"text/javascript\" src=\"js/jquery.flexisel.js\"></script>\n");
      out.write("\t </div>\n");
      out.write("\t <div class=\"single\">  \n");
      out.write("\t   <div class=\"col-md-4\">\n");
      out.write("\t   \t  <div class=\"col_3\">\n");
      out.write("\t   \t  \t<h3>Todays Jobs</h3>\n");
      out.write("\t   \t  \t<ul class=\"list_1\">\n");
      out.write("\t   \t  \t\t<li><a href=\"#\">Department of Health - Western Australia</a></li>\n");
      out.write("\t   \t  \t\t<li><a href=\"#\">Australian Nursing Agency currently require experiences</a></li>\t\t\n");
      out.write("\t   \t  \t\t<li><a href=\"#\">Russia Nursing Agency currently require experiences</a></li>\n");
      out.write("\t   \t  \t\t<li><a href=\"#\">The Government of Western Saudi Arbia</a></li>\t\t\n");
      out.write("\t   \t  \t\t<li><a href=\"#\">Department of Health - Western Australia</a></li>\n");
      out.write("\t   \t  \t\t<li><a href=\"#\">Australian Nursing Agency currently require experiences</a></li>\t\t\n");
      out.write("\t   \t  \t\t<li><a href=\"#\">Russia Nursing Agency currently require experiences</a></li>\n");
      out.write("\t   \t  \t\t<li><a href=\"#\">The Scientific Publishing Services in Saudi Arbia</a></li>\t\n");
      out.write("\t   \t  \t\t<li><a href=\"#\">BPO Private Limited in Canada</a></li>\t\t\n");
      out.write("\t   \t  \t\t<li><a href=\"#\">Executive Tracks Associates in Pakistan</a></li>\n");
      out.write("\t   \t  \t\t<li><a href=\"#\">Pyramid IT Consulting Pvt. Ltd. in Pakistan</a></li>\t\t\t\t\t\t\n");
      out.write("\t   \t  \t</ul>\n");
      out.write("\t   \t  </div>\n");
      out.write("\t   \t  <div class=\"col_3\">\n");
      out.write("\t   \t  \t<h3>Jobs by Category</h3>\n");
      out.write("\t   \t  \t<ul class=\"list_2\">\n");
      out.write("\t   \t  \t\t<li><a href=\"#\">Railway Recruitment</a></li>\n");
      out.write("\t   \t  \t\t<li><a href=\"#\">Air Force Jobs</a></li>\t\t\n");
      out.write("\t   \t  \t\t<li><a href=\"#\">Police Jobs</a></li>\n");
      out.write("\t   \t  \t\t<li><a href=\"#\">Intelligence Bureau Jobs</a></li>\t\t\n");
      out.write("\t   \t  \t\t<li><a href=\"#\">Army Jobs</a></li>\n");
      out.write("\t   \t  \t\t<li><a href=\"#\">Navy Jobs</a></li>\t\t\n");
      out.write("\t   \t  \t\t<li><a href=\"#\">BSNL Jobs</a></li>\n");
      out.write("\t   \t  \t\t<li><a href=\"#\">Software Jobs</a></li>\t\n");
      out.write("\t   \t  \t\t<li><a href=\"#\">Research Jobs</a></li>\t\t\t\t\t\t\t\t\n");
      out.write("\t   \t  \t</ul>\n");
      out.write("\t   \t  </div>\t   \t  \n");
      out.write("\t </div>\n");
      out.write("\t   <div class=\"col-md-8\">\n");
      out.write("\t      <div class=\"col_1\">\n");
      out.write("   \t        <div class=\"col-sm-4 row_2\">\n");
      out.write("\t\t\t\t<a href=\"single.jsp\"><img src=\"images/a1.jpg\" class=\"img-responsive\" alt=\"\"/></a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-sm-8 row_1\">\n");
      out.write("\t\t\t\t<h4><a href=\"single.jsp\">It is a long established fact</a></h4>\n");
      out.write("\t\t\t\t<h6>SIt is a long <span class=\"dot\">Â·</span> Jul. 31, 2015</h6>\n");
      out.write("\t\t\t\t<p>There are many variations of passages of Lorem Ipsum available, but the majority have suffered</p>\n");
      out.write("\t\t\t\t<div class=\"social\">\t\n");
      out.write("\t\t\t\t\t<a class=\"btn_1\" href=\"#\">\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-facebook fb\"></i>\n");
      out.write("\t\t\t\t\t\t<span class=\"share1 fb\">Share</span>\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t<a class=\"btn_1\" href=\"#\">\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-twitter tw\"></i>\n");
      out.write("\t\t\t\t\t\t<span class=\"share1\">Tweet</span>\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t<a class=\"btn_1\" href=\"#\">\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-google-plus google\"></i>\n");
      out.write("\t\t\t\t\t\t<span class=\"share1 google\">Share</span>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t   </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t   </div>\n");
      out.write("\t\t   <div class=\"col_1\">\n");
      out.write("   \t         <div class=\"col-sm-4 row_2\">\n");
      out.write("\t\t\t\t<a href=\"single.jsp\"><img src=\"images/a2.jpg\" class=\"img-responsive\" alt=\"\"/></a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-sm-8 row_1\">\n");
      out.write("\t\t\t\t<h4><a href=\"single.jsp\">Lorem Ipsum is simply dummy</a></h4>\n");
      out.write("\t\t\t\t<h6>SIt is a long <span class=\"dot\">Â·</span> Jul. 31, 2015</h6>\n");
      out.write("\t\t\t\t<p>Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium.</p>\n");
      out.write("\t\t\t\t<div class=\"social\">\t\n");
      out.write("\t\t\t\t\t<a class=\"btn_1\" href=\"#\">\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-facebook fb\"></i>\n");
      out.write("\t\t\t\t\t\t<span class=\"share1 fb\">Share</span>\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t<a class=\"btn_1\" href=\"#\">\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-twitter tw\"></i>\n");
      out.write("\t\t\t\t\t\t<span class=\"share1\">Tweet</span>\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t<a class=\"btn_1\" href=\"#\">\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-google-plus google\"></i>\n");
      out.write("\t\t\t\t\t\t<span class=\"share1 google\">Share</span>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t   </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t   </div>\n");
      out.write("\t\t   <div class=\"col_1\">\n");
      out.write("   \t        <div class=\"col-sm-4 row_2\">\n");
      out.write("\t\t\t\t<a href=\"single.jsp\"><img src=\"images/a3.jpg\" class=\"img-responsive\" alt=\"\"/></a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-sm-8 row_1\">\n");
      out.write("\t\t\t\t<h4><a href=\"single.jsp\">There are many variations</a></h4>\n");
      out.write("\t\t\t\t<h6>SIt is a long <span class=\"dot\">Â·</span> Jul. 31, 2015</h6>\n");
      out.write("\t\t\t\t<p>YBut I must explain to you how all this mistaken idea of denouncing pleasure.</p>\n");
      out.write("\t\t\t\t<div class=\"social\">\t\n");
      out.write("\t\t\t\t\t<a class=\"btn_1\" href=\"#\">\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-facebook fb\"></i>\n");
      out.write("\t\t\t\t\t\t<span class=\"share1 fb\">Share</span>\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t<a class=\"btn_1\" href=\"#\">\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-twitter tw\"></i>\n");
      out.write("\t\t\t\t\t\t<span class=\"share1\">Tweet</span>\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t<a class=\"btn_1\" href=\"#\">\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-google-plus google\"></i>\n");
      out.write("\t\t\t\t\t\t<span class=\"share1 google\">Share</span>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t   </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t   </div>\n");
      out.write("\t\t   <div class=\"col_1\">\n");
      out.write("   \t         <div class=\"col-sm-4 row_2\">\n");
      out.write("\t\t\t\t<a href=\"single.jsp\"><img src=\"images/a4.jpg\" class=\"img-responsive\" alt=\"\"/></a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-sm-8 row_1\">\n");
      out.write("\t\t\t\t<h4><a href=\"single.jsp\">Contrary to popular belief</a></h4>\n");
      out.write("\t\t\t\t<h6>SIt is a long <span class=\"dot\">Â·</span> Jul. 31, 2015</h6>\n");
      out.write("\t\t\t\t<p>At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti.</p>\n");
      out.write("\t\t\t\t<div class=\"social\">\t\n");
      out.write("\t\t\t\t\t<a class=\"btn_1\" href=\"#\">\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-facebook fb\"></i>\n");
      out.write("\t\t\t\t\t\t<span class=\"share1 fb\">Share</span>\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t<a class=\"btn_1\" href=\"#\">\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-twitter tw\"></i>\n");
      out.write("\t\t\t\t\t\t<span class=\"share1\">Tweet</span>\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t<a class=\"btn_1\" href=\"#\">\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-google-plus google\"></i>\n");
      out.write("\t\t\t\t\t\t<span class=\"share1 google\">Share</span>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t   </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t   </div>\n");
      out.write("\t\t   <div class=\"col_1\">\n");
      out.write("   \t         <div class=\"col-sm-4 row_2\">\n");
      out.write("\t\t\t\t<a href=\"single.jsp\"><img src=\"images/a5.jpg\" class=\"img-responsive\" alt=\"\"/></a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-sm-8 row_1\">\n");
      out.write("\t\t\t\t<h4><a href=\"single.jsp\">At vero eos et accusamus</a></h4>\n");
      out.write("\t\t\t\t<h6>SIt is a long <span class=\"dot\">Â·</span> Jul. 31, 2015</h6>\n");
      out.write("\t\t\t\t<p>On the other hand, we denounce with righteous indignation and dislike men.</p>\n");
      out.write("\t\t\t\t<div class=\"social\">\t\n");
      out.write("\t\t\t\t\t<a class=\"btn_1\" href=\"#\">\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-facebook fb\"></i>\n");
      out.write("\t\t\t\t\t\t<span class=\"share1 fb\">Share</span>\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t<a class=\"btn_1\" href=\"#\">\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-twitter tw\"></i>\n");
      out.write("\t\t\t\t\t\t<span class=\"share1\">Tweet</span>\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t<a class=\"btn_1\" href=\"#\">\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-google-plus google\"></i>\n");
      out.write("\t\t\t\t\t\t<span class=\"share1 google\">Share</span>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t   </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t   </div>\n");
      out.write("\t\t   <div class=\"col_2\">\n");
      out.write("   \t         <div class=\"col-sm-4 row_2\">\n");
      out.write("\t\t\t\t<a href=\"single.jsp\"><img src=\"images/a6.jpg\" class=\"img-responsive\" alt=\"\"/></a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-sm-8 row_1\">\n");
      out.write("\t\t\t\t<h4><a href=\"single.jsp\">On the other hand</a></h4>\n");
      out.write("\t\t\t\t<h6>SIt is a long <span class=\"dot\">Â·</span> Jul. 31, 2015</h6>\n");
      out.write("\t\t\t\t<p>Contrary to popular belief, Lorem Ipsum is not simply random text.</p>\n");
      out.write("\t\t\t\t<div class=\"social\">\t\n");
      out.write("\t\t\t\t\t<a class=\"btn_1\" href=\"#\">\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-facebook fb\"></i>\n");
      out.write("\t\t\t\t\t\t<span class=\"share1 fb\">Share</span>\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t<a class=\"btn_1\" href=\"#\">\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-twitter tw\"></i>\n");
      out.write("\t\t\t\t\t\t<span class=\"share1\">Tweet</span>\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t<a class=\"btn_1\" href=\"#\">\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-google-plus google\"></i>\n");
      out.write("\t\t\t\t\t\t<span class=\"share1 google\">Share</span>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t   </div>\n");
      out.write("\t\t\t  </div>\n");
      out.write("\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t   </div>\n");
      out.write("\t   </div>\n");
      out.write("\t   <div class=\"clearfix\"> </div>\n");
      out.write("\t </div>\n");
      out.write("</div>\n");
      out.write("<div class=\"footer\">\n");
      out.write("\t<div class=\"container\" style=\"margin-left:370px;\">\n");
      out.write("\t\t<div class=\"col-md-3 grid_3\">\n");
      out.write("\t\t\t<h4>Navigate</h4>\n");
      out.write("\t\t\t<ul class=\"f_list f_list1\">\n");
      out.write("\t\t\t\t<li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"login.jsp\">Sign In</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"login.jsp\">Join Now</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"about.jsp\">About</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t\t<ul class=\"f_list\">\n");
      out.write("\t\t\t\t<li><a href=\"features.jsp\">Features</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"terms.jsp\">Terms of use</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"contact.jsp\">Contact Us</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"jobs.jsp\">Post a Job</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-md-3 grid_3\">\n");
      out.write("\t\t\t<h4>Seeking</h4>\n");
      out.write("\t\t\t<p>There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable. </p>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>\t\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
