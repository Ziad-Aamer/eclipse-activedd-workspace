<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
	<h2>Custom Login Form</h2>
	
	<form:form action="${pageContext.request.contextPath }/authenticateTheUser" 
				method="post">
		<c:if test="${param.error !=null }">
			<i class="error">Sorry you have entered a wrong username or password</i><br>
		</c:if>
		User Name: <input type="text" name="username"/><br>
		Password:   <input type="password" name="password"/><br>
				<input type="submit" value="Login"/>
		
	</form:form>
	
</body>
</html>