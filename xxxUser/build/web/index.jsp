<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>XXX USER - WOOHOO</title>
        <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
        <header>
            <nav class="navbar navbar-default">
                <div class="container">
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                            <span class="sr-only">Menu</span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                        <a class="navbar-brand" href="#">XXX USER</a>
                    </div>
                    <div id="navbar" class="collapse navbar-collapse">
                        <ul class="nav navbar-nav">
                            <li><a href="#">Inicio</a></li>
                            <li><a href="#sobre">Login</a></li>
                            <li><a href="#viagem">Registrar</a></li>
                            <li><a href="#relatos">Alterar</a></li>
                            <li><a href="#contato">Excluir</a></li>
                        </ul>
                    </div>
                </div>
            </nav>
        </header>

        <div class="container">
            <h1>XXX USER</h1>
            <p class="lead">BEM VINDO AO XXX USER, TODO MUNDO VAI MORRER</p>
            <p>Essa desgraça aqui faz a conexão com o banco de dados via jsp
            pra fazer um CRUD do caralho (mas que merda hein) e demora muito 
            pra resolver as parada, se tu quer interagir nesse projeto boa 
            sorte :v</p>
            <div class="center-block">
                <button class="btn btn-info col-md-3">Incluir</button>
                <button class="btn btn-default col-md-3">Consultar</button>
                <button class="btn btn-warning col-md-3">Alterar</button>
                <button class="btn btn-success col-md-3">Excluir</button>
            </div>
        </div>

        <script src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js">
        </script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js">
        </script>
    </body>

</html>


<%
    // response.sendRedirect("./jsp/acesso/login.jsp");  
%>
