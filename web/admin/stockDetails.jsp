<%-- 
    Document   : stockDetails
    Created on : 19 Nov, 2019, 4:11:03 PM
    Author     : Ritesh Verma
--%>

<%@page import="com.model.User"%>
<%@page import="com.model.Stock"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.dao.StockDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
   response.setHeader("Cache-Control", "no-cache");
   response.setHeader("Cache-Control", "no-store");
   response.setHeader("Pragma", "no-cache");
   response.setDateHeader("Expires", 0);

   if (session.getAttribute("user") == null) {
      response.sendRedirect("../login.jsp");
   } else {
      User user = (User) session.getAttribute("user");
      if (user.getType() == 1) {
%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Donor Details</title>
  </head>
  <body>
    <div class="body-wrapper">
      <jsp:include page="blocks/nav.jsp"></jsp:include>
      <jsp:include page="blocks/header.jsp"></jsp:include>
         <div class="page-wrapper mdc-toolbar-fixed-adjust">
           <main class="content-wrapper">
             <div class="mdc-layout-grid">
               <div class="mdc-layout-grid__inner">
                 <div class="mdc-layout-grid__cell stretch-card mdc-layout-grid__cell--span-12">
                   <div class="mdc-card table-responsive">
                     <div class="table-heading px-2 px-1 border-bottom">
                       <h1 class="mdc-card__title mdc-card__title--large">Stock Details</h1>
                       
                     </div>
                     <table class="table">
                       <thead>
                         <tr>
                           <th class="text-center">Blood Group</th>
                           <th class="text-center">Available Units</th>
                           <th class="text-center">Actions</th>
                         </tr>
                       </thead>
                       <tbody>
                       <%
                          StockDao stockDao = new StockDao();
                          ArrayList<Stock> al = stockDao.getAllStock();
                          Stock stock = new Stock();
                          for (int i = 0; i < al.size(); i++) {
                             stock = al.get(i);
                       %>
                       <tr>
                         <td class="text-center">
                           <%= stock.getBloodGroup()%>
                         </td>
                         <td class="text-center">
                           <%= stock.getAvailable()%>
                         </td>
                         <td class="text-center">
                           <span class="col mdc-button" data-mdc-auto-init="MDCRipple">
                             <a href="" class="mdi mdi-heart text-blue">
                               Update
                             </a>
                           </span>
                         </td>
                       </tr>
                       <%
                          }
                       %>
                     </tbody>
                   </table>
                 </div>
               </div>
             </div>
             <span class="col mdc-button" data-mdc-auto-init="MDCRipple">
               <a href="donorDetails.jsp" class="mdi mdi-heart text-blue">
                 Donor List
               </a>
             </span>
           </div>
         </main>
         <!--content-->
         <jsp:include page="blocks/footer.jsp"></jsp:include>
      </div>
    </div>
  </body>
</html>
<%
      } else {
         response.sendRedirect("../login.jsp");
      }
   }
%>