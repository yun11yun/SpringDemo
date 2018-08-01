<%--
  Created by IntelliJ IDEA.
  User: wentaohuang
  Date: 27/7/18
  Time: 下午4:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Title</title>
    <s:head/>
</head>
<body>
    <s:form action="register">
        <s:textfield name="personBean.firstName" label="First Name"/>
        <s:textfield name="personBean.lastName" label="Last Name"/>
        <s:textfield name="personBean.email" label="Email"/>
        <s:textfield name="personBean.age" label="Age"/>
        <s:submit/>
    </s:form>
</body>
</html>
