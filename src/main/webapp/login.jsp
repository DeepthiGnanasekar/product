<html>
<head>
<link rel="stylesheet" href="css/bootstrap.min.css">
<script src="js/bootstrap.min.js"></script>
<script type="text/javascript">
function login()
{
alert("Login successfully");
}
</script>
</head>
<body>
<h1>Welcome to Revature WaterCan Plant Services</h1>
<h2>User Login </h2>
<form action="LoginServlet">
<label>Name:</label>
<input type="text" name="name" id="name" placeholder="Enter name" required autofocus />
<label>Password:</label>
<input type="text" name="password" id="password" placeholder="Enter password" required autofocus />
<br/>
<input type="submit"  value="Submit" class="btn btn-success" onclick= login()>
<input type="button"  value="Cancel" class="btn btn-danger" onclick="window.location.href = 'index.jsp';">
</form></body>
</html>