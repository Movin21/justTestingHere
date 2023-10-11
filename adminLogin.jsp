<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Administrator Login</title>
</head>
<body>
 <div class='adminLogin'>
        <center>
        <h1>Administrator Login</h1>
        <form action="adminLogin" method="post">
            <input type="text" Class="adminUsername" name="adminUsername" placeholder=" UserName"><br>
            <input type="text" Class="adminPassword" name="adminPassword" placeholder=" Password"><br>
            <button type="submit" name="adminLoginButton"Class="adminLoginButton">Log in</button>
         </center> 
        </form>
   
        <div><img class="logologin" src="eventimage"></div>
        
    </div>

</body>
</html>