/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.70
 * Generated at: 2021-10-27 00:57:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.paging;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import a.b.c.com.paging.BoardDAO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashMap;

public final class boardSelectList2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.Iterator");
    _jspx_imports_classes.add("a.b.c.com.paging.BoardDAO");
    _jspx_imports_classes.add("java.util.HashMap");
    _jspx_imports_classes.add("java.util.ArrayList");
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

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
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
      response.setContentType("text/html; charset=euc-kr");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title> SELECT LIST </title>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\">\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\r\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("	td {\r\n");
      out.write("		width: 300px;\r\n");
      out.write("		text-align: center;\r\n");
      out.write("	}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("\r\n");

	BoardDAO dao = null;
	dao = new BoardDAO();

      out.write("\r\n");
      out.write("\r\n");

	int pageSize = 10;
	int groupSize = 5;
	
	int curPage = 5;
	int totalCount = 0;
	
	if(request.getParameter("curPage") != null)
	{
		curPage = Integer.parseInt(request.getParameter("curPage"));
	}
System.out.println("pageSize >>>> : " + pageSize);
System.out.println("curPage >>>> : " + curPage);
	ArrayList al = dao.selectList(pageSize, curPage);
	
	if (al.size() == 0)
	{

      out.write("\r\n");
      out.write("<table border=\"1\">\r\n");
      out.write("	<tr>\r\n");
      out.write("		<td width=\"400\" align=\"center\">NO DATA</td>\r\n");
      out.write("	</tr>\r\n");
      out.write("</table>	\r\n");

	}
	else
	{
		Iterator iter = al.iterator();

      out.write("	\r\n");
      out.write("<!-- \r\n");
      out.write("https://www.w3schools.com/bootstrap4/bootstrap_tables.asp\r\n");
      out.write(" --> \r\n");
      out.write("<table class=\"table-sm table-striped table-hover table-dark\">	\r\n");
      out.write("	<tr>\r\n");
      out.write("		<td align=\"center\" colspan=\"13\">select된 행의 내용 : 부트스트랩 사용</td>\r\n");
      out.write("	</tr>\r\n");
      out.write("	<tr>\r\n");
      out.write("		<td>글번호</td>\r\n");
      out.write("		<td>제목</td>\r\n");
      out.write("		<td>작성자</td>\r\n");
      out.write("		<td>이메일</td>\r\n");
      out.write("		<td>글내용</td>\r\n");
      out.write("		<td>비밀번호</td>\r\n");
      out.write("		<td>REF</td>\r\n");
      out.write("		<td>STEP</td>\r\n");
      out.write("		<td>DEPTH</td>\r\n");
      out.write("		<td>작성일</td>\r\n");
      out.write("		<td>조회수</td>\r\n");
      out.write("		<td>페이지</td>\r\n");
      out.write("		<td>전체글수</td>\r\n");
      out.write("	</tr>\r\n");

		while(iter.hasNext()) 
		{
			HashMap hm = (HashMap)iter.next();
			totalCount = Integer.parseInt((String)hm.get("TOTALCOUNT"));

      out.write("\r\n");
      out.write("	<tr>\r\n");
      out.write("		<td align=\"center\"> ");
      out.print(hm.get("mnum"));
      out.write("</td>\r\n");
      out.write("		<td align=\"center\"> ");
      out.print(hm.get("mtitle"));
      out.write("</td>\r\n");
      out.write("		<td align=\"center\"> ");
      out.print(hm.get("mname"));
      out.write("</td>\r\n");
      out.write("		<td align=\"center\"> ");
      out.print(hm.get("memail"));
      out.write("</td>\r\n");
      out.write("		<td align=\"center\"> ");
      out.print(hm.get("marea"));
      out.write("</td>\r\n");
      out.write("		<td align=\"center\"> ");
      out.print(hm.get("mpass"));
      out.write("</td>\r\n");
      out.write("		<td align=\"center\"> ");
      out.print(hm.get("mref"));
      out.write("</td>\r\n");
      out.write("		<td align=\"center\"> ");
      out.print(hm.get("mstep"));
      out.write("</td>\r\n");
      out.write("		<td align=\"center\"> ");
      out.print(hm.get("mdepth"));
      out.write("</td>\r\n");
      out.write("		<td align=\"center\"> ");
      out.print(hm.get("mwriteday"));
      out.write("</td>\r\n");
      out.write("		<td align=\"center\"> ");
      out.print(hm.get("mhits"));
      out.write("</td>\r\n");
      out.write("		<td align=\"center\"> ");
      out.print(hm.get("PAGENO"));
      out.write("</td>\r\n");
      out.write("		<td align=\"center\"> ");
      out.print(hm.get("TOTALCOUNT"));
      out.write("</td>\r\n");
      out.write("	</tr>\r\n");

		}
	}

      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "paging.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("url", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("boardSelectList2.jsp", request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("str", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("", request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("pageSize", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(pageSize), request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("groupSize", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(groupSize), request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("curPage", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(curPage), request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("totalCount", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(totalCount), request.getCharacterEncoding()), out, true);
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<!--\r\n");
      out.write("se_BoardSelectList.jsp?searchString=111&searchtype=name&curPage=3\r\n");
      out.write("	str 파리미터에 넘길 값 : searchString=111&searchtype=name\r\n");
      out.write("-->");
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
