<%--
  Created by IntelliJ IDEA.
  User: INT202&204
  Date: 9/19/2023
  Time: 2:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Now you're in multitable</title>

</head>
<body>
    <c:if test="${message == null}">
    <h3>Multiplication Table of${param.number}
        <table style="border: 1px solid black">
            <tr>
                <td colspan="5">Muitiplication table of ${param.number}</td>
            </tr>
<%--            n is variable that contain current element--%>
            <c:forEach begin="1" end="24" var="n">
            <tr>
                <td >${param.number}</td>
                <td >x</td>
                <td >${n}</td>
                <td >=</td>
                <td >${param.number * n}</td>
            </tr>
            </c:forEach>
        </table>
    </h3>
    </c:if>
    <c:if test="${message != null}">
    <h6>Error::
        <hr>${requestScope.message} <span style="color:red">(${param.number})</span>
    </h6>
    </c:if>
    Your browser ${header["User-Agent"]}
</body>
</html>
