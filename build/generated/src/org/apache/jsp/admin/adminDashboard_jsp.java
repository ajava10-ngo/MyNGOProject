package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminDashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../blocks/nav.jsp", out, false);
      out.write("\n");
      out.write("    <!DOCTYPE html>\n");
      out.write("    <html>\n");
      out.write("        <head>\n");
      out.write("            <title>Welfare - Free Bootstrap 4 Template by Colorlib</title>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Dosis:200,300,400,500,700\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Overpass:300,400,400i,600,700\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"http://localhost/MyNGOProject/assets/css/open-iconic-bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../assets/css/animate.css\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"../assets/css/owl.carousel.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../assets/css/owl.theme.default.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../assets/css/magnific-popup.css\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"../assets/css/aos.css\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"../assets/css/ionicons.min.css\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"../assets/css/bootstrap-datepicker.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../assets/css/jquery.timepicker.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"../assets/css/flaticon.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../assets/css/icomoon.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../assets/css/style.css\">\n");
      out.write("            <title></title>\n");
      out.write("        </head>\n");
      out.write("        <body>\n");
      out.write("            \n");
      out.write("        </body>\n");
      out.write("    </html>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../blocks/footer.jsp", out, false);
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
