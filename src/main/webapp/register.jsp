<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/bootstrap.min.css">
<script src="js/bootstrap.min.js"></script>
</head>
<body>
<script type="text/javascript">

function register()
{
alert("Registered successfully...!!! You can Login at anytime...!!!");
window.location.href = "login.jsp";
}
</script>
<h1>Welcome to Revature WaterCan Plant Services</h1>
<h2>Registration Details</h2>
<h2>Please Enter your Details</h2>
<form action="RegisterServlet">
<label>Name:</label>
<input type="text" name="name" id="name" placeholder="Enter name" required autofocus />
<br/>
<label>Mobile_Number:</label>
<input type="tel" name="mobile" id="phone_number" placeholder="Enter phone_number" required  />
<br/>
<label>Set Password:</label>
<input type="password" name="password" id="password" placeholder="Enter Password"  required />
<br/>
<input type="submit" value="Submit" class="btn btn-success" onclick = register()>
<input type="button" value="Cancel" class="btn btn-danger"  onclick="window.location.href = 'index.jsp';"><br>
</form></body>
</html>