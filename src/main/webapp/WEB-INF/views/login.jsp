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
Enter your name <input type="text" name="name"/>
<input type="submit"/>
</form>
</body>
</html>