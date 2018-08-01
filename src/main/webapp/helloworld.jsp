<%--
  Created by IntelliJ IDEA.
  User: wentaohuang
  Date: 27/7/18
  Time: 下午1:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Title</title>
</head>
<body>
    <h2><s:property value="messageStore.message"/></h2>
    <p>I've said hello <s:property value="helloCount"/> times</p>
</body>
</html>
