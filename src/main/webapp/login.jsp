<html>
<head>
<link rel="stylesheet" href="css/bootstrap.min.css">
<script src="js/bootstrap.min.js"></script>
</head>
<body>
<script type="text/javascript">
function login1()
{
alert("Login successfully");
window.location.href = "canSetUp.jsp";
}
</script>
<h1>Welcome to WaterCan Plant Services</h1>
<h2>User Login </h2>
<label>Name:</label>
<input type="text" name="name" id="name" placeholder="Enter name" required autofocus />
<label>Password:</label>
<input type="text" name="password" id="password" placeholder="Enter password" required autofocus />
<br/>
<input type="button"  value="Submit" class="btn btn-success"  onclick="login1()">
<input type="button"  value="Cancel" class="btn btn-danger" onclick="window.location.href = 'index.jsp';">
</body>
</html>