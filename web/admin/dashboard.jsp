<%--
    Document   : dashboard
    Created on : 31 Oct, 2019, 5:01:03 PM
    Author     : Ritesh Verma
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="com.dao.UserDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>Dashboard</title>
        <!-- plugins:css -->
        <link rel="stylesheet" href="node_modules/mdi/css/materialdesignicons.min.css">
        <!-- endinject -->
        <!-- plugin css for this page -->
        <!-- End plugin css for this page -->
        <!-- inject:css -->
        <link rel="stylesheet" href="assets/css/style.css">
        <!-- endinject -->
        <link rel="shortcut icon" href="assets/images/favicon.png" />
    </head>
    <body>
        <div class="body-wrapper">
            <!-- partial:partials/_sidebar.html -->
            <aside class="mdc-persistent-drawer mdc-persistent-drawer--open">
                <nav class="mdc-persistent-drawer__drawer">
                    <div class="mdc-persistent-drawer__toolbar-spacer">
                        <a href="dashboard.jsp" class="brand-logo">
                            <img src="assets/images/logo.svg" alt="logo">
                        </a>
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
                                <a class="mdc-drawer-link" href="#">
                                    <i class="material-icons mdc-list-item__start-detail mdc-drawer-item-icon" aria-hidden="true">track_changes</i>
                                    Create Event
                                </a>
                            </div>
                            <div class="mdc-list-item mdc-drawer-item" href="#" data-toggle="expansionPanel" target-panel="ui-sub-menu">
                                <a class="mdc-drawer-link" href="#">
                                    <i class="material-icons mdc-list-item__start-detail mdc-drawer-item-icon" aria-hidden="true">dashboard</i>
                                    UI Features
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
                                <a class="mdc-drawer-link" href="#">
                                    <i class="material-icons mdc-list-item__start-detail mdc-drawer-item-icon" aria-hidden="true">grid_on</i>
                                    Tables
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
            <!-- partial -->
            <!-- partial:partials/_navbar.html -->
            <header class="mdc-toolbar mdc-elevation--z4 mdc-toolbar--fixed">
                <div class="mdc-toolbar__row">
                    <section class="mdc-toolbar__section mdc-toolbar__section--align-start">
                        <a href="#" class="menu-toggler material-icons mdc-toolbar__menu-icon">menu</a>
                        <span class="mdc-toolbar__input">
                            <div class="mdc-text-field">
                                <input type="text" class="mdc-text-field__input" id="css-only-text-field-box" placeholder="Search anything...">
                            </div>
                        </span>
                    </section>
                    <section class="mdc-toolbar__section mdc-toolbar__section--align-end" role="toolbar">
                        <div class="mdc-menu-anchor">
                            <a href="#" class="mdc-toolbar__icon toggle mdc-ripple-surface" data-toggle="dropdown" toggle-dropdown="notification-menu" data-mdc-auto-init="MDCRipple">
                                <i class="material-icons">notifications</i>
                                <span class="dropdown-count">3</span>
                            </a>
                            <div class="mdc-simple-menu mdc-simple-menu--right" tabindex="-1" id="notification-menu">
                                <ul class="mdc-simple-menu__items mdc-list" role="menu" aria-hidden="true">
                                    <li class="mdc-list-item" role="menuitem" tabindex="0">
                                        <i class="material-icons mdc-theme--primary mr-1">email</i>
                                        One unread message
                                    </li>
                                    <li class="mdc-list-item" role="menuitem" tabindex="0">
                                        <i class="material-icons mdc-theme--primary mr-1">group</i>
                                        One event coming up
                                    </li>
                                    <li class="mdc-list-item" role="menuitem" tabindex="0">
                                        <i class="material-icons mdc-theme--primary mr-1">cake</i>
                                        It's Aleena's birthday!
                                    </li>
                                </ul>
                            </div>
                        </div>
                        <div class="mdc-menu-anchor">
                            <a href="#" class="mdc-toolbar__icon mdc-ripple-surface" data-mdc-auto-init="MDCRipple">
                                <i class="material-icons">widgets</i>
                            </a>
                        </div>
                        <div class="mdc-menu-anchor mr-1">
                            <a href="#" class="mdc-toolbar__icon toggle mdc-ripple-surface" data-toggle="dropdown" toggle-dropdown="logout-menu" data-mdc-auto-init="MDCRipple">
                                <i class="material-icons">more_vert</i>
                            </a>
                            <div class="mdc-simple-menu mdc-simple-menu--right" tabindex="-1" id="logout-menu">
                                <ul class="mdc-simple-menu__items mdc-list" role="menu" aria-hidden="true">
                                    <li class="mdc-list-item" role="menuitem" tabindex="0">
                                        <i class="material-icons mdc-theme--primary mr-1">settings</i>
                                        Settings
                                    </li>
                                    <li class="mdc-list-item" role="menuitem" tabindex="0">
                                        <i class="material-icons mdc-theme--primary mr-1">power_settings_new</i>
                                        Logout
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </section>
                </div>
            </header>
            <!-- partial -->
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
                                                <h3 class="mdc-typography--display1 font-weight-bold mb-1">300</h3>
                                                <p class="font-weight-normal mb-0 mt-0">New Users Added This Month</p>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="mdc-layout-grid__cell stretch-card mdc-layout-grid__cell--span-6">
                                        <div class="mdc-card py-3 pl-2 d-flex flex-row align-item-center">
                                            <div class="mdc--tile mdc--tile-success rounded">
                                                <i class="mdi mdi-basket text-white icon-md"></i>
                                            </div>
                                            <div class="text-wrapper pl-1">
                                                <h3 class="mdc-typography--display1 font-weight-bold mb-1">783</h3>
                                                <p class="font-weight-normal mb-0 mt-0">Total Users</p>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="mdc-layout-grid__cell stretch-card mdc-layout-grid__cell--span-6">
                                        <div class="mdc-card py-3 pl-2 d-flex flex-row align-item-center">
                                            <div class="mdc--tile mdc--tile-warning rounded">
                                                <i class="mdi mdi-ticket text-white icon-md"></i>
                                            </div>
                                            <div class="text-wrapper pl-1">
                                                <h3 class="mdc-typography--display1 font-weight-bold mb-1">69</h3>
                                                <p class="font-weight-normal mb-0 mt-0">Volunteers</p>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="mdc-layout-grid__cell stretch-card mdc-layout-grid__cell--span-6">
                                        <div class="mdc-card py-3 pl-2 d-flex flex-row align-item-center">
                                            <div class="mdc--tile mdc--tile-primary rounded">
                                                <i class="mdi mdi-account-star text-white icon-md"></i>
                                            </div>
                                            <div class="text-wrapper pl-1">
                                                <h3 class="mdc-typography--display1 font-weight-bold mb-1">5785</h3>
                                                <p class="font-weight-normal mb-0 mt-0">New Visitors</p>
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
                                                <th class="text-left">Name</th>
                                                <th class="text-left">Email</th>
                                                <th class="text-left">Username</th>
                                                <th class="text-left">Mobile</th>
                                                <th class="text-left">Gender</th>
                                                <th class="text-left">Age</th>
                                                <th class="text-left">City</th>
                                                <th class="text-left">State</th>
                                                <th class="text-left">Address</th>
                                                <th >Actions</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <%
                                                UserDao userDao = new UserDao();
                                                ResultSet rs = userDao.selectAll();
                                                while (rs.next()) {
                                                    if (Integer.parseInt(rs.getString("type")) != 1) {
                                            %>
                                            <tr>
                                                <td class="text-left">
                                                    <%= rs.getString("name")%>
                                                </td>
                                                <td class="text-left">
                                                    <%= rs.getString("email")%>
                                                </td>
                                                <td class="text-left">
                                                    <%= rs.getString("username")%>
                                                </td>
                                                <td class="text-left">
                                                    <%= rs.getString("mobile")%>
                                                </td>
                                                <td class="text-left">
                                                    <%= rs.getString("age")%>
                                                </td>
                                                <td class="text-left">
                                                    <%= rs.getString("gender")%>
                                                </td>
                                                <td class="text-left">
                                                    <%= rs.getString("cityId")%>
                                                </td>
                                                <td class="text-left">
                                                    <%= rs.getString("stateId")%>
                                                </td>
                                                <td class="text-left">
                                                    <%= rs.getString("address")%>
                                                </td>
                                                <td >
                                                    <div class="col mdc-button" data-mdc-auto-init="MDCRipple">
                                                        <i class="mdi mdi-heart text-blue" onclick="#" >
                                                            Delete User
                                                        </i>
                                                    </div>
                                                </td>
                                            </tr>
                                            <%
                                                    }
                                                }
                                            %>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                    </div>
                </main>
                <!-- partial:partials/_footer.html -->
                <footer>
                    <div class="mdc-layout-grid">
                        <div class="mdc-layout-grid__inner">
                            <div class="mdc-layout-grid__cell stretch-card mdc-layout-grid__cell--span-6">
                                <span class="text-muted">Copyright © 2019 Ajava10. All rights reserved.</span>
                            </div>
                            <div class="mdc-layout-grid__cell stretch-card mdc-layout-grid__cell--span-6 d-flex justify-content-end">
                                <span class="mt-0 text-right">Hand-crafted &amp; made with bootstrap<i class="mdi mdi-heart text-red"></i></span>
                            </div>
                        </div>
                    </div>
                </footer>
                <!-- partial -->
            </div>
        </div>
        <!-- body wrapper -->
        <!-- plugins:js -->
        <script src="node_modules/material-components-web/dist/material-components-web.min.js"></script>
        <script src="node_modules/jquery/dist/jquery.min.js"></script>
        <!-- endinject -->
        <!-- Plugin js for this page-->
        <script src="node_modules/chart.assets/js/dist/Chart.min.js"></script>
        <script src="node_modules/progressbar.assets/js/dist/progressbar.min.js"></script>
        <!-- End plugin js for this page-->
        <!-- inject:js -->
        <script src="assets/js/misc.js"></script>
        <script src="assets/js/material.js"></script>
        <!-- endinject -->
        <!-- Custom js for this page-->
        <script src="assets/js/dashboard.js"></script>
        <!-- End custom js for this page-->
    </body>
</html>
