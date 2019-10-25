<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
    <head>
    </head>
    <body>
        <h3>Welcome, Enter The User Information for Register</h3>
        
        <form:form method="POST" action="/bookapi/registerUserPage" modelAttribute="userRegisterModel">
             
             <table>
                <tr>
                    <td><form:label path="userName">Username</form:label></td>
                    <td><form:input path="userName"/></td>
                </tr>
                <tr>
                    <td><form:label path="password">Password</form:label></td>
                    <td><form:input path="password"/></td>
                </tr>
                <tr>
                    <td><form:label path="eMail">E-mail</form:label></td>
                    <td><form:input path="eMail"/></td>
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