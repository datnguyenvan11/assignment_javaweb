<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Category</title>
</head>
<body>
<div align="center">
    <table border="1" cellpadding="5">
        <caption>
            <h2>List Of Categories</h2>
        </caption>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Actions</th>
        </tr>
        <c:forEach var="cate" items="${requestScope.categories}">
            <tr>
                <td>${cate.id}</td>
                <td>${cate.name}</td>
<%--                <td>--%>
<%--                    <a href="${pageContext.request.contextPath}/update?id=<c:out value='${cate.id}'/>">Edit</a>--%>
<%--                    &nbsp;&nbsp;&nbsp;&nbsp;--%>
<%--                    <a href="${pageContext.request.contextPath}/delete?id=<c:out value='${cate.id}'/>">Delete</a>--%>
<%--                </td>--%>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
