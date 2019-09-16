<html>
<head>
<link rel="stylesheet" href="css/bootstrap.min.css">
<script src="js/bootstrap.min.js"></script>
</head>
<body>
<script type="text/javascript">
function canOrder()
{
alert("Your Order has been Sucessfully Placed...!!!");
window.location.href = "index.jsp";
}
</script>
<h1>Welcome to Revature WaterCan Plant Services</h1>
<form action="OrderCanServlet">
<a href = "availability.jsp">Availability_Stock</a><br>
Enter No Of Cans to Order:
<input type = "number" name = "orderCans" id ="orderCans">
<p>Are you sure you want to order this quantity of Cans :</p>
<input type = "submit" value = "Yes" class="btn btn-success" onclick=canOrder()>
<input type = "button" value = "No" class="btn btn-danger" onclick="window.location.href = 'canSetUp.jsp';">
</form></body>
</html>