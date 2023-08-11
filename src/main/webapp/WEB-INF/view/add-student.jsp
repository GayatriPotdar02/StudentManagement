<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body class="fontstyle">
<link rel="stylesheet" type="text/css" href="/Student-Management/URLToReachResources/css/add-student.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">

<link rel="stylesheet" type="text/css" href="/Student-Management/URLToReachResources/css/my-style-sheet.css">
	<div align="center">
		<h1>Add Student</h1>
		<form:form action="save-student" modelAttribute="student"
			method="POST">

			<form:hidden path="id"/>
			<label>Name : </label>
			<form:input path="name" />
			<br>

			<label>Mobile : </label>
			<form:input path="mobile" />
			<br>

			<label>Country : </label>
			<form:input path="country" />
			<br>

			<label>Date of Birth : </label>
			<form:input path="dob" />
			<br>

			<label>Blood Group : </label>
			<form:input path="blood_group" />
			<br>

			<label>Gender : </label>
			<form:input path="gender" />
			<br>

			<label>C : </label>
			<form:input path="c" />
			<br>

			<label>Java : </label>
			<form:input path="java" />
			<br>

			<label>Python : </label>
			<form:input path="python" />
			<br>

			<label>Data Structure : </label>
			<form:input path="ds" />
			<br>

			<label>Total : </label>
			<form:input path="total" />
			<br>
			<input class="btn btn-outline-success"	 type="submit" value="submit">
		</form:form>
	</div>
</body>
</html>
