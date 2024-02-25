<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Display and Count</title>
</head>
<body>
<table border="1">
    <tr>
        <th>City</th>
        <th>Country</th>
        <th>Count</th>
    </tr>

    <%
        int kathmanduCount = 0;
        for (int i = 0; i < 100; i++) {
    %>
    <tr>
        <td>Kathmandu</td>
        <td>Nepal</td>
        <td><%= ++kathmanduCount %></td>
    </tr>
    <%
        }
    %>
</table>
</body>
</html>
