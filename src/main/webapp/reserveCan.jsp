<html>
<head>
<link rel="stylesheet" href="css/bootstrap.min.css">
<script src="js/bootstrap.min.js"></script>
</head>
<body>
<script type="text/javascript">
function canReserve()
{
alert("Your cans has been Reserved...!!! You can Order the Cans at any Time...!!!Thank You for Using Our Services...!!!");
window.location.href = "index.jsp";
}
</script>
<h1>Welcome to Revature WaterCan Plant Services</h1>
<form action="ReserveCanServlet">
<a href = "availability.jsp">Availability_Stock</a><br>
Enter No Of Cans to reserve:
<input type = "number" name = "reserveCans" id ="reserveCans">
<p>Are you sure you want to reserve this quantity of Cans :</p>
<input type = "button" value = "Yes" class="btn btn-success" onclick=canReserve()>
<input type = "button" value = "No" class="btn btn-danger" onclick="window.location.href = 'canSetUp.jsp';">
</form></body>
</html>