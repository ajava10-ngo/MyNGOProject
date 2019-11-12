<%-- 
    Document   : volunteerDetails
    Created on : 4 Nov, 2019, 11:40:04 AM
    Author     : Ritesh Verma
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="com.dao.VolunteerDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Volunteer Details</title>
    <script>
       function showIdCard() {
          var idCardNo = document.getElementById("idCardNo");
          var city = document.getElementById("city");
          var state = document.getElementById("State");
          var mobile = document.getElementById("mobile");
          var qualification = document.getElementById("qualification");
          var passingYear = document.getElementById("passingYear");
          var profession = document.getElementById("profession");

          var cardDetails = document.getElementById("cardDetails");

          var method = "get";
          var url = "../volunteerCardController?idCardNo=" + idCardNo + "&city=" + city +
                  "&state=" + state + "&mobile=" + mobile + "&qualification=" +
                  qualification + "&passingYear=" + passingYear + "&proffession=" +
                  profession;

          object = new XMLHttpRequest();
          object.open(method, url);

          object.onreadystatechange = function () {
             if (object.readyState === 4) {
                cardDetails.innerHtml = object.responseText;
             }
          };

       }
    </script>

    <script>
       document.addEventListener("DOMContentLoaded", () => {
          
       });
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
                         </tr>
                       </thead>
                       <tbody>
                       <%
                          VolunteerDao volunteerDao = new VolunteerDao();
                          ResultSet rs = volunteerDao.getAllVolunteer();
                          while (rs.next()) {
                       %>
                       <tr data-href="http://www.google.com/">
                         <td class="text-center" >
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
                         <td >
                           <span class="col mdc-button" data-mdc-auto-init="MDCRipple">
                             <a href="../volunteerController?operation=Remove&volunteerId=<%= rs.getString("volunteerId")%>" class="mdi mdi-heart text-blue">
                               Remove
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
                     <h1 class="mdc-card__title">Volunteer Name</h1>
                     <h2 class="mdc-card__subtitle">@post</h2>
                     <span class="social__icon-badge mdc-twitter mdi mdi-twitter"></span>
                   </section>
                   <section class="mdc-card__supporting-text pt-1">
                     <table>
                       <thead>
                         <tr>
                           <th class="mb-2" >Volunteer Card No</th>
                         </tr>
                         <tr>
                           <th class="mb-2">City</th>
                         </tr>
                         <tr>
                           <th class="mb-2">State</th>
                         </tr>
                         <tr>
                           <th class="mb-2">Mobile</th>
                         </tr>
                         <tr>
                           <th class="mb-2">Qualification</th>
                         </tr>
                         <tr>
                           <th class="mb-2">Year Of Passing</th>
                         </tr>
                         <tr>
                           <th class="mb-2">Profession</th>
                         </tr>
                       </thead>
                       <tbody id="cardDetails">
                         <tr>
                           <td>
                             <p id="text"></p>
                           </td>
                         </tr>
                       </tbody>
                     </table>
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
