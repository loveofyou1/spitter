<%--
  Created by IntelliJ IDEA.
  User: sunlei19
  Date: 2018/1/5
  Time: 20:47
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix=" c" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>spitter</title>
    <link rel="stylesheet"
          type="text/css"
          href="<c:url value="resources/style.css"/>">
</head>
<body>
<div class="spittleView">
    <div class="spittleMessage"><c:out value="${spittle.message}"/></div>
    <div>
        <span class="spittleTime">
            <c:out value="${spittle.time}"/>
        </span>
    </div>
</div>
</body>
</html>
