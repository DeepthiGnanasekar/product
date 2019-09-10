<html>
<head>
<link rel="stylesheet" href="css/bootstrap.min.css">
<script src="js/bootstrap.min.js"></script>
</head>
<body>
<script type="text/javascript">
function canReserveOrderSetUp()
{
alert("Your reserved cans has been Ordered Sucessfully...!!!");
window.location.href = "canSetUp.jsp";
}
</script>
Enter No Of Cans to reserve:
<input type = "text">
<p>Are you sure you want to reserve this quantity of Cans :</p>
<input type = "button" value = "Yes" class="btn btn-success" onclick=canReserveOrderSetUp()>
<input type = "button" value = "No" class="btn btn-danger" onclick="window.location.href = 'canSetUp.jsp';">
</body></html>