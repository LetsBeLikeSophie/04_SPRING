/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.70
 * Generated at: 2021-10-26 06:44:45 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import a.b.c.com.board.vo.SpringBoardVO;
import java.util.List;

public final class springBoardSelectAll_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("a.b.c.com.board.vo.SpringBoardVO");
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
      out.write(" \r\n");
      out.write("     \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>게시판 목록</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("	.tt{\r\n");
      out.write("		text-align: center;\r\n");
      out.write("		font-weight: bold;\r\n");
      out.write("	}\r\n");
      out.write("</style> \r\n");
      out.write("<link rel=\"stylesheet\" href=\"/springHbe/common/datepiker/jquery-ui-1.12.1/jquery-ui.min.css\">\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-1.12.4.js\"></script>\r\n");
      out.write("<script src=\"/springHbe/common/datepiker/jquery-ui-1.12.1/jquery-ui.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("	$(document).ready(function(){			\r\n");
      out.write("		/*\r\n");
      out.write("			CSS 선택자 우선순위 점수\r\n");
      out.write("			직접기입  : styl='' : 1000 점 \r\n");
      out.write("			id : #sbnum : 100점\r\n");
      out.write("			class : .sbnum : 10점\r\n");
      out.write("			속성 : [name=\"sbnum\"] : 10점\r\n");
      out.write("		*/\r\n");
      out.write("		// sbnum\r\n");
      out.write("		$(document).on(\"click\", \"#sbnum\", function(){\r\n");
      out.write("			//alert(\"chkInSbnum >>> : \");		\r\n");
      out.write("			if($(this).prop('checked')){			 \r\n");
      out.write("				//$('input[type=\"checkbox\"][name=\"sbnum\"]').prop('checked',false);\r\n");
      out.write("				$('.sbnum').prop('checked',false);\r\n");
      out.write("				$(this).prop('checked',true);\r\n");
      out.write("			}\r\n");
      out.write("		});\r\n");
      out.write("			\r\n");
      out.write("		// 검색버튼\r\n");
      out.write("		//  U\r\n");
      out.write("		$(document).on(\"click\", \"#searchBtn\", function(){\r\n");
      out.write("			alert(\"searchBtn >>> : \");			\r\n");
      out.write("			$(\"#boardList\").attr({ \"method\":\"GET\"\r\n");
      out.write("				                  ,\"action\":\"boardSelectAll.h\"}).submit();\r\n");
      out.write("		});\r\n");
      out.write("		// datepicker : from ~ to 기간조회\r\n");
      out.write("		$(\"#startdate\").datepicker({		\r\n");
      out.write("			showOn: \"button\",    // 달력을 표시할 타이밍 (both: focus or button)\r\n");
      out.write("			buttonImage: \"/springHbe/img/cal_0.gif\", \r\n");
      out.write("			buttonImageOnly : true,            \r\n");
      out.write("			buttonText: \"날짜선택\",             \r\n");
      out.write("			dateFormat: \"yy-mm-dd\",             \r\n");
      out.write("			changeMonth: true,                  			\r\n");
      out.write("			onClose: function(selectedDate) {    \r\n");
      out.write("				$(\"#enddate\").datepicker(\"option\", \"minDate\", selectedDate);\r\n");
      out.write("			}                \r\n");
      out.write("		});		\r\n");
      out.write("		$(\"#enddate\").datepicker({\r\n");
      out.write("			showOn: \"button\", \r\n");
      out.write("			buttonImage: \"/springHbe/img/cal_0.gif\", \r\n");
      out.write("			buttonImageOnly : true,\r\n");
      out.write("			buttonText: \"날짜선택\",\r\n");
      out.write("			dateFormat: \"yy-mm-dd\",\r\n");
      out.write("			changeMonth: true,			\r\n");
      out.write("			onClose: function(selectedDate) {	\r\n");
      out.write("				$(\"#startdate\").datepicker(\"option\", \"maxDate\", selectedDate);\r\n");
      out.write("			}               \r\n");
      out.write("		});			\r\n");
      out.write("		\r\n");
      out.write("		//  I\r\n");
      out.write("		$(document).on(\"click\", \"#I\", function(){\r\n");
      out.write("			//alert(\"I >>> : \");\r\n");
      out.write("			location.href=\"springBoardForm.h\";\r\n");
      out.write("		});\r\n");
      out.write("		//  U\r\n");
      out.write("		$(document).on(\"click\", \"#U\", function(){\r\n");
      out.write("			// alert(\"U >>> : \");	\r\n");
      out.write("			if ($('.sbnum:checked').length == 0){\r\n");
      out.write("				alert(\"수정할 글번호 하나를 선택하세요!!\");\r\n");
      out.write("				return;\r\n");
      out.write("			}\r\n");
      out.write("			 $(\"#boardList\").attr({ \"method\":\"POST\"\r\n");
      out.write("				                   ,\"action\":\"boardSelect.h\"}).submit();\r\n");
      out.write("		});\r\n");
      out.write("		//  D\r\n");
      out.write("		$(document).on(\"click\", \"#D\", function(){\r\n");
      out.write("			//alert(\"D >>> : \");	\r\n");
      out.write("			if ($('.sbnum:checked').length == 0){\r\n");
      out.write("				alert(\"삭제할 글번호 하나를 선택하세요!!\");\r\n");
      out.write("				return;\r\n");
      out.write("			}\r\n");
      out.write("			$(\"#boardList\").attr({ \"method\":\"POST\"\r\n");
      out.write("				                  ,\"action\":\"boardSelect.h\"}).submit();\r\n");
      out.write("		});\r\n");
      out.write("	});\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
 request.setCharacterEncoding("EUC-KR");
      out.write(' ');
      out.write('\r');
      out.write('\n');


	Object obj = request.getAttribute("listAll");
	List<SpringBoardVO> list = (List)obj;
	
	int nCnt = list.size();
	System.out.println("nCnt >>> : " + nCnt);	

      out.write("\r\n");
      out.write("<form name=\"boardList\" id=\"boardList\">\r\n");
      out.write("<table border=\"1\" align=\"center\">\r\n");
      out.write("<thead>\r\n");
      out.write("<tr>\r\n");
      out.write("	<td colspan=\"10\" align=\"center\">\r\n");
      out.write("		<h2>게시판</h2>\r\n");
      out.write("	</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td  colspan=\"10\" align=\"left\">\r\n");
      out.write("<select id=\"keyfilter\" name=\"keyfilter\">\r\n");
      out.write("	<option value=\"key1\">제목</option>\r\n");
      out.write("	<option value=\"key2\">내용</option>\r\n");
      out.write("	<option value=\"key3\">제목+내용</option>\r\n");
      out.write("	<option value=\"key4\">작성자</option>\r\n");
      out.write("	<option value=\"key5\">글번호</option>\r\n");
      out.write("</select>\r\n");
      out.write("<input type=\"text\" id=\"keyword\" name=\"keyword\" placeholder=\"검색어 입력\"><br>\r\n");
      out.write("<input type=\"text\" id=\"startdate\" name=\"startdate\" size=\"12\" placeholder=\"시작일 \">\r\n");
      out.write("~ <input type=\"text\" id=\"enddate\" name=\"enddate\" size=\"12\" placeholder=\"종료일\">\r\n");
      out.write("<button type=\"button\" id=\"searchBtn\">검색</button>\r\n");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("	<td class=\"tt\">체크</td>\r\n");
      out.write("	<td class=\"tt\">글번호</td>\r\n");
      out.write("	<td class=\"tt\">제목</td>\r\n");
      out.write("	<td class=\"tt\">이름</td>		\r\n");
      out.write("	<td class=\"tt\">내용</td>\r\n");
      out.write("	<td class=\"tt\">최종작성일</td>\r\n");
      out.write("	<td class=\"tt\">사진</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</thead>\r\n");

for(int i=0; i<nCnt; i++){		
	SpringBoardVO bvo = list.get(i);	
	

      out.write("					\r\n");
      out.write("<tbody>\r\n");
      out.write("<tr>\r\n");
      out.write("	<td align=\"center\">\r\n");
      out.write("		<input type=\"checkbox\" name=\"sbnum\" id=\"sbnum\" class=\"sbnum\" value=");
      out.print( bvo.getSbnum() );
      out.write(" >\r\n");
      out.write("	</td>		\r\n");
      out.write("	<td class=\"tt\">");
      out.print( bvo.getSbnum() );
      out.write(" </td>\r\n");
      out.write("	<td class=\"tt\">");
      out.print( bvo.getSbsubject() );
      out.write(" </td>\r\n");
      out.write("	<td class=\"tt\">");
      out.print( bvo.getSbname() );
      out.write(" </td>\r\n");
      out.write("	<td class=\"tt\">");
      out.print( bvo.getSbcontent() );
      out.write(" </td>\r\n");
      out.write("	<td class=\"tt\">");
      out.print( bvo.getSbupdatedate() );
      out.write(" </td>\r\n");
      out.write("	<td class=\"tt\"><img src=\"/springHbe/imgupload/sm_");
      out.print( bvo.getSbfile() );
      out.write("\"> </td>	\r\n");
      out.write("</tr>	\r\n");

}//end of for

      out.write("						\r\n");
      out.write("<tr>\r\n");
      out.write("	<td colspan=\"7\" align=\"right\">		\r\n");
      out.write("		<input type=\"button\" value=\"글쓰기\" id='I'>	\r\n");
      out.write("		<input type=\"button\" value=\"글수정\" id='U'>\r\n");
      out.write("		<input type=\"button\" value=\"글삭제\" id='D'>							\r\n");
      out.write("	</td>\r\n");
      out.write("</tr>	\r\n");
      out.write("\r\n");
      out.write("</tbody>			\r\n");
      out.write("</table>\r\n");
      out.write("</form>	\r\n");
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
