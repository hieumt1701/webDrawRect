package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Circle;
import java.util.ArrayList;

public final class circle_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <body>\n");
      out.write("        ");

            ArrayList<Circle> circles = (ArrayList<Circle>) request.getAttribute("circles");
        
      out.write("\n");
      out.write("\n");
      out.write("        <canvas id=\"myCanvas\" width=\"500\" height=\"500\" style=\"border:1px solid #d3d3d3;\">\n");
      out.write("            Your browser does not support the HTML5 canvas tag.</canvas>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            var c = document.getElementById(\"myCanvas\");\n");
      out.write("            var ctx = c.getContext(\"2d\");\n");
      out.write("            ");
 for (Circle c : circles) {
            
      out.write("\n");
      out.write("            ctx.beginPath();\n");
      out.write("            ctx.arc(");
      out.print(c.getX());
      out.write(',');
      out.write(' ');
      out.print(c.getY());
      out.write(',');
      out.write(' ');
      out.print(c.getRadius());
      out.write(", 0, 2 * Math.PI);\n");
      out.write("            ctx.fillStyle = \"rgb(");
      out.print(c.getRed());
      out.write(',');
      out.print(c.getGreen());
      out.write(',');
      out.print(c.getBlue());
      out.write(")\";\n");
      out.write("            ctx.fill();\n");
      out.write("            ctx.stroke();\n");
      out.write("            ");
}
      out.write("\n");
      out.write("        </script> \n");
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
