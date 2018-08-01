<%--
  Created by IntelliJ IDEA.
  User: wentaohuang
  Date: 27/7/18
  Time: 下午4:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Registration Successful</title>
</head>
<body>
    <h3>Thank <s:property value="personBean.firstName"/> Register</h3>
    <p>Your registration information: <s:property value="personBean"/></p>
    <p><a href="<s:url action="index"/>"></a></p>
</body>
</html>
