<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Edit Form</h1>
<form method = "post" action="editok">
<input type="hidden" name="seq" value="${u.seq }"/>
<table>
	<tr>
		<td>Category:</td>
		<td><input type="text" name="category" value="${u.category }"/></td>
	</tr>
	<tr>
		<td>Title:</td>
		<td><input type="text" name="title" value="${u.title }"/></td>
	</tr>
	<tr>
		<td>Writer:</td>
		<td><input type="text" name="writer" value="${u.writer }"/></td>
	</tr>
	<tr>
		<td>Content:</td>
		<td><textarea cols="50" rows="5" name="content">${u.content }</textarea></td>
	</tr>
	<tr>
		<td></td>
		<td><input type="submit" value="editok" /></td>
	</tr>
</table>
</form>
</body>
</html>