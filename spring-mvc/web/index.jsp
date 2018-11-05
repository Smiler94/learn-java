<%--
  Created by IntelliJ IDEA.
  User: linzhen
  Date: 18/11/5
  Time: 下午4:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>
<html>
  <head>
    <title>首页</title>
  </head>
  <body>
    <p>点击下面的按钮获得一个简单的html页面</p>
    <form:form method="GET" action="/static">
      <table>
        <tr>
          <td><input type="submit" value="获取html页面"></td>
        </tr>
      </table>
    </form:form>
  </body>
</html>
