<%--
  Created by IntelliJ IDEA.
  User: dubeyji
  Date: 10/07/26
  Time: 4:55 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

   ${massage}

<h1>Register Form</h1>

<form action="save.do" method="post" >
    <input type="text" name="id" placeholder="enter id">
    <input type="text" name="name" placeholder="enter name">
    <input type="text" name="address" placeholder="enter address">
    <input type="text" name="salary" placeholder="enter salary">
    <button>Save Data</button>
</form>
</body>
</html>
