package org.apache.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class donateNow_jsp extends org.apache.jasper.runtime.HttpJspBase
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

   response.setHeader("Cache-Control", "no-cache");
   response.setHeader("Cache-Control", "no-store");
   response.setHeader("Pragma", "no-cache");
   response.setDateHeader("Expires", 0);

   if (session.getAttribute("user") == null) {
      response.sendRedirect("../login.jsp");
   }

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "blocks/header.jsp", out, false);
      out.write("\n");
      out.write("   <title>Donate Now</title>\n");
      out.write("   <div class=\"contact-page-wrap\">\n");
      out.write("     <div class=\"container\">\n");
      out.write("       <div class=\"row\">\n");
      out.write("         <div class=\"col-12 col-lg-5\">\n");
      out.write("           <div class=\"entry-content\">\n");
      out.write("             <h2>Get In touch with us</h2>\n");
      out.write("\n");
      out.write("             <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris tempus vestib ulum mauris. Lorem ipsum dolor sit amet, conse ctetur. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris tempus vestib ulum mauris quis aliquam. Integer accu msan sodales odio, id tempus velit ullamc.</p>\n");
      out.write("\n");
      out.write("             <ul class=\"contact-social d-flex flex-wrap align-items-center\">\n");
      out.write("               <li><a href=\"#\"><i class=\"fa fa-pinterest-p\"></i></a></li>\n");
      out.write("               <li><a href=\"#\"><i class=\"fa fa-facebook\"></i></a></li>\n");
      out.write("               <li><a href=\"#\"><i class=\"fa fa-twitter\"></i></a></li>\n");
      out.write("               <li><a href=\"#\"><i class=\"fa fa-dribbble\"></i></a></li>\n");
      out.write("               <li><a href=\"#\"><i class=\"fa fa-behance\"></i></a></li>\n");
      out.write("               <li><a href=\"#\"><i class=\"fa fa-linkedin\"></i></a></li>\n");
      out.write("             </ul>\n");
      out.write("\n");
      out.write("             <ul class=\"contact-info p-0\">\n");
      out.write("               <li><i class=\"fa fa-phone\"></i><span>7471126354</span></li>\n");
      out.write("               <li><i class=\"fa fa-envelope\"></i><span>ajava10@ngo.com</span></li>\n");
      out.write("               <li><i class=\"fa fa-map-marker\"></i><span>Universal Informatics ,A.B Road Bhawarkuwa ,Indore</span></li>\n");
      out.write("             </ul>\n");
      out.write("           </div>\n");
      out.write("         </div><!-- .col -->\n");
      out.write("\n");
      out.write("         <div class=\"col-12 col-lg-7\">\n");
      out.write("           <form  action=\"contactController\" method=\"post\" class=\"contact-form\">\n");
      out.write("             <input type=\"text\" placeholder=\"Name\" name=\"name\">\n");
      out.write("             <input type=\"email\" placeholder=\"Email\"  name=\"email\">\n");
      out.write("             <textarea rows=\"15\" cols=\"6\" placeholder=\"Messages\" name=\"message\"></textarea>\n");
      out.write("\n");
      out.write("             <span>\n");
      out.write("               <input class=\"btn gradient-bg\" type=\"submit\" value=\"Contact us\">\n");
      out.write("             </span>\n");
      out.write("           </form><!-- .contact-form -->\n");
      out.write("\n");
      out.write("         </div><!-- .col -->\n");
      out.write("\n");
      out.write("\n");
      out.write("       </div><!-- .row -->\n");
      out.write("     </div><!-- .container -->\n");
      out.write("   </div>\n");
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
