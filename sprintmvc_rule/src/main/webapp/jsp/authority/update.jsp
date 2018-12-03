<%--
  Created by IntelliJ IDEA.
  User: linzhen
  Date: 2018/11/27
  Time: 2:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="rapid" uri="http://www.rapid-framework.org.cn/rapid"%>

<rapid:override name="content">
    <div style="padding:15px">
        <form action="/authority/update" class="layui-form" method="post">
            <div class="layui-form-item">
                <label for="id" class="layui-form-label">权限ID</label>
                <div class="layui-input-inline" style="width:300px">
                    <input id="id" type="text" class="layui-input" name="id" lay-verify="id" value="${authority.id}" readonly/>
                </div>
            </div>
            <div class="layui-form-item">
                <label for="name" class="layui-form-label">权限名</label>
                <div class="layui-input-inline" style="width:300px">
                    <input id="name" type="text" class="layui-input" name="name" lay-verify="name" placeholder="请输入"
                           autocomplete="off" value="${authority.name}"/>
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