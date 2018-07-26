<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<style type="text/css">
.error {
	Color: red
}
</style>
</head>
<body>
	<form:form action="processForm" modelAttribute="emp">
		<form:input path="empID" />
		<br>
		<form:input path="firstName" />
		<form:errors path="firstName" cssClass="error"></form:errors>
		<br>
		<form:input path="lastName" />
		<form:errors path="lastName" cssClass="error"></form:errors>
		<br>

		<form:input path="deptID" />
		<form:errors path="deptID" cssClass="error"></form:errors>
		<br>
		
		
		noOfMoviePasses:<form:input path="noOfMoviePasses" />
		<form:errors path="noOfMoviePasses" cssClass="error"></form:errors>

		<%-- <form:input path="zipcode"/> 
		<form:errors path="zipcode" cssClass="error"></form:errors> --%>
		
		country: <form:select path="country">
			<form:options items="${emp.countryOptions}" />
			
		</form:select>
		<br>
		<%--
		linux:<form:checkbox path="operatingSystem" value="linux"/>
		mac:<form:checkbox path="operatingSystem" value="mac"/>
		windows:<form:checkbox path="operatingSystem" value="windows"/>
		<br>
		PP:<form:radiobutton path="favFood" value="Panipuri"/>
		Ras:<form:radiobutton path="favFood" value="Rasmalay"/>
		 --%>
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>