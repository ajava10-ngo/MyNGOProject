<%-- 
    Document   : UpdateProfile
    Created on : 21 Nov, 2019, 8:56:49 PM
    Author     : Ritesh Verma
--%>

<%@page import="com.model.User"%>
<%@page import="com.dao.UserDao"%>
<%@page import="com.model.State"%>
<%@page import="com.dao.StateDao"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.dao.StockDao"%>
<%@page import="com.model.Stock"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
   response.setHeader("Cache-Control", "no-cache");
   response.setHeader("Cache-Control", "no-store");
   response.setHeader("Pragma", "no-cache");
   response.setDateHeader("Expires", 0);

   User user = new User();

   if (session.getAttribute("user") == null) {
      response.sendRedirect("../login.jsp");
   } else {
      user = (User) session.getAttribute("user");

%>
<!DOCTYPE html>

<jsp:include page="blocks/header.jsp"></jsp:include>
   <title>Update Profile Page</title>
   <script>
      function selectCity() {
         var stateId = document.getElementById("stateId").value;
         var cityId = document.getElementById("cityId");
         var err = document.getElementById("err");

         object = new XMLHttpRequest();

         var method = "get";
         var url = "../register?operation=SelectCity&stateId=" + stateId;

         object.open(method, url);

         object.onreadystatechange = function () {
            if (object.readyState === 4) {
               cityId.innerHTML = object.responseText;
            }
         };
         object.send();
      }
   </script>
   <div class="container">
     <div class="row d-md-flex">
       <div class="col-md-6 d-flex ftco-animate">
         <div class="img img-2 align-self-stretch" style="background-image: url(assets/images/bg_4.jpg);"></div>
       </div>
       <div class="col-md-6 volunteer pl-md-5 ftco-animate">
         <h3 class="mb-3">Update Details</h3>
         <form action="../userController" method="post" class="volunter-form">
           <div class="form-group">
             <input type="text" value="<%= user.getName()%>" name="name" class="form-control" placeholder="Name" required="" >
         </div>
         <div class="form-group">
           <input type="email" value="<%= user.getEmail()%>" name="email" class="form-control" placeholder="Email" required="">
         </div>
         <div class="form-group">
           <input type="text" value="<%= user.getMobile()%>" name="mobile" class="form-control" placeholder="Mobile" required="">
         </div>
         <div class="form-group">
           <input type="text" value="<%= user.getAge()%>" name="age" class="form-control" placeholder="Age" required="">
         </div>
         <div class="form-group">
           <select class="custom-select" name="stockId">
             <option value="<%= user.getStock().getStockId()%>" selected=""><%= user.getStock().getBloodGroup()%></option>
             <%
                Stock stock = new Stock();
                StockDao stockDao = new StockDao();

                ArrayList<Stock> al = stockDao.getAllStock();

                for (int i = 0; i < al.size(); i++) {
                   stock = al.get(i);
             %>
             <option value="<%= stock.getStockId()%>" >
               <%= stock.getBloodGroup()%>
             </option>
             <%
                }
             %>
           </select>
         </div>
         <div class="form-group">
           <select onchange="selectCity()" id="stateId" class="custom-select" name="stateId" required="">
             <option value="<%= user.getState().getStateId()%>" selected=""><%= user.getState().getState()%></option>
             <%
                StateDao stateDao = new StateDao();

                ArrayList<State> arrayList = stateDao.getAllState();
                State state = new State();
                for (int i = 0; i < arrayList.size(); i++) {
                   state = arrayList.get(i);
             %>
             <option value="<%= state.getStateId()%>">
               <%= state.getState()%>
             </option>
             <%
                }
             %>
           </select>
         </div>
         <div class="form-group">
           <select id="cityId" class="custom-select" name="cityId" required="">
             <option value="<%= user.getCity().getCityId()%>"><%= user.getCity().getCity()%></option>
           </select>
           <p id="err"></p>
         </div>
         <div class="form-group">
           <textarea name="address" placeholder="Address" class="form-control textarea" required=""><%= user.getAddress()%></textarea>
         </div>
         <div class="form-group">
           <input type="submit" value="Update" name="operation" class="btn gradient-bg">
           <input type="text" value="<%= user.getUserId()%>" name="userId" hidden="">
         </div>
       </form>
     </div>    			
   </div>
</div>
<jsp:include page="blocks/footer.jsp"></jsp:include>
<%
   }
%>