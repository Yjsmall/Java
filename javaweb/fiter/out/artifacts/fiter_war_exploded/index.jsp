<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>

  <h1>当前有 <span style="color: blueviolet"><%=this.getServletConfig().getServletContext().getAttribute("OnlineCount")%> 人在线</span></h1>
  </body>
</html>
