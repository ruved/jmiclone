/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.0.13
 * Generated at: 2022-03-14 00:40:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class aboutus_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<title>ABOUT US</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body style=\"background-color: #f1f1f1; font-size: 18px;\">\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("			<div class=\"col-sm-2\">\r\n");
      out.write("				<a href=\"\"><center><img src=\"IMG/150px-Jamia_Millia_Islamia_Logo.svg.png\" style=\"height: 100px; width: 100px; margin-top: 20px;\"></center></a>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"col-sm-8\">\r\n");
      out.write("				<center>\r\n");
      out.write("				<h1>JAMIA MILLIA ISLAMIA<br>\r\n");
      out.write("				<span style=\"font-size: 30px;\">(A Central University)</span><br>\r\n");
      out.write("				<span style=\"font-size: 20px;\">NAAC Accredited 'A' Grade</span></h1>\r\n");
      out.write("				</center>\r\n");
      out.write("			</div >\r\n");
      out.write("			<div class=\"col-sm-2\">\r\n");
      out.write("			</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("		<div class=\" list nav navbar\">\r\n");
      out.write("			<ul class=\" nav navbar-nav \">\r\n");
      out.write("				<li ><a href=\"index.jsp\"><span class=\"glyphicon glyphicon-home\" style=\"font-style: none; font-size: 19px; color:black;\"></span>&nbsp;Home</a></li>&nbsp;  &nbsp; \r\n");
      out.write("				<li><a href=\"aboutus.jsp\" ><span class=\"fa fa-bullhorn\" style=\"font-style: none; font-size: 19px;  color:black; color:black;\"></span>&nbsp;About us </a></li> &nbsp;  &nbsp;\r\n");
      out.write("				<li><a href=\"faculty.jsp\"><span class=\"fa fa-building-o\" style=\"font-style: none; font-size: 19px;  color:black;\"></span> &nbsp;Faculty</a></li>&nbsp; &nbsp;\r\n");
      out.write("				<li><a href=\"contact.jsp\" ><span class=\"glyphicon glyphicon-phone-alt\" style=\"font-style: none; font-size: 19px;  color:black;\"></span> &nbsp;Contact us </a></li> &nbsp; &nbsp;\r\n");
      out.write("			</ul>\r\n");
      out.write("	</div>\r\n");
      out.write("<div class=\"container-fluid\" id=\"listdown\">\r\n");
      out.write("	\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("	<h2 ><span style=\"font-weight: bolder;\" id=\"hty\">History--</span></h2></br>	\r\n");
      out.write("		\r\n");
      out.write("		<h3 id=\"hty\"><b>Introduction:-</b></h3>\r\n");
      out.write("					<div>\r\n");
      out.write("						Jamia Millia Islamia, an institution originally established at Aligarh in United Provinces, India in 1920 became a Central University by an act of the Indian Parliament in 1988. In Urdu language, Jamia means âUniversityâ, and Millia means âNationalâ.\r\n");
      out.write("						The story of its growth from a small institution in the pre-independence India to a central university located in New Delhiâoffering integrated education from nursery to research in specialized areasâis a saga of dedication, conviction and vision of a people who worked against all odds and saw it growing step by step. They âbuilt up the Jamia Millia stone by stone and sacrifice by sacrifice,â said Sarojini Naidu, the nightingale of India.\r\n");
      out.write("					</div></br></br>\r\n");
      out.write("		<h3 id=\"hty\"><b>Conception:-</b></h3>\r\n");
      out.write("				<div>\r\n");
      out.write("					Under the colonial British rule, two dominant trends joined hands and contributed towards in the birth of Jamia. One was the anti-colonial Islamic activism and the other was the pro-independence aspiration of the politically radical section of western educated Indian Muslim intelligentsia. In the political climate of 1920, the two trends gravitated together with Mahatma Gandhi as a catalyst. The anti-colonial activism signified by the Khilafat and the pro-independence aspirations symbolised by the non-cooperation movement of the Indian National Congress helped to harness creative energies and the subsequent making of Jamia Millia Islamia. Rabindranath Tagore called it âone of the most progressive educational institutions of Indiaâ.\r\n");
      out.write("					Responding to Gandhijiâs call to boycott all educational institutions supported or run by the colonial regime, a group of nationalist teachers and students quit Aligarh Muslim University, protesting against its pro-British inclinations. The prominent members of this movement were Maulana Mehmud Hasan, Maulana Mohamed Ali, Hakim Ajmal Khan, Dr. Mukhtar Ahmad Ansari, and Abdul Majid Khwaja.</div></br></br>\r\n");
      out.write("		<h3 id=\"hty\"><b>Foundation:-</b></h3>\r\n");
      out.write("				<div>\r\n");
      out.write("					The Foundation Committee met on 29 October 1920. It comprised of the following members:\r\n");
      out.write("					<ul>\r\n");
      out.write("						<li>Dr. Mukhtar Ahmad Ansari (Delhi)</li>\r\n");
      out.write("						<li>Mufti Kafayattullah (Delhi)</li>\r\n");
      out.write("						<li>Tasadduq Husain Khan (UP)</li>\r\n");
      out.write("					    <li>Maulana Abdul Bari Farang Mahali (UP)</li>\r\n");
      out.write("						<li>Maulana Sulaiman Nadvi (Bihar)</li>\r\n");
      out.write("						<li>Maulana Shabbir Ahmed Usmani (UP)</li>\r\n");
      out.write("						<li>Maulana Husain Ahmad Madni (UP)</li>\r\n");
      out.write("						<li>Chaudhury Khaleeq-uz-zaman (UP)</li>\r\n");
      out.write("						<li>Nawab Mohammad Ismail Khan</li>\r\n");
      out.write("					    <li>Dr. Mohammad Iqbal (Punjab)</li>\r\n");
      out.write("					    <li>Maulana Sanaullah Khan Amritsari (Punjab)</li>\r\n");
      out.write("					    <li>Dr. Saifuddin Kitchlew (Punjab)</li>\r\n");
      out.write("					   	 <li>Maulana Abul Kalam Azad (Bengal and Bihar)</li>\r\n");
      out.write("						   	 <li>Dr. Syed Mehmood (Bengal and Bihar)</li>\r\n");
      out.write("				   		 <li>Saith Abdullah Haroon Karachiwale (Sindh, Bombay and Hyderabad)</li>\r\n");
      out.write("					    <li>Abbas Tyabiji (Sindh, Bombay and Hyderabad)</li>\r\n");
      out.write("					   	 <li>Sait Miyan Mohammad Haji Jaam Chhotani (Sindh, Bombay and Hyderabad)</li>\r\n");
      out.write("				 	   <li>Maulavi Abdul Haq (Sindh, Bombay and Hyderabad</li>\r\n");
      out.write("					</ul>\r\n");
      out.write("					On 22 November 1920, Hakim Ajmal Khan was elected the first chancellor of Jamia. Mohamed Ali Jauhar became Jamiaâs first Vice Chancellor, as Allama Iqbal could not accept the offer made through Gandhiji. It also elected a syndicate and created a syllabus subcommittee.\r\n");
      out.write("					<div>The known freedom fighter and Muslim theologian, Maulana Mehmud Hasan, laid the foundation stone of Jamia Millia Islamia at Aligarh on Friday, 29 October 1920. Considering the difficult circumstances under which it started, the list of its first teachers is very impressive:</div>\r\n");
      out.write("					</div></br></br>\r\n");
      out.write("			<h3 id=\"hty\"> <b>Deemed to be University:-</b></h3>\r\n");
      out.write("				<div>In 1962, the University Grants Commission declared the Jamia a âdeemed to be Universityâ. Soon thereafter, the School of Social Work was established in 1967. In 1971, Jamia started the Zakir Husain Institute of Islamic Studies, to honour Dr. Zakir Husain, who had passed away in 1969. BE course in Civil Engineering commenced in 1978; in 1981, the faculties of Humanities and Languages, Natural Sciences, Social Science, and the State Resource Centre were founded. In 1983, it started the Mass Communication Research Centre and the Centre for Coaching and Career Planning. In 1985, it established the Faculty of Engineering & Technology and the University Computer Centre. Academic Staff College and the Academy of Third World Studies followed in 1987 and 1988.</div></br></br>\r\n");
      out.write("			<h3 id=\"hty\"><b>Central University:-</b></h3>\r\n");
      out.write("			<div>\r\n");
      out.write("				By a Special Act of the Parliament, Jamia Millia Islamia was made a central university of India in December 1988. In the list of the Faculties, i.e. Education, Humanities & Languages, Natural Sciences, Social Sciences. Engineering & Technology, one more Faculty - Faculty of Law, was added in 1989. Many new courses and programmes at UG and PG levels have since been added.\r\n");
      out.write("				Besides its Nine faculties, the Jamia has a number of centres of learning and research, like AJK-Mass Communication Research Centre (MCRC), Academy of International Studies etc. The Jamia is also marching ahead in the field of Information Technology (IT). It offers various undergraduate and postgraduate IT courses. Apart from this, the Jamia has a campus wide network which connects a large number of its departments and offices.\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"fotter\"> \r\n");
      out.write("		<p>&copy 2017&nbsp;Jamia Millia Islamia.&nbsp;All rights reserved<br>\r\n");
      out.write("		Site Designed & Developed by MNSR</p> \r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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