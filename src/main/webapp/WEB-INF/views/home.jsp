<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!
</h1>

<P>  The time on the server is ${serverTime}. </P>

<c:if test="${empty member}">
<a href="./member/join">Join</a>
<a href="./member/login">login</a>
</c:if>

<c:if test="${not empty member}">
<a href="#">Logout</a>
<a href="#">Mypage</a>
</c:if>

<a href="./member/search">Search</a>
<a href="./bankbook/list">리스트</a>
<!-- <a href="./bankbook/detail?booknum=2">Detail</a> -->
<a href="./bankbook/add">Add</a>

</body>
</html>
