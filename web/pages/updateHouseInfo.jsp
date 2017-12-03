<%--
  Created by IntelliJ IDEA.
  User: CherryGods
  Date: 2017/12/3
  Time: 9:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>青鸟租房-修改房屋信息</title>
</head>
    <body>
    <h1>修改房屋信息</h1>
    <form action="update" method="post">
        <%
        %>
        ID:<input type="text" value="" name="id"/>
        TITLE:<input type="text" value="" name="title"/>
        DESCRIPTION:<input type="text" value="" name="description"/>
        PRICE:<input type="text" value="" name="price"/>
        PUDATE:<input type="text" value="" name="pubate"/>
        FLOORAGE:<input type="text" value="" name="floorage"/>
        CONTACT<input type="text" value="" name="contact"/>
        <input type="submit" value="更新"/>
    </form>
</body>
</html>
