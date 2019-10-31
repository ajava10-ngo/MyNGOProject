package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.dao.StockDao;
import com.dao.CityDao;
import java.io.PrintWriter;
import java.sql.ResultSet;
import com.dao.StateDao;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    int stateId = 0;

      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "blocks/nav.jsp", out, false);
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "blocks/cssLinkage.jsp", out, false);
      out.write("\n");
      out.write("    <!DOCTYPE html>\n");
      out.write("    <html>\n");
      out.write("        <head>\n");
      out.write("            <title>Registration Page</title>\n");
      out.write("        </head>\n");
      out.write("        <body>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-6 d-flex ftco-animate\">\n");
      out.write("                        <div class=\"img img-2 align-self-stretch\" style=\"background-image: url(assets/images/bg_4.jpg);\"></div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-6 volunteer pl-md-5 ftco-animate\">\n");
      out.write("                        <h3 class=\"mb-3\">Registration</h3>\n");
      out.write("                        <form action=\"register\" method=\"post\" class=\"volunter-form\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <input type=\"text\" name=\"name\" class=\"form-control\" placeholder=\"Name\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <input type=\"email\" name=\"email\" class=\"form-control\" placeholder=\"Email\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <input type=\"text\" name=\"username\" class=\"form-control\" placeholder=\"Username\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <input type=\"password\" name=\"password\" class=\"form-control\" placeholder=\"Password\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <input type=\"text\" name=\"mobile\" class=\"form-control\" placeholder=\"Mobile\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <div class=\"form-control\">\n");
      out.write("                                    <label class=\"label-gender\">Gender\n");
      out.write("                                    </label>\n");
      out.write("\n");
      out.write("                                    <label class=\"gender-radio\">Male\n");
      out.write("                                        <input type=\"radio\" name=\"gender\" value=\"Male\">\n");
      out.write("                                        <span class=\"checkmark\"></span>\n");
      out.write("                                    </label>\n");
      out.write("\n");
      out.write("                                    <label class=\"gender-radio\" >Female\n");
      out.write("                                        <input type=\"radio\" name=\"gender\" value=\"Female\">\n");
      out.write("                                        <span class=\"checkmark\"></span>\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <input type=\"text\" name=\"age\" class=\"form-control\" placeholder=\"Age\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <select class=\"custom-select\" name=\"stockId\">\n");
      out.write("                                    <option value=\"\" selected=\"\">Select Blood Group</option>\n");
      out.write("                                ");

                                    StockDao stockDao = new StockDao();
                                    ResultSet rsStock = stockDao.getAllStock();

                                    while (rsStock.next()) {
                                
      out.write("\n");
      out.write("                                <option value=\"");
      out.print( rsStock.getString("stockId"));
      out.write("\" >\n");
      out.write("                                    ");
      out.print( rsStock.getString("bloodGroup"));
      out.write("\n");
      out.write("                                </option>\n");
      out.write("                                ");

                                    }
                                
      out.write("\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <select class=\"custom-select\" name=\"stateId\">\n");
      out.write("                                <option value=\"\" selected=\"\">Select State</option>\n");
      out.write("                                ");

                                    ResultSet rsState = null;
                                    try {
                                        StateDao stateDao = new StateDao();

                                        rsState = stateDao.getAllState();
                                    } catch (Exception e) {
                                        out.print("Exception : " + e.toString());
                                    }
                                    while (rsState.next()) {
                                
      out.write("\n");
      out.write("                                <option value=\"");
      out.print( rsState.getInt("stateId"));
      out.write("\">\n");
      out.write("                                    ");
      out.print( rsState.getString("state"));
      out.write("\n");
      out.write("                                </option>\n");
      out.write("                                ");

                                    }
                                
      out.write("\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <select class=\"custom-select\" name=\"cityId\">\n");
      out.write("                                <option value=\"\">Select City</option>\n");
      out.write("                                ");

                                    ResultSet rsCity = null;
                                    stateId = 20;
                                    try {
                                        CityDao cityDao = new CityDao();
                                        rsCity = cityDao.getAllCity(stateId);
                                    } catch (Exception e) {
                                        out.print("Exception : " + e.toString());
                                    }
                                    while (rsCity.next()) {
                                
      out.write("\n");
      out.write("\n");
      out.write("                                <option value=\"");
      out.print( rsCity.getString("cityId"));
      out.write('"');
      out.write('>');
      out.print( rsCity.getString("city"));
      out.write("</option>\n");
      out.write("\n");
      out.write("                                ");

                                    }
                                
      out.write("\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <textarea name=\"address\" placeholder=\"Address\" class=\"form-control textarea\"></textarea>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <input type=\"submit\" value=\"Register\" class=\"btn btn-white py-3 px-5\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <a class=\"form-control-plaintext\" href=\"login.jsp\">Already Registered? Login Here</a>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>    \t\t\t\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "blocks/footer.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
