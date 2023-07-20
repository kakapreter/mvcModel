<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>users</title>
</head>
<body>

<c:forEach items="${users}" var="users">
    <table cellpadding="10" border=3>
        <tr>
            <td><c:out value="${users.id}"></c:out></td>
            <td><c:out value="${users.email}"></c:out></td>
            <td><c:out value="${users.username}"></c:out></td>
            <td><c:out value="${users.role}"></c:out></td>
            <td><c:out value="${users.mobile}"></c:out></td>
        </tr>
    </table>
</c:forEach>

</body>
</html>
