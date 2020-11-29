<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
  table {
    border: 2px solid #444444;
    padding: 2px;
  }
  th, td {
  	padding: 2px;
    border: 2px solid #444444;
  }
</style>
</head>
<body>
<h1>자유게시판</h1>
<table id = "list" width="90%">
	<tr>
		<th>ID</th>
		<th>Category</th>
		<th>Title</th>
		<th>Writer</th>
		<th>Content</th>
		<th>Regdate</th>
		<th>Edit</th>
		<th>Delete</th>
	</tr>
	
	<c:forEach items="${list }" var="u">
		<tr>
			<td>${u.seq }</td>
			<td>${u.category }</td>
			<td>${u.title }</td>
			<td>${u.writer }</td>
			<td>${u.content }</td>
			<td>${u.regdate }</td>
			<td><a href="editform/${u.seq }">Edit</a></td>
			<td><a href="deleteok/${u.seq }">Delete</a></td>
		</tr>
	</c:forEach>
</table>

<br/><a href="add">Add New Post</a>
</body>
</html>