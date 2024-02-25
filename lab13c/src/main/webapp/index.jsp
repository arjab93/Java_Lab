<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Information Form</title>
</head>
<body>

<form action="displayStudent.jsp" method="post">
    <label for="name">Name:</label>
    <input type="text" name="name" required><br>

    <label for="rollNo">Roll Number:</label>
    <input type="text" name="rollNo" required><br>

    <label for="address">Address:</label>
    <input type="text" name="address" required><br>

    <input type="submit" value="Submit">
</form>

</body>
</html>
