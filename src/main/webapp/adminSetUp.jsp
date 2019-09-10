<html>
<head>
<link rel="stylesheet" href="css/bootstrap.min.css">
<script src="js/bootstrap.min.js"></script>
</head>
<body>
<script type="text/javascript">
function stock()
{
alert("Availability Stock has been Sucessfully added...!!!");
window.location.href = "index.jsp";
}
</script>
<h1>Welcome to WaterCan Plant Services</h1>
<a href = "availability.jsp">Availability_Stock</a><br>
Set Availability of WaterCans : 
<input type ="text" required><br>
<input type="button" value="Submit" class="btn btn-success" onclick=stock()>
<input type="button" value="Cancel" class="btn btn-danger" onclick="window.location.href = 'index.jsp';"><br>
</body>
</html>