<%--
  Created by IntelliJ IDEA.
  User: 胡辉
  Date: 2019/3/21
  Time: 20:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <a href="account/findAll">查询所有</a>

    <h1 style="color: darkorange">测试保存</h1>
    <form action="account/save">
        姓名：<input type="text" name="name">
        金额：<input type="text" name="money">
              <input type="submit" value="提交">
    </form>

</body>
</html>
