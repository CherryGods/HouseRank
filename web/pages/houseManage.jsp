<%--
  Created by IntelliJ IDEA.
  User: CherryGods
  Date: 2017/12/2
  Time: 20:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>青鸟租房-用户管理</title>
</head>
<body>
<h1>房屋信息管理</h1>
<table border="1px">
    <a href="AddHouse">新增房屋</a>
    <tr>
        <td>ID</td>
        <td>TITLE</td>
        <td>DESCRIPTION</td>
        <td>PRICE</td>
        <td>PUBDATE</td>
        <td>FLOORAGE</td>
        <td>CONTACT</td>
    </tr>
    <c:forEach var="hList" items="${house}">
        <tr>
            <td>${hList.id}</td>
            <td>${hList.title}</td>
            <td>${hList.description}</td>
            <td>${hList.price}</td>
            <td>${hList.pubdate}</td>
            <td>${hList.floorage}</td>
            <td>${hList.contact}</td>
            <td><a href="/delete.action?house.id=${hList.id}">删除房屋</a> </td>
            <td><a href="updateHouseInfo.jsp?id=${hList.id}">修改房屋</a> </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
