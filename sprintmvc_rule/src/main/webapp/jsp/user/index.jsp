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
                        <dd class="layui-this"><a href="/user/index">查询用户</a></dd>
                        <dd><a href="/user/add">添加用户</a></dd>
                    </dl>
                </li>
            </ul>
        </div>
    </div>
    <div class="layui-body">
        <div style="padding:15px">
            <table class="layui-table" id="user_table" lay-filter="demo">
            </table>
            <script type="text/html" id="barDemo">
                <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
                <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
            </script>
        </div>
    </div>
</div>
<script>
    layui.use('element', function() {
        var element = layui.element;
    })

    layui.use('table', function () {
        var table = layui.table;

        table.render({
            elem: '#user_table',
            url: '/user/getAll',
            cols: [[
                {type:'checkbox',fixed:'left'},
                {field:'id',sort: true, fixed:true, title:'ID'},
                {field:'name', title:'用户名'},
                {fixed: 'right', width:178, align:'center', toolbar: '#barDemo', title:'操作'}
            ]]
        })

        table.on('tool(demo)', function(obj) {
            var data = obj.data;

            if (obj.event==='del') {
                layer.confirm('确定删除吗？', function (index) {
                    window.location.href= 'deleteById/' + data.id;
                })
            } else if (obj.event === 'edit') {
                window.location.href = 'findById/' + data.id;
            }
        })
    })
</script>
</body>
</html>
