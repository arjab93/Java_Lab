<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Form</title>
</head>
<body>

<h2>Student Information Form</h2>

<form action="processStudent.jsp" method="post">
    <label for="name">Name:</label>
    <input type="text" id="name" name="name" required><br>

    <label for="rollNumber">Roll Number:</label>
    <input type="text" id="rollNumber" name="rollNumber" required><br>

    <input type="submit" value="Submit">
</form>

</body>
</html>
