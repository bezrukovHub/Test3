<%--
  Created by IntelliJ IDEA.
  User: OlehB9
  Date: 04.02.2017
  Time: 23:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
           prefix="sec"%>
<html>
<head>
    <title>Commodity</title>
</head>
<body>

<form:form modelAttribute="commodity" action="saveCommodity" method="post">
    <form:input path="name" placeholder="name" />
    <form:input path="description" placeholder="description" />
    <form:input path="price" placeholder="price" />
    <form:input path="sale" placeholder="sale" />
    <form:input path="count" placeholder="count" />
    <form:input path="weight" placeholder="weight" />
    <form:input path="information" placeholder="information" />

    <form:select path="subCategory" items="${subCategories}" itemLabel="name" itemValue="id"></form:select>

    <button>Save Commodity</button>
</form:form>

<c:forEach var="commodity" items="${commodities}">
    ${commodity.name} <a href="deleteCommodity/${commodity.id}">delete Commodity</a>
    <br>
</c:forEach>



</body>
</html>
