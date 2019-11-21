package org.apache.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class donation_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "blocks/header.jsp", out, false);
      out.write("\n");
      out.write("    <!DOCTYPE html>\n");
      out.write("    <html>\n");
      out.write("        <head>\n");
      out.write("            <title>Donation</title>\n");
      out.write("            <script>\n");
      out.write("                $(function () {\n");
      out.write("                    $(\"#chkPassport\").click(function () {\n");
      out.write("                        if ($(this).is(\":checked\")) {\n");
      out.write("                            $(\"#dvPassport\").show();\n");
      out.write("                            \n");
      out.write("                        } else {\n");
      out.write("                            $(\"#dvPassport\").hide();\n");
      out.write("                            \n");
      out.write("                        }\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("            </script>\n");
      out.write("        </head>\n");
      out.write("        <body>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row d-md-flex\">\n");
      out.write("                    <div class=\"col-md-6 d-flex ftco-animate\">\n");
      out.write("                        <div class=\"img img-2 align-self-stretch\" style=\"background-image: url(../../assets/images/bg_4.jpg);\"></div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-6 volunteer pl-md-5 ftco-animate\">\n");
      out.write("                        <h3 class=\"mb-3\">Donation Detail</h3>\n");
      out.write("                        <form action=\"donationController\" method=\"post\" class=\"volunter-form\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("\n");
      out.write("                                <label>Name</label><input type=\"text\" name=\"name\" class=\"form-control\" placeholder=\"Enter Your Name...\" required=\"\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <ul>\n");
      out.write("                                    <li><a href=\"payment.jsp\" name=\"money\" style=\"font-size: 20px;color: black\" >&nbsp;Money</a></li>\n");
      out.write("                                    <li><a href=\"\" name=\"blood\" style=\"font-size: 20px;color: black\">&nbsp;Blood</a></li>\n");
      out.write("                                   \n");
      out.write("                                    \n");
      out.write("                                    <li>\n");
      out.write("                                        <label for=\"chkPassport\">\n");
      out.write("                                            <input type=\"checkbox\" id=\"chkPassport\" />\n");
      out.write("                                            other\n");
      out.write("                                        </label>\n");
      out.write("                                    </li>\n");
      out.write("                                    <hr/>\n");
      out.write("                                    <div id=\"dvPassport\" style=\"display: none\">\n");
      out.write("\n");
      out.write("                                        <textarea id=\"txtPassportNumber\" placeholder=\"Other Please Specify\" ></textarea>\n");
      out.write("                                        <br>\n");
      out.write("                                        <br>\n");
      out.write("                                     <input type=\"submit\" value=\"Continue..\"  class=\"btn gradient-bg\">\n");
      out.write("                                    </div>\n");
      out.write("                                    \n");
      out.write("                                </ul>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                               \n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </form>\n");
      out.write("                    </div>    \t\t\t\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </body>\n");
      out.write("    </html>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "blocks/footer.jsp", out, false);
      out.write('\n');
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
