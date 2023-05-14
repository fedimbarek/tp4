<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>ddddd</p>
<jsp:useBean id="nomBean" class="beans.SimpleBean" scope="session"></jsp:useBean>
<p>On accede au compute  avec la methode getCompteur:<br>
c=<%=nomBean.getCompteur() %>
<hr>
on incremente <% nomBean.increment(); %>
<p>on peut :<br>
<jsp:getProperty property="compteur" name="nomBean"/>
</body>
</html>