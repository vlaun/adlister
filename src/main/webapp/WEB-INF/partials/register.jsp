%--
Created by IntelliJ IDEA.
User: yleanavlaun
Date: 2/3/17
Time: 11:28 AM
To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Users Registration</title>
</head>
<body>
<jsp:include page="/WEB-INF/partials/register.jsp" />
<div class="container">
    <h1>Please Register</h1>
    <form action="/register" method="POST">
        <div class="form-group">
            <label for="firstName">First Name</label>
            <input id="firstName" name="firstName" class="form-control" type="text">
        </div>
        <%--<div class="form-group">--%>
            <%--<label for="lastName">Last Name</label>--%>
            <%--<input id="lastName" name="lastName" class="form-control" type="password">--%>
        <%--</div>--%>
        <%--<div class="form-group">--%>
            <%--<label for="address">Home Address</label>--%>
            <%--<input id="address" name="address" class="form-control" type="password">--%>
        <%--</div>--%>
        <%--<div class="form-group">--%>
            <%--<label for="dob">Date of Birth</label>--%>
            <%--<input id="dob" name="dob" class="form-control" type="password">--%>
        <%--</div>--%>
        <input type="submit" class="btn btn-primary btn-block" value="Log In">
    </form>
</div>

</body>
</html>
