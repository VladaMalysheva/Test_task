<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: prost
  Date: 09.03.2023
  Time: 17:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
  <style>
  #myForm {
  display: none; /* hide the form by default */
  }
  </style>
</head>
<body>
<table>
  <thead>
  <tr>
    <th>ID</th>
    <th>Title</th>
    <th>Delete</th>
  </tr>
  </thead>
  <tbody>

  <c:forEach items="${sets}" var="kpac">
    <tr>
      <td>${kpac.ID}</td>
      <td><a href="${pageContext.request.contextPath}/set/${kpac.ID}" target="_blank">${kpac.title}</a></td>
      <td><a href="${pageContext.request.contextPath}/set/delete/${kpac.ID}">Delete</a></td>
    </tr>
  </c:forEach>
  </tbody>
</table>
<p/>

<button onclick="showForm()">Show Form</button>

<p/>
<form:form id="myForm" method="post" action="processForm" modelAttribute="kpacSet">
  <label for="title">Title:</label>
  <form:input id="title" path="title"/><br><br>
  <input type="submit" value="Submit">
</form:form>
<script>
  var form = document.getElementById("myForm");
  if (form.style.display === "none") {
    form.style.display = "block";
  } else {
    form.style.display = "none";
  }
  function showForm() {
    var form = document.getElementById("myForm");
    if (form.style.display === "none") {
      form.style.display = "block";
    } else {
      form.style.display = "none";
    }
  }
</script>
</body>
</html>
