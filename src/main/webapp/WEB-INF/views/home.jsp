<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language= "java" contentType ="text/html; charset=EUC-KR" pageEncoding ="EUC-KR"%>
<%@ page session="false" %>
<html>
<head>
    <script src="<c:url value="/resources/test01.js" />"></script>
	<title>Home</title>
</head>
<body>
<h1 id="app">
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
</body>
</html>
