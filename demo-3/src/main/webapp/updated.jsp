<html>
<head>
<title>First JSP</title>
</head>
<%@ page import="java.util.Date" %>
<body>
<h3>Those details are ${studentDetails.studentName},
${studentDetails.rollNo} Updated. </h3><br>
<strong>Current Time is</strong>: <%=new Date() %>
</body>
</html>