<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="io.github.eldemonstro.bean.Usuario" %>
<%@page import="io.github.eldemonstro.controller.UsuarioController" %>

<%
    String login = request.getParameter("LOGIN");
    String senha = request.getParameter("SENHA");
    Usuario usu = new Usuario("", login, senha, "", "");
    UsuarioController usuController = new UsuarioController();
    Usuario usuValidado = usuController.validaUsuario(usu);
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menu</title>
    </head>
    <body>
        Login = <%=usuValidado.getLogin()%> <br>
        Senha = <%=usuValidado.getSenha()%> <br>
        Tipo = <%=usuValidado.getTipo()%> <br>
        Status = <%=usuValidado.getStatus()%> <br>
        <a href="../usuario/inserir.jsp">Usuario</a>
    </body>
</html>