/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.0.13
 * Generated at: 2022-03-19 15:52:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class Faculty_005fupdate_005fprofile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"IMG/jamia.ico\" type=\"image/ico\"/>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"CSS/practice.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"bootstrap-3.3.6-dist/css/bootstrap.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"bootstrap-3.3.6-dist\\font-awesome-4.7.0\\css\\font-awesome.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"bootstrap-3.3.6-dist\\font-awesome-4.7.0\\css\\font-awesome-min.css\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"bootstrap-3.3.6-dist/js/jquery-2.2.3.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"bootstrap-3.3.6-dist/js/bootstrap.min.js\"></script>\r\n");
      out.write("<title>");
      out.print(session.getAttribute("user_name"));
      out.write("</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"background-color: #eaeaea;\">\r\n");
response.setHeader("Cache-Control","no-store");
response.setHeader("Pragma","no-cache");
response.setDateHeader ("Expires", 0); 

      out.write('\r');
      out.write('\n');

if((session.getAttribute("user_id"))!=null&&(session.getAttribute("pass_word")!=null))
{

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

    }
    else
    {
    
      out.write("\r\n");
      out.write("    ");
      if (true) {
        _jspx_page_context.forward("index.jsp");
        return;
      }
      out.write("\r\n");
      out.write("    ");

     }
    
      out.write("\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("            <div class=\"col-sm-2\">\r\n");
      out.write("                <a href=\"\"><center><img src=\"IMG/150px-Jamia_Millia_Islamia_Logo.svg.png\" style=\"height: 100px; width: 100px; margin-top: 20px;\"></center></a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-sm-8\">\r\n");
      out.write("                <center>\r\n");
      out.write("                <h1>JAMIA MILLIA ISLAMIA<br>\r\n");
      out.write("                <span style=\"font-size: 30px;\">(A Central University)</span><br>\r\n");
      out.write("                <span style=\"font-size: 20px;\">NAAC Accredited 'A' Grade</span></h1>\r\n");
      out.write("                </center>\r\n");
      out.write("            </div >\r\n");
      out.write("            <div class=\"col-sm-2\">\r\n");
      out.write("            </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\" list nav navbar\">\r\n");
      out.write("    <ul class=\" nav navbar-nav \">\r\n");
      out.write("            <li><a href=\"View_stu1.jsp\"><span class=\"glyphicon glyphicon-log-in\"></span>&nbsp;&nbsp;VIEW STUDENT</a></li>\r\n");
      out.write("            <li><a href=\"View_fty1.jsp\"><span class=\"glyphicon glyphicon-log-in\"></span>&nbsp;&nbsp;VIEW FACULTY</a></li>\r\n");
      out.write("            <li><a href=\"Faculty_update_profile.jsp\"><span class=\"glyphicon glyphicon-time\"></span>&nbsp;&nbsp;UPDATE PROFILE</a></li>\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("\r\n");
      out.write("    </ul>\r\n");
      out.write("    <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("        <li ><a href=\"FacultyProfile.jsp\"  style=\"background-color: #eaeaea ; border-radius: 20px;\" id=\"qwe\"><span class=\"glyphicon glyphicon-user\" style=\"font-size: 18px;\"></span>&nbsp;&nbsp;<span>");
      out.print(session.getAttribute("user_name"));
      out.write("</span></a></li>&nbsp; \r\n");
      out.write("        <a href=\"index.jsp\" style=\"padding: 10px; text-decoration: none; color: #ffffff;\" id=\"off\"><button class=\"btn btn-danger\" style=\"padding: 13px; border-radius: 20px;\"><span class=\"glyphicon glyphicon-off\" style=\"font-size: 18px; color: white;\"></span><span style=\"color: white; font-size:20px; padding: 5px;\">&nbsp;&nbsp;Sign Out</span></button></a>&nbsp; &nbsp;\r\n");
      out.write("    </ul>\r\n");
      out.write(" </div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
