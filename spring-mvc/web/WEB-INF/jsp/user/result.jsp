<%--
  Created by IntelliJ IDEA.
  User: linzhen
  Date: 18/11/5
  Time: 下午11:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spring MVC表单处理</title>
</head>
<body>
    <h2>提交的学生信息如下 - </h2>
    <table>
        <tr>
            <td>编号：</td>
            <td>${id}</td>
        </tr>
        <tr>
            <td>名称：</td>
            <td>${name}</td>
        </tr>
        <tr>
            <td>年龄：</td>
            <td>${age}</td>
        </tr>
    </table>
</body>
</html>
