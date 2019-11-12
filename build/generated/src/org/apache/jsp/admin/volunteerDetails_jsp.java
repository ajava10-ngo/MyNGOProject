package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import com.dao.VolunteerDao;

public final class volunteerDetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>Volunteer Details</title>\n");
      out.write("    <script>\n");
      out.write("       function showIdCard() {\n");
      out.write("          var idCardNo = document.getElementById(\"idCardNo\");\n");
      out.write("          var city = document.getElementById(\"city\");\n");
      out.write("          var state = document.getElementById(\"State\");\n");
      out.write("          var mobile = document.getElementById(\"mobile\");\n");
      out.write("          var qualification = document.getElementById(\"qualification\");\n");
      out.write("          var passingYear = document.getElementById(\"passingYear\");\n");
      out.write("          var profession = document.getElementById(\"profession\");\n");
      out.write("          \n");
      out.write("          var method = \"get\";\n");
      out.write("          var url = \"../volunteerCardController?idCardNo=\" + idCardNo + \"&city=\" + city +\n");
      out.write("                  \"&state=\" + state + \"&mobile=\" + mobile + \"&qualification=\" + \n");
      out.write("                  qualification + \"&passingYear=\" + passingYear + \"&proffession=\" +\n");
      out.write("                  profession;\n");
      out.write("\n");
      out.write("          object = new XMLHttpRequest();\n");
      out.write("          object.open(method, url);\n");
      out.write("          \n");
      out.write("          object.onreadystatechange \n");
      out.write("\n");
      out.write("       }\n");
      out.write("    </script>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <div class=\"body-wrapper\">\n");
      out.write("      ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "blocks/nav.jsp", out, false);
      out.write("\n");
      out.write("      ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "blocks/header.jsp", out, false);
      out.write("\n");
      out.write("         <div class=\"page-wrapper mdc-toolbar-fixed-adjust\">\n");
      out.write("           <main class=\"content-wrapper\">\n");
      out.write("             <div class=\"mdc-layout-grid\">\n");
      out.write("               <div class=\"mdc-layout-grid__inner\">\n");
      out.write("                 <div class=\"mdc-layout-grid__cell stretch-card mdc-layout-grid__cell--span-12\">\n");
      out.write("                   <div class=\"mdc-card table-responsive\">\n");
      out.write("                     <div class=\"table-heading px-2 px-1 border-bottom\">\n");
      out.write("                       <h1 class=\"mdc-card__title mdc-card__title--large\">Volunteer List</h1>\n");
      out.write("                     </div>\n");
      out.write("                     <table class=\"table\">\n");
      out.write("                       <thead>\n");
      out.write("                         <tr>\n");
      out.write("                           <th class=\"text-center\">Name</th>\n");
      out.write("                           <th class=\"text-center\">Email</th>\n");
      out.write("                           <th class=\"text-center\">Username</th>\n");
      out.write("                           <th class=\"text-center\">Mobile</th>\n");
      out.write("                           <th class=\"text-center\">Gender</th>\n");
      out.write("                           <th class=\"text-center\">Age</th>\n");
      out.write("                           <th class=\"text-center\">City</th>\n");
      out.write("                           <th class=\"text-center\">State</th>\n");
      out.write("                           <th class=\"text-center\">Address</th>\n");
      out.write("                           <th class=\"text-center\">Actions</th>\n");
      out.write("                         </tr>\n");
      out.write("                       </thead>\n");
      out.write("                       <tbody>\n");
      out.write("                       ");

                          VolunteerDao volunteerDao = new VolunteerDao();
                          ResultSet rs = volunteerDao.getAllVolunteer();
                          while (rs.next()) {
                       
      out.write("\n");
      out.write("                       <tr>\n");
      out.write("                         <td class=\"text-center\">\n");
      out.write("                           ");
      out.print( rs.getString("name"));
      out.write("\n");
      out.write("                         </td>\n");
      out.write("                         <td class=\"text-center\">\n");
      out.write("                           ");
      out.print( rs.getString("email"));
      out.write("\n");
      out.write("                         </td>\n");
      out.write("                         <td class=\"text-center\">\n");
      out.write("                           ");
      out.print( rs.getString("username"));
      out.write("\n");
      out.write("                         </td>\n");
      out.write("                         <td class=\"text-center\">\n");
      out.write("                           ");
      out.print( rs.getString("mobile"));
      out.write("\n");
      out.write("                         </td>\n");
      out.write("                         <td class=\"text-center\">\n");
      out.write("                           ");
      out.print( rs.getString("age"));
      out.write("\n");
      out.write("                         </td>\n");
      out.write("                         <td class=\"text-center\">\n");
      out.write("                           ");
      out.print( rs.getString("gender"));
      out.write("\n");
      out.write("                         </td>\n");
      out.write("                         <td class=\"text-center\">\n");
      out.write("                           ");
      out.print( rs.getString("cityId"));
      out.write("\n");
      out.write("                         </td>\n");
      out.write("                         <td class=\"text-center\">\n");
      out.write("                           ");
      out.print( rs.getString("stateId"));
      out.write("\n");
      out.write("                         </td>\n");
      out.write("                         <td class=\"text-center\">\n");
      out.write("                           ");
      out.print( rs.getString("address"));
      out.write("\n");
      out.write("                         </td>\n");
      out.write("                         <td >\n");
      out.write("                           <span class=\"col mdc-button\" data-mdc-auto-init=\"MDCRipple\">\n");
      out.write("                             <a href=\"../volunteerController?operation=Remove&volunteerId=");
      out.print( rs.getString("volunteerId"));
      out.write("\" class=\"mdi mdi-heart text-blue\">\n");
      out.write("                               Remove\n");
      out.write("                             </a>\n");
      out.write("                           </span>\n");
      out.write("                         </td>\n");
      out.write("                       </tr>\n");
      out.write("                       ");

                          }
                       
      out.write("\n");
      out.write("                     </tbody>\n");
      out.write("                   </table>\n");
      out.write("                 </div>\n");
      out.write("               </div>\n");
      out.write("               <div class=\"mdc-layout-grid__cell stretch-card mdc-layout-grid__cell--span-4\">\n");
      out.write("                 <div class=\"mdc-card card--with-avatar\">\n");
      out.write("                   <section class=\"mdc-card__primary\">\n");
      out.write("                     <div class=\"card__avatar\"><img src=\"assets/images/faces/face1.jpg\" alt=\"\"></div>\n");
      out.write("                     <h1 class=\"mdc-card__title\">Volunteer Name</h1>\n");
      out.write("                     <h2 class=\"mdc-card__subtitle\">@post</h2>\n");
      out.write("                     <span class=\"social__icon-badge mdc-twitter mdi mdi-twitter\"></span>\n");
      out.write("                   </section>\n");
      out.write("                   <section class=\"mdc-card__supporting-text pt-1\">\n");
      out.write("                     <table>\n");
      out.write("                       <thead>\n");
      out.write("                         <tr>\n");
      out.write("                           <td class=\"mb-2\">Volunteer Card No</td>\n");
      out.write("                           <td class=\"mb-2\">City</td>\n");
      out.write("                           <td class=\"mb-2\">State</td>\n");
      out.write("                           <td class=\"mb-2\">Mobile</td>\n");
      out.write("                           <td class=\"mb-2\">Qualification</td>\n");
      out.write("                           <td class=\"mb-2\">Year Of Passing</td>\n");
      out.write("                           <td class=\"mb-2\">Profession</td>\n");
      out.write("                         </tr>\n");
      out.write("                       </thead>\n");
      out.write("                       <tbody>\n");
      out.write("                         <tr>\n");
      out.write("                           <td id=\"idCardNo\"></td>\n");
      out.write("                           <td id=\"city\"></td>\n");
      out.write("                           <td id=\"state\"></td>\n");
      out.write("                           <td id=\"mobile\"></td>\n");
      out.write("                           <td id=\"qualification\"></td>\n");
      out.write("                           <td id=\"passingYear\"></td>\n");
      out.write("                           <td id=\"profession\"></td>\n");
      out.write("                         </tr>\n");
      out.write("                       </tbody>\n");
      out.write("                     </table>\n");
      out.write("                   </section>\n");
      out.write("                   <section class=\"mdc-card__social-footer bg-blue\">\n");
      out.write("                     <div class=\"col\">\n");
      out.write("                       <small>Events Completed</small>\n");
      out.write("                       <p>7</p>\n");
      out.write("                     </div>\n");
      out.write("                     <div class=\"col\">\n");
      out.write("                       <small>Blood Donated</small>\n");
      out.write("                       <p>1</p>\n");
      out.write("                     </div>\n");
      out.write("                   </section>\n");
      out.write("                 </div>\n");
      out.write("               </div>\n");
      out.write("             </div>\n");
      out.write("           </div>\n");
      out.write("         </main>\n");
      out.write("         ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "blocks/footer.jsp", out, false);
      out.write("\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </body>\n");
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
