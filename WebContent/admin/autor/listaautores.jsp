<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Listado de autores</title>
<!-- Required meta tags -->
<jsp:directive.include file="/WEB-INF/includes/head.jspf" />
</head>

<body>
	<header>
		<jsp:directive.include file="/WEB-INF/includes/nav.jspf" />
	</header>
	<main>
		<jsp:directive.include file="/WEB-INF/includes/autor/lista.jspf" />
	</main>
	<footer>
		<!-- place footer here -->
	</footer>
	<jsp:directive.include file="/WEB-INF/includes/bootstrapFooter.jspf" />
</body>
</html>
