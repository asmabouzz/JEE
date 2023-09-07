<%@ page import="com.example.demo.Person" %><%--
  Created by IntelliJ IDEA.
  User: Asmab
  Date: 06/09/2023
  Time: 15:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/Bootstrap.html"%>
<jsp:useBean id="person" type="java.util.ArrayList<com.example.demo.Person>" scope="request"/>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1 class="text-center">Tableau Des Personnes</h1>

<table class="table">

    <tr class="text-center">
        <th>NOM</th>
        <th>PRENOM</th>
        <th>AGE</th>
    </tr>
    <% for (Person p:person){%>

    <tr class="text-center">
        <td><%= p.getNom()%></td>
        <td><%= p.getPrenom()%></td>
        <td><%= p.getAge()%></td>

    </tr>
    <%}%>


</table>



</body>
</html>
