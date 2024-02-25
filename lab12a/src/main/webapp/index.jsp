<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Test JDBC</title>
</head>
<body>
<%
    Class.forName("com.mysql.cj.jdbc.Driver");
    String url = "jdbc:mysql://localhost:3306/java1";
    String dusername = "root";
    String dpassword = "";
    try {
        Connection con = DriverManager.getConnection(url, dusername, dpassword);

        String sql = "select id, name, email from Users";
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();

        if (!rs.next()) {
            System.out.println("No records found in the table.");
        } else {
%>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Email</th>
    </tr>
    <%
        do {
    %>
    <tr>
        <td><%= rs.getString(1) %></td>
        <td><%= rs.getString(2) %></td>
        <td><%= rs.getString(3) %></td>
    </tr>
    <%
        } while (rs.next());
    %>
</table>
<%
        }
    } catch (Exception e) {
        e.printStackTrace();
        System.out.println(e);
    }
%>
</body>
</html>
