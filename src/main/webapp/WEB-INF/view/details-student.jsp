<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
 <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>

<link rel="stylesheet" type="text/css"
	href="/Student-Management/URLToReachResources/css/my-style-sheet.css">
<body class="fontstyle">
	<div class="container" align="center"></div>
	<br>
	<a href="/Student-Management/showStudent">Home</a>
	<div class="container">
		<h1 align="center">Students Information</h1>

<div align="center" class="container">
 
  <!-- Trigger the modal with a button -->
  <button  type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#myModal">Show marks</button>

  <!-- Modal -->
  <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h2 align="center" class="modal-title"><b>${student.name}</b></h2>
        </div>
        <div >
          <p align="center">C: ${student.c}<br>
			 Java: ${student.java}<br>
			 Python: ${student.python}<br>
			 Data Structre: ${student.ds}<br>
			 Total: ${student.total}</p>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        </div>
      </div>
      
    </div>
  </div>
  </div>

		<br>
		<table class="table table-striped" border="1">
			<thead>
				<tr>
					<td>Id</td>
					<td>Name</td>
					<td>Mobile</td>
					<td>Country</td>
					<td>Date of Birth</td>
					<td>Blood Group</td>
					<td>Gender</td>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>${student.id}</td>
					<td>${student.name}</td>
					<td>${student.mobile}</td>
					<td>${student.country}</td>
					<td>${student.dob}</td>
					<td>${student.blood_group}</td>
					<td>${student.gender}</td>

				</tr>
			</tbody>
		</table>
		<br>

	</div>

</body>
</html>