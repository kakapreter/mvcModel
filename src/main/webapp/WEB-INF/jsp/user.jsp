<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>user</title>
</head>
<body>
    ${requestScope.user.id}<br/>
    email:${requestScope.user.email}<br/>
    username:${requestScope.user.username}<br/>
    role:${requestScope.user.role}<br/>
    mobile:${requestScope.user.mobile}<br/>

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
