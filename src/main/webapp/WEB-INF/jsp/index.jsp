<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title> Assignment 3</title>
    <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }
    </style>
</head>
<body>

<h2>Inventory Table</h2>

<table>
    <tr>
        <th>description</th>
        <th>color</th>
        <th>price</th>
    </tr>
    <c:forEach var = "listitem" items = "${inventorylist}">
        <tr>
            <td>${listitem.description}</td>
            <td>${listitem.color}</td>
            <td>${listitem.price}</td>
            <td></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>