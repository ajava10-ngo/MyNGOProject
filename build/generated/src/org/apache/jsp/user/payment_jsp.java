package org.apache.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class payment_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\" />\n");
      out.write("    <title>Credit Card Payment Form Template | PrepBootstrap</title>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/bootstrap/css/bootstrap.min.css\" />\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/font-awesome/css/font-awesome.min.css\" />\n");
      out.write("\n");
      out.write("    <script type=\"text/javascript\" src=\"assets/js/jquery-1.10.2.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"assets/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("    \n");
      out.write("    <style>\n");
      out.write("    .cc-img {\n");
      out.write("        margin: 0 auto;\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("\n");
      out.write("<div class=\"page-header\">\n");
      out.write("    <h1>Credit Card Payment Form <small>A responsive credit card payment template</small></h1>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- Credit Card Payment Form - START -->\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-xs-12 col-md-4 col-md-offset-4\">\n");
      out.write("            <div class=\"panel panel-default\">\n");
      out.write("                <div class=\"panel-heading\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <h3 class=\"text-center\">Payment Details</h3>\n");
      out.write("                        <img class=\"img-responsive cc-img\" src=\"http://www.prepbootstrap.com/Content/images/shared/misc/creditcardicons.png\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"panel-body\">\n");
      out.write("                    <form action=\"../donationController\" method=\"post\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-xs-12\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label>CARD NUMBER</label>\n");
      out.write("                                    <div class=\"input-group\">\n");
      out.write("                                        <input type=\"number\" name=\"cardnumber\" class=\"form-control\" placeholder=\"Valid Card Number\" />\n");
      out.write("                                        <span class=\"input-group-addon\"><span class=\"fa fa-credit-card\"></span></span>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-xs-7 col-md-7\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label><span class=\"hidden-xs\">EXPIRATION</span><span class=\"visible-xs-inline\">EXP</span> DATE</label>\n");
      out.write("                                    <input type=\"text\" name=\"validDate\" class=\"form-control\" placeholder=\"MM / YY\" />\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-xs-5 col-md-5 pull-right\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label>CV CODE</label>\n");
      out.write("                                    <input type=\"number\" name=\"cvc\" class=\"form-control\" placeholder=\"CVC\" />\n");
      out.write("                                   \n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-xs-12\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label>CARD OWNER</label>\n");
      out.write("                                    <input type=\"text\" name=\"owner\" class=\"form-control\" placeholder=\"Card Owner Names\" />\n");
      out.write("                                    \n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                         <div class=\"panel-footer\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-xs-12\">\n");
      out.write("                            <input type=\"submit\" value=\"Process payment\" class=\"btn btn-warning btn-lg btn-block\">\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("               \n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Credit Card Payment Form - END -->\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
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
