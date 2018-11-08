<%--
  Created by IntelliJ IDEA.
  User: linzhen
  Date: 18/11/5
  Time: 下午11:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Spring MVC表单处理</title>
    <style>
        .error {
            color: #ff0000;
        }

        .errorStyle {
            color: #000;
            background-color: #ffEEEE;
            border: 3px solid #ff0000;
            padding: 8px;
            margin: 16px;
        }
    </style>
</head>
<body>
    <h2>User Information</h2>
    <form:form method="POST" action="/user" commandName="user">
        <form:errors path="*" cssClass="errorStyle" element="div"/>
        <table>
            <tr>
                <td><form:label path="id">编号：</form:label></td>
                <td><form:input path="id"/></td>
            </tr>
            <tr>
                <td><form:label path="name">名称：</form:label></td>
                <td><form:input path="name"/></td>
            </tr>
            <tr>
                <td><form:label path="age">年龄：</form:label></td>
                <td><form:input path="age"/></td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="提交表单">
                </td>
            </tr>
        </table>
    </form:form>
</body>
</html>
