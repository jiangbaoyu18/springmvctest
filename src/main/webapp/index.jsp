<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/4/29
  Time: 0:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <h3>入门程序</h3>
    <%--
        <a href="hello">入门程序</a>
    --%>

    <a href="user/testRequestMapping?username=heihei">RequestMapping注解</a>

    <h3>异常处理</h3>

    <a href="user/testException" >异常处理</a>

    <a href="user/testInterceptor" >拦截器</a>

</body>
</html>
