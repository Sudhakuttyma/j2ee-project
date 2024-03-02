<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Insert Student Details Here</h3>
<form action="insertstudent" method="post">
<table>
<tr><td>Enter name:</td><td><input type="text" name="name" required oninvalid="this.setCustomValidity('Please Enter Name')" oninput="this.setCustomValidity('')"/></td></tr>
<tr><td>Enter course:</td><td><input type="text" name="course" required oninvalid="this.setCustomValidity('Please Enter Course')" oninput="this.setCustomValidity('')"/></td></tr>
<tr><td>Enter gender:</td><td><input type="radio" name="male" value="male"/>male
                     <input type="radio" name="male" value="female" required oninvalid="this.setCustomValidity('Please Select')" oninput="this.setCustomValidity('')"/>female</td></tr>
<tr><td>Enter email:</td><td><input type="email" name="email" required oninvalid="this.setCustomValidity('Please Enter Email')" oninput="this.setCustomValidity('')"/></td></tr>
<tr><td>Enter education:</td><td><input type="text" name="education" required oninvalid="this.setCustomValidity('Please Enter Education')" oninput="this.setCustomValidity('')"/></td></tr>
<tr><td></td><td><input type="submit" value="save"/></td></tr>
</table>
</form>
<form action="home" >
<table>
<tr><td> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
<td><input type="submit" value="go home"></td></tr>
</table>
</form>
</body>
</html>