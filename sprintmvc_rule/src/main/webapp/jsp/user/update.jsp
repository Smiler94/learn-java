<%--
  Created by IntelliJ IDEA.
  User: linzhen
  Date: 2018/11/27
  Time: 2:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="rapid" uri="http://www.rapid-framework.org.cn/rapid" %>
<rapid:override name="content">
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
</rapid:override>
<%@ include file="/jsp/common.jsp"%>
