<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="StudentForm " method="GET">
Email_id:<input type="email" name="email"><br>
Name:<input type="text" name="name"><br>
Registration Number:<input type="text" name="regno"><br>
Grade:<input type="text" name="grade"><br>
Phone Number:<input type="text" name="phone"><br>
Gender:<br>
Male:<input type="radio" name="gender" value="male"><br>
Female:<input type="radio" name="gender" value="female"><br>
Registration Status:<br>
Present:<input type="radio" name="status"><br>
Absent:<input type="radio" name="status"><br>
<input type="submit" name="submit">
</form>
</body>
</html>