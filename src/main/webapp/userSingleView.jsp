<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Single User Page!</title>
</head>
<body>

	<table>
			<tr>
				<td>ID :</td>
				<td>${id}</td>
			</tr>
			<tr>
				<td>UserName :</td>
				<td>${userName}</td>
			</tr>
			<tr>
				<td>Password :</td>
				<td>${password}</td>
			</tr>
			<tr>
				<td>E-mail :</td>
				<td>${eMail}</td>
			</tr>
			<tr>
				<td>Creation Date :</td>
				<td>${creationDate}</td>
			</tr>
			<tr>
				<td>Modification Date :</td>
				<td>${modificationDate}</td>
			</tr>
			<tr>
				<br><br>
			</tr>
	</table>	
	<br><br><br>  
  	<a href="index.html">Back to Homepage</a>

</body>
</html>