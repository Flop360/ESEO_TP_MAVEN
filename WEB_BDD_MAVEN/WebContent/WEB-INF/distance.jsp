<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="com.bean.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BDD Villes</title>
<script src="js/jquery-3.2.1.min.js"></script>

<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="css/bootstrap-grid.min.css" />
<link rel="stylesheet" type="text/css"
	href="css/bootstrap-reboot.min.css" />
<link rel="stylesheet"
	href="https://cdn.datatables.net/1.10.16/css/jquery.dataTables.min.css" />


<script defer src="js/fontawesome-all.js"></script>
<script src="https://code.jquery.com/ui/1.9.1/jquery-ui.js"
	integrity="sha256-BX2qlDN922gJsGwDJRhytK0MSxXflk+de/NR4ayQY8A="
	crossorigin="anonymous"></script>
<script
	src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js"></script>

</head>

<body>
	<h1 class="text-center">La distance entre les 2 villes est :
		${distance} Km/h</h1>
	<div class="row">
		<a href="GetVilles" class="btn btn-primary">Retour à l'accueil</a>
	</div>

</body>
</html>