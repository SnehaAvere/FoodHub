package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <footer class=\"container text-center\">\n");
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
