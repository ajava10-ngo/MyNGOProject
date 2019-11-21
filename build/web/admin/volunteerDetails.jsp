<%-- 
    Document   : volunteerDetails
    Created on : 4 Nov, 2019, 11:40:04 AM
    Author     : Ritesh Verma
--%>

<%@page import="com.model.User"%>
<%@page import="com.model.Volunteer"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="com.dao.VolunteerDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
   response.setHeader("Cache-Control", "no-cache");
   response.setHeader("Cache-Control", "no-store");
   response.setHeader("Pragma", "no-cache");
   response.setDateHeader("Expires", 0);

   if (session.getAttribute("user") == null) {
      response.sendRedirect("../login.jsp");
   }
%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Volunteer Details</title>
    <script>
       function showIdCard(volunteerId) {
          var cardDetails = document.getElementById("cardDetails");

         object = new XMLHttpRequest();

          var method = "get";
          var url = "../volunteerCardController?volunteerId=" + volunteerId;

          object.open(method, url);

          object.onreadystatechange = function () {
             if (object.readyState === 4) {
                cardDetails.innerHTML = object.responseText;
             }
          };
          object.send();
       }
    </script>
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
                       <h1 class="mdc-card__title mdc-card__title--large">Volunteer List</h1>
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
                           <th class="text-center">Details</th>
                         </tr>
                       </thead>
                       <tbody>
                       <%
                          User user = new User();
                          VolunteerDao volunteerDao = new VolunteerDao();
                          ArrayList<User> al = volunteerDao.getAllVolunteer();

                          for (int i = 0; i < al.size(); i++) {
                             user = al.get(i);
                       %>
                       <tr>
                         <td class="text-center" >
                           <%= user.getName()%>
                         </td>
                         <td class="text-center">
                           <%= user.getEmail()%>
                         </td>
                         <td class="text-center">
                           <%= user.getUsername()%>
                         </td>
                         <td class="text-center">
                           <%= user.getMobile()%>
                         </td>
                         <td class="text-center">
                           <%= user.getAge()%>
                         </td>
                         <td class="text-center">
                           <%= user.getGender()%>
                         </td>
                         <td class="text-center">
                           <%= user.getCity().getCity()%>
                         </td>
                         <td class="text-center">
                           <%= user.getState().getState()%>
                         </td>
                         <td class="text-center">
                           <%= user.getAddress()%>
                         </td>

                         <td>
                           <span class="col mdc-button" data-mdc-auto-init="MDCRipple">
                             <a href="../volunteerController?operation=Remove&volunteerId=<%= user.getVolunteer().getVolunteerId()%>" class="mdi mdi-heart text-blue">
                               Remove
                             </a>
                           </span>
                         </td>
                         <td >
                           <span class="col mdc-button" data-mdc-auto-init="MDCRipple" >

                             <a class="mdi mdi-heart text-blue" onchange="" onclick="showIdCard(<%= user.getVolunteer().getVolunteerId()%>)">
                               Details
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
               <div class="mdc-layout-grid__cell stretch-card mdc-layout-grid__cell--span-4">
                 <div class="mdc-card card--with-avatar">
                   <section class="mdc-card__primary">
                     <div class="card__avatar"><img src="assets/images/faces/face1.jpg" alt=""></div>
                     <h1 class="mdc-card__title">Volunteer ID Card</h1>
                     <h2  class="mdc-card__subtitle"></h2>
                     <span class="social__icon-badge mdc-twitter mdi mdi-twitter"></span>
                   </section>
                   <section class="mdc-card__supporting-text pt-1" >
                     <p id="cardDetails" ></p>
                   </section>
                   <section class="mdc-card__social-footer bg-blue">
                     <div class="col">
                       <small>Events Completed</small>
                       <p>7</p>
                     </div>
                     <div class="col">
                       <small>Blood Donated</small>
                       <p>1</p>
                     </div>
                   </section>
                 </div>
               </div>
             </div>
           </div>
         </main>
         <jsp:include page="blocks/footer.jsp"></jsp:include>
      </div>
    </div>
  </body>
</html>
