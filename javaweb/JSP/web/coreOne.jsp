<%--
  Created by IntelliJ IDEA.
  User: smallYJ
  Date: 2020/8/3
  Time: 16:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:set var="score" value="85"/>

<c:choose>
    <c:when test="${score>=90}">你的成绩优秀</c:when>
    <c:when test="${score>=80}">你的成绩良好</c:when>
    <c:when test="${score<=60}">及格</c:when>
</c:choose>

</body>
</html>
