<%--
  Created by IntelliJ IDEA.
  User: sunlei19
  Date: 2018/1/5
  Time: 20:47
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix=" c" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@page session="false" %>
<html>
<head>
    <title>Spitter</title>
    <link rel="stylesheet" type="text/css"
          href="<c:url value="/resources/<style></style>"/>">
</head>
<body>
<h1>Register</h1>
<form method="post">
    first Name:<input type="text" name="firstName"/><br>
    Last Name:<input type="text" name="lastName"/><br>
    UserName: <input type="text" name="username"/><br>
    PassWord: <input type="text" name="password"/><br>
    <input type="submit" value="Register"/>
</form>
</body>
</html>
