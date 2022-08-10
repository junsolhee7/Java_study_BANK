<%@page import="java.util.ArrayList"%>
<%@page import="com.iu.start.bankMembers.BankMembersDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<% 
	ArrayList<BankMembersDTO> ar = (ArrayList<BankMembersDTO>)request.getAttribute("list");
%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Member List Page</h1>
	<a href="../">index</a>
	<hr>
	
	<table border="1">
		<thead>
			<tr>
				<th>userName</th>
				<th>passWord</th>
				<th>name</th>
				<th>email</th>
				<th>phone</th> 
			</tr>
		</thead>
		<tbody>
		<%for(BankMembersDTO bankMembersDTO : ar){ %>
			<tr>
				<td><%=bankMembersDTO.getUserName() %></td>
				<td><%=bankMembersDTO.getPassWord() %></td>
				<td><%=bankMembersDTO.getName() %></td>
				<td><%=bankMembersDTO.getEmail() %></td>
				<td><%=bankMembersDTO.getPhone() %></td>
			</tr>
		<%} %>
		</tbody>
		
	</table>
</body>
</html>