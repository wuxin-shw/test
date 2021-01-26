<%--
  Created by IntelliJ IDEA.
  User: 无心y
  Date: 2020/12/11
  Time: 20:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>1.单个数据散提交</h2>
<form action="${pageContext.request.contextPath}/haha/zhendema.action" method="post">
    姓名:<input name="uname"><br>
    年龄:<input name="uage"><br>
    <input type="submit" value="提交">
</form>
${msg}
</body>
</html>
