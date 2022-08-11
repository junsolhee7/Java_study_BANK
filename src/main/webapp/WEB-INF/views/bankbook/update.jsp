<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Update Page</h1>
	<a href="../">index</a>
	<hr>
	
	<table border="1">
		<thead>
			<tr>
				<th>Num</th>
				<th>Name</th>
				<th>Rate</th>
				<th>Sale</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>${requestScope.dto.getBookNum()}</td>
				<td>${requestScope.dto.bookName}</td>
				<td>${dto.bookRate}</td>
				<td>${dto.bookSale }
						<!-- 판매중
						판매금지 -->
				</td>
			</tr>
		</tbody>
	</table>
	
	<form action="/bankbook/update" method=post>
		<div>
			Num : <input type="hidden" name = "bookNum" readonly value=${dto.bookNum}>
		</div>
		<div>
			Name : <input type="text" name = "bookName" value=${dto.bookName}>
		</div>
		<div>
			Rate : <input type="text" name = "bookRate" value=${dto.bookRate}>
		</div>
		
		<input type="submit" value="수정">
		<button type="submit">수정</button>
	</form>
</body>
</html>