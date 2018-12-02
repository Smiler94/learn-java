<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="rapid" uri="http://www.rapid-framework.org.cn/rapid"%>
<rapid:override name="content">
    <div style="padding:15px">
        <form action="/authority/add" class="layui-form" method="post">
            <div class="layui-form-item">
                <label for="name" class="layui-form-label">权限名</label>
                <div class="layui-input-inline" style="width:300px">
                    <input id="name" type="text" class="layui-input" name="name" lay-verify="name" placeholder="请输入"
                           autocomplete="off"/>
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
