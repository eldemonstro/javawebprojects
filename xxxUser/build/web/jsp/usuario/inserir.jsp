<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inserir Usuario</title>
    </head>
    <body>
        <form name="InserirValidado" action="validaInserir.jsp" method="POST">
            Login: <input type="text" name="LOGIN" value=""> <br>
            Senha: <input type="password" name="SENHA" value=""> <br>
            Status: <input type="text" name="STATUS" value=""> <br>
            Tipo: <input type="text" name="TIPO" value=""> <br>
            <input type="submit" name="submit" value="Ok">
        </form>
    </body>
</html>
