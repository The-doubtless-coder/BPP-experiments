<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 3/14/2023
  Time: 12:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Student Form</title>
  <link rel="stylesheet" href="css/style.css">
</head>
<body>
<div class="stud-form">
  <h1>EMPLOYEE REGISTRATION</h1>
  <h2>please enter only accurate details</h2>
  <div class="form">
    <form class="welcome" method="post" action="registerurl">
      <label for="id">ID Number:</label>
      <input type="text" id="id" name="id" placeholder="Enter your national identification details" required>
      <label for="name">Employee Name:</label>
      <input type="text" id="name" name="name" placeholder="Enter your name" required>
<%--      <label for="doj">Current Date:</label>--%>
<%--      <input type="datetime-local" id="doj" name="doj" placeholder="Enter current date" required>--%>
      <label for="company">Company Name:</label>
      <input type="text" id="company" name="company" placeholder="Enter the name of your employer" required>
      <label for="salary">Salary:</label>
      <input type="number" step="any" id="salary" name="salary" placeholder="Enter your current salary" required>
      <input class="submit-btn" type="submit" name="reg" value="RegisterEmployee">
    </form>
  </div>
</div>
</body>
</html>
