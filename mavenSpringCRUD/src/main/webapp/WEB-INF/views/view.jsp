<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>User Details</h2>

	<table border="1" width="70%" cellpadding="2">
		<tr>
			<th>ID</th>
			<th>Username</th>
			<th>Password</th>
			<th>Age</th>
			<th>Address</th>
		
		</tr>

		<!-- Sample user data - Replace this with actual data from your database -->
		<c:forEach var="us" items="${users }">
			<tr>
				<td>${us.id}</td>
				<td>${us.username}</td>
				<td>${us.password }</td>
				<td>${us.address }</td>
								
				<td><a href="edituser/${us.id}">Edit</a></td>  
				<td><a href="delete/${us.id}">Delete</a></td> 
			</tr>
		</c:forEach>
		<!-- Add more rows for additional users -->

	</table>
</body>
</html>