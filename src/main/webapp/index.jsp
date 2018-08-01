<%@ page contentType="text/html; charset=utf-8" language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
    <h2>Welcome To Struts 2!</h2>
    <p><a href="<s:url action="hello"/>">Hello World</a></p>
    <s:url action="hello" var="helloLink">
        <s:param name="userName">Bruce Phillips</s:param>
    </s:url>
    <p><a href="${helloLink}">Hello Bruce Phillips</a></p>

    <s:form action="hello">
        <s:textfield name="userName"/>
        <s:submit value="Submit"/>
    </s:form>

    <p><a href="register.jsp">Please register</a> for our prize drawing.</p>
</body>
</html>
