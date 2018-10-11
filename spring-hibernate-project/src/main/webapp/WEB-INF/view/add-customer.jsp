<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link type="text/css"
	  rel="stylesheet"
	  href="${pageContext.request.contextPath}/view-resources/css/add-customer-style.css"/>
<link type="text/css"
	  rel="stylesheet"
	  href="${pageContext.request.contextPath}/view-resources/css/style.css"/>
</head>
<body>

	<div id="wrapper">
		<div id="header">
			<h2>CRM Customer Relationship Management</h2>
		</div>
	</div>
	<div id="container">
		<h3>Save New Customer</h3>
		
		<form:form action="addForm" method="post" modelAttribute="newCustomer">
			
			<form:hidden path="id"/>
			
			First Name: <form:input type="text" path="firstName"/>
			<br/><br/>
			Last Name:  <form:input type="text" path="lastName"/>
			<br/><br/>
			Email (*):  <form:input type="text" path="email"/>
			<br/><br/>
	
			<input type="submit" value="Save"/>
		</form:form>
		
		<div style="clear;both;"></div>
		
		<p>
			<a href="${pageContext.request.contextPath}/customer/list">Back To List</a>
		</p>
	</div>
	
</body>
</html>