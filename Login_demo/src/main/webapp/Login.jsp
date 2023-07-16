<html>
<head>
<title>Login Form</title>
</head>
<%@ page import="java.util.Date" %>
<body>
<h3>Welcome ${username}</h3><br> 
<form action="/login">
Name: <input type="text" name="username" placeholder="Username"> <br>
Password: <  input type="password" id="psw" name="password" 
pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*?[0-9])(?=.*?[!@#$%^&*+`~'=?\|\]\[\(\)\-<>/]).{8,}" 
title="Must contain at least one number and one uppercase and lowercase letter and special character,  and at least 8 or more characters" required> <br>
<button type="submit"> Login</button>
</form>
<strong>Current Time is</strong>: <%=new Date() %>

</body>
</html>