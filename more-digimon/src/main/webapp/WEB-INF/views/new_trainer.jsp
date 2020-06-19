<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="saveTrainer" method="post" modelAttribute="trainer">
			<table border="1" >
			<tr>
					<td>Name: </td>
					<td><form:input path="name" /></td>
				</tr>
				</table>
					<td colspan="2"><input type="submit" value="Save"></td>
		</form:form>

</body>
</html>