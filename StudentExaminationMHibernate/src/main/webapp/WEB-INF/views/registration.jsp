<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib uri = "http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>

	<div align="center">
		<h1>Welcome to Student Examination Registration Page</h1>
		<form:form action="registration" method="post" modelAttribute="user">
			<table border=1>
				<tr>
					<td>Aadhaar Number</td>
					<td><form:input type="text" path="aadhaarNumber"
							style="width: 120px" /><font color="red"><form:errors
								path="aadhaarNumber" /></font></td>
				</tr>
				<tr>
					<td>Name</td>
					<td><form:input type="text" path="name" style="width: 120px" /><font
						color="red"><form:errors path="name" /></font></td>
				</tr>

				<tr>
					<td>Email</td>
					<td><form:input type="text" path="emailId"
							style="width: 120px" /><font color="red"><form:errors
								path="emailId" /></font></td>
				</tr>

				<tr>
					<td>Mobile Number</td>
					<td><form:input type="text" path="mobileNumber"
							style="width: 120px" /><font color="red"><form:errors
								path="mobileNumber" /></font></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><form:input type="password" path="password"
							style="width: 120px" /><font color="red"><form:errors
								path="password" /></font></td>
				</tr>
				<tr>
					<td>Confirm Password</td>
					<td><input type="password" name="confirmPassword"
						style="width: 120px" /><font color="red"><form:errors
								path="confirmPassword" /></font></td>
				</tr>
				<tr>
					<td>Role</td>
					<td><form:select path="roleId" id="roleId"
							style="width: 127px">
							<option value=1>User</option>
							<option value=2>Admin</option>
							<option value=3>Trainer</option>
						</form:select></td>
				</tr>
			</table>
			<input type="submit" value="Register">
		</form:form>
	</div>
</body>
</html>

