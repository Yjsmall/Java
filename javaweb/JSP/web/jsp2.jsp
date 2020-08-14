<%--
  Created by IntelliJ IDEA.
  User: smallYJ
  Date: 2020/8/2
  Time: 15:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@page errorPage="error/500.jsp" %>

<%--声明一个错误页面--%>
<%@page isErrorPage="true" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    int x = 1/0;
%>

</body>
</html>
