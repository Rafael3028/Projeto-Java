/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.65
 * Generated at: 2023-06-01 12:16:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.html;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sobrenos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"pt-br\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Sobre Nós</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/bootstrap.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../js/bootstrap.min.js\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/estilo.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/owl.carousel.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/owl.theme.default.min.css\">\r\n");
      out.write("    <link rel=\"icon\" href=\"./img/64c13544e31a508f877ce665b7e659f7-linha-flores-roxas-em-aquarela.png\">\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\" integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("   \r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("      // <![CDATA[\r\n");
      out.write("      var colours=new Array('#fee', '#fcc', '#f9b', '#fee', '#fcc', '#f9b'); // colours of the hearts\r\n");
      out.write("      var minisize=10; // smallest size of hearts in pixels\r\n");
      out.write("      var maxisize=15; // biggest size of hearts in pixels\r\n");
      out.write("      var hearts=66; // maximum number of hearts on screen\r\n");
      out.write("      var over_or_under=\"over\"; // set to \"over\" for hearts to always be on top, or \"under\" to allow them to float behind other objects\r\n");
      out.write("      \r\n");
      out.write("      /*****************************\r\n");
      out.write("      *JavaScript Love Heart Cursor*\r\n");
      out.write("      *  (c)2013+ mf2fm web-design *\r\n");
      out.write("      *   http://www.mf2fm.com/rv  *\r\n");
      out.write("      *  DON'T EDIT BELOW THIS BOX *\r\n");
      out.write("      *****************************/\r\n");
      out.write("      var x=ox=400;\r\n");
      out.write("      var y=oy=300;\r\n");
      out.write("      var swide=800;\r\n");
      out.write("      var shigh=600;\r\n");
      out.write("      var sleft=sdown=0;\r\n");
      out.write("      var herz=new Array();\r\n");
      out.write("      var herzx=new Array();\r\n");
      out.write("      var herzy=new Array();\r\n");
      out.write("      var herzs=new Array();\r\n");
      out.write("      var kiss=false;\r\n");
      out.write("      \r\n");
      out.write("      if (typeof('addRVLoadEvent')!='function') function addRVLoadEvent(funky) {\r\n");
      out.write("        var oldonload=window.onload;\r\n");
      out.write("        if (typeof(oldonload)!='function') window.onload=funky;\r\n");
      out.write("        else window.onload=function() {\r\n");
      out.write("          if (oldonload) oldonload();\r\n");
      out.write("          funky();\r\n");
      out.write("        }\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      addRVLoadEvent(mwah);\r\n");
      out.write("      \r\n");
      out.write("      function mwah() { if (document.getElementById) {\r\n");
      out.write("        var i, heart;\r\n");
      out.write("        for (i=0; i<hearts; i++) {\r\n");
      out.write("          heart=createDiv(\"auto\", \"auto\");\r\n");
      out.write("          heart.style.visibility=\"hidden\";\r\n");
      out.write("        heart.style.zIndex=(over_or_under==\"over\")?\"1001\":\"0\";\r\n");
      out.write("          heart.style.color=colours[i%colours.length];\r\n");
      out.write("        heart.style.pointerEvents=\"none\";\r\n");
      out.write("          if (navigator.appName==\"Microsoft Internet Explorer\") heart.style.filter=\"alpha(opacity=75)\";\r\n");
      out.write("          else heart.style.opacity=0.75;\r\n");
      out.write("          heart.appendChild(document.createTextNode(String.fromCharCode(10022)));\r\n");
      out.write("          document.body.appendChild(heart);\r\n");
      out.write("          herz[i]=heart;\r\n");
      out.write("        herzy[i]=false;\r\n");
      out.write("        }\r\n");
      out.write("        set_scroll();\r\n");
      out.write("        set_width();\r\n");
      out.write("        herzle();\r\n");
      out.write("      }}\r\n");
      out.write("      \r\n");
      out.write("      function herzle() {\r\n");
      out.write("        var c;\r\n");
      out.write("        if (Math.abs(x-ox)>1 || Math.abs(y-oy)>1) {\r\n");
      out.write("          ox=x;\r\n");
      out.write("          oy=y;\r\n");
      out.write("          for (c=0; c<hearts; c++) if (herzy[c]===false) {\r\n");
      out.write("          herz[c].firstChild.nodeValue=String.fromCharCode( 10022);\r\n");
      out.write("            herz[c].style.left=(herzx[c]=x-minisize/2)+\"px\";\r\n");
      out.write("            herz[c].style.top=(herzy[c]=y-minisize)+\"px\";\r\n");
      out.write("            herz[c].style.fontSize=minisize+\"px\";\r\n");
      out.write("          herz[c].style.fontWeight='normal';\r\n");
      out.write("            herz[c].style.visibility='visible';\r\n");
      out.write("            herzs[c]=minisize;\r\n");
      out.write("            break;\r\n");
      out.write("          }\r\n");
      out.write("        }\r\n");
      out.write("        for (c=0; c<hearts; c++) if (herzy[c]!==false) blow_me_a_kiss(c);\r\n");
      out.write("        setTimeout(\"herzle()\", 40);\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      document.onmousedown=pucker;\r\n");
      out.write("      document.onmouseup=function(){clearTimeout(kiss);};\r\n");
      out.write("      \r\n");
      out.write("      function pucker() {\r\n");
      out.write("        ox=-1;\r\n");
      out.write("        oy=-1;\r\n");
      out.write("        kiss=setTimeout('pucker()', 100);\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      function blow_me_a_kiss(i) {\r\n");
      out.write("        herzy[i]-=herzs[i]/minisize+i%2;\r\n");
      out.write("        herzx[i]+=(i%5-2)/5;\r\n");
      out.write("        if (herzy[i]<sdown-herzs[i] || herzx[i]<sleft-herzs[i] || herzx[i]>sleft+swide-herzs[i]) {\r\n");
      out.write("          herz[i].style.visibility=\"hidden\";\r\n");
      out.write("          herzy[i]=false;\r\n");
      out.write("        }\r\n");
      out.write("        else if (herzs[i]>minisize+2 && Math.random()<.5/hearts) break_my_heart(i);\r\n");
      out.write("        else {\r\n");
      out.write("          if (Math.random()<maxisize/herzy[i] && herzs[i]<maxisize) herz[i].style.fontSize=(++herzs[i])+\"px\";\r\n");
      out.write("          herz[i].style.top=herzy[i]+\"px\";\r\n");
      out.write("          herz[i].style.left=herzx[i]+\"px\";\r\n");
      out.write("        }\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      function break_my_heart(i) {\r\n");
      out.write("        var t;\r\n");
      out.write("        herz[i].firstChild.nodeValue=String.fromCharCode(9676);\r\n");
      out.write("        herz[i].style.fontWeight='bold';\r\n");
      out.write("        herzy[i]=false;\r\n");
      out.write("        for (t=herzs[i]; t<=maxisize; t++) setTimeout('herz['+i+'].style.fontSize=\"'+t+'px\"', 60*(t-herzs[i]));\r\n");
      out.write("        setTimeout('herz['+i+'].style.visibility=\"hidden\";', 60*(t-herzs[i]));\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      document.onmousemove=mouse;\r\n");
      out.write("      function mouse(e) {\r\n");
      out.write("        if (e) {\r\n");
      out.write("          y=e.pageY;\r\n");
      out.write("          x=e.pageX;\r\n");
      out.write("        }\r\n");
      out.write("        else {\r\n");
      out.write("          set_scroll();\r\n");
      out.write("          y=event.y+sdown;\r\n");
      out.write("          x=event.x+sleft;\r\n");
      out.write("        }\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      window.onresize=set_width;\r\n");
      out.write("      function set_width() {\r\n");
      out.write("        var sw_min=999999;\r\n");
      out.write("        var sh_min=999999;\r\n");
      out.write("        if (document.documentElement && document.documentElement.clientWidth) {\r\n");
      out.write("          if (document.documentElement.clientWidth>0) sw_min=document.documentElement.clientWidth;\r\n");
      out.write("          if (document.documentElement.clientHeight>0) sh_min=document.documentElement.clientHeight;\r\n");
      out.write("        }\r\n");
      out.write("        if (typeof(self.innerWidth)=='number' && self.innerWidth) {\r\n");
      out.write("          if (self.innerWidth>0 && self.innerWidth<sw_min) sw_min=self.innerWidth;\r\n");
      out.write("          if (self.innerHeight>0 && self.innerHeight<sh_min) sh_min=self.innerHeight;\r\n");
      out.write("        }\r\n");
      out.write("        if (document.body.clientWidth) {\r\n");
      out.write("          if (document.body.clientWidth>0 && document.body.clientWidth<sw_min) sw_min=document.body.clientWidth;\r\n");
      out.write("          if (document.body.clientHeight>0 && document.body.clientHeight<sh_min) sh_min=document.body.clientHeight;\r\n");
      out.write("        }\r\n");
      out.write("        if (sw_min==999999 || sh_min==999999) {\r\n");
      out.write("          sw_min=800;\r\n");
      out.write("          sh_min=600;\r\n");
      out.write("        }\r\n");
      out.write("        swide=sw_min;\r\n");
      out.write("        shigh=sh_min;\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      window.onscroll=set_scroll;\r\n");
      out.write("      function set_scroll() {\r\n");
      out.write("        if (typeof(self.pageYOffset)=='number') {\r\n");
      out.write("          sdown=self.pageYOffset;\r\n");
      out.write("          sleft=self.pageXOffset;\r\n");
      out.write("        }\r\n");
      out.write("        else if (document.body && (document.body.scrollTop || document.body.scrollLeft)) {\r\n");
      out.write("          sdown=document.body.scrollTop;\r\n");
      out.write("          sleft=document.body.scrollLeft;\r\n");
      out.write("        }\r\n");
      out.write("        else if (document.documentElement && (document.documentElement.scrollTop || document.documentElement.scrollLeft)) {\r\n");
      out.write("          sleft=document.documentElement.scrollLeft;\r\n");
      out.write("          sdown=document.documentElement.scrollTop;\r\n");
      out.write("        }\r\n");
      out.write("        else {\r\n");
      out.write("          sdown=0;\r\n");
      out.write("          sleft=0;\r\n");
      out.write("        }\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      function createDiv(height, width) {\r\n");
      out.write("        var div=document.createElement(\"div\");\r\n");
      out.write("        div.style.position=\"absolute\";\r\n");
      out.write("        div.style.height=height;\r\n");
      out.write("        div.style.width=width;\r\n");
      out.write("        div.style.overflow=\"hidden\";\r\n");
      out.write("        div.style.backgroundColor=\"transparent\";\r\n");
      out.write("        return (div);\r\n");
      out.write("      }\r\n");
      out.write("      // ]]>\r\n");
      out.write("      </script>\r\n");
      out.write("</head>\r\n");
      out.write("<head>\r\n");
      out.write("<body>\r\n");
      out.write("  <nav class=\"navbar navbar-expand-lg navbar-light fixed-top\" id=\"blur\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("      <a class=\"navbar-brand\" href=\"#\">Lumiere</a>\r\n");
      out.write("      <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("        <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("      </button>\r\n");
      out.write("  \r\n");
      out.write("      <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("        <ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("          <li class=\"nav-item active\">\r\n");
      out.write("            <a class=\"nav-link\" href=\"./home.jsp\" target=\"_blank\">Home</a>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li class=\"nav-item\">\r\n");
      out.write("            <a class=\"nav-link\" href=\"./TelaProduto.jsp\" target=\"_blank\">Produtos</a>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li class=\"nav-item\">\r\n");
      out.write("            <a class=\"nav-link\" href=\"./contatos.jsp\" target=\"_blank\">Contatos</a>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li class=\"nav-item\">\r\n");
      out.write("            <a class=\"nav-link\" href=\"./sobrenos.jsp\">Sobre Nós</a>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li class=\"nav-item\">\r\n");
      out.write("            <a class=\"nav-link\" href=\"./login.jsp\"><img src=\"../img/8324223_ui_essential_app_avatar_profile_icon.png\" id=\"imgnav\"></a>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li class=\"nav-item\">\r\n");
      out.write("            <a class=\"nav-link\" href=\"#\"><img src=\"../img/9025885_shopping_cart_icon.png\" id=\"imgnav\"></a>\r\n");
      out.write("          </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write(" \r\n");
      out.write("    </div>\r\n");
      out.write("  \r\n");
      out.write("  </nav>\r\n");
      out.write("\r\n");
      out.write("  <div>\r\n");
      out.write("    <img class=\"banner-principal\" src=\"../img/capa04.png\" style=\"height: 30%; width: 100%\" alt=\"banner\">\r\n");
      out.write("    <div class=\"texto-bloco\">\r\n");
      out.write("        <h2 class=\"banner_texto\" style=\"font-size: 100px; text-shadow: 0 0 10px pink ; color:black;\"> Sobre Nós\r\n");
      out.write("        </h2>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div> \r\n");
      out.write("<br>\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("<div class=\"linha\">\r\n");
      out.write("  <div class=\"coluna\">\r\n");
      out.write("  </div><div class=\"coluna\"></div><div class=\"coluna\"></div>\r\n");
      out.write("  <div class=\"coluna\">\r\n");
      out.write("    <img src=\"../img/1.png\" alt=\"\" width=\"100%\" style=\"border-radius: 15%;\">\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"coluna\">\r\n");
      out.write("    <br><br>\r\n");
      out.write("    <h4 style=\"margin-top: 30%;\">Nossa Missão</h4><br>\r\n");
      out.write("    <p>Produzir e comercializar velas aromÃ¡ticas de qualidade que proporcionem experiÃªncias sensoriais e terapÃªuticas Ãºnicas para nossos clientes.</p>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<br><br>\r\n");
      out.write("\r\n");
      out.write("<div class=\"linha\">\r\n");
      out.write("  <div class=\"coluna\"></div><div class=\"coluna\"></div><div class=\"coluna\"></div>\r\n");
      out.write("  <div class=\"coluna\">\r\n");
      out.write("    <img src=\"../img/2.png\" alt=\"\" width=\"100%\" style=\"border-radius: 15%;\">\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"coluna\">\r\n");
      out.write("    <br><br>\r\n");
      out.write("\r\n");
      out.write("    <h4 style=\"margin-top: 30%;\">Nossa VisÃ£o</h4><br>\r\n");
      out.write("    <p>Ser uma das principais referÃªncias no Rio de Janeiro atÃ© o ano de 2028 na entrega de velas e sabonetes proporcionando bem-estar para o corpo e mente.</p>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<br><br>\r\n");
      out.write("<div class=\"linha\">\r\n");
      out.write("  <div class=\"coluna\"></div><div class=\"coluna\"></div><div class=\"coluna\"></div>\r\n");
      out.write("  <div class=\"coluna\">\r\n");
      out.write("    <img src=\"../img/3.png\" alt=\"\" width=\"100%\" style=\"border-radius: 15%;\">\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"coluna\" >\r\n");
      out.write("    <br><br>\r\n");
      out.write("    <h4 style=\"margin-top: 30%;\">Nossos Valores</h4><br>\r\n");
      out.write("    <p>Valorizamos a integridade, paixÃ£o pela evoluÃ§Ã£o, comprometimento com resultados, valorizaÃ§Ã£o das pessoas e do bem-estar.</p>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<br><br>\r\n");
      out.write("\r\n");
      out.write("<div class=\"whats\">\r\n");
      out.write("    <a href=\"https://wa.me/5521979249199\" target=\"_blank\">\r\n");
      out.write("    <img src=\"../img/whats1.png\" width=\"60\" alt=\"Fale Conosco pelo Whatsapp\" title=\"Fale Conosco pelo Whatsapp\" />\r\n");
      out.write("  </a>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("  <script src=\"../js/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"../js/owl.carousel.min.js\"></script>\r\n");
      out.write("  <script src=\"../js/setup.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <footer class=\"new_footer_area bg_color\">\r\n");
      out.write("    <div class=\"new_footer_top\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"col-lg-3 col-md-6\">\r\n");
      out.write("                    <div class=\"f_widget about-widget pl_70 wow fadeInLeft\" data-wow-delay=\"0.4s\" style=\"visibility: visible; animation-delay: 0.4s; animation-name: fadeInLeft;\">\r\n");
      out.write("                        <h3 class=\"f-title f_600 t_color f_size_18\">InÃ­cio</h3>\r\n");
      out.write("                        <ul class=\"list-unstyled f_list\">\r\n");
      out.write("                            <li><a href=\"./home.html\" target=\"_blank\">Home</a></li>\r\n");
      out.write("                            <li><a href=\"./produto.html\" target=\"_blank\">Produtos</a></li>\r\n");
      out.write("                           \r\n");
      out.write("                          \r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-3 col-md-6\">\r\n");
      out.write("                    <div class=\"f_widget about-widget pl_70 wow fadeInLeft\" data-wow-delay=\"0.6s\" style=\"visibility: visible; animation-delay: 0.6s; animation-name: fadeInLeft;\">\r\n");
      out.write("                        <h3 class=\"f-title f_600 t_color f_size_18\">InformaÃ§Ãµes</h3>\r\n");
      out.write("                        <ul class=\"list-unstyled f_list\">\r\n");
      out.write("                          <li><a href=\"./sobrenos.html\">Sobre NÃ³s</a></li>\r\n");
      out.write("                          <li><a href=\"./contatos.html\" target=\"_blank\">Contatos</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-3 col-md-6\">\r\n");
      out.write("                  <h3 class=\"f-title f_600 t_color f_size_18\">Sobre nÃ³s</h3>\r\n");
      out.write("                  <h3 class=\"f-title f_600 t_color f_size_18\">\r\n");
      out.write("                      Lorem ipsum dolor sit amet consectetur adipisicing elit.\r\n");
      out.write("                      Corrupti, magnam ipsam quis natus cumque ad nulla laudantium ex reiciendis\r\n");
      out.write("                      consequatur quasi blanditiis dolorum culpa repudiandae consectetur asperiores officia nobis excepturi?\r\n");
      out.write("                    </h3>\r\n");
      out.write("                    \r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-3 col-md-6\">\r\n");
      out.write("                  <img src=\"../img/64c13544e31a508f877ce665b7e659f7-linha-flores-roxas-em-aquarela.png\" width=\"300px\">\r\n");
      out.write("                    \r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"footer_bg\">\r\n");
      out.write("            <div class=\"footer_bg_one\"></div>\r\n");
      out.write("            <div class=\"footer_bg_two\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("   \r\n");
      out.write("</footer>\r\n");
      out.write("\r\n");
      out.write("<script src=\"../js/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"../js/owl.carousel.min.js\"></script>\r\n");
      out.write("<script src=\"../js/setup.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
