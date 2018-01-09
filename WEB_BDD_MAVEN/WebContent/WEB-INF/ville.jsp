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
<script
	src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js"></script>

</head>

<body>
	<h1 class="text-center">Villes</h1>

	<div class="row">
		<div class="col-md-12">
			<table id="table" class="table table-striped display">
				<thead>
					<tr>
						<th>code INSEE</th>
						<th>Nom</th>
						<th>Libellé</th>
						<th>Code postal</th>
						<th>Ligne 5</th>
						<th>Latitude</th>
						<th>Longitude</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${listVilles}" var="ville">
						<tr>
							<td>${ville.code_commune_INSEE}</td>
							<td>${ville.nom_commune}</td>
							<td>${ville.libelle_acheminement}</td>
							<td>${ville.code_postal}</td>
							<td>${ville.ligne_5}</td>
							<td>${ville.coordonnees_gps.latitude}</td>
							<td>${ville.coordonnees_gps.longitude}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>

	<script src="js/bootstrap.min.js"></script>
	<script>
		$(document).ready(function() {
			$('#table').DataTable({});
		});
	</script>

</body>
</html>