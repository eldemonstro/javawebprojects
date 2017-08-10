<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form name="LoginSistema" action="menu.jsp" method="POST">
            Login: <input type="text" name="login" value=""> <br>
            Senha: <input type="password" name="password" value=""> <br>
            <input type="submit" name="submit" value="Ok">
        </form>
    </body>
</html>
