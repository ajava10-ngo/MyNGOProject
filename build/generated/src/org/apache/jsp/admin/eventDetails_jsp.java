package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.dao.EventDao;
import java.sql.ResultSet;

public final class eventDetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Event Details</title>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <div class=\"body-wrapper\">\n");
      out.write("      ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "blocks/nav.jsp", out, false);
      out.write("\n");
      out.write("      ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "blocks/header.jsp", out, false);
      out.write("\n");
      out.write("          <div class=\"page-wrapper mdc-toolbar-fixed-adjust\">\n");
      out.write("            <main class=\"content-wrapper\">\n");
      out.write("              <div class=\"mdc-layout-grid\">\n");
      out.write("                <div class=\"mdc-layout-grid__inner\">\n");
      out.write("                  <div class=\"mdc-layout-grid__cell stretch-card mdc-layout-grid__cell--span-12\">\n");
      out.write("                    <div class=\"mdc-card table-responsive\">\n");
      out.write("                      <div class=\"table-heading px-2 px-1 border-bottom\">\n");
      out.write("                        <h1 class=\"mdc-card__title mdc-card__title--large\">Upcoming Events</h1>\n");
      out.write("                      </div>\n");
      out.write("                      <table class=\"table\">\n");
      out.write("                        <thead>\n");
      out.write("                            <th class=\"text-left\">Event</th>\n");
      out.write("                            <th class=\"text-left\">Description</th>\n");
      out.write("                            <th class=\"text-left\">Date And Time</th>\n");
      out.write("                            <th class=\"text-left\">Location</th>\n");
      out.write("                            <th class=\"text-left\">Sponsers</th>\n");
      out.write("                            <th class=\"text-center\" colspan=\"2\">Actions</th>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("                        ");

                            EventDao volunteerDao = new EventDao();
                            ResultSet rs = volunteerDao.getAllEvent();
                            while (rs.next()) {
                        
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                          <td class=\"text-left\">\n");
      out.write("                            ");
      out.print( rs.getString("eventType") );
      out.write("\n");
      out.write("                          </td>\n");
      out.write("                          <td class=\"text-left\">\n");
      out.write("                            ");
      out.print( rs.getString("description") );
      out.write("\n");
      out.write("                          </td>\n");
      out.write("                          <td class=\"text-left\">\n");
      out.write("                            ");
      out.print( rs.getString("dateTime") );
      out.write("\n");
      out.write("                          </td>\n");
      out.write("                          <td class=\"text-left\">\n");
      out.write("                            ");
      out.print( rs.getString("location") );
      out.write("\n");
      out.write("                          </td>\n");
      out.write("                          <td class=\"text-left\">\n");
      out.write("                            ");
      out.print( rs.getString("sponsers") );
      out.write("\n");
      out.write("                          </td>\n");
      out.write("                          <td>\n");
      out.write("                            <span class=\"mdc-button\" data-mdc-auto-init=\"MDCRipple\">\n");
      out.write("                              <a href=\"#\" class=\"mdi mdi-heart text-blue\">\n");
      out.write("                                Update\n");
      out.write("                              </a>\n");
      out.write("                            </span>\n");
      out.write("                            <span class=\"mdc-button\" data-mdc-auto-init=\"MDCRipple\">\n");
      out.write("                              <a href=\"#\" class=\"mdi mdi-heart text-blue\">\n");
      out.write("                                Remove\n");
      out.write("                              </a>\n");
      out.write("                            </span>\n");
      out.write("                          </td>\n");
      out.write("                        </tr>\n");
      out.write("                        ");

                            }
                        
      out.write("\n");
      out.write("                      </tbody>\n");
      out.write("                    </table>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </main>\n");
      out.write("          ");
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
