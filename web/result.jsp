<%--
  Created by IntelliJ IDEA.
  User: lyvantinh
  Date: 04/10/2019
  Time: 21:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
    <%
        List style = (List) request.getAttribute("style");
        Iterator it = style.iterator();
        while (it.hasNext()){
            out.println("<br>try: " + it.next());
        }
    %>
</body>
</html>
