<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
 <%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<html:form action="userAction">
		<table>
			<tr>
				<td>FirstName:</td>
				<td><html:text property="fname"></html:text></td>

			</tr>
			<tr>
				<td>LastName:</td>
				<td><html:text property="lname"></html:text></td>

			</tr>
			<tr>
				<td>Email:</td>
				<td><html:text property="email"></html:text></td>

			</tr>
			<tr>
				<td>Mobile:</td>
				<td><html:text property="mobile"></html:text></td>

			</tr>
			<tr>
				<td>
				<html:submit property="method">
						<bean:message key="button.search" />
					</html:submit></td>
				<td>
				<html:submit property="method">
						<bean:message key="button.update" />
					</html:submit></td>
			</tr>
		</table>
	</html:form>

</body>
</html>