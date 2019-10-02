<%--
  Created by IntelliJ IDEA.
  User: patarak
  Date: 23.09.2019
  Time: 11:44
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>${greeting} <sec:authentication property="name"/></h1>

<sec:authorize access="hasRole('ROLE_ADMIN')">
<a class href="addGoal.jsp">
    Add Goal
</a>
</sec:authorize>
</body>
</html>
