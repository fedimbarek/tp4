<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>information</h1>
<form action="clientservlet">
<div>
<table align="center">
<tr><td><label>nom</label></td>
<td><input type="text" name="nom"></td></tr>
<tr><td><label>prenom</label></td>
<td><input type="text" name="prenom"></td></tr>
<tr><td><label>adress</label></td>
<td><input type="text" name="adress"></td></tr>
<tr><td><label>tel</label></td>
<td><input type="text" name="tel"></td></tr>
<tr><td><label>email</label></td>
<td><input type="text" name="email"></td></tr></table>
<button type="submit">valider</button></div>
</form>
</body>
</html>