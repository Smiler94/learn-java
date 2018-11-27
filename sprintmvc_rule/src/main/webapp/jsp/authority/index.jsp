<%--
  Created by IntelliJ IDEA.
  User: linzhen
  Date: 2018/11/27
  Time: 2:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
                <li class="layui-nav-item layui-nav-itemed">
                    <a href="javascript:;">权限管理</a>
                    <dl class="layui-nav-child">
                        <dd class="layui-this"><a href="/authority/list">查询权限</a></dd>
                        <dd><a href="/authority/add">添加权限</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item">
                    <a href="javascript:;">角色管理</a>
                    <dl class="layui-nav-child">
                        <dd><a href="/role/list">查询角色</a></dd>
                        <dd class="layui-this"><a href="/role/add">添加角色</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item">
                    <a href="javascript:;">用户管理</a>
                    <dl class="layui-nav-child">
                        <dd><a href="/user/list">查询用户</a></dd>
                        <dd class="layui-this"><a href="/user/add">添加用户</a></dd>
                    </dl>
                </li>
            </ul>
        </div>
    </div>
    <div class="layui-body">
        <div style="padding:15px">
            <table class="layui-table" lay-data="{width:892, height:483, url:'authority/getAll', page:true, id:'idTest}" lay-filter="demo">
                <thead>
                <tr>
                    <th lay-data="{type:'checkbox',fixed:'left'}"></th>
                    <th lay-data="{field:'id',sort: true, fixed:true}">ID</th>
                    <th lay-data="{field:'name'}">权限名</th>
                    <th lay-data="{fixed: 'right', width:178, align:'center', toolbar: '#barDemo'}"></th>
                </tr>
                </thead>
            </table>
            <script type="text/html" id="barDemo">
                <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
                <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
            </script>
        </div>
    </div>
    <div class="layui-footer">
        @ linzhen
    </div>
</div>
<script>
    layui.use('element', function() {
        var element = layui.element;
    })
</script>
</body>
</html>
