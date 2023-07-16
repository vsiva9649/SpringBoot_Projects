
<html>
<head>
<title>First JSP</title>
</head>
<%@ page import="java.util.Date" %>
<body>
<h3>Hi ${studentDetails.studentName},
${studentDetails.rollNo} got added</h3><br>
<strong>Current Time is</strong>: <%=new Date() %>

</body>
</html>