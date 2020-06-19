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
<form:form action="saveDigimon" method="post" modelAttribute="digimon">
			<table border="1" >
			<tr>
					<td>Name: </td>
					<td><form:input path="name" /></td>
					<td>Hp: </td>
					<td><form:input path="hp" /></td>
					<td>Atk: </td>
					<td><form:input path="atk" /></td>
					<td>Def: </td>
					<td><form:input path="def" /></td>
					<td>Res: </td>
					<td><form:input path="res" /></td>
					<td>Evolution: </td>
					<td><form:input path="evolution" /></td>
				</tr>
				</table>
					<td colspan="2"><input type="submit" value="Save"></td>
		</form:form>


</body>
</html>