
<html>
<head>
<title>First JSP</title>
</head>
<%@ page import="java.util.Date" %>
<body>
<h3>Hi ${username}</h3><br>
<form action="addStudent">
Name: <input type="text" name="studentName"> <br>
Roll No: <input type="text" name="rollNo"> <br>
<input type="submit">
</form>
<h1> DELETE </h1>
<form action="deleteStudent">
Roll No: <input type="text" name="rollNo"> <br>
<input type="submit">
</form>

<h1> UPDATE </h1>
<form action="updateStudent">
Name: <input type="text" name="studentName"> <br>
Roll No: <input type="text" name="rollNo"> <br>
<input type="submit">
</form>

<h1> VIEW </h1>
<form action="viewStudent">
Roll No: <input type="text" name="rollNo"> <br>
<input type="submit">
</form>
<strong>Current Time is</strong>: <%=new Date() %>

</body>
</html>