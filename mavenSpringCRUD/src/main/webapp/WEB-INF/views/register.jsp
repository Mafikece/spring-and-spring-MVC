<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>User Registration Form</h2>

    <form action="save" method="post">

        <!-- Username -->
        <label for="username">Username:</label>
        <input type="text" id="username" placeholder="Username" name="username" required >
        

        <!-- Password -->
        <label for="password">Password:</label>
        <input type="password" id="password" placeholder="Password" name="password" required>
       

        <!-- Age -->
        <label for="age">Age:</label>
        <input type="number" id="age" placeholder="Age" name="age" required>
       

        <!-- Address -->
        <label for="address">Address:</label>
        <input type="address" name="address" placeholder="Address" required>
       

        <!-- Submit Button -->
        <input type="submit" value="Submit">

    </form>
    
</body>
</html>