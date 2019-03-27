<%--
  Created by IntelliJ IDEA.
  User: 胡辉
  Date: 2019/3/21
  Time: 20:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1 style="color: darkorange">查询成功！</h1>
    <c:forEach items="${list}" var="account">
          ${account.id}
          ${account.name}
          ${account.money}
    </c:forEach>
</body>
</html>
