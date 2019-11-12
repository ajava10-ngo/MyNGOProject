package org.apache.jsp.volunteer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "blocks/nav.jsp", out, false);
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "blocks/header.jsp", out, false);
      out.write("\n");
      out.write("   <div class=\"page-wrapper mdc-toolbar-fixed-adjust\">\n");
      out.write("     <main class=\"content-wrapper\">\n");
      out.write("       <div class=\"mdc-layout-grid\">\n");
      out.write("         <div class=\"mdc-layout-grid__inner\">\n");
      out.write("           <div class=\"mdc-layout-grid__cell stretch-card mdc-layout-grid__cell--span-4\">\n");
      out.write("             <div class=\"mdc-card card--with-avatar\">\n");
      out.write("               <section class=\"mdc-card__primary\">\n");
      out.write("                 <div class=\"card__avatar\"><img src=\"assets/images/faces/face1.jpg\" alt=\"\"></div>\n");
      out.write("                 <h1 class=\"mdc-card__title\">Volunteer Name</h1>\n");
      out.write("                 <h2 class=\"mdc-card__subtitle\">@post</h2>\n");
      out.write("                 <span class=\"social__icon-badge mdc-twitter mdi mdi-twitter\"></span>\n");
      out.write("               </section>\n");
      out.write("               <section class=\"mdc-card__supporting-text pt-1\">\n");
      out.write("                 <p class=\"mb-2\">Volunteer Card No</p>\n");
      out.write("                 <p class=\"mb-2\">City</p>\n");
      out.write("                 <p class=\"mb-2\">State</p>\n");
      out.write("                 <p class=\"mb-2\">Mobile</p>\n");
      out.write("                 <p class=\"mb-2\">Qualification</p>\n");
      out.write("                 <p class=\"mb-2\">Year Of Passing</p>\n");
      out.write("                 <p class=\"mb-2\">Profession</p>\n");
      out.write("               </section>\n");
      out.write("               <section class=\"mdc-card__social-footer bg-blue\">\n");
      out.write("                 <div class=\"col\">\n");
      out.write("                   <small>Events Completed</small>\n");
      out.write("                   <p>7</p>\n");
      out.write("                 </div>\n");
      out.write("                 <div class=\"col\">\n");
      out.write("                   <small>Blood Donated</small>\n");
      out.write("                   <p>1</p>\n");
      out.write("                 </div>\n");
      out.write("               </section>\n");
      out.write("             </div>\n");
      out.write("           </div>\n");
      out.write("           <div class=\"mdc-layout-grid__cell stretch-card mdc-layout-grid__cell--span-8\">\n");
      out.write("             <div class=\"mdc-card px-2 py-2\">\n");
      out.write("               <!--<div id=\"js-legend\" class=\"chartjs-legend mb-2\"></div>-->\n");
      out.write("               <table>\n");
      out.write("                 <thead>\n");
      out.write("                   <tr>\n");
      out.write("                     <th>TODO Here</th>\n");
      out.write("                   </tr>\n");
      out.write("                 </thead>\n");
      out.write("\n");
      out.write("                 <tbody>\n");
      out.write("                   <tr>\n");
      out.write("                     <td>TODO Here</td>\n");
      out.write("                   </tr>\n");
      out.write("                 </tbody>\n");
      out.write("               </table>\n");
      out.write("             <!--</div>-->\n");
      out.write("           </div>\n");
      out.write("         </div>\n");
      out.write("       </div>\n");
      out.write("     </main>\n");
      out.write("   ");
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
