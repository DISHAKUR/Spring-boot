<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View All Students</title>
</head>
<body>
<label>Students</label>
	<table>
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Course</th>
				<th>Fees</th>
			</tr>
		
			<c:forEach items="${students}" var="std">

				<tr>
					<td>${std.id}</td>
					<td>${std.name}</td>
					<td>${std.course}</td>
					<td>${std.sfee}</td>
					<td><a href="deleteRecord?id=${std.id}">Delete</a></td>
					<td><a href="editRecord?id=${std.id}">Edit</a></td>
					
			</tr>
			</c:forEach>
	
	</table>
	<a href="showCreate">Add New Record</a>

</body>
</html>