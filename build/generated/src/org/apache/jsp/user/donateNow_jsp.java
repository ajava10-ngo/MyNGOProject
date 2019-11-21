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
      out.write("             <h2>Contribute With Us</h2>\n");
      out.write("             <header class=\"entry-header d-flex flex-wrap justify-content-between align-items-center\">\n");
      out.write("               <div class=\"header-elements\">\n");
      out.write("                 <h2 class=\"entry-title\"><a href=\"#\">Donate Money</a></h2>\n");
      out.write("                 <div class=\"post-metas d-flex flex-wrap align-items-center\">\n");
      out.write("                 </div>\n");
      out.write("               </div>\n");
      out.write("               <div class=\"donate-icon\">\n");
      out.write("                 <a href=\"#\"><img src=\"assets/images/donate-icon.png\" alt=\"\"></a>\n");
      out.write("               </div>\n");
      out.write("             </header>\n");
      out.write("             <div class=\"entry-content mt-5\">\n");
      out.write("               <p>No one is useless in this world who lightens the burdens of another.You have not lived today until you have done something for someone who can never repay you.It's not how much we give but how much love we put into giving.\n");
      out.write("               </p>\n");
      out.write("             </div><!-- .entry-content -->\n");
      out.write("             <header class=\"entry-header d-flex flex-wrap justify-content-between align-items-center\">\n");
      out.write("               <div class=\"header-elements\">\n");
      out.write("                 <h2 class=\"entry-title\"><a href=\"#\">Donate Blood</a></h2>\n");
      out.write("                 <div class=\"post-metas d-flex flex-wrap align-items-center\">\n");
      out.write("                 </div>\n");
      out.write("               </div>\n");
      out.write("               <div class=\"donate-icon\">\n");
      out.write("                 <a href=\"#\"><img src=\"assets/images/donate-icon.png\" alt=\"\"></a>\n");
      out.write("               </div>\n");
      out.write("             </header>\n");
      out.write("             <div class=\"entry-content mt-5\">\n");
      out.write("               <p>\n");
      out.write("                 Get involved in any way that suits you and start lifting lives today. Campaign, Volunteer, Intern, Fundraise, Donate, Shop, Become a Member. Best NGO in India. Trusted Indian NGO. Educate a Child. Sponsor a Girl Child. Shuddhi All India NGO. Empower Women.\n");
      out.write("               </p>\n");
      out.write("             </div><!-- .entry-content -->\n");
      out.write("\n");
      out.write("           </div>\n");
      out.write("         </div><!-- .col -->\n");
      out.write("         <div class=\"col-12 col-lg-7\">\n");
      out.write("           <form  action=\"contactController\" method=\"post\" class=\"contact-form\">\n");
      out.write("             <header class=\"entry-header d-flex flex-wrap justify-content-between align-items-center\">\n");
      out.write("               <div class=\"header-elements\">\n");
      out.write("                 <h2 class=\"entry-title\"><a href=\"#\">Other</a></h2>\n");
      out.write("                 <div class=\"post-metas d-flex flex-wrap align-items-center\">\n");
      out.write("                 </div>\n");
      out.write("               </div>\n");
      out.write("               <div class=\"donate-icon\">\n");
      out.write("                 <a href=\"#\"><img src=\"assets/images/donate-icon.png\" alt=\"\"></a>\n");
      out.write("               </div>\n");
      out.write("             </header>\n");
      out.write("             <div class=\"entry-content mt-5\">\n");
      out.write("               <p>\n");
      out.write("                 Volunteer for causes of your choice Education, Children, Environment. Bhumi - Youth volunteering NGO, Educate children, transform lives. Be a Campus Ambassador. Volunteer Now. Intern with us. Highlights: 10 Years Of Experience, Non-Profit Organisation.\n");
      out.write("               </p>\n");
      out.write("             </div><!-- .entry-content -->\n");
      out.write("             <textarea rows=\"15\" cols=\"6\" placeholder=\"Description\" name=\"description\"></textarea>\n");
      out.write("             <span>\n");
      out.write("               <input class=\"btn gradient-bg\" type=\"submit\" value=\"Donate\">\n");
      out.write("             </span>\n");
      out.write("           </form><!-- .contact-form -->\n");
      out.write("         </div><!-- .col -->\n");
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
