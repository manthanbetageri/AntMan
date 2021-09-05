<%@ page import ="com.technoelevate.Employee.DTO.EmployeeInformation"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<% 
EmployeeInformation fi =(EmployeeInformation) request.getAttribute("addEmp");
String msg=(String) request.getAttribute("msg");
/* EmployeeInformation einfo=(EmployeeInformation) request.getAttribute("addEmp");
	String msg=(String)request.getAttribute("msg"); */
%>
<body>

<%=msg %>
</body>
</html>