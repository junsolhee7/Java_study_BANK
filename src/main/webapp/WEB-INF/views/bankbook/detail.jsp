<%@page import="com.iu.start.bankBook.BankBookDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%-- <%
//요청이 발생되면 생성, 응답이 나가면 소멸 : RequestScope : Request 영역
BankBookDTO bankBookDTO = (BankBookDTO)request.getAttribute("dto");
%> --%>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Detail Page</h1>
	<a href="../">index</a>
	<!-- 상대경로 -->
	<a href="../member/login.iu">Login</a>
	<!-- 절대경로 -->
	<a href="/member/join.iu">Join</a>
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
				<td>${dto.bookSale}
						<!-- 판매중
						판매금지 -->
				</td>
			</tr>
		</tbody>
	</table>
		<a href="./list.iu">리스트 보기</a>
		<a href="./update.iu?bookNum=${dto.bookNum}">수정</a>
		<a href="./delete.iu?bookNum=${dto.bookNum}">삭제</a>
		
		<c:if test="${not empty sessionScope.member}">
		<a href="../bankAccount/add.iu?bookNum=${dto.bookNum}">가입하기</a>
		</c:if>
</body>
</html>