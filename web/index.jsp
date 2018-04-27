<%--
  Created by IntelliJ IDEA.
  User: zy28313
  Date: 2018/4/17
  Time: 17:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>spring-mvc</title>
</head>
<body>


<form action="springmvc/testModelAttribute" method="Post">
    <input type="hidden" name="id" value="1">
    username:<input type="text" name="username" value="Tom"/>
    <br>
    email:<input type="text" name="email" value="tom@aa.com">
    <br>
    age:<input type="text" name="age" value="12">
    <br>
    <input type="submit" value="submit"/>
</form>
<br><br>

<a href="springmvc/testSessionAttributes">test testSessionAttributes</a>
<br><br>

<a href="springmvc/testMap">test map</a>
<br><br>

<a href="springmvc/testModelAndView">test ModelAndView</a>
<br><br>

<a href="springmvc/testServletAPI">test ServletAPI</a>
<br><br>
<form action="springmvc/testPojo" method="post">
    username:<input type="text" name="username"/><br>
    password:<input type="text" name="password"/><br>
    email:<input type="text" name="email"/><br>
    age:<input type="text" name="age"><br>
    city:<input type="text" name="address.city"><br>
    province:<input type="text" name="address.province"><br>
    <input type="submit" value="submit">
</form>
<br><br>
<a href="springmvc/testCookieValue">test CookieValue</a>
<br><br>
<a href="springmvc/testRequestHeader">test requestHeader</a>
<br><br>
<a href="springmvc/testRequestParam?username=ryan&age=11">test requestParam</a>
<br>
<br>
<form action="springmvc/testRest/1" method="PUT">
    <input type="hidden" name="_method" value="PUT"/>
    <input type="submit" value="TestRest put"/>
</form>
<br>
<form action="springmvc/testRest/1" method="DELETE">
    <input type="hidden" name="_method" value="DELETE"/>
    <input type="submit" value="TestRest DELETE"/>
</form>
<br>
<form action="springmvc/testRest" method="post">
    <input type="submit" value="TestRest POST">
</form>
<br>
<a href="springmvc/testRest/1">test rest get</a>
<br><br>
<a href="springmvc/testPathVariable/1">test path variable</a>
<br>
<a href="helloworld">hello world</a>
<br>
<a href="springmvc/testRequestMapping">test request Mapping</a>
<br>
<a href="springmvc/testParamsAndHeaders?username=zy&age=11">test params and headers</a>

<form action="springmvc/testMethod" method="post">
    <input type="submit" value="submit">
</form>


</body>
</html>