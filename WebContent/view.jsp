<%@page import="com.sun.jndi.toolkit.url.Uri"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="/WEB-INF/mylib.tld" prefix="m" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<m:greet user="revan" />

		<p>username: ${userinfo.fname}</p>
		<p>Last name: ${userinfo.lname}</p>
		<p>Address : ${userinfo.address.area}</p>
		<p>Pincode: ${param.pincode}</p>
		<p>Email-id: ${initParam.adminemail}</p>
	<p>	${cookie.namecookie.value} </p>
	<p>Host :${header.host } </p>
	<p>Host :${header["user-agent"] } </p>
	
	Selected hobbies :${hobbylist["2"]}	<br/>
	Selected hobbies:
	<ul>
	<c:forEach var="h" items="${hobbylist}">
		<li>${h}</li>
	</c:forEach>
	</ul>
	</body>
	</html>
