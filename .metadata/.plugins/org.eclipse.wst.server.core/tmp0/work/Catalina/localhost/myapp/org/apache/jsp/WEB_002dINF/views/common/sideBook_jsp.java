/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.60
 * Generated at: 2022-05-20 01:00:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sideBook_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1649033184895L));
    _jspx_dependants.put("jar:file:/D:/workspace-ddadaLast/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/ddada/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("jar:file:/D:/workspace-ddadaLast/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/ddada/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153352682000L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;

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
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
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

      out.write("\r\n");
      out.write("    \r\n");
      out.write("\r\n");

  request.setCharacterEncoding("UTF-8");

      out.write(' ');
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <!-- Required meta tags -->\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("    <title>사이드 바</title>\r\n");
      out.write("    <style>\r\n");
      out.write("    	.flex-column {\r\n");
      out.write("			text-align:left;\r\n");
      out.write("			margin-left:10px;\r\n");
      out.write("		}\r\n");
      out.write("		.category-icon{\r\n");
      out.write("			display:inline;\r\n");
      out.write("			vertical-align:middle;\r\n");
      out.write("			position:relative;\r\n");
      out.write("			top:-4px;\r\n");
      out.write("		}\r\n");
      out.write("		a.parent-category{\r\n");
      out.write("			font-size:23px;\r\n");
      out.write("			color: black;\r\n");
      out.write("			display:inline-block;\r\n");
      out.write("		}\r\n");
      out.write(" 		.category {\r\n");
      out.write("			font-size:23px;\r\n");
      out.write("			color: #6ca8d8;\r\n");
      out.write("			display:inline-block;\r\n");
      out.write("		}\r\n");
      out.write("		a.child-category{\r\n");
      out.write("			font-size:19px;\r\n");
      out.write("			color: rgb(192, 192, 192);\r\n");
      out.write("		/* 	display:inline-block; */\r\n");
      out.write("			display:block;\r\n");
      out.write("			position:relative;\r\n");
      out.write("			left:15px;\r\n");
      out.write("		}\r\n");
      out.write("		a.parent-category:hover {\r\n");
      out.write("		    color: #6ca8d8;\r\n");
      out.write("		    text-decoration: none;\r\n");
      out.write("		}\r\n");
      out.write(" 		.category:hover {\r\n");
      out.write("		    color: #6ca8d8;\r\n");
      out.write("		    text-decoration: none;\r\n");
      out.write("		}\r\n");
      out.write("		a.child-category:hover {\r\n");
      out.write("		    color: #6ca8d8;\r\n");
      out.write("		    text-decoration: none;\r\n");
      out.write("		}\r\n");
      out.write("		#category-home > a{\r\n");
      out.write("			font-size:23px;\r\n");
      out.write("			display:inline-block;\r\n");
      out.write("			color: #6ca8d8;\r\n");
      out.write("		}\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!-- 	<div class=\"row\" style=\"margin-top: 70px;\"> -->\r\n");
      out.write("\r\n");
      out.write("      <div class=\"col-3\" style=\"margin-left: 10px; max-width: 230px;\">   \r\n");
      out.write("        <div class=\"nav flex-column\" style=\"display:inline;\">\r\n");
      out.write("          <div class=\"parent-category\">\r\n");
      out.write("	          <img class=\"category-icon\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/Image/category_icon.png\" style=\"width:16px; height:16px; margin-right:5px;\">\r\n");
      out.write("	          <a class=\"parent-category\">강좌 Ddada</a>\r\n");
      out.write("          </div>\r\n");
      out.write("          \r\n");
      out.write("          <br>\r\n");
      out.write("          \r\n");
      out.write("          <div class=\"parent-category\">\r\n");
      out.write("	          <img class=\"category-icon\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/Image/category_icon.png\" style=\"width:16px; height:16px; margin-right:5px;\">\r\n");
      out.write("	          <a class=\"parent-category\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/board/certificateInfo.do\">자격증 Ddada</a>\r\n");
      out.write("          </div>\r\n");
      out.write("          <br>\r\n");
      out.write("          \r\n");
      out.write("          <div class=\"parent-category\">\r\n");
      out.write("	          <img class=\"category-icon\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/Image/category_icon.png\" style=\"width:16px; height:16px; margin-right:5px;\">\r\n");
      out.write("	          <a class=\"parent-category\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/board/takeClassList.do\">나의 Ddada</a>\r\n");
      out.write("          </div>\r\n");
      out.write("          \r\n");
      out.write("          <br>\r\n");
      out.write("          \r\n");
      out.write("          <div class=\"parent-category\">\r\n");
      out.write("	          <img class=\"category-icon\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/Image/category_icon.png\" style=\"width:16px; height:16px; margin-right:5px;\">\r\n");
      out.write("	          <a class=\"category\" id=\"#category-home\">도서 Ddada</a>\r\n");
      out.write("          </div>\r\n");
      out.write("          \r\n");
      out.write("          <br>\r\n");
      out.write("          \r\n");
      out.write("          <div class=\"parent-category\">\r\n");
      out.write("	          <img class=\"category-icon\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/Image/category_icon.png\" style=\"width:16px; height:16px; margin-right:5px;\">\r\n");
      out.write("	          <a class=\"parent-category\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/board/notice.do\">커뮤니티 Ddada</a>\r\n");
      out.write("          </div>\r\n");
      out.write("          \r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("	$('#category-home').css('color', '#6ca8d8');\r\n");
      out.write("	$('#category-home').parent().css('color', '#6ca8d8');\r\n");
      out.write("\r\n");
      out.write("$(function ()\r\n");
      out.write("{\r\n");
      out.write("    var url = window.location.pathname;\r\n");
      out.write("    \r\n");
      out.write("    console.log(url); // /myapp/board/takeClassList.do\r\n");
      out.write("    \r\n");
      out.write("    var urlRegExp = new RegExp(url.replace(/\\/$/, '') + \"$\");  \r\n");
      out.write("    $('.parent-category').each(function ()\r\n");
      out.write("    {\r\n");
      out.write("    	if (urlRegExp.test(this.href.replace(/\\/$/, '')))\r\n");
      out.write("    	{\r\n");
      out.write("    		$(this).parent().css('color', 'black');\r\n");
      out.write("        	$(this).css('color', 'black');\r\n");
      out.write("        }\r\n");
      out.write("     });\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
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

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    boolean _jspx_th_c_005fset_005f0_reused = false;
    try {
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent(null);
      // /WEB-INF/views/common/sideBook.jsp(9,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("contextPath");
      // /WEB-INF/views/common/sideBook.jsp(9,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/common/sideBook.jsp(9,0) '${pageContext.request.contextPath}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${pageContext.request.contextPath}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
      if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      _jspx_th_c_005fset_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fset_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fset_005f0_reused);
    }
    return false;
  }
}
