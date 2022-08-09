<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>

<h1>Enroll Page</h1>
<hr>
<div>
	<form action="list" method="post">
		<div class="container">
			bookNum<input type="text" name="bookNum"> <br>
			bookName<input type="text" name="bookName"> <br>
			bookRate<input type="text" name="bookRate"> <br>
			bookSale<input type="text" name="bookSale"> <br>
			<input type="submit" value="등록">
			<input type="reset" value="초기화">
		</div>
	</form>
</div>
</body>
</html>