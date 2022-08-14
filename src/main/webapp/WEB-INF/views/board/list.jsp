<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Board List</h1>
	<a href="../">index</a>
	<hr>

	<table border="1">
		<thead>
			<tr>
				<th>글번호</th>
				<th>글제목</th>
				<th>작성자</th>
				<th>작성날짜</th>
				<th>조회수</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list}" var="dto">
				<tr>
					<td>${dto.writeNum}</td>
					<td><a href="./detail.gg?writeNum=${dto.writeNum}">${dto.writeTitle}</a></td>
					<td>${dto.writeUser}</td>
					<td>${dto.writeDate}</td>
					<td>${dto.hits}</td>
				</tr>			
			</c:forEach>
		</tbody>
	
	</table>


</body>
</html>