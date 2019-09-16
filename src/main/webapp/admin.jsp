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
}
</script>
<h1>Welcome to Revature WaterCan Plant Services</h1>
<h2> Admin_Login </h2>
<h2>Login </h2>
<form action="AdminServlet">
<label>Name:</label>
<input type="text" name="name" id="name" placeholder="Enter name" required autofocus />
<label>Password:</label>
<input type="text" name="password" id="password" placeholder="Enter password" required autofocus />
<br/>
<input type="submit" value="Submit" class="btn btn-success" onclick=admin()>
<input type="button" value="Cancel" class="btn btn-danger"  onclick="window.location.href = 'index.jsp';"><br>
</form></body>
</html>