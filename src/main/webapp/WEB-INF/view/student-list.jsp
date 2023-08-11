<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" type="text/css"
	href="/Student-Management/URLToReachResources/css/my-style-sheet.css">
</head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM"
	crossorigin="anonymous">
<body class="fontstyle">

	<h1 align="center">Students Information</h1>
	<br>
            

	<br>
	<div class="container">
	<form action="showAddStudent">
				<input class="btn btn-outline-success"  type="submit" value="Add">
			</form>
			<form class="search" action="search" method="get">
						<input type="text" name="userEntered" placeholder="Search user">
						<button class="btn btn-primary" type="submit">Search</button>
						
					</form>
		<table class="table table-striped" border="1">
			<thead>
				<tr>
					<td>Id</td>
					<td>Name</td>
					<td>Mobile</td>
					<td>Country</td>
				


				</tr>
			</thead>
			
			<c:forEach var="student" items="${students}">
				<tr>
					<td>${student.id}</td>
					<td>${student.name}</td>
					<td>${student.mobile}</td>
					<td>${student.country}</td>
					<td><a href="/Student-Management/details/${student.id}">Details</a></td>
					<td><a
						href="/Student-Management/updateStudent?userId=${student.id}">Update</a></td>
					<td><a href="/Student-Management/delete?userId=${student.id}"
						onclick="if(!(confirm('Are you sure you want to delete?'))) return false">Delete</a></td>
					<br>
				</tr>
			</c:forEach>

		</table>
		<img class="image" alt="fke image"
			src="/Student-Management/URLToReachResources/images/Premium Vector _ Happy cute kids boy and girl hug together.jpg">
	</div>
</body>
</html>