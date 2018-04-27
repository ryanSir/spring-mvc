<%--
  Created by IntelliJ IDEA.
  User: zy28313
  Date: 2018/4/17
  Time: 17:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <title>title</title>
</head>
<body>
<h1>success page</h1>

time:${requestScope.time}
<br><br>
names:${requestScope.names}

<br><br>
request user:${requestScope.user}
<br><br>
session user:${sessionScope.user}
<br><br>
request school:${requestScope.school}
<br><br>
session school:${sessionScope.school}
<br><br>
abc user:${requestScope.user}
<br><br>
user user:${requestScope.user}
</body>
</html>
