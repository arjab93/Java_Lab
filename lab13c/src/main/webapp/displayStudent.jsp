<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Display Student Information</title>
</head>
<body>

<h2>Student Information:</h2>

<%
    // Retrieve form parameters from the request
    String name = request.getParameter("name");
    String rollNo = request.getParameter("rollNo");
    String address = request.getParameter("address");
%>

<p><strong>Name:</strong> <%= name %></p>
<p><strong>Roll Number:</strong> <%= rollNo %></p>
<p><strong>Address:</strong> <%= address %></p>

</body>
</html>
