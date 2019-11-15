<%-- 
    Document   : donateNow
    Created on : Nov 14, 2019, 11:37:02 AM
    Author     : PRAGATI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:include page="blocks/header.jsp"></jsp:include>
 <script>
                $(function () {
                    $("#chkPassport").click(function () {
                        if ($(this).is(":checked")) {
                            $("#dvPassport").show();
                            
                        } else {
                            $("#dvPassport").hide();
                            
                        }
                    });
                });
            </script>

            
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Donate !</title>
    </head>
    <body>
        <center>
            <form>
                    <div>
                        <h3>Donate For a Better World !</h3>
                        <ul>
                            <li><a href="#"   name="money" id="money" >
                                    Money</a></li>
                            <li><a href="#" name="blood" id="blood" onclick="" >
                                    Blood</a></li>
                            <li>  <label for="chkPassport">
                                            <input type="checkbox" id="chkPassport" />
                                            other
                                        </label>
                                    </li>
                                    <hr/>
                                    <div id="dvPassport" style="display: none">

                                        <textarea id="txtPassportNumber" placeholder="Other Please Specify" ></textarea>
                                    </div>
                               
                           
                        </ul>
                        <input type="submit" value="Continue..." id="one" >
                   </div>
            </form>
        </center>
    </body>
</html>
<jsp:include page="blocks/footer.jsp"></jsp:include>
