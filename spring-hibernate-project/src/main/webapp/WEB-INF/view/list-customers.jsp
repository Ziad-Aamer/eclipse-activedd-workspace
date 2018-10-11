<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customers List</title>

<link type="text/css"
	  rel="stylesheet"
	  href="${pageContext.request.contextPath}/view-resources/css/style.css"/>

</head>
<body>
	<h1>List Of All Customers:</h1>
	
	<div id="wrapper">
		<div id="header">
			<h2>CRM Customer Relationship Management</h2>
		</div>
	</div>
	
	<input type="button" value="Add Customer"
			onclick="window.location.href='showFormForAdd'"
			class="add-button"/>
	<div id="container">
		<div id="content">
			
			<table>
				<tr>
					<th>First Name </th>
					<th>Last Name </th>
					<th>Email </th>
					<th>Action </th>
				</tr>	
				<c:forEach var="tempCustomer" items="${listOfCustomers}">
				<c:url var="updateLink" value="showFormForUpdate">
					<c:param name="customerId">${tempCustomer.id}</c:param>
				</c:url>
				<c:url var="deleteLink" value="deleteCustomer">
					<c:param name="customerId">${tempCustomer.id}</c:param>
				</c:url>
					<tr>
						<td>${tempCustomer.firstName}</td>
						<td>${tempCustomer.lastName}</td>
						<td>${tempCustomer.email}</td>
						<td>
						<a href="${updateLink }" >update</a> 
						|
						<a href="${deleteLink}" onclick="if (!(confirm('Are Sure ?'))) return false;">Delete</a>
						</td>
						
					</tr>
				</c:forEach>
			</table>
			
		</div>
	</div>
</body>
</html>