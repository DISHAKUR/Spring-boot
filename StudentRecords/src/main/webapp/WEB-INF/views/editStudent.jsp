<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Student</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>

<div style="text-align: center;
    border: 1px solid black;
    margin: 90px auto;" class="col-md-5">
		<form action="updateRecord" method="post">
		<lable>Update Student</lable>
			<div class="col-md-12">
				<label> ID : </label> <input type="text" name="id" value="${student.id}" readonly="true"></input>
			</div>
			<br>
			<div class="col-md-12">
				<label> Name: </label> <input type="text" name="name" value="${student.name}"></input>
			</div>
			<br>
			<div class="col-md-12">
				<label> Course : </label> <input type="text" name="course" value="${student.course}"></input>
			</div>
			<br>
			<div class="col-md-12">
				<label> Fees : </label> <input type="text" name="sfee" value="${student.sfee}"></input>
			</div>
			
			<br><br><br><br><br>
			<div class="col-md-6">
				<input type="submit" class="btn btn-primary" name="submit"></input>
			</div>
			
		</form>
	
		
		<a href="displayStudents">View All</a>


	</div>

</body>
</html>