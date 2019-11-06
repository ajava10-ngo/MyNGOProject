package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class createEvent_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>Create Event</title>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <div class=\"body-wrapper\">\n");
      out.write("      ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "blocks/nav.jsp", out, false);
      out.write("\n");
      out.write("      ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "blocks/header.jsp", out, false);
      out.write("\n");
      out.write("          <!--content-->\n");
      out.write("          <div class=\"page-wrapper mdc-toolbar-fixed-adjust\">\n");
      out.write("            <main class=\"content-wrapper\">\n");
      out.write("              <div class=\"mdc-layout-grid\">\n");
      out.write("                <div class=\"mdc-layout-grid__inner\">\n");
      out.write("                  <div class=\"mdc-layout-grid__cell stretch-card mdc-layout-grid__cell--span-12\">\n");
      out.write("                    <div class=\"mdc-card\">\n");
      out.write("                      <form action=\"../createEvent\" method=\"post\" class=\"volunter-form\">\n");
      out.write("                        <section class=\"mdc-card__primary\">\n");
      out.write("                          <h1 class=\"mdc-card__title mdc-card__title--large\">Create Event</h1>\n");
      out.write("                        </section>\n");
      out.write("                        <section class=\"mdc-card__supporting-text\">\n");
      out.write("                          <div class=\"mdc-layout-grid__inner\">\n");
      out.write("                            <div class=\"mdc-layout-grid__cell mdc-layout-grid__cell--span-4-desktop\">\n");
      out.write("                              <div class=\"template-demo\">\n");
      out.write("                                <div id=\"demo-tf-box-wrapper\">\n");
      out.write("                                  <div id=\"tf-box-example\" class=\"mdc-text-field mdc-text-field--box w-100\">\n");
      out.write("                                    <input name=\"eventType\" required pattern=\".{8,}\" type=\"text\" id=\"tf-box\" class=\"mdc-text-field__input\" aria-controls=\"name-validation-message\" placeholder=\"Enter Event\">\n");
      out.write("                                  </div>\n");
      out.write("                                  <p class=\"mdc-text-field-helper-text mdc-text-field-helper-text--validation-msg\" id=\"name-validation-msg\">\n");
      out.write("                                    Must be at least 8 characters\n");
      out.write("                                  </p>\n");
      out.write("                                </div>\n");
      out.write("                              </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"mdc-layout-grid__cell mdc-layout-grid__cell--span-4-desktop\">\n");
      out.write("                              <div class=\"template-demo\">\n");
      out.write("                                <div id=\"demo-tf-box-wrapper\">\n");
      out.write("                                  <div id=\"tf-box-example\" class=\"mdc-text-field mdc-text-field--box w-100\">\n");
      out.write("                                    <input name=\"description\" required pattern=\".{8,}\" type=\"text\" id=\"tf-box\" class=\"mdc-text-field__input\" aria-controls=\"name-validation-message\" placeholder=\"Enter Description\">\n");
      out.write("                                  </div>\n");
      out.write("                                  <p class=\"mdc-text-field-helper-text mdc-text-field-helper-text--validation-msg\" id=\"name-validation-msg\">\n");
      out.write("                                    Must be at least 8 characters\n");
      out.write("                                  </p>\n");
      out.write("                                </div>\n");
      out.write("                              </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"mdc-layout-grid__cell mdc-layout-grid__cell--span-4-desktop\">\n");
      out.write("                              <div class=\"template-demo\">\n");
      out.write("                                <div id=\"demo-tf-box-leading-wrapper\">\n");
      out.write("                                  <div id=\"tf-box-leading-example\" class=\"mdc-text-field mdc-text-field--box mdc-text-field--with-leading-icon w-100\">\n");
      out.write("                                    <i class=\"material-icons mdc-text-field__icon\" tabindex=\"0\" onclick=\"\">event</i>\n");
      out.write("                                    <input type=\"date\" name=\"dateTime\" id=\"tf-box-leading\" class=\"mdc-text-field__input\" placeholder=\"Select Date\">\n");
      out.write("\n");
      out.write("                                    <div class=\"mdc-text-field__bottom-line\"></div>\n");
      out.write("                                  </div>\n");
      out.write("                                </div>\n");
      out.write("                              </div>\n");
      out.write("                            </div>\n");
      out.write("                          </div>\n");
      out.write("                          <div class=\"mdc-layout-grid__inner\">\n");
      out.write("                            <div class=\"mdc-layout-grid__cell mdc-layout-grid__cell--span-4-desktop\">\n");
      out.write("                              <div class=\"template-demo\">\n");
      out.write("                                <div id=\"demo-tf-box-wrapper\">\n");
      out.write("                                  <div id=\"tf-box-example\" class=\"mdc-text-field mdc-text-field--box w-100\">\n");
      out.write("                                    <input name=\"volunteerId\" type=\"text\" id=\"tf-box\" class=\"mdc-text-field__input\" aria-controls=\"name-validation-message\" placeholder=\"Enter Volunteer ID\">\n");
      out.write("                                  </div>\n");
      out.write("                                  <p class=\"mdc-text-field-helper-text mdc-text-field-helper-text--validation-msg\" id=\"name-validation-msg\">\n");
      out.write("                                    Must be at least 8 characters\n");
      out.write("                                  </p>\n");
      out.write("                                </div>\n");
      out.write("                              </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"mdc-layout-grid__cell mdc-layout-grid__cell--span-4-desktop\">\n");
      out.write("                              <div class=\"template-demo\">\n");
      out.write("                                <div id=\"demo-tf-box-wrapper\">\n");
      out.write("                                  <div id=\"tf-box-example\" class=\"mdc-text-field mdc-text-field--box w-100\">\n");
      out.write("                                    <input name=\"location\" type=\"text\" id=\"tf-box\" class=\"mdc-text-field__input\" aria-controls=\"name-validation-message\" placeholder=\"Enter Location\">\n");
      out.write("                                  </div>\n");
      out.write("                                  <p class=\"mdc-text-field-helper-text mdc-text-field-helper-text--validation-msg\" id=\"name-validation-msg\">\n");
      out.write("                                    Must be at least 8 characters\n");
      out.write("                                  </p>\n");
      out.write("                                </div>\n");
      out.write("                              </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"mdc-layout-grid__cell mdc-layout-grid__cell--span-4-desktop\">\n");
      out.write("                              <div class=\"template-demo\">\n");
      out.write("                                <div id=\"demo-tf-box-wrapper\">\n");
      out.write("                                  <div id=\"tf-box-example\" class=\"mdc-text-field mdc-text-field--box w-100\">\n");
      out.write("                                    <input name=\"sponsers\" required pattern=\".{8,}\" type=\"text\" id=\"tf-box\" class=\"mdc-text-field__input\" aria-controls=\"name-validation-message\" placeholder=\"Enter Sponsers\">\n");
      out.write("                                  </div>\n");
      out.write("                                  <p class=\"mdc-text-field-helper-text mdc-text-field-helper-text--validation-msg\" id=\"name-validation-msg\">\n");
      out.write("                                    Must be at least 8 characters\n");
      out.write("                                  </p>\n");
      out.write("                                </div>\n");
      out.write("                              </div>\n");
      out.write("                            </div>\n");
      out.write("                          </div>\n");
      out.write("                          <div class=\"mdc-layout-grid__inner\">\n");
      out.write("                            <div class=\"mdc-layout-grid__cell mdc-layout-grid__cell--span-4-desktop\">\n");
      out.write("                              <div class=\"template-demo\">\n");
      out.write("                                <div id=\"demo-tf-box-wrapper\">\n");
      out.write("                                  <div id=\"tf-box-example\" class=\"mdc-text-field mdc-text-field--box w-100\">\n");
      out.write("                                    <input type=\"submit\" value=\"Create Event\" id=\"tf-box\" class=\"mdc-text-field__input\" aria-controls=\"name-validation-message\">\n");
      out.write("                                  </div>\n");
      out.write("                                </div>\n");
      out.write("                              </div>\n");
      out.write("                            </div>\n");
      out.write("                          </div>\n");
      out.write("                        </section>\n");
      out.write("                      </form>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </main>\n");
      out.write("            <!--content-->\n");
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
