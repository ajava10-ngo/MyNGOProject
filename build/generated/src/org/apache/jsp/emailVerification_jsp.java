package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.mailSending.SendMailSSL;
import java.util.Random;
import com.dao.UserDao;
import com.model.User;

public final class emailVerification_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");

   String email = "";
   Random r = new Random();
   String generatedOtp = "";

   if (request.getParameter("email") != null) {
      email = request.getParameter("email");
      System.out.println("Value of i is : " + generatedOtp);

      generatedOtp = String.format("%4d", r.nextInt(1001));
      SendMailSSL.sendEmail(email, generatedOtp);
   }

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <title>Email Verification</title>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "blocks/header.jsp", out, false);
      out.write("\n");
      out.write("       <script>\n");
      out.write("          function verfifyOtp() {\n");
      out.write("             var otp = document.getElementById(\"otp\").value;\n");
      out.write("             \n");
      out.write("\n");
      out.write("\n");
      out.write("          }\n");
      out.write("       </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row d-md-flex\">\n");
      out.write("          <div class=\"col-md-6 d-flex ftco-animate\">\n");
      out.write("            <div class=\"img img-2 align-self-stretch\" style=\"background-image: url(assets/images/bg_4.jpg);\"></div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-md-6 volunteer pl-md-5 ftco-animate\">\n");
      out.write("            <h3 class=\"mb-3\">Email Verification</h3>\n");
      out.write("            <form action=\"register\" method=\"post\" class=\"volunter-form\">\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <input type=\"text\" name=\"otp\" class=\"form-control\" placeholder=\"Enter OTP\" required=\"\">\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\" >\n");
      out.write("                <input type=\"submit\" name=\"operation\" id=\"otp\" value=\"Verify\" onclick=\"verfifyOtp()\" class=\"btn gradient-bg\">\n");
      out.write("              </div>\n");
      out.write("              <div id=\"verifyOtpErr\" >\n");
      out.write("                 \n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <a class=\"form-control-sm\" href=\"register?operation=ResendOTP&email=");
      out.print(email);
      out.write("\">Didn't Get OTP? Resend</a>\n");
      out.write("            </div>\n");
      out.write("          </form>\n");
      out.write("        </div>    \t\t\t\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
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
