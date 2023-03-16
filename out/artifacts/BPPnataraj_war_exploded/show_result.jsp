<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 3/15/2023
  Time: 12:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result Page</title>
    <link type="text/css" rel="stylesheet" href="css/style.css">
</head>
<body>
<div class="rza">
    <%
        if (request.getAttribute("rza") != null) {
            String result = request.getAttribute("rza").toString();
            if (result.equalsIgnoreCase("success")) {
    %>
    <h1>The data was successfully persisted</h1>
    <%
    } else {
    %>
    <h1 class="red">An error prevented the data from being
        persisted</h1>
    <%
            }
        }
    %>
    <h2><a href="index.jsp">Back to homepage</a></h2>
</div>

</body>
</html>
