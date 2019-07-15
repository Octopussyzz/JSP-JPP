<%@ page import="fr.wildcodeschool.githubtracker.model.Githuber" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<%--
  Created by IntelliJ IDEA.
  User: octopus
  Date: 12/07/19
  Time: 11:49
  To change this template use File | Settings | File Templates.
--%>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="header.jsp" %>
<html>
    <head>
        <title>Githubers List</title>
    </head>
    <body>
        <h1>List of Githubers :</h1>
        <table class="table">
            <thead>
            <tr>
                <th scope="col">Name</th>
                <th scope="col">Id</th>
                <th scope="col">Login</th>
                <th scope="col">Email</th>
                <th scope="col">Avatar Url</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items = "${githubers}" var = "current">
            <tr>
                    <td><c:out value = "${current.name}"/></td>
                    <td><c:out value = "${current.id}"/></td>
                    <td><c:out value = "${current.login}"/></td>
                    <td><c:out value = "${current.email}"/></td>
                    <td><c:out value = "${current.avatarUrl}"/></td>
            </tr>
            </c:forEach>
            </tbody>
        </table>

    </body>
</html>
