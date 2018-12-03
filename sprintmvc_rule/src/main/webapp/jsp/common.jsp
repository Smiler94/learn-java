<%--
  Created by IntelliJ IDEA.
  User: linzhen
  Date: 2018/11/27
  Time: 2:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="rapid" uri="http://www.rapid-framework.org.cn/rapid"%>
<%
    String path = request.getContextPath();
//    System.out.println(path);
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
                <c:forEach items="${navs}" var="nav" varStatus="status">
                    <c:if test="${nav.isCurrent}">
                        <li class="layui-nav-item layui-nav-itemed">
                    </c:if>
                    <c:if test="${!nav.isCurrent}">
                        <li class="layui-nav-item">
                    </c:if>
                            <a href="javascript:;">${nav.name}</a>
                            <dl class="layui-nav-child">
                                <c:forEach items="${nav.subNavs}" var="subNav">
                                    <c:if test="${subNav.isCurrent}">
                                        <dd class="layui-this"><a href="${subNav.uri}">${subNav.name}</a></dd>
                                    </c:if>
                                    <c:if test="${!subNav.isCurrent}">
                                        <dd><a href="${subNav.uri}">${subNav.name}</a></dd>
                                    </c:if>
                                </c:forEach>
                            </dl>
                        </li>
                </c:forEach>
            </ul>
        </div>
    </div>
    <div class="layui-body">
        <rapid:block name="content">
            base content
        </rapid:block>
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
<rapid:block name="script">

</rapid:block>
</body>
</html>
