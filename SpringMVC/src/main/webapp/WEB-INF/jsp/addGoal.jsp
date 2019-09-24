<%--
  Created by IntelliJ IDEA.
  User: patarak
  Date: 24.09.2019
  Time: 9:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Add Goal</title>
    <style>
        .error {
            color:#ff0000;
        }
        .errorblock {
            color: #000;
            background-color: #ffEEEE;
            border: 3px solid #ff0000;
            padding: 8px;
            margin: 16px;
        }
    </style>
</head>
<body>

<form:form modelAttribute="goal">
    <form:errors path="*" cssClass="errorblock" element="div"/>
    <table>
        <tr>
            <td>Enter minutes</td>
            <td><form:input path="minutes" cssErrorClass="error"></form:input></td
            <td><form:errors path="minutes" cssClass="error"></form:errors></td

        </tr>
        <tr>
            <td colspan="3">
                <input type="submit" value="Enter Goal Minutes">
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
