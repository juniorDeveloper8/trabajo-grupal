<%-- 
    Document   : validacion
    Created on : 08-nov-2022, 0:22:39
    Author     : rober
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%session.invalidate();%>
        <% HttpSession nsession = request.getSession(false);
            if (nsession != null) {
                String data = (String) session.getAttribute("correo");

                out.println(data);
            } else {
                out.println("Session is not active");
            }

        %>

        <%session.invalidate();%>
        <% HttpSession msession = request.getSession(false);
            if (msession != null) {

                String data = (String) session.getAttribute("contra");
                out.println(data);
            } else {
                out.println("Session is not active");
            }
        %>
        
        <!--String s_dni = request.getParameter("dni");
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_pension",
                "root", "");
        Statement st = con.createStatement();
        ResultSet rs;

        int idpersona = 0;
        int idpensionista = 0;
        String nombres = "";
        rs = st.executeQuery("SELECT p.idPERSONA, pe.idPENSIONISTA, CONCAT(p.Nombres, ' ', p.Apellidos) as Nombres,"
                + " p.dni FROM persona p, pensionista pe "
                + "WHERE p.idPERSONA = pe.idPERSONA "
                + "AND p.dni='" + s_dni + "' "
                + "AND DATE_FORMAT(pe.fecha_ingreso,'%Y%m') = DATE_FORMAT(sysdate(), '%Y%m') ");
        if (rs.next()) {

            idpersona = rs.getInt("idpersona");
            idpensionista = rs.getInt("idpensionista");
            nombres = rs.getString("Nombres");

            session.setAttribute("s_dni", s_dni);
            response.sendRedirect("save_desayuno.jsp?idpersona=" + idpersona + "&idpensionista=" + idpensionista + "&Nombres=" + nombres);

        } else {
            response.sendRedirect("../../../falla.jsp");
        }
        ////////////////////////////////////////////////////////////////////////////////////
        String correo = "";
            String passqord = "";
            String rolAcademico = "";
            String Einscripcion = "";
            
            rs = st.executeQuery("SELECT , crud,(correo, ' ', password,' ', rolAcademico,' ', Einscripcion) as Nombres,"
                    + "FROM datos "
                    + "WHERE p.idPERSONA = pe.idPERSONA "
                    + "AND DATE_FORMAT(pe.fecha_ingreso,'%Y%m') = DATE_FORMAT(sysdate(), '%Y%m') ");
            if (rs.next()) {

                datos_id = rs.getInt("datos");
                
                nombres = rs.getString("Nombres");

                session.setAttribute("s_dni", s_dni);
                response.sendRedirect("save_registro.jsp?idpersona=" + datos_id +"&Nombres=" + nombres + "&apellidos="+ apellidos 
                        + "direccion=" + direccion + "telefono=" + telefono);

            } else {
                response.sendRedirect("../../../falla.jsp");
            }

    %>
        -->
        


    </body>
</html>
