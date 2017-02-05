<%--
  Created by IntelliJ IDEA.
  User: OlehB9
  Date: 04.02.2017
  Time: 22:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form:form modelAttribute="category" action="saveCategory" method="post">

        <form:input  path="name"  type="text" placeholder="category name"/>
        <button >Save category</button>
</form:form>

<c:forEach var="category" items="${categories}">
    ${category.name}
    <a href="deleteCategory/${category.id}">delete category</a>
    <br>
</c:forEach>

</body>
</html>
