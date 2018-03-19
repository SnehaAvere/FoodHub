<%-- 
    Document   : register
    Created on : 15 Mar, 2018, 7:03:16 PM
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
       <form action="registerservlet.do" method="post">
           
	<!-- Main div code -->
        
	<div id="main">
	<div class="h-tag">
	<h2 align="center" >Create Your Account</h2>
	</div>
	<!-- create account div -->
	<div class="login">
	<table cellspacing="2" align="center" cellpadding="8" border="0">
	<tr>
	<td align="right" >Enter First name :</td>
	<td><input type="text" placeholder="Enter user first here" name="customer_Fname"/></td>
	</tr>
        <tr>
	<td align="right">Enter Last name :</td>
	<td><input type="text" placeholder="Enter user Last here" name="customer_Lname"/></td>
	</tr>
        <tr>
	<td align="right">Enter Address :</td>
	<td><input type="text" name="customer_Address" /></td>
	</tr>
        <tr>
	<td align="right">Enter date of birth :</td>
	<td><input type="text" placeholder="dd/mm/yy" name="customer_DOB" /></td>
	</tr>
	<tr>
	<td align="right">Enter Email ID :</td>
	<td><input type="text" placeholder="Enter Email ID here" name="customer_EmailID"/></td>
	</tr>
        <tr>
	<td align="right">Enter Phone number :</td>
	<td><input type="text" placeholder="********" name="customer_PhoneNo" /></td>
	</tr>
	<tr>
	<td align="right">Enter Login ID :</td>
	<td><input type="text" placeholder="Enter Login ID" name="customer_LoginID" /></td>
	</tr>
	<tr>
	<td align="right">Enter Password :</td>
	<td><input type="password" placeholder="Enter Password here" name="customer_Password"/></td>
        </tr>
	<tr>
	<td></td>
	<td>
	<input type="reset" value="Clear Form"/>
	<input type="submit" value="submit" /></td>
	</tr>
	</table>
	</div>
	<!-- create account box ending here.. -->
	</div>
	<!-- Main div ending here... -->
       </form>
        
    </body>
</html>
