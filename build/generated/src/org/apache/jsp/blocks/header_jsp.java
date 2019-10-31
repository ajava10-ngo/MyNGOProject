package org.apache.jsp.blocks;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <html>\n");
      out.write("    <head>\n");
      out.write("        <!-- Required meta tags -->\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\n");
      out.write("        <!-- Bootstrap CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"../assets/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("        <!-- FontAwesome CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"../assets/css/font-awesome.min.css\">\n");
      out.write("\n");
      out.write("        <!-- ElegantFonts CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"../assets/css/elegant-fonts.css\">\n");
      out.write("\n");
      out.write("        <!-- themify-icons CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"../assets/css/themify-icons.css\">\n");
      out.write("\n");
      out.write("        <!-- Swiper CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"../assets/css/swiper.min.css\">\n");
      out.write("\n");
      out.write("        <!-- Styles -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"../assets/css/style.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <header class=\"site-header\">\n");
      out.write("            <div class=\"top-header-bar\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row flex-wrap justify-content-center justify-content-lg-between align-items-lg-center\">\n");
      out.write("                        <div class=\"col-12 col-lg-8 d-none d-md-flex flex-wrap justify-content-center justify-content-lg-start mb-3 mb-lg-0\">\n");
      out.write("                            <div class=\"header-bar-email\">\n");
      out.write("                                MAIL: <a href=\"#\">contact@ourcharity.com</a>\n");
      out.write("                            </div><!-- .header-bar-email -->\n");
      out.write("\n");
      out.write("                            <div class=\"header-bar-text\">\n");
      out.write("                                <p>PHONE: <span>+24 3772 120 091 / +56452 4567</span></p>\n");
      out.write("                            </div><!-- .header-bar-text -->\n");
      out.write("                        </div><!-- .col -->\n");
      out.write("\n");
      out.write("                        <div class=\"col-12 col-lg-4 d-flex flex-wrap justify-content-center justify-content-lg-end align-items-center\">\n");
      out.write("                            <div class=\"donate-btn\">\n");
      out.write("                                <a href=\"#\">Donate Now</a>\n");
      out.write("                            </div><!-- .donate-btn -->\n");
      out.write("                        </div><!-- .col -->\n");
      out.write("                    </div><!-- .row -->\n");
      out.write("                </div><!-- .container -->\n");
      out.write("            </div><!-- .top-header-bar -->\n");
      out.write("\n");
      out.write("            <div class=\"nav-bar\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-12 d-flex flex-wrap justify-content-between align-items-center\">\n");
      out.write("                            <div class=\"site-branding d-flex align-items-center\">\n");
      out.write("                                <a class=\"d-block\" href=\"index.jsp\" rel=\"home\"><img class=\"d-block\" src=\"../assets/images/logo.png\" alt=\"logo\"></a>\n");
      out.write("                            </div><!-- .site-branding -->\n");
      out.write("\n");
      out.write("                            <nav class=\"site-navigation d-flex justify-content-end align-items-center\">\n");
      out.write("                                <ul class=\"d-flex flex-column flex-lg-row justify-content-lg-end align-content-center\">\n");
      out.write("                                    <li class=\"current-menu-item\"><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                                    <li><a href=\"about.html\">About us</a></li>\n");
      out.write("                                    <li><a href=\"causes.html\">Causes</a></li>\n");
      out.write("                                    <li><a href=\"portfolio.html\">Gallery</a></li>\n");
      out.write("                                    <li><a href=\"news.html\">News</a></li>\n");
      out.write("                                    <li><a href=\"contact.html\">Contact</a></li>\n");
      out.write("                                    <li><a href=\"login.jsp\">Login/Register</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </nav><!-- .site-navigation -->\n");
      out.write("\n");
      out.write("                            <div class=\"hamburger-menu d-lg-none\">\n");
      out.write("                                <span></span>\n");
      out.write("                                <span></span>\n");
      out.write("                                <span></span>\n");
      out.write("                                <span></span>\n");
      out.write("                            </div><!-- .hamburger-menu -->\n");
      out.write("                        </div><!-- .col -->\n");
      out.write("                    </div><!-- .row -->\n");
      out.write("                </div><!-- .container -->\n");
      out.write("            </div><!-- .nav-bar -->\n");
      out.write("        </header><!-- .site-header -->\n");
      out.write("        <!-- END nav -->");
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
