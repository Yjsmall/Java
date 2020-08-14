<%--
  Created by IntelliJ IDEA.
  User: smallYJ
  Date: 2020/8/2
  Time: 19:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    pageContext.setAttribute("hello01","hello",PageContext.SESSION_SCOPE);
    //session.setAttribute("hello01","hello");
%>


</body>
</html>
