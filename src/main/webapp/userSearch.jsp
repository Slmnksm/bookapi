<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
   <body>
        <h3>Welcome, Enter The User Information for Search</h3>
        
        <form:form method="POST" action="/bookapi/searchUserPage" modelAttribute="userSearchModel">
             
             <table>
                <tr>
                    <td><form:label path="id">ID</form:label></td>
                    <td><form:input path="id"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
            </table>
            
        </form:form>
        <br><br>
        <a href="index.html">Back to Homepage</a>
    </body>
</html>