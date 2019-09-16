<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/bootstrap.min.css">
<script src="js/bootstrap.min.js"></script>
</head>
<body>
<script type="text/javascript">
function setStock()
{
alert("Availability Stock has been Sucessfully added...!!!");
window.location.href = "index.jsp";
}
</script>
<%
String errorMessage = request.getParameter("errorMessage");
if(errorMessage!=null){
    out.println("<font color='red'>" + errorMessage + "</font>");
}
%>
<form action="AdminSetUpServlet" >
<h1>Welcome to Revature WaterCan Plant Services</h1>
<a href = "availability.jsp">Availability_Stock</a><br>
Set Availability number of WaterCans : 
<input type="text" name="can" placeholder="Enter the cans" required autofocus  /> <br>
<input type="submit" value="Submit" class="btn btn-success" onclick = setStock() >
<input type="button" value="Cancel" class="btn btn-danger" onclick="window.location.href = 'index.jsp';"><br>
</form></body>
</html>