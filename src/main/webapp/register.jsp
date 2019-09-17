<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/bootstrap.min.css"></link>
<script src="js/jquery-3.4.1.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script>
function register()
{
	event.preventDefault();
	var name = document.getElementById("name").value;
	var mobile=document.getElementById("mobile").value;
	var password=document.getElementById("password").value;
	var formData = "name=" +name + "&mobile="+ mobile +"&password="+ password;
    var url = "http://localhost:8080/waterCanWebServices/RegisterServlet?" + formData;
    console.log(url);
    $.get(url, function(response){
    console.log(response);
    var data=JSON.parse(response);
    //if(data==null) 
        if ( data.errorMessage != null){
        	alert(data.errorMessage);
    	alert("Invalid Crendentials...!!! Please enter Valid Details...!!!");
     	window.location.href= "register.jsp";
    	}
    else
        {
    	alert(data.message);
    	 alert("Registered successfully...!!! You can Login at anytime...!!!");    
     	window.location.href= "index.jsp";
        }

/*
            {
    	alert("error");
    	alert(data.errorMessage);
    }
    else if(response!=null)
    	{
    	alert(data.message);
        alert("Registered successfully...!!! You can Login at anytime...!!!");    
    	window.location.href= "index.jsp";
    	}*/
       
    });
}
</script>

</head>
<body>
<jsp:include page="header.jsp"></jsp:include><br>

<form onsubmit="register()">
<h1>Welcome to Revature WaterCan Plant Services</h1>
<h2>Registration Details</h2>
<h2>Please Enter your Details</h2>
<label>Name:</label>
<input type="text" name="name" id="name" placeholder="Enter name" required autofocus />
<br/>
<label>Mobile Number:</label>
<input type="tel" name="mobile" id="mobile" placeholder="Enter phone_number" required  />
<br/>
<label>Set Password:</label>
<input type="password" name="password" id="password" placeholder="Enter Password"  required />
<br/>
<input type="submit" value="Submit" class="btn btn-success" onclick="register()">
<input type="button" value="Cancel" class="btn btn-danger"  onclick="window.location.href = 'index.jsp';"><br>
</form>

</body>
</html>