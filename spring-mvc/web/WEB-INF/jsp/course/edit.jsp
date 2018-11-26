<%--
  Created by IntelliJ IDEA.
  User: linzhen
  Date: 2018/11/26
  Time: 23:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>add</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
</head>
<body>
<div id="main">
    <div class="row">
        <div class="col-md-12">
            <h1>添加课程</h1>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/update" class="form-horizontal" role="form" method="post">
        <div class="form-group">
            <label class="col-sm-1 control-label">课程编号</label>
            <div class="col-sm-3">
                <input type="text" class="form-control" readonly name="id" placeholder="请输入课程编号" value="${course.id}"/>
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-1 control-label">课程名称</label>
            <div class="col-sm-3">
                <input type="text" class="form-control" name="name" placeholder="请输入课程名称" value="${course.name}"/>
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-1 control-label">课程价格</label>
            <div class="col-sm-3">
                <input type="text" class="form-control" name="price" placeholder="请输入课程价格" value="${course.price}"/>
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-1 col-sm-3">
                <input type="hidden" name="_method" value="PUT"/>
                <button type="submit" class="btn btn-default">提交</button>
            </div>
        </div>
    </form>
</div>
</body>
</html>
