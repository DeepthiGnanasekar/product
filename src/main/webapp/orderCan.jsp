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
window.location.href = "canSetUp.jsp";
}
</script>
<a href = "availability.jsp">Availability_Stock</a><br>
Enter No Of Cans to Order:
<input type = "text">
<p>Are you sure you want to order this quantity of Cans :</p>
<input type = "button" value = "Yes" class="btn btn-success" onclick=canOrder()>
<input type = "button" value = "No" class="btn btn-danger" onclick="window.location.href = 'canSetUp.jsp';">
</body>
</html>