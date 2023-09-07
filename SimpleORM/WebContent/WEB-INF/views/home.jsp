<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.reshma.*,java.util.*" %>
	<%List<Employee> emp=(List<Employee>)request.getAttribute("emp"); %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<center>
		<h2>Employee List</h2>
	<table border=1 style='border-collapse:collapse'>

		<tr>
			<th>Emp no</th>
			<th>dept no</th>
			<th>Emp name</th>
			<th>job</th>
			<th>sal</th>
			<th></th>
			<th></th>
		</tr>
		<%for(Employee e:emp){ %>
		<form action="http://localhost:8080/SimpleORM/home">
		<tr>
			<td><%=e.getEmpno() %></td>
			<td><%=e.getDeptno() %></td>
			<td><%=e.getEname() %></td>
			<td><%=e.getJob() %></td>
			<td><%=e.getSal()  %></td>
			<td><button name="click" value="edit" onclick="edit()">edit</button></td>
			<td><button name="click" value="del" onclick="del()">del</button></td>
		</tr>
		</form>
		<%} %>
	</table><br><br>
	<td><button name="click" value="add" onclick="add()">add</button></td>
	<td><button name="click" value="save" onclick="save()">save</button></td><br>
	</center>

</body>
</html>