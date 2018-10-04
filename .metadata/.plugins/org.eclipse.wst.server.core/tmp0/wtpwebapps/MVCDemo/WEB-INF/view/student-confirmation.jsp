<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>how are student : ${student.firstName} ${student.lastName}</h2>
	<br/><br/>
	<h2>Country: ${student.country}</h2>
	 
	 Your Favorite OS are:
	 <ul>
	 	<c:forEach var="temp" items="${student.favOs }">
	 		<li>${temp }</li>
	 	</c:forEach>
	 </ul>
</body>
</html>