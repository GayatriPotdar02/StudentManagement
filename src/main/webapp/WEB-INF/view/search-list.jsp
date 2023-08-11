<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM"
	crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="/Student-Management/URLToReachResources/css/my-style-sheet.css">
<body class="fontstyle">
<div align="center">
		<table class="table table-striped" border="1">
			<thead>
				<tr>
					<td>Id</td>
					<td>Name</td>
					<td>Mobile</td>
					<td>Country</td>
					

				</tr>
			</thead>
			<form action="showAddStudent">
				<input type="submit" value="add">
			</form>
			<c:forEach var="student" items="${searchstudents}">
				<tr>
					<td>${student.id}</td>
					<td>${student.name}</td>
					<td>${student.mobile}</td>
					<td>${student.country}</td>
			 		<td><a href="/Student-Management/details/${student.id}">Details</a></td>  
					<td><a href="/Student-Management/updateStudent?userId=${student.id}">Update</a></td> 
					<td><a href="/Student-Management/delete?userId=${student.id}" onclick="if(!(confirm('Are you sure you want to delete?'))) return false">Delete</a></td> 
					<br>
				</tr>
			</c:forEach>

		</table>
	</div>
</body>
</html>