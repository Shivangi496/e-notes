/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.62
 * Generated at: 2024-07-26 02:56:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.User.UserDetails;
import com.User.UserDetails;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/all_component/navbar.jsp", Long.valueOf(1721961333210L));
    _jspx_dependants.put("/all_component/footer.jsp", Long.valueOf(1721961303460L));
    _jspx_dependants.put("/all_component/allcss.jsp", Long.valueOf(1721962008145L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.User.UserDetails");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
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

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
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

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
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

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Login Page</title>\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\"\r\n");
      out.write("	integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\"\r\n");
      out.write("	crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\"\r\n");
      out.write("	integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\"\r\n");
      out.write("	crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js\"\r\n");
      out.write("	integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\"\r\n");
      out.write("	crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js\"\r\n");
      out.write("	integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\"\r\n");
      out.write("	crossorigin=\"anonymous\"></script>");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body style='margin:0;'>\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-dark bg-custom navbar-custom\">\r\n");
      out.write("	<a class=\"navbar-brand\" href=\"#\"><i class=\"fa fa-book\"\r\n");
      out.write("		aria-hidden=\"true\"></i> ENotes</a>\r\n");
      out.write("	<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\"\r\n");
      out.write("		data-target=\"#navbarSupportedContent\"\r\n");
      out.write("		aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\"\r\n");
      out.write("		aria-label=\"Toggle navigation\">\r\n");
      out.write("		<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("	</button>\r\n");
      out.write("\r\n");
      out.write("	<div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("		<ul class=\"navbar-nav mr-auto\">\r\n");
      out.write("			<li class=\"nav-item active\"><a class=\"nav-link\" href=\"home.jsp\"><i\r\n");
      out.write("					class=\"fa fa-home\" aria-hidden=\"true\"></i> Home <span\r\n");
      out.write("					class=\"sr-only\">(current)</span></a></li>\r\n");
      out.write("			<li class=\"nav-item\"><a class=\"nav-link\" href=\"addNotes.jsp\"><i\r\n");
      out.write("					class=\"fa fa-plus\" aria-hidden=\"true\"></i> Add Notes</a></li>\r\n");
      out.write("\r\n");
      out.write("			<li class=\"nav-item\"><a class=\"nav-link\" href=\"showNotes.jsp\"><i\r\n");
      out.write("					class=\"fa fa-address-book-o\" aria-hidden=\"true\"></i> Show Notes</a></li>\r\n");
      out.write("		</ul>\r\n");
      out.write("\r\n");
      out.write("		");
 
       UserDetails user = (UserDetails)session.getAttribute("userD");
       if(user!= null){
     
      out.write("\r\n");
      out.write("\r\n");
      out.write("		<a href=\"\" class=\"btn btn-light my-2 my-sm-0 mr-2\" data-toggle=\"modal\" data-target=\"#exampleModal\"\r\n");
      out.write("			type=\"submit\"><i class=\"fa fa-user\" aria-hidden=\"true\"></i> ");
      out.print(user.getName());
      out.write("</a>\r\n");
      out.write("		\r\n");
      out.write("		<a href=\"LogoutServlet\" class=\"btn btn-light my-2 my-sm-0 mr-2\"\r\n");
      out.write("			type=\"submit\"\"><i class=\"fa fa-user-plus\" aria-hidden=\"true\"></i>Logout</a>\r\n");
      out.write("\r\n");
      out.write("        <!-- Model -->\r\n");
      out.write("<div class=\"modal fade\" id=\"exampleModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("  <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("    <div class=\"modal-content\">\r\n");
      out.write("      <div class=\"modal-header\">\r\n");
      out.write("        <h5 class=\"modal-title\" id=\"exampleModalLabel\">Modal title</h5>\r\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\r\n");
      out.write("          <span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("        </button>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"modal-body\">\r\n");
      out.write("      \r\n");
      out.write("       <div class=\"container text-center\">\r\n");
      out.write("              <i class=\"fa fa-user fa-3x\"></i>\r\n");
      out.write("              <h5></h5>\r\n");
      out.write("              \r\n");
      out.write("              <table class=\"table\">\r\n");
      out.write("                 <tbody>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                      <th>User Id</th>\r\n");
      out.write("                      <td>");
      out.print( user.getId() );
      out.write("</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    \r\n");
      out.write("                    <tr>\r\n");
      out.write("                       <th>Full Name</th>\r\n");
      out.write("                       <td>");
      out.print(user.getName() );
      out.write("</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    \r\n");
      out.write("                    <tr>\r\n");
      out.write("                       <th>Email Id</th>\r\n");
      out.write("                       <td>");
      out.print(user.getEmail() );
      out.write("</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                 </tbody>\r\n");
      out.write("              </table>\r\n");
      out.write("              \r\n");
      out.write("              <div>\r\n");
      out.write("                 <button type=\"button\" class=\"btn btn-primary\"\r\n");
      out.write("                 data-dismiss=\"modal\">Close</button>\r\n");
      out.write("              \r\n");
      out.write("              </div>\r\n");
      out.write("       </div>\r\n");
      out.write("        \r\n");
      out.write("      </div>\r\n");
      out.write("      \r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("		");

			} else {

	     
      out.write("\r\n");
      out.write("\r\n");
      out.write("		<a href=\"login.jsp\" class=\"btn btn-light my-2 my-sm-0 mr-2\"\r\n");
      out.write("			type=\"submit\"><i class=\"fa fa-user\" aria-hidden=\"true\"></i>Login</a>\r\n");
      out.write("		\r\n");
      out.write("		<a href=\"register.jsp\" class=\"btn btn-light my-2 my-sm-0 mr-2\"\r\n");
      out.write("			type=\"submit\"><i class=\"fa fa-user-plus\" aria-hidden=\"true\"></i>Register</a>\r\n");
      out.write("         ");
 
         }
       
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("	\r\n");
      out.write("</nav>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<div class=\"container-fluid div-color\" style='z-index:2;'>\r\n");
      out.write("		<div class=\"row\">\r\n");
      out.write("			<div class=\"col-md-4 offset-md-4\">\r\n");
      out.write("				<div class=\"card mt-4\">\r\n");
      out.write("					<div class=\"card-header text-center text-white bg-custom\">\r\n");
      out.write("						<i class=\"fa fa-user-plus\" aria-hidden=\"true\"></i>\r\n");
      out.write("						<h4>Login Page</h4>\r\n");
      out.write("					</div>\r\n");
      out.write("					\r\n");
      out.write("					");
 
					   String invalidMsg= (String) session.getAttribute("login-failed");
					   if(invalidMsg!= null){
					
      out.write("\r\n");
      out.write("\r\n");
      out.write("					<div class=\"alert alert-danger\" role=\"alert\">");
      out.print(invalidMsg);
      out.write("</div>\r\n");
      out.write("					\r\n");
      out.write("					");

					 session.removeAttribute("login-failed");
					   }
					
      out.write("\r\n");
      out.write("					\r\n");
      out.write("	         		");

					 String withoutLogin=(String)session.getAttribute("Login-error");
					 if(withoutLogin!=null)
					 { 
      out.write("\r\n");
      out.write("					\r\n");
      out.write("					<div class=\"alert alert-danger\" role=\"alert\">");
      out.print(withoutLogin);
      out.write("</div>\r\n");
      out.write("					\r\n");
      out.write("					");

					session.removeAttribute("Login-error");
					 }
					
      out.write("\r\n");
      out.write("					\r\n");
      out.write("					");

					String lgMsg=(String)session.getAttribute("logoutMsg");
					if(lgMsg!=null)
					{
      out.write("\r\n");
      out.write("					\r\n");
      out.write("					<div class=\"alert alert-success\" role=\"alert\">");
      out.print(lgMsg);
      out.write("</div>\r\n");
      out.write("					\r\n");
      out.write("					");

					session.removeAttribute("logoutMsg");
					}
					
      out.write("\r\n");
      out.write("					\r\n");
      out.write("					<div class=\"card-body\">\r\n");
      out.write("						<form action=\"loginSevlet\" method=\"post\">\r\n");
      out.write("							<div class=\"form-group\">\r\n");
      out.write("								<label>Enter Email</label> <input type=\"email\"\r\n");
      out.write("									class=\"form-control\" id=\"exampleInputEmail1\"\r\n");
      out.write("									aria-describedby=\"emailHelp\" name=\"uemail\">\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"form-group\">\r\n");
      out.write("								<label for=\"exampleInputPassword1\">Enter Password</label> <input\r\n");
      out.write("									type=\"password\" class=\"form-control\" id=\"exampleInputPassword1\"\r\n");
      out.write("									name=\"upassword\">\r\n");
      out.write("							</div>\r\n");
      out.write("\r\n");
      out.write("							<button type=\"submit\"\r\n");
      out.write("								class=\"btn btn-primary badge-pill btn-block\">Login</button>\r\n");
      out.write("						</form>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"container-fluid bg-dark mt-0\">\r\n");
      out.write("<p class=\"text-center text-white\" style='padding:5px;'>Note: Any Errors occurs then contact with Munazza. Designed and developed by Munazza Nasir</p>\r\n");
      out.write("\r\n");
      out.write("<p class=\"text-center text-white\">All Right Reserved @Munazza-2023-24</p>\r\n");
      out.write("\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
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
