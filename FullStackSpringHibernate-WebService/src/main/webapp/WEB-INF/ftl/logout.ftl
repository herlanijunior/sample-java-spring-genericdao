<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>

<head>
	<#import "/spring.ftl" as springftl/>
	<meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1">
	<title>Logout Page</title>
</head>
<body onload='document.logoutForm.submit();'>
 
		<form name='logoutForm'
		  action="<@springftl.url '/service/logout'/>" method='POST'>
		  <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
		</form>
	</div>
 
</body>
</html>