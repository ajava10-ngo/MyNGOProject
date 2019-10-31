package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "blocks/nav.jsp", out, false);
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "blocks/cssLinkage.jsp", out, false);
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Admin Login</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <section class=\"ftco-section-3 img\" style=\"background-image: url(assets/images/bg_3.jpg);\">\n");
      out.write("            <div class=\"overlay\"></div>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row d-md-flex\">\n");
      out.write("                    <div class=\"col-md-6 d-flex ftco-animate\">\n");
      out.write("                        <div class=\"img img-2 align-self-stretch\">\n");
      out.write("                            <h3 class=\"mb-3\">Admin Login</h3>\n");
      out.write("                            <form action=\"login\" method=\"post\" class=\"volunter-form\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <input type=\"text\" name=\"username\" class=\"form-control\" placeholder=\"Username\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <input type=\"password\" name=\"password\" class=\"form-control\" placeholder=\"Password\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <input type=\"submit\" value=\"Login\" class=\"btn btn-white py-3 px-5\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <a class=\"form-control-plaintext\" href=\"register.jsp\">Not Registered? Register Here</a>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "blocks/footer.jsp", out, false);
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
