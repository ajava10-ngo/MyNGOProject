package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.model.State;
import com.model.Stock;
import java.util.ArrayList;
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "blocks/header.jsp", out, false);
      out.write("\n");
      out.write("   <!DOCTYPE html>\n");
      out.write("   <title>Registration Page</title>\n");
      out.write("   <script>\n");
      out.write("      function selectCity() {\n");
      out.write("         var stateId = document.getElementById(\"stateId\").value;\n");
      out.write("         var cityId = document.getElementById(\"cityId\");\n");
      out.write("         var err = document.getElementById(\"err\");\n");
      out.write("\n");
      out.write("         object = new XMLHttpRequest();\n");
      out.write("\n");
      out.write("         var method = \"get\";\n");
      out.write("         var url = \"register?operation=SelectCity&stateId=\" + stateId;\n");
      out.write("\n");
      out.write("         object.open(method, url);\n");
      out.write("\n");
      out.write("         object.onreadystatechange = function () {\n");
      out.write("            if (object.readyState === 4) {\n");
      out.write("               cityId.innerHTML = object.responseText;\n");
      out.write("            }\n");
      out.write("         };\n");
      out.write("         object.send();\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      function checkEUM() {\n");
      out.write("         var email = document.getElementById(\"email\").value;\n");
      out.write("         var username = document.getElementById(\"username\").value;\n");
      out.write("         var mobile = document.getElementById(\"mobile\").value;\n");
      out.write("\n");
      out.write("         var chEmail = document.getElementById(\"chEmail\");\n");
      out.write("         var chUsername = document.getElementById(\"chUsername\");\n");
      out.write("         var chMobile = document.getElementById(\"chMobile\");\n");
      out.write("\n");
      out.write("         object = new XMLHttpRequest();\n");
      out.write("\n");
      out.write("         var method = \"get\";\n");
      out.write("         var url = \"register?operation=checkEUM&email=\" + email + \"&username=\" + username + \"&mobile=\" + mobile;\n");
      out.write("\n");
      out.write("         object.open(method, url);\n");
      out.write("\n");
      out.write("         object.onreadystatechange = function () {\n");
      out.write("            if (object.readyState === 4) {\n");
      out.write("               var response = object.responseText;\n");
      out.write("               if (response === \"Email\") {\n");
      out.write("                  chEmail.innerHTML = \"<span style='color : red'>Email Already Exists<span>\";\n");
      out.write("               } else if (response === \"Username\") {\n");
      out.write("                  chUsername.innerHTML = \"<span style='color : red'>\" + response + \"<span>\";\n");
      out.write("               } else if (response === \"Mobile\") {\n");
      out.write("                  chMobile.innerHTML = \"<span style='color : red'>\" + response + \"<span>\";\n");
      out.write("               } else if (response === \"\") {\n");
      out.write("//                  alert(\"hello\");\n");
      out.write("                  chMobile.innerHTML = \"<span style='color : red'><span>\";\n");
      out.write("               }\n");
      out.write("            }\n");
      out.write("         };\n");
      out.write("         object.send();\n");
      out.write("      }\n");
      out.write("   </script>\n");
      out.write("\n");
      out.write("   <div class=\"container\">\n");
      out.write("     <div class=\"row d-md-flex\">\n");
      out.write("       <div class=\"col-md-6 d-flex ftco-animate\">\n");
      out.write("         <div class=\"img img-2 align-self-stretch\" style=\"background-image: url(assets/images/bg_4.jpg);\"></div>\n");
      out.write("       </div>\n");
      out.write("       <div class=\"col-md-6 volunteer pl-md-5 ftco-animate\">\n");
      out.write("         <h3 class=\"mb-3\">Registration</h3>\n");
      out.write("         <form action=\"register\" method=\"post\" class=\"volunter-form\">\n");
      out.write("           <div class=\"form-group\">\n");
      out.write("             <input type=\"text\" name=\"name\" class=\"form-control\" placeholder=\"Name\" required=\"\" >\n");
      out.write("           </div>\n");
      out.write("           <div class=\"form-group\">\n");
      out.write("             <input type=\"email\" id=\"email\" name=\"email\" onkeyup=\"checkEUM()\" class=\"form-control\" placeholder=\"Email\" required=\"\">\n");
      out.write("           </div>\n");
      out.write("           <p id=\"chEmail\"></p>\n");
      out.write("           <div class=\"form-group\">\n");
      out.write("             <input type=\"text\" id=\"username\" name=\"username\" onfocus=\"checkEUM()\" class=\"form-control\" placeholder=\"Username\" required=\"\">\n");
      out.write("           </div>\n");
      out.write("           <p id=\"chUsername\"></p>\n");
      out.write("           <div class=\"form-group\">\n");
      out.write("             <input type=\"password\" name=\"password\" class=\"form-control\" placeholder=\"Password\" required=\"\">\n");
      out.write("           </div>\n");
      out.write("           <div class=\"form-group\">\n");
      out.write("             <input type=\"text\" id=\"mobile\" name=\"mobile\" onfocus=\"checkEUM()\" class=\"form-control\" placeholder=\"Mobile\" required=\"\">\n");
      out.write("           </div>\n");
      out.write("           <p id=\"chMobile\"></p>\n");
      out.write("           <div class=\"form-group\">\n");
      out.write("             <div class=\"form-control\">\n");
      out.write("               <label class=\"label-gender\">Gender\n");
      out.write("               </label>\n");
      out.write("\n");
      out.write("               <label class=\"gender-radio\">Male\n");
      out.write("                 <input type=\"radio\" name=\"gender\" value=\"Male\" required=\"\">\n");
      out.write("                 <span class=\"checkmark\"></span>\n");
      out.write("               </label>\n");
      out.write("\n");
      out.write("               <label class=\"gender-radio\" >Female\n");
      out.write("                 <input type=\"radio\" name=\"gender\" value=\"Female\" required=\"\">\n");
      out.write("                 <span class=\"checkmark\"></span>\n");
      out.write("               </label>\n");
      out.write("             </div>\n");
      out.write("           </div>\n");
      out.write("           <div class=\"form-group\">\n");
      out.write("             <input type=\"text\" name=\"age\" class=\"form-control\" placeholder=\"Age\" required=\"\">\n");
      out.write("           </div>\n");
      out.write("           <div class=\"form-group\">\n");
      out.write("             <select class=\"custom-select\" name=\"stockId\">\n");
      out.write("               <option value=\"9\" selected=\"\">Select Blood Group</option>\n");
      out.write("             ");

                Stock stock = new Stock();
                StockDao stockDao = new StockDao();

                ArrayList<Stock> al = stockDao.getAllStock();

                for (int i = 0; i < al.size(); i++) {
                   stock = al.get(i);
             
      out.write("\n");
      out.write("             <option value=\"");
      out.print( stock.getStockId());
      out.write("\" >\n");
      out.write("               ");
      out.print( stock.getBloodGroup());
      out.write("\n");
      out.write("             </option>\n");
      out.write("             ");

                }
             
      out.write("\n");
      out.write("           </select>\n");
      out.write("         </div>\n");
      out.write("         <div class=\"form-group\">\n");
      out.write("           <select onchange=\"selectCity()\" id=\"stateId\" class=\"custom-select\" name=\"stateId\" required=\"\">\n");
      out.write("             <option value=\"0\" selected=\"\">Select State</option>\n");
      out.write("             ");

                StateDao stateDao = new StateDao();

                ArrayList<State> arrayList = stateDao.getAllState();
                State state = new State();
                for (int i = 0; i < arrayList.size(); i++) {
                   state = arrayList.get(i);
             
      out.write("\n");
      out.write("             <option value=\"");
      out.print( state.getStateId());
      out.write("\">\n");
      out.write("               ");
      out.print( state.getState());
      out.write("\n");
      out.write("             </option>\n");
      out.write("             ");

                }
             
      out.write("\n");
      out.write("           </select>\n");
      out.write("         </div>\n");
      out.write("         <div class=\"form-group\">\n");
      out.write("           <select id=\"cityId\" class=\"custom-select\" name=\"cityId\" required=\"\">\n");
      out.write("             <option value=\"\">Select City</option>\n");
      out.write("           </select>\n");
      out.write("           <p id=\"err\"></p>\n");
      out.write("         </div>\n");
      out.write("         <div class=\"form-group\">\n");
      out.write("           <textarea name=\"address\" placeholder=\"Address\" class=\"form-control textarea\" required=\"\"></textarea>\n");
      out.write("         </div>\n");
      out.write("\n");
      out.write("         <div class=\"form-group\">\n");
      out.write("           <input type=\"submit\" value=\"Register\" name=\"operation\" class=\"btn gradient-bg\">\n");
      out.write("         </div>\n");
      out.write("         <div class=\"form-group\">\n");
      out.write("           <a class=\"form-control-plaintext\" href=\"login.jsp\">Already Registered? Login Here</a>\n");
      out.write("         </div>\n");
      out.write("       </form>\n");
      out.write("     </div>    \t\t\t\n");
      out.write("   </div>\n");
      out.write("</div>\n");
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
