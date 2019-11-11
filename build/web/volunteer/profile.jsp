<%-- 
    Document   : profile
    Created on : 10 Nov, 2019, 9:08:32 PM
    Author     : Ritesh Verma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:include page="blocks/nav.jsp"></jsp:include>
<jsp:include page="blocks/header.jsp"></jsp:include>
   <div class="page-wrapper mdc-toolbar-fixed-adjust">
     <main class="content-wrapper">
       <div class="mdc-layout-grid">
         <div class="mdc-layout-grid__inner">
           <div class="mdc-layout-grid__cell stretch-card mdc-layout-grid__cell--span-4">
             <div class="mdc-card card--with-avatar">
               <section class="mdc-card__primary">
                 <div class="card__avatar"><img src="assets/images/faces/face1.jpg" alt=""></div>
                 <h1 class="mdc-card__title">Volunteer Name</h1>
                 <h2 class="mdc-card__subtitle">@post</h2>
                 <span class="social__icon-badge mdc-twitter mdi mdi-twitter"></span>
               </section>
               <section class="mdc-card__supporting-text pt-1">
                 <p class="mb-2">Volunteer Card No</p>
                 <p class="mb-2">City</p>
                 <p class="mb-2">State</p>
                 <p class="mb-2">Mobile</p>
                 <p class="mb-2">Qualification</p>
                 <p class="mb-2">Year Of Passing</p>
                 <p class="mb-2">Profession</p>
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
           <div class="mdc-layout-grid__cell stretch-card mdc-layout-grid__cell--span-8">
             <div class="mdc-card px-2 py-2">
               <!--<div id="js-legend" class="chartjs-legend mb-2"></div>-->
               <table>
                 <thead>
                   <tr>
                     <th>TODO Here</th>
                   </tr>
                 </thead>

                 <tbody>
                   <tr>
                     <td>TODO Here</td>
                   </tr>
                 </tbody>
               </table>
             <!--</div>-->
           </div>
         </div>
       </div>
     </main>
   <jsp:include page="blocks/footer.jsp"></jsp:include>
