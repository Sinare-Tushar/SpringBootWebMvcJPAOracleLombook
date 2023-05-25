<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 --%>
 <!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>WELCOME TO PRODUCT REGISTER</h3>
<form:form action="save" method="POST" modelAttribute="product">
<pre>
 <form:input type="hidden" path="id" /><br>
CODE : <form:input path="code"/><br>
NAME : <form:input path="name"/><br>
COST : <form:input path="cost"/><br>
GST : <form:select path="gst"><br>
<form:option value="5">5%-SLAB</form:option>
<form:option value="12">12%-SLAB</form:option>
<form:option value="18">18%-SLAB</form:option>
<form:option value="22">22%-SLAB</form:option>
<form:option value="30">30%-SLAB</form:option>
</form:select><br>
NOTE : <form:textarea path="note"/><br>
<input type="submit" value="CREATE PRODUCT"/>
</pre>
</form:form>
${message}
</body>
</html>