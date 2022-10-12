<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="seljdbc.User"%>
<%@page import="seljdbc.JdbcCRUD"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String name=request.getParameter("user");
User user=new User();
user.setUsername(name);
JdbcCRUD crud=new JdbcCRUD();
int i=crud.insert(user);
if(i>0){
	response.sendRedirect("success.jsp");
}
else{
	response.sendRedirect("fail.jsp");
}

%>
</body>
</html>