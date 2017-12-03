<%--
  Created by IntelliJ IDEA.
  User: CherryGods
  Date: 2017/12/2
  Time: 20:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>青鸟租房-用户登录</title>
</head>
<body>
<form action="login" method="post">
    <table border="2">
        <tr>
            <td>
                用户名:<input type="text" name="users.username"/><br>
            </td>
        </tr>
        <tr>
            <td>
                密码:<input type="password" name="users.password"/><br>
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="登录"/>
            </td>
        </tr>
    </table>



</form>
</body>
</html>
