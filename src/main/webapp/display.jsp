<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to Display page</h1>
	
	<h2>Person Details</h2>
	<h4>Name : ${name}</h4>
	<h4>Age  : ${age}</h4>
	
	<hr>
	<h2>User Details</h2>
	<h4>Name : ${user}</h4>
	
	<hr>
	
	<h3>Name : <%=request.getAttribute("name") %></h3>
	<h3>Age  : <%=request.getAttribute("age") %></h3>
	
</body>
</html>