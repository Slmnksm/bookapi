<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User List</title>
</head>
<body>
	<c:forEach items="${list}" var="user">
	    <table>
			<tr>
				<td>ID :</td>
				<td>${user.id}</td>
			</tr>
			<tr>
				<td>UserName :</td>
				<td>${user.userName}</td>
			</tr>
			<tr>
				<td>Password :</td>
				<td>${user.password}</td>
			</tr>
			<tr>
				<td>E-mail :</td>
				<td>${user.eMail}</td>
			</tr>
			<tr>
				<td>Creation Date :</td>
				<td>${user.creationDate}</td>
			</tr>
			<tr>
				<td>Modification Date :</td>
				<td>${user.modificationDate}</td>
			</tr>
			<tr>
				<br><br><br>
			</tr>
		</table>
		
	</c:forEach>
	<br><br><br><br>
		<a href="index.html">Back to Homepage</a>
</body>
</html>