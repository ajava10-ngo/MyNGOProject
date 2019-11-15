<%--
    Document   : dashboard
    Created on : 31 Oct, 2019, 5:01:03 PM
    Author     : Ritesh Verma
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="com.dao.DonorDao"%>
<%@page import="com.dao.EventDao"%>
<%@page import="com.model.Event"%>
<%@page import="com.dao.VolunteerDao"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="com.dao.UserDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
   int totalUser = 0;
   UserDao getUser = new UserDao();
   ResultSet resultSetUser = getUser.getAllUser();
   while (resultSetUser.next()) {
      totalUser++;
   }

   int totalVolunteer = 0;
   VolunteerDao volunteerDao = new VolunteerDao();
   ArrayList alVolunteer = volunteerDao.getAllVolunteer();
   totalVolunteer = alVolunteer.size();

   int totalEvent = 0;
   EventDao eventDao = new EventDao();
   ResultSet resultSetEvent = eventDao.getAllEvent();
   while (resultSetEvent.next()) {
      totalEvent++;
   }

   int totalDonation = 0;
   DonorDao donorDao = new DonorDao();
   ResultSet resultSetDonor = donorDao.getAllDonor();
   while (resultSetDonor.next()) {
      totalDonation++;
   }
%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Dashboard</title>
  </head>
  <body>
    <div class="body-wrapper">
      <jsp:include page="blocks/nav.jsp"></jsp:include>
      <jsp:include page="blocks/header.jsp"></jsp:include>
         <!--content-->
         <div class="page-wrapper mdc-toolbar-fixed-adjust">
           <main class="content-wrapper">
             <div class="mdc-layout-grid">
               <div class="mdc-layout-grid__inner">
                 <div class="mdc-layout-grid__cell stretch-card mdc-layout-grid__cell--span-8">
                   <div class="mdc-layout-grid__inner">
                     <div class="mdc-layout-grid__cell stretch-card mdc-layout-grid__cell--span-6">
                       <div class="mdc-card py-3 pl-2 d-flex flex-row align-item-center">
                         <div class="mdc--tile mdc--tile-danger rounded">
                           <i class="mdi mdi-account-settings text-white icon-md"></i>
                         </div>
                         <div class="text-wrapper pl-1">
                           <h3 class="mdc-typography--display1 font-weight-bold mb-1"><%= totalUser%></h3>
                         <p class="font-weight-normal mb-0 mt-0">Total Active User</p>
                       </div>
                     </div>
                   </div>
                   <div class="mdc-layout-grid__cell stretch-card mdc-layout-grid__cell--span-6">
                     <div class="mdc-card py-3 pl-2 d-flex flex-row align-item-center">
                       <div class="mdc--tile mdc--tile-success rounded">
                         <i class="mdi mdi-basket text-white icon-md"></i>
                       </div>
                       <div class="text-wrapper pl-1">
                         <h3 class="mdc-typography--display1 font-weight-bold mb-1"><%= totalVolunteer%></h3>
                         <p class="font-weight-normal mb-0 mt-0">Total Volunteer</p>
                       </div>
                     </div>
                   </div>
                   <div class="mdc-layout-grid__cell stretch-card mdc-layout-grid__cell--span-6">
                     <div class="mdc-card py-3 pl-2 d-flex flex-row align-item-center">
                       <div class="mdc--tile mdc--tile-warning rounded">
                         <i class="mdi mdi-ticket text-white icon-md"></i> 
                       </div>
                       <div class="text-wrapper pl-1">
                         <h3 class="mdc-typography--display1 font-weight-bold mb-1"><%= totalEvent%></h3>
                         <p class="font-weight-normal mb-0 mt-0">Total Events Done</p>
                       </div>
                     </div>
                   </div>
                   <div class="mdc-layout-grid__cell stretch-card mdc-layout-grid__cell--span-6">
                     <div class="mdc-card py-3 pl-2 d-flex flex-row align-item-center">
                       <div class="mdc--tile mdc--tile-primary rounded">
                         <i class="mdi mdi-account-star text-white icon-md"></i>
                       </div>
                       <div class="text-wrapper pl-1">
                         <h3 class="mdc-typography--display1 font-weight-bold mb-1"><%= totalDonation%></h3>
                         <p class="font-weight-normal mb-0 mt-0">Total Blood Donation</p>
                       </div>
                     </div>
                   </div>
                 </div>
               </div>
               <div class="mdc-layout-grid__cell stretch-card mdc-layout-grid__cell--span-4">
                 <div class="mdc-card d-flex flex-column">
                   <div class="mdc-layout-grid__inner flex-grow-1">
                     <div class="mdc-layout-grid__cell stretch-card mdc-layout-grid__cell--span-3"></div>
                     <div class="mdc-layout-grid__cell stretch-card mdc-layout-grid__cell--span-6 d-flex align-item-center flex-column">
                       <h2 class="mdc-card__title mdc-card__title--large text-center mt-2 mb-2">Recent Event</h2>
                       <div id="currentBalanceCircle" class="w-100"></div>
                     </div>
                     <div class="mdc-layout-grid__cell stretch-card mdc-layout-grid__cell--span-3"></div>
                   </div>
                   <div class="mdc-layout-grid__inner">
                     <div class="mdc-layout-grid__cell stretch-card mdc-layout-grid__cell--span-12">
                       <section class="mdc-card__action-footer mt-4 bg-red w-100">
                         <div class="col mdc-button" data-mdc-auto-init="MDCRipple">
                           <i class="mdi mdi-store icon-md"></i>
                         </div>
                         <div class="col mdc-button" data-mdc-auto-init="MDCRipple">
                           <i class="mdi mdi-phone-plus icon-md"></i>
                         </div>
                         <div class="col mdc-button" data-mdc-auto-init="MDCRipple">
                           <i class="mdi mdi-share-variant icon-md"></i>
                         </div>
                         <div class="col mdc-button" data-mdc-auto-init="MDCRipple">
                           <i class="mdi mdi-autorenew icon-md"></i>
                         </div>
                       </section>
                     </div>
                   </div>
                 </div>
               </div>
               <div class="mdc-layout-grid__cell stretch-card mdc-layout-grid__cell--span-12">
                 <div class="mdc-card table-responsive">
                   <div class="table-heading px-2 px-1 border-bottom">
                     <h1 class="mdc-card__title mdc-card__title--large">User List</h1>
                   </div>
                   <table class="table">
                     <thead>
                       <tr>
                         <th class="text-center">Name</th>
                         <th class="text-center">Email</th>
                         <th class="text-center">Username</th>
                         <th class="text-center">Mobile</th>
                         <th class="text-center">Gender</th>
                         <th class="text-center">Age</th>
                         <th class="text-center">City</th>
                         <th class="text-center">State</th>
                         <th class="text-center">Address</th>
                         <th class="text-center">Actions</th>
                       </tr>
                     </thead>
                     <tbody>
                       <%
                          UserDao userDao = new UserDao();
                          ResultSet rs = userDao.getUserNotInVolunteer();
                          while (rs.next()) {
                       %>
                       <tr>
                         <td class="text-center">
                           <%= rs.getString("name")%>
                         </td>
                         <td class="text-center">
                           <%= rs.getString("email")%>
                         </td>
                         <td class="text-center">
                           <%= rs.getString("username")%>
                         </td>
                         <td class="text-center">
                           <%= rs.getString("mobile")%>
                         </td>
                         <td class="text-center">
                           <%= rs.getString("age")%>
                         </td>
                         <td class="text-center">
                           <%= rs.getString("gender")%>
                         </td>
                         <td class="text-center">
                           <%= rs.getString("cityId")%>
                         </td>
                         <td class="text-center">
                           <%= rs.getString("stateId")%>
                         </td>
                         <td class="text-center">
                           <%= rs.getString("address")%>
                         </td>
                         <td>
                           <span class="col mdc-button" data-mdc-auto-init="MDCRipple">
                             <a href="../userController?operation=Inactive&userId=<%= rs.getString("userId")%>" class="mdi mdi-heart text-blue">
                               Inactive
                             </a>
                           </span>
                           <span class="col mdc-button" data-mdc-auto-init="MDCRipple">
                             <a href="../volunteerController?operation=Insert&userId=<%= rs.getString("userId")%>&email=<%= rs.getString("email")%>" class="mdi mdi-heart text-blue">
                               Make_Volunteer
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
           </div>
         </main>
         <!--content-->
         <jsp:include page="blocks/footer.jsp"></jsp:include>
      </div>
    </div>
  </body>
</html>
