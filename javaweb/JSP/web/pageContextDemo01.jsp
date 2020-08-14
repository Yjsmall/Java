<%--
  Created by IntelliJ IDEA.
  User: smallYJ
  Date: 2020/8/2
  Time: 19:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    pageContext.setAttribute("name1","small1");
    request.setAttribute("name2","small2");
    session.setAttribute("name3","small3");
    application.setAttribute("name4","small4");
%>

<%--脚本片段 必须要用java正确性--%>
<%
    //通过pageContext取出我们的值
    //从底层到高层(作用域): page->request->session->application
    Object name1 = pageContext.findAttribute("name1");//保存数据只在一个页面有效
    Object name2 = pageContext.findAttribute("name2");//保存数据只在一次请求有效,请求转发携带这个数据
    Object name3 = pageContext.findAttribute("name3");//保存数据只在一次会话有效,从打开浏览器到关闭浏览器
    Object name4 = pageContext.findAttribute("name4");//保存数据只在服务器有效,打开服务器到关闭服务器

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
