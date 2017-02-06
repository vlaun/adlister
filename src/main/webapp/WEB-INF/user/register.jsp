<%--
  Created by IntelliJ IDEA.
  User: yleanavlaun
  Date: 2/3/17
  Time: 4:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Signup</title>
</head>
<body>
<h1>Signup to Adlister</h1>
<form action="/register" method="post">
    <label>Username</label>
    <input type="text" name="username">
    <label>Email</label>
    <input type="text" name="email">
    <label>Password</label>
    <input type="password" name="password">

    <input type="submit" value="Sign up!">
</form>
</body>
</html>
