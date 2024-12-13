<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="<%= request.getContextPath() %>/FormDemo" method="post">
Full Name:<input type="text" name="fullname">
<br>
DOB:<select name="year">
<option value = "1995">1995</option>
<option value = "1996">1996</option>
<option value = "1997">1997</option>
<option value = "1998">1998</option>
<option value = "1999">1999</option>
<option value = "2000">2000</option>
</select>
<br>
Gender:<input type="radio" name="gender" value="Male">Male
<input type="radio" name="gender" value="Female">Female
<input type="radio" name="gender" value="Others">Others
<br>
Language:<input type="checkbox" name="language" value="Telugu">Telugu
<input type="checkbox" name="language" value="English">English
<input type="checkbox" name="language" value="Hindi">Hindi
<br>
<button type="submit" value="submit">Submit</button>
</form>
</body>
</html>