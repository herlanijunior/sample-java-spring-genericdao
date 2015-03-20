<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>

<head>
	<#import "/spring.ftl" as springftl/>
	<meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1">
	<title>Login Page</title>
<style>
.error {
	padding: 15px;
	margin-bottom: 20px;
	border: 1px solid transparent;
	border-radius: 4px;
	color: #a94442;
	background-color: #f2dede;
	border-color: #ebccd1;
}
 
.msg {
	padding: 15px;
	margin-bottom: 20px;
	border: 1px solid transparent;
	border-radius: 4px;
	color: #31708f;
	background-color: #d9edf7;
	border-color: #bce8f1;
}
 
#login-box {
	width: 300px;
	padding: 20px;
	margin: 100px auto;
	background: #fff;
	-webkit-border-radius: 2px;
	-moz-border-radius: 2px;
	border: 1px solid #000;
}
</style>
</head>
<body onload='document.loginForm.username.focus();'>
 
	<h1>Spring Security Custom Login Form (XML)</h1>
 
	<div id="login-box">
 
		<h3>Login with Username and Password</h3>
 
 		<#if error??>
			<div class="error">${error}</div>
		</#if>  

		<#if msg??>
			<div class="msg">${msg}</div>
 		</#if> 
 		
		<form name='loginForm'
		  action="<@springftl.url '/j_spring_security_check'/>" method='POST'>
 
		  <table>
			<tr>
				<td>User:</td>
				<td><input type='text' name='username' value=''></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type='password' name='password' /></td>
			</tr>
			<tr>
				<td colspan='2'><input name="submit" type="submit"
					value="submit" /></td>
			</tr>
		  </table>
		  <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
 
		</form>
	</div>
 
</body>
</html>