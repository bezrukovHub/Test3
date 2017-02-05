<%--
  Created by IntelliJ IDEA.
  User: OlehB9
  Date: 04.02.2017
  Time: 23:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
           prefix="sec"%>
<html>
<head>
    <title>SubCategory</title>
</head>
<body>

<form:form modelAttribute="subCategory" action="saveSubCategory" method="post">
        <form:input path="name" placeholder="name" />

        <form:select path="category" items="${categories}" itemLabel="name" itemValue="id"></form:select>

        <button>Save SubCategory</button>
</form:form>

<c:forEach var="subCategory" items="${subCategories}">
    ${subCategory.name} <a href="deleteSubCategory/${subCategory.id}">delete SubCategory</a>
    <br>
</c:forEach>


</body>
</html>
