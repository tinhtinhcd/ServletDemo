<%--
  Created by IntelliJ IDEA.
  User: lyvantinh
  Date: 04/10/2019
  Time: 21:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>

</head>
<body>
<form action="Calculator" method="post">
    <div><input name="a" size="4" type="number">+<input name="b" size="4" type="number"></div>
    <div><input name="c" size="4" type="number">+<input name="d" size="4" type="number"></div>
    <br><div><input type="submit" value="Submit"></div>
    <%
        String result = (String) request.getAttribute("result");
        if (null != result) out.print(result);
    %>
</form>
</body>
</html>
