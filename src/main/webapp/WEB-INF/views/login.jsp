<%@ page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Yahoo!!!!!!!!</title>
</head>
<%
System.out.println("scriplet");
Date date = new Date();
%>
<body>
<div>Current date is <%= date%></div>
My first JSP
<form action="/login.do" method="post">
Name: <input type="text" name="name"/>
Password: <input type="password" name="password"/>
<input type="submit"/>
</form>
<font color="red">${authErrorMessage}</font>
</body>
</html>