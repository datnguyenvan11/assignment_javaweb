<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 6/26/2020
  Time: 4:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Category</title>
</head>
<body>
<form method="post" action="insert-category">
    <table>
        <tr>
            <td>Product Name</td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td><input type="submit" value="Save Category"></td>
        </tr>

    </table>
</form>
</body>
</html>
