<%-- 
    Document   : inicio
    Created on : 02-nov-2022, 9:31:10
    Author     : rober
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <title>Login</title>

    </head>

    <body>
        <h1 class="row justify-content-md-center">Hello World!</h1>

        <div class="container">
            <div class="row justify-content-md-center" style=" background-color: #5DC1B9">
                <div class="card" style="width: 18rem;">
                    <img src="cat.png" class="card-img-top" alt="..." <%--imagen--%>>
                    <div class="card-body">

                        <%--USUARIO--%>

                        <form action="" metood="POST">
                            <div class="mb-3">
                                <label for="exampleInputEmail1" class="form-label">Email</label>
                                <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                                <%--<div id="emailHelp" class="form-text"></div>--%>
                            </div>
                            <div class="mb-3">
                                <label for="exampleInputPassword1" class="form-label">Password</label>
                                <input type="password" class="form-control" id="exampleInputPassword1">
                            </div>
                            <div class="mb-3 form-check">
                                <input type="checkbox" class="form-check-input" id="exampleCheck1">
                                <label class="form-check-label" for="exampleCheck1">check me out </label>
                            </div>
                            <%--boton login--%>
                            <button  class="btn btn-primary" style="background-color: #5DC1B9">Login</button>                            
                    </div>

                    </form>

                    <div class="container">
                        <%--<div class="row justify-content-md-center">--%>

                        <form action="registro.jsp" methood="POST">
                            <button  class="btn btn-primary" style="background-color: #5DC1B9">Register</button>
                        </form>

                    </div>
                </div>
            </div>

            <%
                String email = "Admind";
                String password = "Admin";

                session.setAttribute("correo", email );
                session.setAttribute("contra", password);

            %>         
            <%--varibles de secion--%>
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    </body>
</html>
