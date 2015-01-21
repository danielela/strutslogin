<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<html:form action="loginAction" >

UserID: <html:text property="userId"></html:text>
<html:errors property="userId" />
<br>
Password:<html:password property="pwd"></html:password>
<html:errors property="pwd" />
<br>
Country:
<html:select property="country">
	<html:option value=""></html:option>
	<html:options property="countryList" />
</html:select>
<br>

<html:submit value="Login" ></html:submit>
</html:form>



</body>
</html>