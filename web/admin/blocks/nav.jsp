<%-- 
    Document   : nav
    Created on : 2 Nov, 2019, 3:15:28 PM
    Author     : Ritesh Verma
--%>
<%@page import="com.model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Demo Dash</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Dashboard</title>

<!--<link rel="stylesheet" href="assets/css/materialdesignicons.min.css">-->
<link rel="stylesheet" href="assets/css/style.css">
<link rel="stylesheet" href="assets/css/bootstrap.min.css">

<!--<link rel="shortcut icon" href="assets/images/favicon.png"/>-->

<script src="assets/js/misc.js"></script>
<script src="assets/js/material.js"></script>
<script src="assets/js/jquery.min.js"></script>
<script src="assets/js/bootstrap-progressbar.min.js"></script>
<!--<script src="assets/js/bootstrap.min.js"></script>
<script src="assets/js/dashboard.js"></script>
<script src="assets/js/popper.min.js"></script>-->

<aside class="mdc-persistent-drawer mdc-persistent-drawer--open">
  <nav class="mdc-persistent-drawer__drawer">
    <div class="mdc-persistent-drawer__toolbar-spacer">
      <%
         if (session.getAttribute("user") != null) {
            User user = (User) session.getAttribute("user");
      %>
      <h4><%= user.getName()%></h4>
      <%
         }
      %>
    </div>
    <div class="mdc-list-group">
      <nav class="mdc-list mdc-drawer-menu">
        <div class="mdc-list-item mdc-drawer-item">
          <a class="mdc-drawer-link" href="dashboard.jsp">
            <i class="material-icons mdc-list-item__start-detail mdc-drawer-item-icon" aria-hidden="true">desktop_mac</i>
            Dashboard
          </a>
        </div>
        <div class="mdc-list-item mdc-drawer-item">
          <a class="mdc-drawer-link" href="volunteerDetails.jsp">
            <i class="material-icons mdc-list-item__start-detail mdc-drawer-item-icon" aria-hidden="true">track_changes</i>
            Volunteer
          </a>
        </div>
        <div class="mdc-list-item mdc-drawer-item" href="#" data-toggle="expansionPanel" target-panel="ui-sub-menu">
          <a class="mdc-drawer-link" href="donorDetails.jsp">
            <i class="material-icons mdc-list-item__start-detail mdc-drawer-item-icon" aria-hidden="true">dashboard</i>
            Blood Bank
            <i class="mdc-drawer-arrow material-icons">arrow_drop_down</i>
          </a>
          <div class="mdc-expansion-panel" id="ui-sub-menu">
            <nav class="mdc-list mdc-drawer-submenu">
              <div class="mdc-list-item mdc-drawer-item">
                <a class="mdc-drawer-link" href="#">
                  Buttons
                </a>
              </div>
              <div class="mdc-list-item mdc-drawer-item">
                <a class="mdc-drawer-link" href="#">
                  Typography
                </a>
              </div>
            </nav>
          </div>
        </div>
        <div class="mdc-list-item mdc-drawer-item">
          <a class="mdc-drawer-link" href="eventDetails.jsp">
            <i class="material-icons mdc-list-item__start-detail mdc-drawer-item-icon" aria-hidden="true">grid_on</i>
            Events
          </a>
        </div>
        <div class="mdc-list-item mdc-drawer-item">
          <a class="mdc-drawer-link" href="#">
            <i class="material-icons mdc-list-item__start-detail mdc-drawer-item-icon" aria-hidden="true">pie_chart_outlined</i>
            Charts
          </a>
        </div>

        <div class="mdc-list-item mdc-drawer-item" href="#" data-toggle="expansionPanel" target-panel="sample-page-submenu">
          <a class="mdc-drawer-link" href="#">
            <i class="material-icons mdc-list-item__start-detail mdc-drawer-item-icon" aria-hidden="true">pages</i>
            Sample Pages
            <i class="mdc-drawer-arrow material-icons">arrow_drop_down</i>
          </a>
          <div class="mdc-expansion-panel" id="sample-page-submenu">
            <nav class="mdc-list mdc-drawer-submenu">
              <div class="mdc-list-item mdc-drawer-item">
                <a class="mdc-drawer-link" href="pages/samples/blank-page.html">
                  Blank Page
                </a>
              </div>
              <div class="mdc-list-item mdc-drawer-item">
                <a class="mdc-drawer-link" href="pages/samples/403.html">
                  403
                </a>
              </div>
              <div class="mdc-list-item mdc-drawer-item">
                <a class="mdc-drawer-link" href="pages/samples/404.html">
                  404
                </a>
              </div>
              <div class="mdc-list-item mdc-drawer-item">
                <a class="mdc-drawer-link" href="pages/samples/500.html">
                  500
                </a>
              </div>
              <div class="mdc-list-item mdc-drawer-item">
                <a class="mdc-drawer-link" href="pages/samples/505.html">
                  505
                </a>
              </div>
              <div class="mdc-list-item mdc-drawer-item">
                <a class="mdc-drawer-link" href="pages/samples/login.html">
                  Login
                </a>
              </div>
              <div class="mdc-list-item mdc-drawer-item">
                <a class="mdc-drawer-link" href="pages/samples/register.html">
                  Register
                </a>
              </div>
            </nav>
          </div>
        </div>
      </nav>
    </div>
  </nav>
</aside>
