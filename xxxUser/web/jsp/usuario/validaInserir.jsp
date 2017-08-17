<%-- 
    Document   : validaInserir
    Created on : 17/08/2017, 09:49:41
    Author     : demon
--%>

<%@page import="io.github.eldemonstro.controller.UsuarioController"%>
<%@page import="io.github.eldemonstro.bean.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    String login = request.getParameter("LOGIN");
    String senha = request.getParameter("SENHA");
    String status = request.getParameter("STATUS");
    String tipo = request.getParameter("TIPO");
    Usuario usu = new Usuario("", login, senha, status, tipo);
    UsuarioController usuController = new UsuarioController();
    Usuario usuValidado = usuController.validaUsuario(usu);
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Validar Usuario</title>
    </head>
    <body>
        Id = <%=usuValidado.getId()%> <br>
        Login = <%=usuValidado.getLogin()%> <br>
        Senha = <%=usuValidado.getSenha()%> <br>
        Tipo = <%=usuValidado.getTipo()%> <br>
        Status = <%=usuValidado.getStatus()%> <br>
        <a href="../usuario/inserir.jsp">Usuario</a>
    </body>
</html>
