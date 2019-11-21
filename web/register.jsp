<%-- 
    Document   : register
    Created on : 25 Oct, 2019, 5:10:33 PM
    Author     : Ritesh Verma
--%>

<%@page import="com.model.State"%>
<%@page import="com.model.Stock"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.dao.StockDao"%>
<%@page import="com.dao.CityDao"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="com.dao.StateDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="blocks/header.jsp"></jsp:include>
   <!DOCTYPE html>
   <title>Registration Page</title>
   <script>
      function selectCity() {
         var stateId = document.getElementById("stateId").value;
         var cityId = document.getElementById("cityId");
         var err = document.getElementById("err");

         object = new XMLHttpRequest();

         var method = "get";
         var url = "register?operation=SelectCity&stateId=" + stateId;

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
         <h3 class="mb-3">Registration</h3>
         <form action="register" method="post" class="volunter-form">
           <div class="form-group">
             <input type="text" name="name" class="form-control" placeholder="Name" required="" >
           </div>
           <div class="form-group">
             <input type="email" name="email" class="form-control" placeholder="Email" required="">
           </div>
           <div class="form-group">
             <input type="text" name="username" class="form-control" placeholder="Username" required="">
           </div>
           <div class="form-group">
             <input type="password" name="password" class="form-control" placeholder="Password" required="">
           </div>
           <div class="form-group">
             <input type="text" name="mobile" class="form-control" placeholder="Mobile" required="">
           </div>
           <div class="form-group">
             <div class="form-control">
               <label class="label-gender">Gender
               </label>

               <label class="gender-radio">Male
                 <input type="radio" name="gender" value="Male" required="">
                 <span class="checkmark"></span>
               </label>

               <label class="gender-radio" >Female
                 <input type="radio" name="gender" value="Female" required="">
                 <span class="checkmark"></span>
               </label>
             </div>
           </div>
           <div class="form-group">
             <input type="text" name="age" class="form-control" placeholder="Age" required="">
           </div>
           <div class="form-group">
             <select class="custom-select" name="stockId">
               <option value="9" selected="">Select Blood Group</option>
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
             <option value="0" selected="">Select State</option>
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
             <option value="">Select City</option>
           </select>
           <p id="err"></p>
         </div>

         <div class="form-group">
           <textarea name="address" placeholder="Address" class="form-control textarea" required=""></textarea>
         </div>

         <div class="form-group">
           <input type="submit" value="Register" name="operation" class="btn gradient-bg">
         </div>
         <div class="form-group">
           <a class="form-control-plaintext" href="login.jsp">Already Registered? Login Here</a>
         </div>
       </form>
     </div>    			
   </div>
</div>
<jsp:include page="blocks/footer.jsp"></jsp:include>


