<%-- 
    Document   : login
    Created on : 15 Mar, 2018, 5:13:20 PM
    Author     : SNEHA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
           body {
    background-image: url("images/background1.jpg");
   background-size: cover ;
                }
                .no-background {
    background-image: url("images/blank.jpg");
}
        </style>
    </head>
    <body>
        <%@include file="navbar.jsp" %>
         <form action="loginservlet.do" method="post" >
        <div id="main">
	<div class="h-tag">
	<h2 align="center" > Customer Login</h2>
	</div>
	<!-- create account div -->
	<div class="login">
	<table cellspacing="2" align="center" cellpadding="8" border="0" rowspacing="8" rowpadding="8">
            <tr>
	<td align="right">Enter Login ID :</td>
	<td><input type="text" placeholder="Enter Login ID" name="customer_LoginID" /></td>
            </tr><br>
	<tr>
	<td align="right">Enter Password :</td>
	<td><input type="password" placeholder="Enter Password here" name="customer_Password"/></td>
        </tr>
        <tr>
            <td><input required type="reset" value="Clear Form" id="res" class="btn" /></td>
            <td><input required type="submit" value="Login"  /></td>
	</tr>
        <tr><td><a href="register.jsp"> new register here </a></td></tr>
	</table>
	</div>
	<!-- create account box ending here.. -->
	</div>
         </form>
        
    </body>
</html>
