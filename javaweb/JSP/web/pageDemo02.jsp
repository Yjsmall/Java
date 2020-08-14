<%--
  Created by IntelliJ IDEA.
  User: smallYJ
  Date: 2020/8/2
  Time: 19:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    //通过pageContext取出我们的值
    Object name1 = pageContext.findAttribute("name1");
    Object name2 = pageContext.findAttribute("name2");
    Object name3 = pageContext.findAttribute("name3");
    Object name4 = pageContext.findAttribute("name4");

%>
<%--El表达式输出--%>

<h1>取出的的值:</h1>
<h3>${name1}</h3>
<h3>${name2}</h3>
<h3>${name3}</h3>
<h3>${name4}</h3>
<h3><%=pageContext.findAttribute("name5")%></h3>


</body>
</html>
