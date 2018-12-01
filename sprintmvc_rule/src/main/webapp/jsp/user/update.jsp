<%--
  Created by IntelliJ IDEA.
  User: linzhen
  Date: 2018/11/27
  Time: 2:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    System.out.println(path);
%>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="<%=path %>/static/layui/css/layui.css" type="text/css">
    <script type="text/javascript" src="<%=path %>/static/layui/layui.js"></script>
</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
    <div class="layui-header">
        <div class="layui-logo">后台管理系统</div>
        <ul class="layui-nav layui-layout-left">
            <li class="layui-nav-item"><a href="">控制台</a></li>
            <li class="layui-nav-item"><a href="">信息控制</a></li>
            <li class="layui-nav-item"><a href="">
                <a href="javascript:;">权限管理</a>
            </a></li>
        </ul>
        <ul class="layui-nav layui-layout-right">
            <li class="layui-nav-item">
                <a href="javascript:;">
                    <img src="<%=path%>/static/layui/images/img.png" class="layui-nav-img">
                    林林
                </a>
                <dl class="layui-nav-child">
                    <dd><a href="">基本资料</a></dd>
                    <dd><a href="">安全设置</a></dd>
                </dl>
            </li>
            <li class="layui-nav-item"><a href="">退出</a></li>
        </ul>
    </div>
    <div class="layui-side layui-bg-black">
        <div class="layui-side-scroll">
            <ul class="layui-nav layui-nav-tree">
                <li class="layui-nav-item">
                    <a href="javascript:;">权限管理</a>
                    <dl class="layui-nav-child">
                        <dd><a href="/authority/index">查询权限</a></dd>
                        <dd><a href="/authority/add">添加权限</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item">
                    <a href="javascript:;">角色管理</a>
                    <dl class="layui-nav-child">
                        <dd><a href="/role/index">查询角色</a></dd>
                        <dd><a href="/role/add">添加角色</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item layui-nav-itemed">
                    <a href="javascript:;">用户管理</a>
                    <dl class="layui-nav-child">
                        <dd><a href="/user/index">查询用户</a></dd>
                        <dd class="layui-this"><a href="/user/add">添加用户</a></dd>
                    </dl>
                </li>
            </ul>
        </div>
    </div>
    <div class="layui-body">
        <div style="padding:15px">
            <form action="/user/add" class="layui-form" method="post">
                <div class="layui-form-item">
                    <label for="name" class="layui-form-label">用户ID</label>
                    <div class="layui-input-inline" style="width:300px">
                        <input id="id" type="text" class="layui-input" name="id" lay-verify="name" placeholder="请输入"
                               autocomplete="off" value="${user.id}" readonly/>
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="name" class="layui-form-label">用户名</label>
                    <div class="layui-input-inline" style="width:300px">
                        <input id="name" type="text" class="layui-input" name="name" lay-verify="name" placeholder="请输入"
                               autocomplete="off" value="${user.name}"/>
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">请选择角色</label>
                    <div class="layui-input-block">
                        <c:forEach items="${roles}" var="role" varStatus="status">
                            <c:if test="${role.has}">
                                <input type="checkbox" name="roles[]" value="${role.id}" title="${role.name}" checked/>
                            </c:if>
                            <c:if test="${!role.has}">
                                <input type="checkbox" name="roles[]" value="${role.id}" title="${role.name}"/>
                            </c:if>
                        </c:forEach>
                    </div>
                </div>
                <div class="layui-form-item">
                    <div class="layui-input-block">
                        <button class="layui-btn" lay-submit="" lay-filter="demo1">立即提交</button>
                        <button type="reset" class="layui-btn layui-btn-primary">重置</button>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
<script>
    layui.use('element', function() {
        var element = layui.element;
    })

    layui.use(['form'], function() {
        var form = layui.form;
    })
</script>
</body>
</html>
