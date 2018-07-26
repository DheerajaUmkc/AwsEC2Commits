<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<form:form action="myPage" modelAttribute="emp">





	<form:input path="empID" />
		<br>
		<form:input path="firstName" />
	<%-- 	<form:errors path="firstName" cssClass="error"></form:errors>
	 --%> 	<br>
		<form:input path="lastName" />
	<%-- 	 <form:errors path="lastName" cssClass="error"></form:errors>
	 --%>
		<form:input path="noOfMoviePasses" />
		 <form:errors path="noOfMoviePasses" cssClass="error"></form:errors>
		<form:input path="deptID" />
		 <form:errors path="deptID" cssClass="error"></form:errors>
		
		 <h1>${emp.empID}</h1>
		<h1>${emp.firstName}</h1>
		<h1>${emp.lastName}</h1>
	<%-- 	<h1>${emp.zipcode}</h1> --%>
		<h1>${emp.noOfMoviePasses}</h1>
		<h1>${emp.deptID}</h1>
		<input type="submit" value="click">
	</form:form>


	<%-- 
<h1>${emp.countryOptions}</h1>
<h1>${emp.operatingSystem}</h1>
<h1>${emp.favFood}</h1> --%>
</body>
</html>