<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Form</title>
</head>
<body>

<h1>Edit User Details</h1>
<form action="/mavenSpringCRUD/updateSave" method="post">
<table>
<tr>
<td></td> 
<td><input type="hidden" name="id" value="${user.getId() }"/></td>
</tr>

<tr>
<td>Name:</td> 
<td><input type="text" name="username" value="${user.getUsername() }"/></td>
</tr>/></td>
</tr>

<td>Password:</td> 
<td><input type="text" name="password" value="${user.getPassword() }"/></td>
</tr>/></td>
</tr>

<td>Address:</td> 
<td><input type="text" name="address" value="${user.getAddress() }"/></td>
</tr>/></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="Edit&Save"></td>
</tr>
</table>

</form>
</body>
</html>