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
    <h1>STUDENT REGISTRATION</h1>
    <h2>please enter only accurate details</h2>
    <div class="form">
    <form class="welcome" method="post" action="registerurl">
      <label for="id">ID Number:</label>
      <input type="text" id="id" name="id" placeholder="Enter your national identification details" required>
      <label for="name">Student Name:</label>
        <input type="text" id="name" name="name" placeholder="Enter your name" required>
<%--        <label for="doj">Current Date:</label>--%>
<%--      <input type="datetime-local" id="doj" name="doj" placeholder="Enter current date" required>--%>
        <label for="address">Address:</label>
      <input type="text" id="address" name="address" placeholder="Enter your address" required>
        <label for="course">Course:</label>
      <input type="text" id="course" name="course" placeholder="Enter your current salary" required>
      <label for="mark1">English Marks:</label>
      <input type="number" step="any" id="mark1" name="mark1" placeholder="Enter your current salary" required>
      <label for="mark2">Kiswahili Marks:</label>
      <input type="number" step="any" id="mark2" name="mark2" placeholder="Enter your current salary" required>
      <label for="mark3">Science Marks:</label>
      <input type="number" step="any" id="mark3" name="mark3" placeholder="Enter your current salary" required>
      <input class="submit-btn" type="submit" name="reg" value="RegisterStudent">
    </form>
    </div>
  </div>
</body>
</html>
