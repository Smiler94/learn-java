<%--
  Created by IntelliJ IDEA.
  User: linzhen
  Date: 2018/11/27
  Time: 2:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="rapid" uri ="http://www.rapid-framework.org.cn/rapid"%>
<rapid:override name="content">
    <div style="padding:15px">
        <table class="layui-table" id="user_table" lay-filter="demo">
        </table>
        <script type="text/html" id="barDemo">
            <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
            <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
        </script>
    </div>
</rapid:override>
<rapid:override name="script">
    <script>
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
</rapid:override>
<%@ include file="/jsp/common.jsp"%>
