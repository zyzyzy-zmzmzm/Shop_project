<%--
  Created by IntelliJ IDEA.
  User: 玉敏哈哈哈
  Date: 2019/11/29
  Time: 11:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h4>用户</h4>
<table cellspacing="0" cellpadding="0" width="400" height="400" border="1">
    <tr>
        <td>用户Id</td>
        <td>姓名</td>
        <td>年龄</td>
        <td>出生日期</td>
        <td>住址</td>
        <td>删除</td>
    </tr>
    <c:forEach items="${yonghu}" var="yy">
    <tr>
        <td>${yy.id}</td>
        <td>${yy.username}</td>
        <td>${yy.age}</td>
        <td>${yy.birthday}</td>
        <td>${yy.address}</td>
            <%--        <td>--%>
            <%--           <a href="${pageContext.request.contextPath}/coll/deluser.p?id=${yy.id}">删除 </a>--%>
            <%--            <a href="${pageContext.request.contextPath}/rest/coll/delUser1/${yy.id}">删除 </a>--%>
            <%--        </td>--%>
    </tr>

    </c:forEach>
</body>
</html>
