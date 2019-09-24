<%--
  Created by IntelliJ IDEA.
  User: patarak
  Date: 23.09.2019
  Time: 13:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Add minutes page</title>
</head>
<body>
    <h1>Add minutes Exercised</h1>

    Language <a href="?language=en">English</a> | <a href="?language=es">Spanish</a>

    <form:form modelAttribute="exercise">
        <table>
            <tr>
                <td><spring:message code="goal.text"/></td>
                <td><form:input path="minutes"/></td>

            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="Enter Exercise"/>
                </td>

            </tr>

        </table>
    </form:form>

    <h1>Our goal for the day is: ${goal.minutes}</h1>
</body>
</html>
