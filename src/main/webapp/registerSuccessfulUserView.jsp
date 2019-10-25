<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Spring MVC Form Handling</title>
</head>
<body>

	<h2>Registered User Information</h2>
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
	</table>
	<br><br>
    <a href="index.html">Back to Homepage</a>
	
</body>
</html>