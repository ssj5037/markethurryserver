/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.56
 * Generated at: 2020-08-10 06:18:03 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class usertemplate_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/WEB-INF/views/inc/asset.jsp", Long.valueOf(1597039148558L));
    _jspx_dependants.put("jar:file:/D:/MHserver/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/mhserver/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/views/inc/header.jsp", Long.valueOf(1597039678509L));
    _jspx_dependants.put("/WEB-INF/views/inc/footer.jsp", Long.valueOf(1597039753501L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1597037562784L));
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/mh/css/bootstrap.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/mh/css/markethurry.css\">\r\n");
      out.write("<script src=\"/mh/js/jquery-1.12.4.js\"></script>\r\n");
      out.write("<script src=\"/mh/js/bootstrap.js\"></script>\r\n");
      out.write("<script src=\"/mh/js/Backstretch.js\"></script>");
      out.write("\r\n");
      out.write("<!-- hiding menu -->\r\n");
      out.write("<div id=\"menubartp\">\r\n");
      out.write("\t<a href=\"\" class=\"hyperlink\">전체 카테고리</a> <a href=\"\" class=\"hyperlink\">HOT\r\n");
      out.write("\t\t상품</a> <a href=\"\" class=\"hyperlink\">알뜰 상품</a> <a href=\"\" class=\"hyperlink\">나만의\r\n");
      out.write("\t\t레시피</a> <a href=\"\" class=\"hyperlink\">이달의 이벤트</a> <input type=\"text\"\r\n");
      out.write("\t\tid=\"searchbox\" value=\"검색내용을 입력해주세요.\"> <span\r\n");
      out.write("\t\tclass=\"glyphicon glyphicon-search\" id=\"searchimg\"></span> <a href=\"#\"\r\n");
      out.write("\t\tid=\"shoppingbox\"></a>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- user menu (register, login , as) -->\r\n");
      out.write("<div id=\"noticebar\">\r\n");
      out.write("\t<div id=\"noticeMent\">\r\n");
      out.write("\t\t<span class=\"eachNotice\">[마켓허리] \"허리라이프-어디든 간다! 마켓멀리! 신선하지 않은\r\n");
      out.write("\t\t\t신선MD의 신선한 장미를 찾아서\" 댓글이벤트 당첨 결과</span> <span class=\"eachNotice\">[마켓허리]\r\n");
      out.write("\t\t\t유튜브 ‘컬리라이프-일할 때도 쉴 때도 먹어야 한다, 극한직업 컬리 MD편’ 댓글 이벤트 당첨 공지</span> <span\r\n");
      out.write("\t\t\tclass=\"eachNotice\">[마켓허리] 코로나19 확진자 관련 현황 및 대응조치 안내</span> <span\r\n");
      out.write("\t\t\tclass=\"eachNotice\">[가격인상공지] [모어댄프레쉬] 맥돈 삼겹살 구이용 300g 외 23건\r\n");
      out.write("\t\t\t(2020 5. 20 ~)</span> <span class=\"eachNotice\">[마켓컬리] 개인정보처리방침 개정 내용\r\n");
      out.write("\t\t\t사전안내</span>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<header>\r\n");
      out.write("\t<div id=\"usermenu\">\r\n");
      out.write("\t\t<a href=\"register.html\" class=\"hyperlink\">회원가입</a> <a\r\n");
      out.write("\t\t\thref=\"login.html\" class=\"hyperlink\">로그인</a> <a\r\n");
      out.write("\t\t\thref=\"../../user/customerCenter.html\" class=\"hyperlink\">고객센터</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- 마켓허리 로고 -->\r\n");
      out.write("\t<img src=\"/mh/images/brandlogo.png\" alt=\"brandlogo\" id=\"brandlogo\">\r\n");
      out.write("</header>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- menu bar -->\r\n");
      out.write("<div id=\"menubar\">\r\n");
      out.write("\t<a href=\"\" class=\"hyperlink\">전체 카테고리</a> <a href=\"\" class=\"hyperlink\">HOT\r\n");
      out.write("\t\t상품</a> <a href=\"\" class=\"hyperlink\">알뜰 상품</a> <a href=\"\" class=\"hyperlink\">나만의\r\n");
      out.write("\t\t레시피</a> <a href=\"\" class=\"hyperlink\">이달의 이벤트</a> <input type=\"search\"\r\n");
      out.write("\t\tid=\"searchbox\" value=\"검색내용을 입력해주세요.\" autocomplete=\"off\"> <span\r\n");
      out.write("\t\tclass=\"glyphicon glyphicon-search\" id=\"searchimg\"></span> <a href=\"#\"\r\n");
      out.write("\t\tid=\"shoppingbox\"></a>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- detail menu -->\r\n");
      out.write("<!-- todo -->\r\n");
      out.write("<div id=\"detailmenu\">\r\n");
      out.write("\t<ul style=\"list-style: none;\">\r\n");
      out.write("\t\t<a href=\"\"><li>채소</li></a>\r\n");
      out.write("\t\t<a href=\"\"><li>과일</li></a>\r\n");
      out.write("\t\t<a href=\"\"><li>육류</li></a>\r\n");
      out.write("\t\t<a href=\"\"><li>수산</li></a>\r\n");
      out.write("\t\t<a href=\"\"><li>가공식품</li></a>\r\n");
      out.write("\t\t<a href=\"\"><li>양념, 소스</li></a>\r\n");
      out.write("\t\t<a href=\"\"><li>유제품</li></a>\r\n");
      out.write("\t\t<a href=\"\"><li>건강 식품</li></a>\r\n");
      out.write("\t\t<a href=\"\"><li>음료</li></a>\r\n");
      out.write("\t</ul>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<!-- footer -->\r\n");
      out.write("\r\n");
      out.write(" <!-- top button -->\r\n");
      out.write("    <a href=\"#\" id=\"topbtn\" style=\"border: 0px; outline: none;\"></a>\r\n");
      out.write("\r\n");
      out.write("    <!-- footer -->\r\n");
      out.write("    <div id=\"footer\">\r\n");
      out.write("        <div id=\"innerfooter\">\r\n");
      out.write("            <div class=\"footerctnt\">\r\n");
      out.write("                <table id=\"ft1\" style=\"outline: none;\">\r\n");
      out.write("                    <tbody>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <span style=\"display:block; font-size:24px;\">고객센터</span>\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td><span id=\"asknum\">1600-4000</span></td>\r\n");
      out.write("                        <td><span>365 고객센터</span><br><span class=\"cpmdesc\">오전 7시 - 오후 7시</span></td>\r\n");
      out.write("                        \r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td><a href=\"\" class=\"ask\">1:1 문의</a></td>\r\n");
      out.write("                        <td><span>24시간 접수 가능</span><br><span class=\"cpmdesc\">고객센터 운영중 순차적으로 답변해드리겠습니다.</span></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td><a href=\"\" class=\"ask\">공지사항</a></td>\r\n");
      out.write("                        <td><span style=\"font-weight: bold; font-size:11px\">마켓허리에서 알려드리는 오늘의 소식!</span></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </tbody>\r\n");
      out.write("                </table>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"footerctnt\">\r\n");
      out.write("                <table id=\"ft2\" style=\"outline: none;\">\r\n");
      out.write("                    <tbody>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>\r\n");
      out.write("                                <a href=\"\">회사소개</a>\r\n");
      out.write("                                <a href=\"\">인재채용</a>\r\n");
      out.write("                                <a href=\"\">이용약관</a>\r\n");
      out.write("                                <a href=\"\">개인정보처리방침</a>\r\n");
      out.write("                                <a href=\"\">이용안내</a>\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td><span class=\"cpmdesc\">법인명 (상호): 주식회사 MarketHurry &nbsp;|&nbsp; \r\n");
      out.write("                                사업자등록번호: 123-45-7891011</span><br>\r\n");
      out.write("                                <span class=\"cpmdesc\">통신판매업: 제 2018-서울역삼-0123425호 &nbsp;|&nbsp; 개인정보보호책임자: (주)마켓허리</span><br>\r\n");
      out.write("                                <span class=\"cpmdesc\">주소: 서울 강남구 테헤란로 132 (역삼동)한독약품 빌딩 8층 &nbsp;|&nbsp; 대표이사: 이은수</span><br>\r\n");
      out.write("                                <span class=\"cpmdesc\" >제휴문의 : <span style=\"color:#08718E;\">markethurry@hurrycorp.com</span></span><br>\r\n");
      out.write("                                <span class=\"cpmdesc\">채용문의 : <span style=\"color:#08718E;\">recruit@hurrycorp.com</span></span><br>\r\n");
      out.write("\r\n");
      out.write("                                <span class=\"cpmdesc\">팩스: 070-1234-5678 &nbsp;|&nbsp; 이메일: <span style=\"color:#08718E;\">help@hurrycorp.com</span></span><br><br>\r\n");
      out.write("                                <span class=\"cpmdesc\">© HURRY CORP. ALL RIGHTS RESERVED</span>\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>\r\n");
      out.write("                                <a href=\"\" id=\"insta\" class=\"snslogo\"></a>\r\n");
      out.write("                                <a href=\"\" id=\"fb\" class=\"snslogo\"></a>\r\n");
      out.write("                                <a href=\"\" id=\"post\" class=\"snslogo\"></a>\r\n");
      out.write("                                <a href=\"\" id=\"blog\" class=\"snslogo\"></a>\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </tbody>\r\n");
      out.write("                </table>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>");
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
