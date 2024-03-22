/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.87
 * Generated at: 2024-03-21 01:10:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class test04_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>데이터 전송 비교</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<h2>데이터 전송비교</h2>\r\n");
      out.write("	<table>\r\n");
      out.write("		<caption><h3><strong style>GET/POST 비교</strong> 비교</h3></caption>\r\n");
      out.write("		<tbody>\r\n");
      out.write("			<th>GET</th> <th>POST</th>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td>\r\n");
      out.write("					<p>보안이 취약</p>\r\n");
      out.write("					<p>전송할수 있는 데이터는 최대 255Byte이다</p>\r\n");
      out.write("					<p>?name=? 형식으로 주소창에전달</p>\r\n");
      out.write("					<p>post 방식에 비해 처리속도는 빠른편</p>\r\n");
      out.write("					<p>서블릿에서는 doGet()을 이용합니다.</p>\r\n");
      out.write("					<p>주로 a태그를 활용</p>\r\n");
      out.write("				</td>\r\n");
      out.write("				<td>\r\n");
      out.write("					<p>get 방식에 비해 보안에 더 유리</p>\r\n");
      out.write("					<p>전송할수 있는 데이터의 양은 거의 무한</p>\r\n");
      out.write("					<p>get방식에 비해 처리속도는 느림</p>\r\n");
      out.write("					<p>서블릿 에서는 doPost()를 이용합니다.</p>\r\n");
      out.write("					<p>주로 폼 태그를 활용</p>\r\n");
      out.write("				</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("		</tbody>\r\n");
      out.write("		<hr>\r\n");
      out.write("		<h3>GET 방식 예</h3>\r\n");
      out.write("		<div>\r\n");
      out.write("			<a href=\"get.jsp?name=권 &age=25\"></a>\r\n");
      out.write("		</div>\r\n");
      out.write("		<hr>\r\n");
      out.write("		<h3>POST 방식의 예</h3>\r\n");
      out.write("		<div>\r\n");
      out.write("			<form action=\"post.jsp\" metod=\"post\">\r\n");
      out.write("				<table>\r\n");
      out.write("					<caption>설문조사</caption>\r\n");
      out.write("					<tbody>\r\n");
      out.write("						<tr>\r\n");
      out.write("							<th><label for=\"id\">아이디</label></th>\r\n");
      out.write("							<td><input type=\"text\" name=\"id\" id=\"id\" required ></td>\r\n");
      out.write("						</tr>\r\n");
      out.write("						<tr>\r\n");
      out.write("							<th><label for=\"birtg\">출생년도</label></th>\r\n");
      out.write("							<td><input type=\"number\" name=\"birth\" id=\"birth\"></td>\r\n");
      out.write("						</tr>\r\n");
      out.write("						<tr>\r\n");
      out.write("						  	<th><label for=\"name\">이름</label></th>\r\n");
      out.write("							<td><input type=\"text\" name=\"name\" id=\"name\" required></td>\r\n");
      out.write("						</tr>\r\n");
      out.write("						<tr>\r\n");
      out.write("							<th><label>좋아하는동물</label></th>\r\n");
      out.write("							<td>\r\n");
      out.write("								<input type=\"checkbox\" name=\"pet\" id=\"pet1\" value=\"dog\"checked>\r\n");
      out.write("								<label for=\"pet1\">강아지</label>\r\n");
      out.write("								<input type=\"checkbox\" name=\"pet\" id=\"pet2\"value=\"cat\" checked>\r\n");
      out.write("								<label for=\"pet2\">고양이</label>\r\n");
      out.write("								<input type=\"checkbox\" name=\"pet\" id=\"pet3\"value=\"cow\" checked>\r\n");
      out.write("								<label for=\"pet3\">송아지</label>\r\n");
      out.write("							</td>\r\n");
      out.write("						</tr>\r\n");
      out.write("						<tr>\r\n");
      out.write("							<td colspan=\"2\">\r\n");
      out.write("							<button type=\"submit\">전송</button>\r\n");
      out.write("							<button type=\"reset\">초기화</button>\r\n");
      out.write("						</tr>\r\n");
      out.write("					</tbody>\r\n");
      out.write("				</table>\r\n");
      out.write("			</form>\r\n");
      out.write("		</div>\r\n");
      out.write("	</table>\r\n");
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