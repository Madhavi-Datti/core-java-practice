<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String name = "Expression element";
out.println("This is scriptlet element");
%>
<br>
<%=
name
%>
<br>
<%! 
int a = 10;
int b = 20;
void add(JspWriter out) throws Exception {
	out.println("This is declaration element");
    out.println(a + b); 
}
%>
<%
add(out); // Call the add method inside a scriptlet
%>
<br>
</body>
</html>
