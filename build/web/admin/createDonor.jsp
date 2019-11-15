<%-- 
    Document   : createDonor
    Created on : 7 Nov, 2019, 9:14:08 PM
    Author     : Ritesh Verma
--%>

<%@page import="com.model.Stock"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.dao.UserDao"%>
<%@page import="com.dao.DonorDao"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="com.dao.StockDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Create Event</title>
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
                       <h1 class="mdc-card__title mdc-card__title--large">Enter Donor Details</h1>
                     </div>
                     <form action="../donorController" method="post">
                       <div class="mdc-card">
                         <section class="mdc-card__supporting-text">
                           <div class="mdc-layout-grid__inner">
                             <div class="mdc-layout-grid__cell mdc-layout-grid__cell--span-4-desktop">
                               <div class="template-demo">
                                 <div id="demo-tf-box-wrapper">
                                   <div id="tf-box-example" class="mdc-text-field mdc-text-field--box w-100">
                                     <input name="userId" list="browsers" id="tf-box" class="mdc-text-field__input" aria-controls="name-validation-message" placeholder="Enter Name">
                                     <datalist id="browsers">
                                     <%
                                        UserDao userDao = new UserDao();
                                        ResultSet rsUser = userDao.getAllUser();
                                        while (rsUser.next()) {
                                     %>
                                     <option value="<%= rsUser.getString("userId")%> ">
                                       <%= rsUser.getString("name")%>
                                     </option>

                                     <%
                                        }
                                     %>
                                   </datalist>
                                   <div class="mdc-text-field__bottom-line"></div>
                                 </div>
                                 <p class="mdc-text-field-helper-text mdc-text-field-helper-text--validation-msg" id="name-validation-msg">
                                   Must be at least 8 characters
                                 </p>
                               </div>
                             </div>
                           </div>
                         </div>
                         <div class="mdc-layout-grid__inner">
                           <div class="mdc-layout-grid__cell mdc-layout-grid__cell--span-4-desktop">
                             <div class="template-demo">
                               <div id="demo-tf-box-wrapper">
                                 <div id="tf-box-example" class="mdc-text-field mdc-text-field--box w-100">
                                   <input name="date" value="" type="text" id="tf-box" class="mdc-text-field__input" aria-controls="name-validation-message" placeholder="Enter Date">
                                   <div class="mdc-text-field__bottom-line"></div>
                                 </div>
                                 <p class="mdc-text-field-helper-text mdc-text-field-helper-text--validation-msg" id="name-validation-msg">
                                   Must be at least 8 characters
                                 </p>
                               </div>
                             </div>
                           </div>
                         </div>
                         <div class="mdc-layout-grid__inner">
                           <div class="mdc-layout-grid__cell mdc-layout-grid__cell--span-4-desktop">
                             <div class="template-demo">
                               <div id="demo-tf-box-wrapper">
                                 <div id="tf-box-example" class="mdc-text-field mdc-text-field--box w-100">
                                   <select name="stockId" class="mdc-select__surface">
                                     <option value="0">Select Blood Group</option>
                                     <%
                                        StockDao stockDao = new StockDao();
                                        ArrayList<Stock> alStock = stockDao.getAllStock();
                                        Stock stock = new Stock();
                                        for (int i = 0; i < alStock.size(); i++) {
                                           stock = alStock.get(i);
                                     %>

                                     <option value="<%= stock.getStockId()%>"><%= stock.getBloodGroup()%></option>

                                     <%
                                        }
                                     %>

                                   </select>
                                   <div class="mdc-text-field__bottom-line"></div>
                                 </div>
                                 <p class="mdc-text-field-helper-text mdc-text-field-helper-text--validation-msg" id="name-validation-msg">
                                   Must be at least 8 characters
                                 </p>
                               </div>
                             </div>
                           </div>
                         </div>
                         <div class="mdc-layout-grid__inner">
                           <div class="mdc-layout-grid__cell mdc-layout-grid__cell--span-4-desktop">
                             <div class="template-demo">
                               <div id="demo-tf-box-wrapper">
                                 <div id="tf-box-example" class="mdc-text-field mdc-text-field--box w-100">
                                   <input type="submit" name="operation" value="Submit" id="tf-box" class="mdc-text-field__input" aria-controls="name-validation-message">
                                 </div>
                               </div>
                             </div>
                           </div>
                         </div>
                       </section>
                     </div>
                   </form>
                 </div>
               </div>
             </div>
             <span class="col mdc-button" data-mdc-auto-init="MDCRipple">
               <a href="donorDetails.jsp" class="mdi mdi-heart text-blue">
                 Donor Details
               </a>
             </span>
           </div>
         </main>
         <jsp:include page="blocks/footer.jsp"></jsp:include>
      </div>
    </div>
  </body>
</html>
