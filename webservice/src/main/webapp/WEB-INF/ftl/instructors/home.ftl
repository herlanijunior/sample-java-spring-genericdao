<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<#--
http://stackoverflow.com/questions/12894082/how-to-prevent-ie9-from-rendering-intranet-sites-in-compatibility-mode
 -->
<html>
	<meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1">

	<head>	  
		<#import "/spring.ftl" as springftl/>
		
		<script src="<@springftl.url '/js/home.js'/>" type="text/javascript"></script>
			
	</head>
	
	<body>
		<h2>Home Instructors</h2>
		
		
		<h5><a href="<@springftl.url '/view/home/'/>">Back</a></h5>
  	</body>
</html>

