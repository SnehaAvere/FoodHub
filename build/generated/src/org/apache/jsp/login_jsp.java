package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/navbar.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("           body {\n");
      out.write("    background-image: url(\"images/background1.jpg\");\n");
      out.write("   background-size: cover ;\n");
      out.write("                }\n");
      out.write("                .no-background {\n");
      out.write("    background-image: url(\"images/blank.jpg\");\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("     <!-- Latest compiled and minified CSS -->\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("<!-- Optional theme -->\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css\" >\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <nav class=\"navbar navbar-inverse navbar-fixed-top\" id=\"my-navbar\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#navbar-collapse\">\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>                        \n");
      out.write("      </button>\n");
      out.write("        \n");
      out.write("        <a href=\"\" class=\"navbar-brand\"><img src=\"images/logo2.jpg\" style=\"max-width:200px;\" alt=\"logo\"</a>\n");
      out.write("    </div>\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"navbar-collapse\">\n");
      out.write("      <ul class=\"nav navbar-nav\">\n");
      out.write("          <li class=\"active\"><a href=\"#\">Home</a></li>\n");
      out.write("          <li><a href=\"#\">Menu</a></li>\n");
      out.write("        <li><a href=\"#\">Reservation</a></li>\n");
      out.write("        <li><a href=\"#\">About Us</a></li>\n");
      out.write("        <li><a href=\"#\">Contact Us</a></li>\n");
      out.write("      </ul>\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("        <li><a href=\"login.jsp\"><span class=\"glyphicon glyphicon-log-in\"></span> Login</a></li>\n");
      out.write("        <li><a href=\"register.jsp\"><span class=\"glyphicon glyphicon-user\"></span> Register</a></li>\n");
      out.write("      </ul>\n");
      out.write("            </div>\n");
      out.write("  </div><!--end Container -->\n");
      out.write("</nav>\n");
      out.write("        \n");
      out.write("                 <script src=\"http://code.jquery.com/jquery-2.1.1.min.js\"></script>\n");
      out.write("        <!-- Latest compiled and minified JavaScript -->\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("         <form action=\"loginservlet.do\" method=\"post\" >\n");
      out.write("        <div id=\"main\">\n");
      out.write("\t<div class=\"h-tag\">\n");
      out.write("\t<h2 align=\"center\">Create Your Account</h2>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- create account div -->\n");
      out.write("\t<div class=\"login\">\n");
      out.write("\t<table cellspacing=\"2\" align=\"center\" cellpadding=\"8\" border=\"0\">\n");
      out.write("            <tr>\n");
      out.write("\t<td align=\"right\">Enter Login ID :</td>\n");
      out.write("\t<td><input type=\"text\" placeholder=\"Enter Login ID\" name=\"customer_LoginID\" /></td>\n");
      out.write("            </tr><br>\n");
      out.write("\t<tr>\n");
      out.write("\t<td align=\"right\">Enter Password :</td>\n");
      out.write("\t<td><input type=\"password\" placeholder=\"Enter Password here\" name=\"customer_Password\"/></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td><input required type=\"reset\" value=\"Clear Form\" id=\"res\" class=\"btn\" /></td>\n");
      out.write("            <td><input required type=\"submit\" value=\"Create Account\" class=\"btn\" onclick=\"Login()\" /></td>\n");
      out.write("\t</tr>\n");
      out.write("        <tr><td><a href=\"register.jsp\"> new register here </a></td></tr>\n");
      out.write("\t</table>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- create account box ending here.. -->\n");
      out.write("\t</div>\n");
      out.write("         </form>\n");
      out.write("         ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("     <!-- Latest compiled and minified CSS -->\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("<!-- Optional theme -->\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css\" >\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <footer class=\"container text-center \">\n");
      out.write("    <div class=\"row\" style=\"background-color:#F7DC6F; \">\n");
      out.write("        <section id=\"hours\" class=\"col-sm-4\">\n");
      out.write("            <span>Hours:</span><br>\n");
      out.write("            mon-fri: 10:00am-10:00pm<br>\n");
      out.write("            sat-sun: 8:00am-12:00am\n");
      out.write("            <hr class=\"visible-xs\">\n");
      out.write("        </section>\n");
      out.write("        <section id=\"address\" class=\"col-sm-4\">\n");
      out.write("            <span>Address:</span><br>\n");
      out.write("            7015 Reisterstown Road<br>\n");
      out.write("            Baltimore,MD 21215\n");
      out.write("             <hr class=\"visible-xs\">\n");
      out.write("        </section>\n");
      out.write("        <section id=\"testimonials\" class=\"col-sm-4\">\n");
      out.write("            <p>\"The best indian restaurant I've been to! and that's saying a lot, since I've been to many!\"</p>\n");
      out.write("            <p>\"Amazing food! Great service! Couldn't ask for more!\n");
      out.write("            I'll be back again and again!\"</p>\n");
      out.write("        </section>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"text-center\">&copy;Copyright FoodHub india 2010</div>\n");
      out.write(" \n");
      out.write("</footer>\n");
      out.write("               <script src=\"http://code.jquery.com/jquery-2.1.1.min.js\"></script>\n");
      out.write("        <!-- Latest compiled and minified JavaScript -->\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
