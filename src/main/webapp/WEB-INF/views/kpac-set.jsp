<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: prost
  Date: 09.03.2023
  Time: 18:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <th>ID</th>
        <th>Title</th>
        <th>Description</th>
    </tr>
    </thead>
    <tbody>

    <c:forEach items="${kpacSet}" var="kpac">
        <tr>
            <td>${kpac.ID}</td>
            <td>${kpac.title}</td>
            <td>${kpac.description}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
