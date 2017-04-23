<%--
  Created by IntelliJ IDEA.
  User: abc83
  Date: 2017/4/23
  Time: 17:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <title>Title</title>
    <script src="${ctx}/static/js/jquery-3.2.1.min.js"></script>
</head>
<body>
<h2  style="text-align: center;margin-top: 100px">Hello World! -- ${date}</h2>
</body>
</html>
