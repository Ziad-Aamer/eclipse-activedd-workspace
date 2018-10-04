<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Registration form</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
		first name: <form:input path="firstName"/>
		<br/><br/>
		last name: <form:input path="lastName"/>
		 <br/><br/>
		 
		 Windows OS<form:checkbox path="favOs" value="WOS"/>
		 Linux OS<form:checkbox path="favOs" value="LOS"/>
		 Macintosh OS<form:checkbox path="favOs" value="MOS"/>
		 <br/><br/>
		 <form:select path="country">
		 	<form:options items="${student.coOptions}"/>			
		 </form:select>
		 <input type="submit" />
	</form:form>
</body>
</html>