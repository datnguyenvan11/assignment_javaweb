<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/29/2020
  Time: 3:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Fruit</title>
</head>
<body>
<h2>Edit Fruit</h2>
<form method="post" action="edit-fruit">
    <table border="0" cellpadding="5">
        <tr>
            <td>ID: </td>
            <td>${fruit.id}
                <form:hidden path="id"/>
            </td>
        </tr>
        <tr>
            <td>Name: </td>
            <td><form:input path="name" /></td>
        </tr>
        <tr>
            <td>Description: </td>
            <td><form:input path="description" /></td>
        </tr>
        <tr>
            <td>Price: </td>
            <td><form:input path="price" /></td>
        </tr>
        <tr>
            <td>Unit: </td>
            <td><form:input path="unit" /></td>
        </tr>
        <tr>
            <td>Origin: </td>
            <td><form:input path="origin" /></td>
        </tr>
        <tr>
            <td>Thumbnail: </td>
            <td><form:input path="thumbnail" /></td>
        </tr>
        <tr>
            <td>Category Id: </td>
            <td><form:input path="categoryId" /></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="Save"></td>
        </tr>
    </table>
</form>
</body>
</html>