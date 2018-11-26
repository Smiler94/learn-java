<%--
  Created by IntelliJ IDEA.
  User: linzhen
  Date: 2018/11/26
  Time: 23:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>课程列表</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
</head>
<body>
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <h1>课程管理</h1>
            </div>
        </div>

        <div class="row">
            <div class="col-md-12">
                <table class="table table-hover" id="emps_table">
                    <thead>
                    <tr>
                        <th>
                            <input type="checkbox" id="check_all"/>
                        </th>
                        <th>编号</th>
                        <th>课程名</th>
                        <th>价格</th>
                        <th>编辑</th>
                        <th>删除</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${courses}" var="course">
                        <tr>
                            <td><input type="checkbox" class="check_item"/></td>
                            <td>${course.id}</td>
                            <td>${course.name}</td>
                            <td>${course.price}</td>
                            <td>
                                <form action="${pageContext.request.contextPath}/getById/${course.id}" method="get">
                                    <button class="btn btn-primary edit_btn" type="submit">
                                        <span class="glyphicon glyphicon-pencil">编辑</span>
                                    </button>
                                </form>
                            </td>
                            <td>
                                <form action="${pageContext.request.contextPath}/delete/${course.id}" method="post">
                                    <button class="btn btn-danger delete-btn" type="submit">
                                        <input type="hidden" name="_method" value="DELETE">
                                        <span class="glyphicon glyphicon-trash">删除</span>
                                    </button>
                                </form>
                            </td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</body>
</html>
