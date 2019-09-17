<!DOCTYPE>
<html>
<head>
<link rel="stylesheet" href="css/bootstrap.min.css">
<script src="js/bootstrap.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
function admin()
{
	var name = document.getElementById(name);
	var password = document.getElementById(password);
	var formData ="name=" +name + "&password="+ password;
	
alert("Login successfully");
}
</script>
</head>
<body>
<form onsubmit="admin()">
<h1>Welcome to Revature WaterCan Plant Services</h1>
<h2> Admin_Login </h2>
<h2>Login </h2>
<label>Name:</label>
<input type="text" name="name" id="name" placeholder="Enter name" required autofocus />
<label>Password:</label>
<input type="text" name="password" id="password" placeholder="Enter password" required autofocus />
<br/>
<input type="submit" value="Submit" class="btn btn-success" onclick=admin()>
<input type="button" value="Cancel" class="btn btn-danger"  onclick="window.location.href = 'index.jsp';"><br>
</form></body>
</html>