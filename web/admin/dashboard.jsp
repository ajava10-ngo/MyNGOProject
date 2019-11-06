<%--
    Document   : dashboard
    Created on : 31 Oct, 2019, 5:01:03 PM
    Author     : Ritesh Verma
--%>

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
    ResultSet resultSetVolunteer = volunteerDao.getAllVolunteer();
    while (resultSetVolunteer.next()) {
        totalVolunteer++;
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
                          <p class="font-weight-normal mb-0 mt-0">Total User</p>
                        </div>
                      </div>
                    </div>
                    <div class="mdc-layout-grid__cell stretch-card mdc-layout-grid__cell--span-6">
                      <div class="mdc-card py-3 pl-2 d-flex flex-row align-item-center">
                        <div class="mdc--tile mdc--tile-primary rounded">
                          <i class="mdi mdi-account-star text-white icon-md"></i>
                        </div>
                        <div class="text-wrapper pl-1">
                          <h3 class="mdc-typography--display1 font-weight-bold mb-1"><%= totalVolunteer%></h3>
                          <p class="font-weight-normal mb-0 mt-0">Total Volunteers</p>
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
                          <th class="text-center">Actions</th>
                        </tr>
                      </thead>
                      <tbody>
                        <%
                            UserDao userDao = new UserDao();
                            ResultSet rs = userDao.getAllUser();
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
                            <span class="col mdc-button" data-mdc-auto-init="MDCRipple">
                              <a href="" class="mdi mdi-heart text-blue">Delete User</a>
                            </span>
                            <span class="col mdc-button" data-mdc-auto-init="MDCRipple">
                              <a href="makeVolunteer.jsp?id=<%= rs.getString("userId")%>&email=<%= rs.getString("email")%>" class="mdi mdi-heart text-blue">
                                Make_Volunteer
                              </a>
                            </span>
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
          <!--content-->
          <jsp:include page="blocks/footer.jsp"></jsp:include>
      </div>
    </div>
  </body>
</html>
