<html>
<head>
<link rel="stylesheet" href="css/bootstrap.min.css">
<script src="js/bootstrap.min.js"></script>
</head>
<body>
<script type="text/javascript">
function canReserveOrder()
{
alert("Your reserved cans has been Ordered Sucessfully...!!!");
window.location.href = "canSetUp.jsp";
}
</script>
<p>Do you want to order your reserved Cans :</p>
<input type = "button" value = "Yes" class="btn btn-success" onclick=canReserve()>
<input type = "button" value = "No" class="btn btn-danger" onclick="window.location.href = 'canSetUp.jsp';">
<input type = "button" value = "Modify the reserve" class="btn btn-danger" onclick="window.location.href = 'reserveSetUp.jsp';">
</body>
</html>