<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
 <%--Jsp表达式

 <%= 表达式/变量%>
 --%>
  <%= new java.util.Date()%>
 <hr>
  <%--jsp 脚本片段--%>
  <%
      int sum = 0;
      for (int i = 1;i <= 100; i++){
          sum+=i;
      }
      out.println("<h1>Sum=" + sum +"</h1>");
  %>

  <%
      int x = 10;
      out.println(x);
  %>
  <p>这是一个jsp文档</p>

  <%
      for (int i = 0; i < 5; i++) {
  %>
  <h1>hello, world1 ${i} </h1>
  <%
      }
  %>
  <hr>

  <%!
      static {
          System.out.println("Loading Servlet!");
      }
      private int globalVar = 0;
      public void kuang(){
          System.out.println("进入方法");
      }

  %>




  </body>
</html>
