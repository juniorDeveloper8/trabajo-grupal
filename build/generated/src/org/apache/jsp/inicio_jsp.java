package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class inicio_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("        <title>Login</title>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <h1 class=\"row justify-content-md-center\">Hello World!</h1>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row justify-content-md-center\" style=\" background-color: #5DC1B9\">\n");
      out.write("                <div class=\"card\" style=\"width: 18rem;\">\n");
      out.write("                    <img src=\"cat.png\" class=\"card-img-top\" alt=\"...\" ");
      out.write(">\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("\n");
      out.write("                        ");
      out.write("\n");
      out.write("\n");
      out.write("                        <form action=\"\" metood=\"POST\">\n");
      out.write("                            <div class=\"mb-3\">\n");
      out.write("                                <label for=\"exampleInputEmail1\" class=\"form-label\">Email</label>\n");
      out.write("                                <input type=\"email\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\">\n");
      out.write("                                ");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"mb-3\">\n");
      out.write("                                <label for=\"exampleInputPassword1\" class=\"form-label\">Password</label>\n");
      out.write("                                <input type=\"password\" class=\"form-control\" id=\"exampleInputPassword1\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"mb-3 form-check\">\n");
      out.write("                                <input type=\"checkbox\" class=\"form-check-input\" id=\"exampleCheck1\">\n");
      out.write("                                <label class=\"form-check-label\" for=\"exampleCheck1\">check me out </label>\n");
      out.write("                            </div>\n");
      out.write("                            ");
      out.write("\n");
      out.write("                            <button  class=\"btn btn-primary\" style=\"background-color: #5DC1B9\">Login</button>                            \n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    </form>\n");
      out.write("\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        ");
      out.write("\n");
      out.write("\n");
      out.write("                        <form action=\"registro.jsp\" methood=\"POST\">\n");
      out.write("                            <button  class=\"btn btn-primary\" style=\"background-color: #5DC1B9\">Register</button>\n");
      out.write("                        </form>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            ");

                String email = "Admind";
                String password = "Admin";

                session.setAttribute("correo", email );
                session.setAttribute("contra", password);

            
      out.write("         \n");
      out.write("            ");
      out.write("\n");
      out.write("            <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>\n");
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
