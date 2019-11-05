<%-- 
    Document   : demoDash
    Created on : 2 Nov, 2019, 3:14:39 PM
    Author     : Ritesh Verma
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="com.dao.UserDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
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
                                            <h1 class="mdc-card__title mdc-card__title--large">User List</h1>
                                        </div>

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
