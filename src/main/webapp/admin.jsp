<html>
<head>
<link rel="stylesheet" href="css/bootstrap.min.css">
<script src="js/bootstrap.min.js"></script>
</head>
<body>
<script type="text/javascript">
function admin()
{
alert("Login successfully");
window.location.href = "adminSetUp.jsp";
}
</script>
<h1>Welcome to WaterCan Plant Services</h1>
<h2> Admin_Login </h2>
<h2>Login </h2>
Name:
<input type="text">
Password:
<input type="password" > <br>
<input type="button" value="Submit" class="btn btn-success"  onclick="admin()">
<input type="button" value="Cancel" class="btn btn-danger"  onclick="window.location.href = 'index.jsp';"><br>
</body>
</html>