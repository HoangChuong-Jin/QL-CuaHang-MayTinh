/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.46
 * Generated at: 2022-01-07 14:37:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/struts2-core-2.5.26.jar", Long.valueOf(1636937486642L));
    _jspx_dependants.put("jar:file:/D:/NAM%204/Xay%20Dung%20Dich%20Vu%20Mang/DOAN/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/MAYTINH/WEB-INF/lib/struts2-core-2.5.26.jar!/META-INF/struts-tags.tld", Long.valueOf(1606296240000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005factionmessage_005fnobody;

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
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005factionmessage_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fs_005factionmessage_005fnobody.release();
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("  	<title>Đăng nhập</title>\n");
      out.write("	<link href=\"https://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.min.css\" rel=\"stylesheet\"> \n");
      out.write("  	<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css\">\n");
      out.write("	<script src=\"https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js\" ></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\" ></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.min.js\" ></script>\n");
      out.write("	<style>\n");
      out.write("		body{\n");
      out.write("			background-color: #83b9f2;\n");
      out.write("		}\n");
      out.write("		.slidee {\n");
      out.write("			animation: slidee;\n");
      out.write("			-webkit-animation-name: slidee;\n");
      out.write("			animation-duration: 1.5s;\n");
      out.write("			-webkit-animation-duration: 1.5s;\n");
      out.write("			visibility: visible;\n");
      out.write("		}\n");
      out.write("\n");
      out.write("		@keyframes slidee {\n");
      out.write("			0% {\n");
      out.write("				opacity: 0;\n");
      out.write("				transform: translateY(70%);\n");
      out.write("			}\n");
      out.write("			100% {\n");
      out.write("				opacity: 1;\n");
      out.write("				transform: translateY(0%);\n");
      out.write("			}\n");
      out.write("		}\n");
      out.write("		@-webkit-keyframes slidee {\n");
      out.write("			0% {\n");
      out.write("				opacity: 0;\n");
      out.write("				transform: translateY(70%);\n");
      out.write("			}\n");
      out.write("			100% {\n");
      out.write("				opacity: 1;\n");
      out.write("				transform: translateY(0%);\n");
      out.write("			}\n");
      out.write("		}\n");
      out.write("	</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("		<nav class=\"navbar navbar-light bg-light sticky-top\">\n");
      out.write("			<div class=\"container\">\n");
      out.write("				<a class=\"navbar-brand\" href=\"#\">\n");
      out.write("					<strong>Logo</strong> &nbsp;\n");
      out.write("				</a>\n");
      out.write("			</div>\n");
      out.write("		</nav>\n");
      out.write("	<br>\n");
      out.write("	<div class=\"container\">\n");
      out.write("		<div class=\"row\">\n");
      out.write("			<div class=\"col-sm-3\">\n");
      out.write("			</div>\n");
      out.write("			<div class=\"col-sm-6 slidee\">\n");
      out.write("				<div class=\"card\">\n");
      out.write("					<h4 class=\"card-header\">ĐĂNG NHẬP</h4>\n");
      out.write("					<div class=\"card-body\">\n");
      out.write("					\n");
      out.write("					<form action=\"loginUser\" method=\"POST\">\n");
      out.write("						<div class=\"form-group\">\n");
      out.write("							<label for=\"Tên đăng nhập\" >Tên đăng nhập</label>\n");
      out.write("							\n");
      out.write("							<input type=\"text\" class=\"form-control\" id=\"email\" name=\"tendangnhap\" required>\n");
      out.write("							\n");
      out.write("						</div>\n");
      out.write("						<div class=\"form-group\">\n");
      out.write("							<label for=\"inputPassword3\">Mật khẩu</label>\n");
      out.write("							<input type=\"password\" class=\"form-control\" id=\"matkhau\" name=\"matkhau\" required>	\n");
      out.write("						</div>\n");
      out.write("						\n");
      out.write("						<div class=\"form-group row\">\n");
      out.write("							<div class=\"col-sm-6\">\n");
      out.write("								<label for=\"\">Bạn chưa có tài khoản?|\n");
      out.write("									<a href=\"DangKy\">Đăng ký</a> \n");
      out.write("								</label>\n");
      out.write("							</div>\n");
      out.write("							<div class=\"col-sm-6 \">\n");
      out.write("								<button type=\"submit\" class=\"btn btn-block btn-primary\">Đăng nhập</button>\n");
      out.write("							</div>\n");
      out.write("						</div>\n");
      out.write("						</form>\n");
      out.write("						\n");
      out.write("					</div>\n");
      out.write("				</div>\n");
      out.write("\n");
      out.write("			</div>\n");
      out.write("		</div>\n");
      out.write("	</div>\n");
      out.write("	 ");
      if (_jspx_meth_s_005fif_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("</body>\n");
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

  private boolean _jspx_meth_s_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f0 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    boolean _jspx_th_s_005fif_005f0_reused = false;
    try {
      _jspx_th_s_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_s_005fif_005f0.setParent(null);
      // /WEB-INF/login.jsp(94,2) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fif_005f0.setTest("hasActionMessages()");
      int _jspx_eval_s_005fif_005f0 = _jspx_th_s_005fif_005f0.doStartTag();
      if (_jspx_eval_s_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_s_005fif_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = org.apache.jasper.runtime.JspRuntimeLibrary.startBufferedBody(_jspx_page_context, _jspx_th_s_005fif_005f0);
        }
        do {
          out.write("\n");
          out.write("        <div class=\"welcome\">\n");
          out.write("            ");
          if (_jspx_meth_s_005factionmessage_005f0(_jspx_th_s_005fif_005f0, _jspx_page_context))
            return true;
          out.write(" \n");
          out.write("        </div>\n");
          out.write("    ");
          int evalDoAfterBody = _jspx_th_s_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_s_005fif_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_s_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f0);
      _jspx_th_s_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_s_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_s_005fif_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_s_005factionmessage_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:actionmessage
    org.apache.struts2.views.jsp.ui.ActionMessageTag _jspx_th_s_005factionmessage_005f0 = (org.apache.struts2.views.jsp.ui.ActionMessageTag) _005fjspx_005ftagPool_005fs_005factionmessage_005fnobody.get(org.apache.struts2.views.jsp.ui.ActionMessageTag.class);
    boolean _jspx_th_s_005factionmessage_005f0_reused = false;
    try {
      _jspx_th_s_005factionmessage_005f0.setPageContext(_jspx_page_context);
      _jspx_th_s_005factionmessage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f0);
      int _jspx_eval_s_005factionmessage_005f0 = _jspx_th_s_005factionmessage_005f0.doStartTag();
      if (_jspx_th_s_005factionmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fs_005factionmessage_005fnobody.reuse(_jspx_th_s_005factionmessage_005f0);
      _jspx_th_s_005factionmessage_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_s_005factionmessage_005f0, _jsp_getInstanceManager(), _jspx_th_s_005factionmessage_005f0_reused);
    }
    return false;
  }
}
