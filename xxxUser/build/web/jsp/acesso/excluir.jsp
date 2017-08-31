<%-- 
    Document   : excluir
    Created on : 31/08/2017, 09:58:25
    Author     : demon
--%>

<%@page import="io.github.eldemonstro.bean.Usuario" %>
<%@page import="io.github.eldemonstro.controller.UsuarioController" %>

<%
    String cod = request.getParameter("COD");
    int id = Integer.parseInt(cod);
    
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
