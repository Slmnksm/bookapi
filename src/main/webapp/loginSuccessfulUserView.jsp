<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Spring MVC Form Handling</title>
</head>
<body>

	<h2>Submitted User Information</h2>
	<table>
		<tr>
			<td>UserName :</td>
			<td>${userName}</td>
		</tr>
		<tr>
			<td>Password :</td>
			<td>${password}</td>
		</tr>
	</table>
	<br><br>
    <a href="index.html">Back to Homepage</a>
</body>
</html>