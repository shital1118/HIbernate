<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Add new Customer</h1>
	<a href="index.jsp">Home Page</a>
<!-- 	<form action="CustomerController" method="post"> -->
	<form action="CookieController" method="post">
	
		<input type="hidden"  name="customerId" placeholder="enter Customer Id"><br>
		<input type="text"  name="firstName" placeholder="enter firstname"><br>
		<input type="text"  name="lastName" placeholder="enter lasttname"><br>
		<input type="text"  name="mobileNo" placeholder="enter mobileNo"><br>
		<input type="text"  name="email" placeholder="enter email"><br>
		<input type="submit"  value="Add customer" >
	
	
	</form>

</body>
</html>