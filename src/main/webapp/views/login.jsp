<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href = "webjars/bootstrap/4.5.3/css/bootstrap.min.css" rel="stylesheet">
<style>
.login-form{
   width:400px;
   height:200px;
   position:absolute;
   background-color:#5B5EA6;
   border-radius:20px;
   top: 50%;
   left: 50%;
   margin-right : -50%;
   transform: translate(-50%,-50%);
}
</style>
</head>
<body>
	<h1>Login page</h1>
	<h1>${errorMsg}</h1>
	<div class = "login-form">
	   <div class = "container-fluid">
	   <form action = "processform" method = "post">
	       <input 
	            type="text" 
	            name="userName" 
	            class="form-control mt-3" 
	            placeholder="User Name "
	        />
	            
	       <input 
	            type="password" 
	            name="password" 
	            class="form-control mt-3" 
	            placeholder="Password"
	        />
	       <button class="mt-3 btn btn-dark btn-block">Login</button>
	   </form>
	   </div>
	</div>
</body>
</html>