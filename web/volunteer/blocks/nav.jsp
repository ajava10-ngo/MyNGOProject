<%-- 
    Document   : nav
    Created on : 10 Nov, 2019, 9:10:31 PM
    Author     : Ritesh Verma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Material Admin</title>
    <!-- plugins:css -->
    <link rel="stylesheet" href="assets/node_modules/mdi/assets/css/materialdesignicons.min.css">
    <!-- endinject -->
    <!-- plugin css for this page -->
    <!-- End plugin css for this page -->
    <!-- inject:css -->
    <link rel="stylesheet" href="assets/css/style.css">
    <!-- endinject -->
    <link rel="shortcut icon" href="assets/images/favicon.png" />
    <!-- plugins:js -->
    <script src="assets/node_modules/material-components-web/dist/material-components-web.min.js"></script>
    <script src="assets/node_modules/jquery/dist/jquery.min.js"></script>
    <!-- endinject -->
    <!-- Plugin js for this page-->
    <script src="assets/node_modules/chart.assets/js/dist/Chart.min.js"></script>
    <script src="assets/node_modules/progressbar.assets/js/dist/progressbar.min.js"></script>
    <!-- End plugin js for this page-->
    <!-- inject:js -->
    <script src="assets/js/misc.js"></script>
    <script src="assets/js/material.js"></script>
    <!-- endinject -->
    <!-- Custom js for this page-->
    <script src="assets/js/dashboard.js"></script>
    <!-- End custom js for this page-->
    <title>Profile Page</title>
  </head>
  <body>
    <div class="body-wrapper">
      <!-- partial:partials/_sidebar.html -->
      <aside class="mdc-persistent-drawer mdc-persistent-drawer--open">
        <nav class="mdc-persistent-drawer__drawer">
          <div class="mdc-persistent-drawer__toolbar-spacer">
            <a href="index.html" class="brand-logo">
              <img src="assets/images/logo.svg" alt="logo">
            </a>
          </div>
          <div class="mdc-list-group">
            <nav class="mdc-list mdc-drawer-menu">
              <div class="mdc-list-item mdc-drawer-item">
                <a class="mdc-drawer-link" href="index.html">
                  <i class="material-icons mdc-list-item__start-detail mdc-drawer-item-icon" aria-hidden="true">desktop_mac</i>
                  Dashboard
                </a>
              </div>
              <div class="mdc-list-item mdc-drawer-item">
                <a class="mdc-drawer-link" href="pages/forms/basic-forms.html">
                  <i class="material-icons mdc-list-item__start-detail mdc-drawer-item-icon" aria-hidden="true">track_changes</i>
                  Forms
                </a>
              </div>
              <div class="mdc-list-item mdc-drawer-item" data-toggle="expansionPanel">
                <a class="mdc-drawer-link" href="#">
                  <i class="material-icons mdc-list-item__start-detail mdc-drawer-item-icon" aria-hidden="true">dashboard</i>
                  UI Features
                  <i class="mdc-drawer-arrow material-icons">arrow_drop_down</i>
                </a>
                <div class="mdc-expansion-panel" id="ui-sub-menu">
                  <nav class="mdc-list mdc-drawer-submenu">
                    <div class="mdc-list-item mdc-drawer-item">
                      <a class="mdc-drawer-link" href="pages/ui-features/buttons.html">
                        Buttons
                      </a>
                    </div>
                    <div class="mdc-list-item mdc-drawer-item">
                      <a class="mdc-drawer-link" href="pages/ui-features/typography.html">
                        Typography
                      </a>
                    </div>
                  </nav>
                </div>
              </div>
              <div class="mdc-list-item mdc-drawer-item">
                <a class="mdc-drawer-link" href="pages/ui-features/tables.html">
                  <i class="material-icons mdc-list-item__start-detail mdc-drawer-item-icon" aria-hidden="true">grid_on</i>
                  Tables
                </a>
              </div>
              <div class="mdc-list-item mdc-drawer-item">
                <a class="mdc-drawer-link" href="pages/charts/chartjs.html">
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
              <div class="mdc-list-item mdc-drawer-item purchase-link">
                <a href="https://www.bootstrapdash.com/product/material-admin/" target="_blank" class="mdc-button mdc-button--raised mdc-button--dense mdc-drawer-link" data-mdc-auto-init="MDCRipple">
                  Upgrade To Pro
                </a>
              </div>
            </nav>
          </div>
        </nav>
      </aside>
