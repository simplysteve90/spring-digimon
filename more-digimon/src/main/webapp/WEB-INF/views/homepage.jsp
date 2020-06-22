<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div style="width: 50%; float: left;">
		<h3>
			<a href="newTrainer">New Trainer</a>
		</h3>
		<p>Trainer List</p>
		<table border="1">

			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Action</th>
			</tr>
			<c:forEach items="${trainerList}" var="trainer">
				<tr>
					<td>${trainer.id}</td>
					<td>${trainer.name}</td>
					<td><a href="editTrainer?id=${trainer.id}">Edit</a>
						&nbsp;&nbsp;&nbsp; <a href="deleteTrainer?id=${trainer.id}">Delete</a>
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>
	<div style="width: 50%; float: right;">
		<h3>
			<a href="newDigimon">New Digimon</a>
		</h3>
		<p>Digimon List</p>
		<table border="1">

			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Hp</th>
				<th>Atk</th>
				<th>Def</th>
				<th>Res</th>
				<th>Evolution</th>
				<th>Action</th>
			</tr>
			<c:forEach items="${digimonList}" var="digimon">
				<tr>
					<td>${digimon.id}</td>
					<td>${digimon.name}</td>
					<td>${digimon.hp}</td>
					<td>${digimon.atk}</td>
					<td>${digimon.def}</td>
					<td>${digimon.res}</td>
					<td>${digimon.evolution}</td>

					<td><a href="editDigimon?id=${digimon.id}">Edit</a>
						&nbsp;&nbsp;&nbsp; <a href="deleteDigimon?id=${digimon.id}">Delete</a>
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>

</body>
</html>