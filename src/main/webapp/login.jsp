<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/bootstrap.min.css">
<script src="js/bootstrap.min.js"></script>
<script src="js/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
function login()
{
	event.preventDefault();
	var phone_number = document.getElementById("phone_number").value;
	var password=document.getElementById("password").value;
	var formData = "phone_number=" +phone_number + "&password="+ password;
	var url = "http://localhost:8080/waterCanWebServices/LoginServlet?" +formData;
	$.get(url, function(response){
	    console.log(response);
	    var data=JSON.parse(response);
	    	if(data.errorMessage== null){
	    		alert("Login successfully");
	    		window.location.href= "canSetUp.jsp";
	    	}
	    else
	    	{
	    	alert("Invalid Crendentials...!!! Please enter Valid Details...!!!");
	     	window.location.href= "index.jsp";
	    	}
	       
	    });
}
</script>
</head>
<body>
<form onsubmit="login()">
<h1>Welcome to Revature WaterCan Plant Services</h1>
<h2>User Login </h2>
<label>Mobile Number:</label>
<input type="tel" name="phone_number" id="phone_number" placeholder="Enter phone_number" required  /><br>
<label>Password:</label>
<input type="password" name="password" id="password" placeholder="Enter Password"  required />
<br/>
<input type="submit"  value="Submit" class="btn btn-success"onclick=login()>
<input type="button"  value="Cancel" class="btn btn-danger" onclick="window.location.href = 'index.jsp';">
</form></body>
</html>