<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Handling Request</title>
</head>
<body>
FullName: <%= request.getParameter("fullname") %>
<br>
DOB: <%=request.getParameter("year") %>
<br>
Gender: <%=request.getParameter("gender") %>
<br>
Language: 
<% 
String[] data = request.getParameterValues("language");
for(String a:data)
{
	out.println("<br>");
	out.println(a);
}


%>
</body>
</html>