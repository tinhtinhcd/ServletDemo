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
<form action="Calculator2" method="post">
    <div><input name="a" size="4" type="number" value="<%=request.getAttribute("a")%>"> +
        <input name="b" size="4"
               type="number"
               value="<%=request.getAttribute("b")%>">
        = <input name="r1" size="4" type="number" value="<%=request.getAttribute("r1")%>"></div>
        <div><input name="c" size="4" type="number" value="<%=request.getAttribute("c")%>"> +
        <input name="d" size="4" type="number" value="<%=request.getAttribute("d")%>"> =
        <input name="r2" size="4" type="number" value="<%=request.getAttribute("r2")%>"></div>
    <br>
    <div><input type="submit" value="Submit"></div>

</form>
</body>
</html>
