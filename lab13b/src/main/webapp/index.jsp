<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Simple Interest Calculator</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 20px;
        }

        h2 {
            color: #333;
        }

        form {
            background-color: #fff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            width: 300px;
            margin: 0 auto;
        }

        label {
            display: block;
            margin-bottom: 5px;
        }

        input {
            width: 100%;
            padding: 8px;
            margin-bottom: 10px;
            box-sizing: border-box;
            border: 1px solid #ccc;
            border-radius: 4px;
        }

        input[type="submit"] {
            background-color: #4caf50;
            color: #fff;
            cursor: pointer;
        }

        p {
            color: #333;
            margin-bottom: 5px;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }

        th, td {
            border: 1px solid #ddd;
            padding: 8px;
            text-align: left;
        }

        th {
            background-color: #4caf50;
            color: #fff;
        }

        /* Additional styling for the output section */
        .output-section {
            margin-top: 20px;
            padding: 15px;
            border-radius: 8px;
            background-color: #fff;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            width: 300px;
            margin: 0 auto;
        }

        .output-label {
            font-weight: bold;
            color: #333;
            margin-bottom: 5px;
        }

        .output-value {
            color: #4caf50;
            margin-bottom: 10px;
        }
    </style>
</head>
<body>

<%
    // Check if the form is submitted
    String principalStr = request.getParameter("principal");
    String rateStr = request.getParameter("rate");
    String timeStr = request.getParameter("time");

    if (principalStr != null && rateStr != null && timeStr != null) {
        // Retrieve user inputs from the request
        double principal = Double.parseDouble(principalStr);
        double rate = Double.parseDouble(rateStr);
        double time = Double.parseDouble(timeStr);

        // Calculate simple interest
        double simpleInterest = (principal * rate * time) / 100;
%>
<div class="output-section">
    <h2>Simple Interest Calculation Result:</h2>
    <p class="output-label">Principal Amount:</p>
    <p class="output-value"><%= principal %></p>
    <p class="output-label">Rate of Interest:</p>
    <p class="output-value"><%= rate %></p>
    <p class="output-label">Time (in years):</p>
    <p class="output-value"><%= time %></p>
    <p class="output-label">Simple Interest:</p>
    <p class="output-value"><%= simpleInterest %></p>
</div>

<%
} else {
%>

<form action="" method="post">
    <label for="principal">Principal Amount:</label>
    <input type="text" name="principal" required><br>

    <label for="rate">Rate of Interest:</label>
    <input type="text" name="rate" required><br>

    <label for="time">Time (in years):</label>
    <input type="text" name="time" required><br>

    <input type="submit" value="Calculate Simple Interest">
</form>

<%
    }
%>

</body>
</html>
