package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.dao.DonorDao;
import com.dao.EventDao;
import com.model.Event;
import com.dao.VolunteerDao;
import java.sql.ResultSet;
import com.dao.UserDao;

public final class dashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");

   int totalUser = 0;
   UserDao getUser = new UserDao();
   ResultSet resultSetUser = getUser.getAllUser();
   while (resultSetUser.next()) {
      totalUser++;
   }

   int totalVolunteer = 0;
   VolunteerDao volunteerDao = new VolunteerDao();
   ResultSet resultSetVolunteer = volunteerDao.getAllVolunteer();
   while (resultSetVolunteer.next()) {
      totalVolunteer++;
   }

   int totalEvent = 0;
   EventDao eventDao = new EventDao();
   ResultSet resultSetEvent = volunteerDao.getAllVolunteer();
   while (resultSetEvent.next()) {
      totalEvent++;
   }

   int totalDonation = 0;
   DonorDao donorDao = new DonorDao();
   ResultSet resultSetDonor = donorDao.getAllDonor();
   while (resultSetDonor.next()) {
      totalDonation++;
   }

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>Dashboard</title>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <div class=\"body-wrapper\">\n");
      out.write("      ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "blocks/nav.jsp", out, false);
      out.write("\n");
      out.write("      ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "blocks/header.jsp", out, false);
      out.write("\n");
      out.write("         <!--content-->\n");
      out.write("         <div class=\"page-wrapper mdc-toolbar-fixed-adjust\">\n");
      out.write("           <main class=\"content-wrapper\">\n");
      out.write("             <div class=\"mdc-layout-grid\">\n");
      out.write("               <div class=\"mdc-layout-grid__inner\">\n");
      out.write("                 <div class=\"mdc-layout-grid__cell stretch-card mdc-layout-grid__cell--span-8\">\n");
      out.write("                   <div class=\"mdc-layout-grid__inner\">\n");
      out.write("                     <div class=\"mdc-layout-grid__cell stretch-card mdc-layout-grid__cell--span-6\">\n");
      out.write("                       <div class=\"mdc-card py-3 pl-2 d-flex flex-row align-item-center\">\n");
      out.write("                         <div class=\"mdc--tile mdc--tile-danger rounded\">\n");
      out.write("                           <i class=\"mdi mdi-account-settings text-white icon-md\"></i>\n");
      out.write("                         </div>\n");
      out.write("                         <div class=\"text-wrapper pl-1\">\n");
      out.write("                           <h3 class=\"mdc-typography--display1 font-weight-bold mb-1\">");
      out.print( totalUser);
      out.write("</h3>\n");
      out.write("                         <p class=\"font-weight-normal mb-0 mt-0\">Total User</p>\n");
      out.write("                       </div>\n");
      out.write("                     </div>\n");
      out.write("                   </div>\n");
      out.write("                   <div class=\"mdc-layout-grid__cell stretch-card mdc-layout-grid__cell--span-6\">\n");
      out.write("                     <div class=\"mdc-card py-3 pl-2 d-flex flex-row align-item-center\">\n");
      out.write("                       <div class=\"mdc--tile mdc--tile-success rounded\">\n");
      out.write("                         <i class=\"mdi mdi-basket text-white icon-md\"></i>\n");
      out.write("                       </div>\n");
      out.write("                       <div class=\"text-wrapper pl-1\">\n");
      out.write("                         <h3 class=\"mdc-typography--display1 font-weight-bold mb-1\">");
      out.print( totalVolunteer);
      out.write("</h3>\n");
      out.write("                         <p class=\"font-weight-normal mb-0 mt-0\">Total Volunteer</p>\n");
      out.write("                       </div>\n");
      out.write("                     </div>\n");
      out.write("                   </div>\n");
      out.write("                   <div class=\"mdc-layout-grid__cell stretch-card mdc-layout-grid__cell--span-6\">\n");
      out.write("                     <div class=\"mdc-card py-3 pl-2 d-flex flex-row align-item-center\">\n");
      out.write("                       <div class=\"mdc--tile mdc--tile-warning rounded\">\n");
      out.write("                         <i class=\"mdi mdi-ticket text-white icon-md\"></i> \n");
      out.write("                       </div>\n");
      out.write("                       <div class=\"text-wrapper pl-1\">\n");
      out.write("                         <h3 class=\"mdc-typography--display1 font-weight-bold mb-1\">");
      out.print( totalEvent);
      out.write("</h3>\n");
      out.write("                         <p class=\"font-weight-normal mb-0 mt-0\">Total Events Done</p>\n");
      out.write("                       </div>\n");
      out.write("                     </div>\n");
      out.write("                   </div>\n");
      out.write("                   <div class=\"mdc-layout-grid__cell stretch-card mdc-layout-grid__cell--span-6\">\n");
      out.write("                     <div class=\"mdc-card py-3 pl-2 d-flex flex-row align-item-center\">\n");
      out.write("                       <div class=\"mdc--tile mdc--tile-primary rounded\">\n");
      out.write("                         <i class=\"mdi mdi-account-star text-white icon-md\"></i>\n");
      out.write("                       </div>\n");
      out.write("                       <div class=\"text-wrapper pl-1\">\n");
      out.write("                         <h3 class=\"mdc-typography--display1 font-weight-bold mb-1\">");
      out.print( totalDonation);
      out.write("</h3>\n");
      out.write("                         <p class=\"font-weight-normal mb-0 mt-0\">Total Blood Donation</p>\n");
      out.write("                       </div>\n");
      out.write("                     </div>\n");
      out.write("                   </div>\n");
      out.write("                 </div>\n");
      out.write("               </div>\n");
      out.write("               <div class=\"mdc-layout-grid__cell stretch-card mdc-layout-grid__cell--span-4\">\n");
      out.write("                 <div class=\"mdc-card d-flex flex-column\">\n");
      out.write("                   <div class=\"mdc-layout-grid__inner flex-grow-1\">\n");
      out.write("                     <div class=\"mdc-layout-grid__cell stretch-card mdc-layout-grid__cell--span-3\"></div>\n");
      out.write("                     <div class=\"mdc-layout-grid__cell stretch-card mdc-layout-grid__cell--span-6 d-flex align-item-center flex-column\">\n");
      out.write("                       <h2 class=\"mdc-card__title mdc-card__title--large text-center mt-2 mb-2\">Recent Event</h2>\n");
      out.write("                       <div id=\"currentBalanceCircle\" class=\"w-100\"></div>\n");
      out.write("                     </div>\n");
      out.write("                     <div class=\"mdc-layout-grid__cell stretch-card mdc-layout-grid__cell--span-3\"></div>\n");
      out.write("                   </div>\n");
      out.write("                   <div class=\"mdc-layout-grid__inner\">\n");
      out.write("                     <div class=\"mdc-layout-grid__cell stretch-card mdc-layout-grid__cell--span-12\">\n");
      out.write("                       <section class=\"mdc-card__action-footer mt-4 bg-red w-100\">\n");
      out.write("                         <div class=\"col mdc-button\" data-mdc-auto-init=\"MDCRipple\">\n");
      out.write("                           <i class=\"mdi mdi-store icon-md\"></i>\n");
      out.write("                         </div>\n");
      out.write("                         <div class=\"col mdc-button\" data-mdc-auto-init=\"MDCRipple\">\n");
      out.write("                           <i class=\"mdi mdi-phone-plus icon-md\"></i>\n");
      out.write("                         </div>\n");
      out.write("                         <div class=\"col mdc-button\" data-mdc-auto-init=\"MDCRipple\">\n");
      out.write("                           <i class=\"mdi mdi-share-variant icon-md\"></i>\n");
      out.write("                         </div>\n");
      out.write("                         <div class=\"col mdc-button\" data-mdc-auto-init=\"MDCRipple\">\n");
      out.write("                           <i class=\"mdi mdi-autorenew icon-md\"></i>\n");
      out.write("                         </div>\n");
      out.write("                       </section>\n");
      out.write("                     </div>\n");
      out.write("                   </div>\n");
      out.write("                 </div>\n");
      out.write("               </div>\n");
      out.write("               <div class=\"mdc-layout-grid__cell stretch-card mdc-layout-grid__cell--span-12\">\n");
      out.write("                 <div class=\"mdc-card table-responsive\">\n");
      out.write("                   <div class=\"table-heading px-2 px-1 border-bottom\">\n");
      out.write("                     <h1 class=\"mdc-card__title mdc-card__title--large\">User List</h1>\n");
      out.write("                   </div>\n");
      out.write("                   <table class=\"table\">\n");
      out.write("                     <thead>\n");
      out.write("                       <tr>\n");
      out.write("                         <th class=\"text-center\">Name</th>\n");
      out.write("                         <th class=\"text-center\">Email</th>\n");
      out.write("                         <th class=\"text-center\">Username</th>\n");
      out.write("                         <th class=\"text-center\">Mobile</th>\n");
      out.write("                         <th class=\"text-center\">Gender</th>\n");
      out.write("                         <th class=\"text-center\">Age</th>\n");
      out.write("                         <th class=\"text-center\">City</th>\n");
      out.write("                         <th class=\"text-center\">State</th>\n");
      out.write("                         <th class=\"text-center\">Address</th>\n");
      out.write("                         <th class=\"text-center\">Actions</th>\n");
      out.write("                       </tr>\n");
      out.write("                     </thead>\n");
      out.write("                     <tbody>\n");
      out.write("                       ");

                          UserDao userDao = new UserDao();
                          ResultSet rs = userDao.getUserNotInVolunteer();
                          while (rs.next()) {
                             if (Integer.parseInt(rs.getString("type")) != 1) {
                       
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
      out.write("                         <td>\n");
      out.write("                           <span class=\"col mdc-button\" data-mdc-auto-init=\"MDCRipple\">\n");
      out.write("                             <a href=\"../userController?operation=Inactive&userId=");
      out.print( rs.getString("userId"));
      out.write("\" class=\"mdi mdi-heart text-blue\">\n");
      out.write("                               Inactive\n");
      out.write("                             </a>\n");
      out.write("                           </span>\n");
      out.write("                           <span class=\"col mdc-button\" data-mdc-auto-init=\"MDCRipple\">\n");
      out.write("                             <a href=\"../volunteerController?operation=Insert&userId=");
      out.print( rs.getString("userId"));
      out.write("&email=");
      out.print( rs.getString("email"));
      out.write("\" class=\"mdi mdi-heart text-blue\">\n");
      out.write("                               Make_Volunteer\n");
      out.write("                             </a>\n");
      out.write("                           </span>\n");
      out.write("                         </td>\n");
      out.write("                       </tr>\n");
      out.write("                       ");

                             }
                          }
                       
      out.write("\n");
      out.write("                     </tbody>\n");
      out.write("                   </table>\n");
      out.write("                 </div>\n");
      out.write("               </div>\n");
      out.write("             </div>\n");
      out.write("           </div>\n");
      out.write("         </main>\n");
      out.write("         <!--content-->\n");
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
