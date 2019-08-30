<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to employee portal page</h1>
<hr>
<form action="displayAll" method="post">
<h2>
click here to see all employee records <br>
<input type="submit" name="submit" value="display all employees">
</h2>
</form>
<hr>
<form action="displayEmp" method="post">
<h2>
Enter Emp ID <input type="text" name="eid"><br>
<input type="submit" name="submit" value="Display">
</h2>
</form>
<form action="displayByDesignation" method="post">
<h2>
Enter Emp Designation <input type="text" name="designation"><br>
<input type="submit" name="submit" value="Display">
</h2>
</form>

<hr>
<form action="displayByAge" method="post">
<h2>
click here to see all employee records sorted by age <br>
Enter Emp Designation <input type="text" name="designation"><br>
<input type="submit" name="submit" value="display all employees">
</h2>
</form>


<hr>
<form action="insertEmp" method="post">
<h2>
Enter ID <input type="text" name="eid"><br>
Enter name <input type="text" name="name"><br>
Enter age <input type="text" name="age"><br>
Enter designation <input type="text" name="designation"><br>
<input type="submit" name="submit" value="insert"><br>
<input type="reset" name="reset" value="reset">
</h2>
</form>


<hr>
<form action="updateEmp" method="post">
<h2>
Enter ID <input type="text" name="eid"><br>
Enter name <input type="text" name="name"><br>
Enter age <input type="text" name="age"><br>
Enter designation <input type="text" name="designation"><br>
<input type="submit" name="submit" value="update"><br>
<input type="reset" name="reset" value="reset">
</h2>
</form>

<hr>
<form action="deleteEmp" method="post">
<h2>
Enter ID <input type="text" name="eid"><br>
<input type="submit" name="submit" value="delete">
</h2>
</form>
</body>
</html>