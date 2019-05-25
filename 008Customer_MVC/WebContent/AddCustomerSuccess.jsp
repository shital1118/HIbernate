<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AddCustomerSuccess</title>
</head>
<body>
	<h1>Customer Added Successfully</h1>
	
	<a href="AddCustomerPage.jsp">Add customer</a>
	
	<hr>
	<h3>
			Customer FirstName : ${customer.firstName }<br>
			Customer LastName : ${customer.lastName }<br>
			Customer Mobile No : ${customer.mobileNo }<br>
			Customer Email id : ${customer.email}<br>

	</h3>

</body>
</html>