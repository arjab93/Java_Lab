<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Process Student Information</title>
</head>
<body>

<h2>Student Information:</h2>

<%
    String name = request.getParameter("name");
    String rollNumber = request.getParameter("rollNumber");
%>

<p>Name: <%= name %></p>
<p>Roll Number: <%= rollNumber %></p>

</body>
</html>
