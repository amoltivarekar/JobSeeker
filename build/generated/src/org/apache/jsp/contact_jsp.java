package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contact_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<!DOCTYPE HTML>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Contact</title>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<meta name=\"keywords\" content=\"Seeking Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, \r\n");
      out.write("Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design\" />\r\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\r\n");
      out.write("<link href=\"css/bootstrap-3.1.1.min.css\" rel='stylesheet' type='text/css' />\r\n");
      out.write("<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\r\n");
      out.write("<script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("<!-- Custom Theme files -->\r\n");
      out.write("<link href=\"css/style.css\" rel='stylesheet' type='text/css' />\r\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Roboto:100,200,300,400,500,600,700,800,900' rel='stylesheet' type='text/css'>\r\n");
      out.write("<!----font-Awesome----->\r\n");
      out.write("<link href=\"css/font-awesome.css\" rel=\"stylesheet\"> \r\n");
      out.write("<!----font-Awesome----->\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<nav class=\"navbar navbar-default\" role=\"navigation\">\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t    <div class=\"navbar-header\">\r\n");
      out.write("\t        <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\r\n");
      out.write("\t\t        <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("\t\t        <span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t        <span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t        <span class=\"icon-bar\"></span>\r\n");
      out.write("\t        </button>\r\n");
      out.write("\t        <a class=\"navbar-brand\" href=\"index.jsp\"><img src=\"images/logo.png\" alt=\"\"/></a>\r\n");
      out.write("\t    </div>\r\n");
      out.write("\t    <!--/.navbar-header-->\r\n");
      out.write("\t    <div class=\"navbar-collapse collapse\" id=\"bs-example-navbar-collapse-1\" style=\"height: 1px;\">\r\n");
      out.write("\t        <ul class=\"nav navbar-nav\">\t\t        \t\t        \r\n");
      out.write("\t\t        <li class=\"dropdown\">\r\n");
      out.write("\t\t            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Jobs<b class=\"caret\"></b></a>\r\n");
      out.write("\t\t            <ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t             <li><a href=\"Jobs.jsp?jobname='Walk-In'\">Walk-ins</a></li>\r\n");
      out.write("\t\t\t            <li><a href=\"Jobs.jsp?jobname='Part Time'\">Part Time Jobs</a></li>\r\n");
      out.write("\t\t\t            <li><a href=\"Jobs.jsp?jobname='Teaching'\">Teaching Jobs</a></li>\r\n");
      out.write("\t\t\t            <li><a href=\"Jobs.jsp?jobname='Internship'\">Internship Jobs</a></li>\r\n");
      out.write("\t\t\t            <li><a href=\"Jobs.jsp?jobname='Tech Support'\">Tech Support</a></li>\r\n");
      out.write("                                    <li><a href=\"Jobs.jsp?jobname='Finance'\">Finance Jobs</a></li>\r\n");
      out.write("\t\t            </ul>\r\n");
      out.write("\t\t        </li>                        \r\n");
      out.write("\t\t        <li class=\"dropdown\">\r\n");
      out.write("\t\t            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Login<b class=\"caret\"></b></a>\r\n");
      out.write("\t\t             <ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t            <li><a href=\"login.jsp\">Recruiter's Login</a></li>\r\n");
      out.write("\t\t\t            <li><a href=\"login.jsp\">Jobseeker's Login</a></li>\t\t\t            \r\n");
      out.write("\t\t             </ul>\r\n");
      out.write("\t\t        </li>\r\n");
      out.write("                        <li class=\"dropdown\">\r\n");
      out.write("\t\t            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Register<b class=\"caret\"></b></a>\r\n");
      out.write("\t\t             <ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t            <li><a href=\"recruiterregister.jsp\">Recruiter Register</a></li>\r\n");
      out.write("\t\t\t            <li><a href=\"jobseekerregister.jsp\">Jobseeker's Register</a></li>\t\t\t            \r\n");
      out.write("\t\t             </ul>\r\n");
      out.write("\t\t        </li>\r\n");
      out.write("                        <li class=\"dropdown\"><a href=\"about.jsp\">About us</a></li>\r\n");
      out.write("                        <li class=\"dropdown\"><a href=\"contact.jsp\">Contact</a></li>\r\n");
      out.write("\t        </ul>\r\n");
      out.write("\t    </div>\r\n");
      out.write("\t    <div class=\"clearfix\"> </div>\r\n");
      out.write("\t  </div>\r\n");
      out.write("\t    <!--/.navbar-collapse-->\r\n");
      out.write("\t</nav>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("    <div class=\"single\">  \r\n");
      out.write("\t   <div class=\"contact_top\" >\r\n");
      out.write("\t   \t <h2>Our Addresses</h2>\r\n");
      out.write("\t     <div class=\"col-sm-4\" style=\"margin-left: 400px;\">\r\n");
      out.write("\t   \t   <address class=\"addr\">\r\n");
      out.write("                <p class=\"secondary3\">\r\n");
      out.write("                    S.V ROAD, <br>\r\n");
      out.write("                   KHAR WEST, near to paint house.</p>\r\n");
      out.write("                <dl>\r\n");
      out.write("                    <dt>Freephone:</dt>\r\n");
      out.write("                    <dd>\r\n");
      out.write("                        8056432211\r\n");
      out.write("                    </dd>\r\n");
      out.write("                </dl>\r\n");
      out.write("                <dl>\r\n");
      out.write("                    <dt>Telephone:</dt>\r\n");
      out.write("                    <dd>\r\n");
      out.write("                        +1 2587 4677 236\r\n");
      out.write("                    </dd>\r\n");
      out.write("                </dl>\r\n");
      out.write("                <dl>\r\n");
      out.write("                    <dt>FAX:</dt>\r\n");
      out.write("                    <dd>\r\n");
      out.write("                        +1 2587 4677 236\r\n");
      out.write("                    </dd>\r\n");
      out.write("                </dl>\r\n");
      out.write("                <dl class=\"email\">\r\n");
      out.write("                    <dt>E-mail:</dt>\r\n");
      out.write("                    <dd>\r\n");
      out.write("                        <a href=\"malito:mail@demolink.org\">khankhansa18@gmail.com\r\n");
      out.write("                </dl>\r\n");
      out.write("           </address>\r\n");
      out.write("          </div>\r\n");
      out.write("          </address>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"clearfix\"> </div>\r\n");
      out.write("\t   </div>\r\n");
      out.write("\t   <div class=\"content_bottom\">\r\n");
      out.write("\t   \t <h3>Contact Form</h3>\r\n");
      out.write("\t   \t   <form>\r\n");
      out.write("\t\t\t<div class=\"contact_box1\">\r\n");
      out.write("             \t<input type=\"text\" class=\"text\" value=\"Name\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {this.value = 'Name';}\">\r\n");
      out.write("\t\t\t \t<input type=\"text\" class=\"text\" value=\"Email\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {this.value = 'Email';}\" style=\"margin-left:3%\">\r\n");
      out.write("\t\t\t \t<input type=\"text\" class=\"text\" value=\"Phone\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {this.value = 'Phone';}\" style=\"margin-left:3%\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"text_1\">\r\n");
      out.write("               <textarea value=\"Message\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {this.value = 'Message';}\">Message</textarea>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-submit1 form_but1\">\r\n");
      out.write("\t           <input name=\"submit\" type=\"submit\" id=\"submit\" value=\"Submit\"><br>\r\n");
      out.write("\t        </div>\r\n");
      out.write("                       <br><br><br>\r\n");
      out.write("           </form>\r\n");
      out.write("\t   </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"footer\">\r\n");
      out.write("\t<div class=\"container\" style=\"margin-left:370px;\">\r\n");
      out.write("\t\t<div class=\"col-md-3 grid_3\">\r\n");
      out.write("\t\t\t<h4>Navigate</h4>\r\n");
      out.write("\t\t\t<ul class=\"f_list f_list1\">\r\n");
      out.write("\t\t\t\t<li><a href=\"index.jsp\">Home</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"login.jsp\">Sign In</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"login.jsp\">Join Now</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"about.jsp\">About</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<ul class=\"f_list\">\r\n");
      out.write("\t\t\t\t<li><a href=\"features.jsp\">Features</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"terms.jsp\">Terms of use</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"contact.jsp\">Contact Us</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"jobs.jsp\">Post a Job</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t</div>\t\t\r\n");
      out.write("\t\t<div class=\"col-md-3 grid_3\">\r\n");
      out.write("\t\t\t<h4>Seeking</h4>\r\n");
      out.write("\t\t\t<p>There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable. </p>\r\n");
      out.write("\t\t</div>\t\t\r\n");
      out.write("\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\t\t\t");
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
