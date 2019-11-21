<%--
    Document   : createEvent
    Created on : 6 Nov, 2019, 8:25:06 PM
    Author     : Ritesh Verma
--%>

<%@page import="com.dao.UserDao"%>
<%@page import="com.model.User"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.dao.EventDao"%>
<%@page import="com.model.Event"%>
<%@page import="java.sql.ResultSet"%>
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
<%
   Event event = new Event();
   int eventId = 0;
   if (request.getParameter("eventId") != null) {
      eventId = Integer.parseInt(request.getParameter("eventId"));
   }

   if (eventId != 0) {
      event = new Event();
      event.setEventId(eventId);

      EventDao eventDao = new EventDao();
      ArrayList<Event> al = eventDao.getSingleEvent(event);
      event = al.get(0);
   }
%>
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
                       <h1 class="mdc-card__title mdc-card__title--large">Create An Event</h1>
                     </div>
                     <form action="../eventController" method="post">
                       <div class="mdc-card">
                         <section class="mdc-card__supporting-text">
                           <div class="mdc-layout-grid__inner">
                             <div class="mdc-layout-grid__cell mdc-layout-grid__cell--span-4-desktop">
                               <div class="template-demo">
                                 <div id="demo-tf-box-wrapper">
                                   <div id="tf-box-example" class="mdc-text-field mdc-text-field--box w-100">
                                     <input name="event" value="<%= event.getEvent()%>" type="text" id="tf-box" class="mdc-text-field__input" aria-controls="name-validation-message" placeholder="Enter Name">

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
                                   <input name="description" value="<%= event.getDescription()%>" type="text" id="tf-box" class="mdc-text-field__input" aria-controls="name-validation-message" placeholder="Enter Description">

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
                                   <input name="date" value="<%= event.getDate()%>" type="text" id="tf-box" class="mdc-text-field__input" aria-controls="name-validation-message" placeholder="Enter Date">

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
                                   <input name="time" value="<%= event.getTime()%>" type="text" id="tf-box" class="mdc-text-field__input" aria-controls="name-validation-message" placeholder="Enter Time">
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
                           <%
                              if (eventId == 0) {
                           %>
                           <div class="mdc-layout-grid__cell mdc-layout-grid__cell--span-4-desktop">
                             <div class="template-demo">
                               <div id="demo-tf-box-wrapper">
                                 <div id="tf-box-example" class="mdc-text-field mdc-text-field--box w-100">
                                   <input name="volunteerId" list="browsers" id="tf-box" class="mdc-text-field__input" aria-controls="name-validation-message" placeholder="Enter Volunteer">
                                   <datalist id="browsers">
                                     <%
                                        User user = new User();
                                        UserDao userDao = new UserDao();
                                        ArrayList<User> al = userDao.getAllUser();
                                        for (int i = 0; i < al.size(); i++) {
                                           user = al.get(i);
                                     %>
                                     <option value="<%= user.getUserId()%>">
                                       <%= user.getName()%>
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
                           <%
                           } else {
                           %>
                           <div class="mdc-layout-grid__cell mdc-layout-grid__cell--span-4-desktop">
                             <div class="template-demo">
                               <div id="demo-tf-box-wrapper">
                                 <div id="tf-box-example" class="mdc-text-field mdc-text-field--box w-100">
                                   <input name="volunteerId" list="browsers" value="<%= event.getVolunteerId() %>" id="tf-box" class="mdc-text-field__input" aria-controls="name-validation-message" placeholder="Enter Volunteer">
                                   <datalist id="browsers">
                                     <%
                                        User user = new User();
                                        UserDao userDao = new UserDao();
                                        ArrayList<User> al = userDao.getAllUser();
                                        for (int i = 0; i < al.size(); i++) {
                                           user = al.get(i);
                                     %>
                                     <option value="<%= user.getUserId()%> ">
                                       <%= user.getName()%>
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
                           <%
                              }
                           %>
                           <div class="mdc-layout-grid__cell mdc-layout-grid__cell--span-4-desktop">
                             <div class="template-demo">
                               <div id="demo-tf-box-wrapper">
                                 <div id="tf-box-example" class="mdc-text-field mdc-text-field--box w-100">
                                   <input name="location" value="<%= event.getLocation()%>" type="text" id="tf-box" class="mdc-text-field__input" aria-controls="name-validation-message" placeholder="Enter Location">

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
                                   <input name="sponsers" value="<%= event.getSponsers()%>" type="text" id="tf-box" class="mdc-text-field__input" aria-controls="name-validation-message" placeholder="Enter Sponser">

                                   <div class="mdc-text-field__bottom-line"></div>
                                 </div>
                                 <p class="mdc-text-field-helper-text mdc-text-field-helper-text--validation-msg" id="name-validation-msg">
                                   Must be at least 8 characters
                                 </p>
                               </div>
                             </div>
                           </div>
                         </div>
                         <%
                            if (eventId == 0) {
                         %>
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
                         <%
                         } else {
                         %>
                         <div class="mdc-layout-grid__inner">
                           <div class="mdc-layout-grid__cell mdc-layout-grid__cell--span-4-desktop">
                             <div class="template-demo">
                               <div id="demo-tf-box-wrapper">
                                 <div id="tf-box-example" class="mdc-text-field mdc-text-field--box w-100">
                                   <input type="hidden" value="<%= eventId%>" name="eventId">
                                   <input type="submit" name="operation" value="Update" id="tf-box" class="mdc-text-field__input" aria-controls="name-validation-message">
                                 </div>
                               </div>
                             </div>
                           </div>
                         </div>
                         <%
                            }
                         %>
                       </section>
                     </div>
                   </form>
                 </div>
               </div>
             </div>
             <span class="col mdc-button" data-mdc-auto-init="MDCRipple">
               <a href="eventDetails.jsp" class="mdi mdi-heart text-blue">
                 Event Details
               </a>
             </span>
           </div>
         </main>
         <jsp:include page="blocks/footer.jsp"></jsp:include>
      </div>
    </div>
  </body>
</html>
