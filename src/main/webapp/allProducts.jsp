<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 21.11.2016
  Time: 21:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib  prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Все товары</title>
</head>
<body>
<c:forEach var="product" items="${products}">
    <li>
        <b2>Продукт</b2><br/>
        <b2>Код ${product.id} Наименование: ${product.name} Цена: ${product.price} </b2>
    </li>
</c:forEach>
</body>
</html>
