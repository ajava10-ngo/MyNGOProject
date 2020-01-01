<%-- 
    Document   : donorDetails
    Created on : 5 Nov, 2019, 6:30:26 PM
    Author     : Ritesh Verma
--%>

<%@page import="com.model.User"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="com.dao.DonorDao"%>
<%@page import="com.model.Donor"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                       <h1 class="mdc-card__title mdc-card__title--large">Donor List</h1>
                     </div>
                     <table class="table">
                       <thead>
                         <tr>
                           <th class="text-center">Name</th>
                           <th class="text-center">Blood Group</th>
                           <th class="text-center">Mobile</th>
                           <th class="text-center">Gender</th>
                           <th class="text-center">Age</th>
                           <th class="text-center">Donation Date</th>
                           <th class="text-center">Address</th>
                           <th class="text-center">Actions</th>
                         </tr>
                       </thead>
                       <tbody>
                       <%
                          DonorDao donorDao = new DonorDao();
                          ArrayList<User> al = donorDao.getAllDonor();
                          user = new User();
                          for (int i = 0; i < al.size(); i++) {
                             user = al.get(i);
                       %>
                       <tr>
                         <td class="text-center">
                           <%= user.getName()%>
                         </td>
                         <td class="text-center">
                           <%= user.getStock().getBloodGroup()%>
                         </td>
                         <td class="text-center">
                           <%= user.getMobile()%>
                         </td>
                         <td class="text-center">
                           <%= user.getGender()%>
                         </td>
                         <td class="text-center">
                           <%= user.getAge()%>
                         </td>
                         <td class="text-center">
                           <%= user.getDonor().getDate()%>
                         </td>
                         <td class="text-center">
                           <%= user.getAddress()%>
                         </td>
                         <td class="text-center">
                           <span class="col mdc-button" data-mdc-auto-init="MDCRipple">
                             <a href="" class="mdi mdi-heart text-blue">
                               Remove
                             </a>
                           </span>
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
               <a href="createDonor.jsp" class="mdi mdi-heart text-blue">
                 Create
               </a>
             </span>
             <span class="col mdc-button" data-mdc-auto-init="MDCRipple">
               <a href="stockDetails.jsp" class="mdi mdi-heart text-blue">
                 Stock Details
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