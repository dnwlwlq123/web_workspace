/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.85
 * Generated at: 2024-02-27 07:26:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class boardDeleteForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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
      out.write("    <style>\r\n");
      out.write("		#container {\r\n");
      out.write("			margin: auto;\r\n");
      out.write("			width: 1100px;\r\n");
      out.write("			height: 500px;\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		#container:after {\r\n");
      out.write("			content: '';\r\n");
      out.write("			display: block;\r\n");
      out.write("			clear: both;\r\n");
      out.write("			float: none;\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		#nav {\r\n");
      out.write("			margin-left: 10px;\r\n");
      out.write("			width: 25%;\r\n");
      out.write("			height: 100%;\r\n");
      out.write("			float: left;\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		#section {\r\n");
      out.write("			width: 70%;\r\n");
      out.write("			height: 100%;\r\n");
      out.write("			float: left;\r\n");
      out.write("		}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<div id=\"header\" style=\"text-align: center;\">\r\n");
      out.write("	<h1>\r\n");
      out.write("		<a href=\"/projectMVC/index.jsp\">\r\n");
      out.write("			<img alt=\"사과\" src=\"/projectMVC/image/apple.png\" width=\"50\" height=\"50\"></a>\r\n");
      out.write("		MVC를 활용한 미니 프로젝트\r\n");
      out.write("	</h1>\r\n");
      out.write("</div>\r\n");
      out.write("<hr style=\"border-color: yellowgreen;\">\r\n");
      out.write("<div id=\"container\">\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../main/boardMenu.jsp", out, false);
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	<form id=\"boardDeleteForm\">\r\n");
      out.write("	<div id=\"section\">\r\n");
      out.write("		<input type=\"hidden\" name=\"seq\" id=\"seq\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${seq }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("		<input type=\"hidden\" name =\"pg\" id=\"pg\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pg }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("		<input type=\"hidden\" id=\"memId\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${memId }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"/>\r\n");
      out.write("		<table border=\"1\" cellpadding=\"7\" frame=\"hsides\" rules=\"rows\">\r\n");
      out.write("			<tr>\r\n");
      out.write("				<th height=\"100\" colspan=\"3\">\r\n");
      out.write("					<h3><span id=\"subjectSpan\"></span></h3>\r\n");
      out.write("				</th>\r\n");
      out.write("			</tr>\r\n");
      out.write("			\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td align=\"center\" width=\"200\">글번호 : <span id=\"seqSpan\"></span></td>\r\n");
      out.write("				<td align=\"center\" width=\"200\">작성자 : <span id=\"idSpan\"></span></td>\r\n");
      out.write("				<td align=\"center\" width=\"200\">조회수 : <span id=\"hitSpan\"></span></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td height=\"300\" valign=\"top\" colspan=\"3\"><span id=\"contentSpan\"></span></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("		</table>\r\n");
      out.write("		<br>\r\n");
      out.write("		<div style=\"margin-top: 5px;\">\r\n");
      out.write("		<input type=\"button\" value=\"목록\" \r\n");
      out.write("			   onclick=\"location.href='/projectMVC/board/boardList.do?pg=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("'\">\r\n");
      out.write("		<span id=\"boardViewSpan\">\r\n");
      out.write("			<input type=\"button\" value=\"글수정\" id=\"boardUpdateFormBtn\">\r\n");
      out.write("			<input type=\"button\" value=\"글삭제\" id=\"boardDeleteFormBtn\">\r\n");
      out.write("		</span>\r\n");
      out.write("			<input type=\"button\" value=\"답글\" id=\"boardReplyFormBtn\">\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	</form>\r\n");
      out.write("</div>\r\n");
      out.write("<script src=\"http://code.jQuery.com/jquery-3.7.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$('#boardDeleteFormBtn').click(function(){\r\n");
      out.write("		$.ajax({\r\n");
      out.write("			type: 'post',\r\n");
      out.write("			url: '/projectMVC/board/boardDelete.do',\r\n");
      out.write("			data: $('#boardDeleteForm').serialize(), //pseq pg subject content\r\n");
      out.write("			dataType: 'text',\r\n");
      out.write("			success: function(data){\r\n");
      out.write("				//alert(data.trim());\r\n");
      out.write("				\r\n");
      out.write("				if(data.trim() == 'ok'){\r\n");
      out.write("					alert(\"작성하신 글이삭제되었습니다.\");\r\n");
      out.write("					location.href = \"/projectMVC/board/boardList.do?pg=1\";\r\n");
      out.write("				}else{\r\n");
      out.write("					alert(\"안됐어\")\r\n");
      out.write("				}\r\n");
      out.write("			},\r\n");
      out.write("			error: function(e){\r\n");
      out.write("				console.log(e);\r\n");
      out.write("			}\r\n");
      out.write("		});\r\n");
      out.write("});\r\n");
      out.write("</script>");
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
