package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class registro_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n");
      out.write("        <title>Registro</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1 class=\"row justify-content-md-center\"> Ingrese sus datos! </h1>\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        <form>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row justify-content-md-center\">\n");
      out.write("                    <div class=\"form-floating mb-3\">\n");
      out.write("\n");
      out.write("                        <input type=\"names\" class=\"form-control\" id=\"floatingInput\" placeholder=\"name\">\n");
      out.write("                        <label for=\"floatingInput\">NOMBRES</label>\n");
      out.write("\n");
      out.write("                        <div class=\"form-floating\">\n");
      out.write("                            <input type=\"srnames\" class=\"form-control\" id=\"floatingPassword\" placeholder=\"surnames\">\n");
      out.write("                            <label for=\"floatingPassword\">APELLIDOS</label>\n");
      out.write("                            <div class=\"form-floating\">\n");
      out.write("                                <input type=\"direction\" class=\"form-control\" id=\"floatingPassword\" placeholder=\"direction\">\n");
      out.write("                                <label for=\"floatingPassword\">DIRECCION</label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-floating\">\n");
      out.write("                                <input type=\"cell-phone\" class=\"form-control\" id=\"floatingPassword\" placeholder=\"cell-phone\">\n");
      out.write("                                <label for=\"floatingPassword\">TELEFONICO</label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-floating\">\n");
      out.write("                                <input type=\"emaila\" class=\"form-control\" id=\"floatingPassword\" placeholder=\"name@example.com\">\n");
      out.write("                                <label for=\"floatingPassword\">CORREO</label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-floating\">\n");
      out.write("                                <input type=\"password\" class=\"form-control\" id=\"floatingPassword\" placeholder=\"Contraseña\">\n");
      out.write("                                <label for=\"floatingPassword\">PASSWORD</label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-floating\">\n");
      out.write("                                <input type=\"Identificacion_clase\" class=\"form-control\" id=\"floatingPassword\" placeholder=\"Contraseña\">\n");
      out.write("                                <label for=\"floatingPassword\">IDENTIFCACION DE CLASE</label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-floating\">\n");
      out.write("                                <input type=\"PeriodoEscolar\" class=\"form-control\" id=\"floatingPassword\" placeholder=\"Contraseña\">\n");
      out.write("                                <label for=\"floatingPassword\">Periodo Escolar</label>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    ");
      out.write("\n");
      out.write("\n");
      out.write("                    <div action=\"validar.jsp\" class=\"form-group\">\n");
      out.write("                        <a href=\"#\" class=\"btn btn-primary\" style=\"background-color: #5DC1B9\"/> Crear Cuenta</a>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("      </form>\n");
      out.write("       ");

            String s_dni = request.getParameter("datos");
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/deber",
                    "root", "123456789");
            Statement st = con.createStatement();
            ResultSet rs;

            int datos = 0;
            int id= 0;
           
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
                response.sendRedirect("save_registro.jsp?datos" + datos +"&Nombres=" + nombres + "&apellidos="+ apellidos 
                        + "&direccion=" + direccion + "&telefono=" + telefono);

            } else {
                response.sendRedirect("../../../inicio.jsp");
            }
            
            
            

        
      out.write("v \n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
