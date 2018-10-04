<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
	.error{
		color:red
	}
</style>

</head>
<body>
	<form:form action="processForm" modelAttribute="customer">
		First Name: <form:input type="text" path="firstName"/>
		<br/><br/>
		Last Name (*):<form:input type="text" path="lastName"/>
		<form:errors path="lastName" cssClass="error"/>
		<br/><br/>
		Free Passes (*):<form:input type="text" path="freePasses"/>
		<form:errors path="freePasses" cssClass="error"/>
		<br/><br/>
		Course Code:<form:input type="text" path="courseCode"/>
		<form:errors path="courseCode" cssClass="error"/>
		<br/><br/>
		
		<input type="submit" value="Submit your info"/>
	</form:form>
</body>
</html>