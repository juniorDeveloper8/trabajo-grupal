<%-- 
    Document   : resgitro
    Created on : 02-nov-2022, 10:22:17
    Author     : rober
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <title>Registro</title>
    </head>
    <body>
        <h1 class="row justify-content-md-center"> Ingrese sus datos! </h1>

        <%--
        cuadro de cptura de datos y registro
        --%>
        <form>
            <div class="container">
                <div class="row justify-content-md-center">
                    <div class="form-floating mb-3">

                        <input type="names" class="form-control" id="floatingInput" placeholder="name">
                        <label for="floatingInput">NOMBRES</label>

                        <div class="form-floating">
                            <input type="srnames" class="form-control" id="floatingPassword" placeholder="surnames">
                            <label for="floatingPassword">APELLIDOS</label>
                            <div class="form-floating">
                                <input type="direction" class="form-control" id="floatingPassword" placeholder="direction">
                                <label for="floatingPassword">DIRECCION</label>
                            </div>
                            <div class="form-floating">
                                <input type="cell-phone" class="form-control" id="floatingPassword" placeholder="cell-phone">
                                <label for="floatingPassword">TELEFONICO</label>
                            </div>
                            <div class="form-floating">
                                <input type="emaila" class="form-control" id="floatingPassword" placeholder="name@example.com">
                                <label for="floatingPassword">CORREO</label>
                            </div>
                            <div class="form-floating">
                                <input type="password" class="form-control" id="floatingPassword" placeholder="Contraseña">
                                <label for="floatingPassword">PASSWORD</label>
                            </div>
                            <div class="form-floating">
                                <input type="Identificacion_clase" class="form-control" id="floatingPassword" placeholder="Contraseña">
                                <label for="floatingPassword">IDENTIFCACION DE CLASE</label>
                            </div>
                            <div class="form-floating">
                                <input type="PeriodoEscolar" class="form-control" id="floatingPassword" placeholder="Contraseña">
                                <label for="floatingPassword">Periodo Escolar</label>
                            </div>
                        </div>
                    </div>
                    <%--boton de registro--%>

                    <div action="validar.jsp" class="form-group">
                        <a href="#" class="btn btn-primary" style="background-color: #5DC1B9"/> Crear Cuenta</a>
                    </div>

                </div>
            </div>
        </form>
        <%
            String s_dni = request.getParameter("datos");
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/deber",
                    "root", "123456789");
            Statement st = con.createStatement();
            ResultSet rs;

            int datos = 0;
            int id = 0;

            String nombres = "";
            String apellidos = "";
            String direccion = "";
            String telefono = "";

            rs = st.executeQuery("SELECT , datos,(Nombres, ' ', Apellidos,' ', Direccion,' ', Telefono,) as Nombres,"
                    + "FROM datos "
                    + "WHERE nombres = Nombres "
                    + "WHERE apellidos = Apellidos "
                    + "WHERE telefono = Telefono "
                    + "WHERE direccion = Direccion ");
            if (rs.next()) {

                datos = rs.getInt("datos");

                nombres = rs.getString("Nombres");
                apellidos = rs.getString("Apellidos");
                telefono = rs.getString("Telefono");
                direccion = rs.getString("Direccion");
                session.setAttribute("s_dni", s_dni);
                response.sendRedirect("save_registro.jsp?datos" + datos + "&Nombres=" + nombres + "&apellidos=" + apellidos
                        + "&direccion=" + direccion + "&telefono=" + telefono);

            } else {
                response.sendRedirect("../../../inicio.jsp");
            }


        %>v 
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    </body>
</html>
