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
<h2>Edit Trainer</h2>
		<form:form action="saveTrainer" method="post" modelAttribute="trainer">
			<table border="1" >
			
					<form:input type="hidden" path="id" />
					
				<tr>
					<td>Name: </td>
					<td><form:input path="name" /></td>
				</tr>
				
				<tr>
					<td colspan="2"><input type="submit" value="Edit Trainer"></td>
				</tr>						
			</table>
		</form:form>

</body>
</html>