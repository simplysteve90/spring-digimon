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
<h2>Edit Product</h2>
		<form:form action="saveDigimon" method="post" modelAttribute="digimon">
			<table border="1">
			
					
					<form:input type="hidden" path="id" />
				                           
						
				<tr>
					<td>Name: </td>
					<td><form:input path="name" /></td>
				</tr>
				<tr>
					<td>Hp: </td>
					<td><form:input path="hp" /></td>
				</tr>
				<tr>
					<td>Atk: </td>
					<td><form:input path="atk" /></td>
				</tr>
				<tr>
					<td>Def: </td>
					<td><form:input path="def" /></td>
				</tr>
				<tr>
					<td>Res: </td>
					<td><form:input path="res" /></td>
				</tr>
				<tr>
					<td>Evolution: </td>
					<td><form:input path="evolution" /></td>
				</tr>		
				<tr>
					<td colspan="2"><input type="submit" value="Edit Digimon"></td>
				</tr>						
			</table>
		</form:form>

</body>
</html>