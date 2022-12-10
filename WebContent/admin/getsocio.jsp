<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="Stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/custom.css">
</head>
<body>
   	
   	<div class="form-mod-socio" action="/controller?operation=buscar">
	   	<form action="">
	   	<fieldset>
	   	<legend><h1>Rellena los campos</h1></legend>
	   		<h2>Modificar Socio</h2>
	   		<div>
	   			<span>Inserta el nombre del socio: </span> <input type="text" name="nombre-socio">
	   		</div>
	   	
	   		<button type="submit">Buscar</button>
	   	</fieldset>
	   	</form>
</body>
</html>