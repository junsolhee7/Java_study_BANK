<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>

<h1>Add page</h1>
<a href="../">index</a>
<hr>
<div>
	<form action="./add" method="post">
		<div class="container">
			<div>
				bookName : <input type="text" name="bookName"> <br>
			</div>
			<div>
				bookRate : <input type="text" name="bookRate"> <br>
			</div>
			<div>
				<input type="submit" value="Create">
				<button type="submit">Add</button> 
				<input type="reset" value="초기화">
			</div>
		</div>
	</form>
</div>
</body>
</html>