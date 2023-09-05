<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.List" %>
<%@ page import="br.jdbc.dao.produtoDAO" %>
<%@ page import="br.jdbc.dto.produtoDTO" %>
<%
Connection conn = null;
try {
    String url = "jdbc:mysql://localhost:3306/registro";
    String user = "root";
    String password = "";
    Class.forName("com.mysql.jdbc.Driver");
    conn = DriverManager.getConnection(url, user, password);
} catch (SQLException e) {
    e.printStackTrace();
} catch (ClassNotFoundException e) {
    e.printStackTrace();
}
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Produtos</title>
    <link rel="stylesheet" href="../css/bootstrap.min.css">
    <link rel="stylesheet" href="../js/bootstrap.min.js">
    <link rel="stylesheet" href="../css/owl.carousel.min.css">
    <link rel="stylesheet" href="../css/owl.theme.default.min.css">
    <link rel="stylesheet" href="../css/estilo.css">
    <link rel="stylesheet" href="../css/botao.css">
    <link rel="stylesheet" href="../css/produto.css">
     <link rel="icon" href="../img/64c13544e31a508f877ce665b7e659f7-linha-flores-roxas-em-aquarela.png">
   
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
      <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
      <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
      <script type="text/javascript">
        // <![CDATA[
        var colours=new Array('#fee', '#fcc', '#f9b', '#fee', '#fcc', '#f9b'); // colours of the hearts
        var minisize=10; // smallest size of hearts in pixels
        var maxisize=15; // biggest size of hearts in pixels
        var hearts=66; // maximum number of hearts on screen
        var over_or_under="over"; // set to "over" for hearts to always be on top, or "under" to allow them to float behind other objects
        
        /*****************************
        *JavaScript Love Heart Cursor*
        *  (c)2013+ mf2fm web-design *
        *   http://www.mf2fm.com/rv  *
        *  DON'T EDIT BELOW THIS BOX *
        *****************************/
        var x=ox=400;
        var y=oy=300;
        var swide=800;
        var shigh=600;
        var sleft=sdown=0;
        var herz=new Array();
        var herzx=new Array();
        var herzy=new Array();
        var herzs=new Array();
        var kiss=false;
        
        if (typeof('addRVLoadEvent')!='function') function addRVLoadEvent(funky) {
          var oldonload=window.onload;
          if (typeof(oldonload)!='function') window.onload=funky;
          else window.onload=function() {
            if (oldonload) oldonload();
            funky();
          }
        }
        
        addRVLoadEvent(mwah);
        
        function mwah() { if (document.getElementById) {
          var i, heart;
          for (i=0; i<hearts; i++) {
            heart=createDiv("auto", "auto");
            heart.style.visibility="hidden";
          heart.style.zIndex=(over_or_under=="over")?"1001":"0";
            heart.style.color=colours[i%colours.length];
          heart.style.pointerEvents="none";
            if (navigator.appName=="Microsoft Internet Explorer") heart.style.filter="alpha(opacity=75)";
            else heart.style.opacity=0.75;
            heart.appendChild(document.createTextNode(String.fromCharCode(10022)));
            document.body.appendChild(heart);
            herz[i]=heart;
          herzy[i]=false;
          }
          set_scroll();
          set_width();
          herzle();
        }}
        
        function herzle() {
          var c;
          if (Math.abs(x-ox)>1 || Math.abs(y-oy)>1) {
            ox=x;
            oy=y;
            for (c=0; c<hearts; c++) if (herzy[c]===false) {
            herz[c].firstChild.nodeValue=String.fromCharCode( 10022);
              herz[c].style.left=(herzx[c]=x-minisize/2)+"px";
              herz[c].style.top=(herzy[c]=y-minisize)+"px";
              herz[c].style.fontSize=minisize+"px";
            herz[c].style.fontWeight='normal';
              herz[c].style.visibility='visible';
              herzs[c]=minisize;
              break;
            }
          }
          for (c=0; c<hearts; c++) if (herzy[c]!==false) blow_me_a_kiss(c);
          setTimeout("herzle()", 40);
        }
        
        document.onmousedown=pucker;
        document.onmouseup=function(){clearTimeout(kiss);};
        
        function pucker() {
          ox=-1;
          oy=-1;
          kiss=setTimeout('pucker()', 100);
        }
        
        function blow_me_a_kiss(i) {
          herzy[i]-=herzs[i]/minisize+i%2;
          herzx[i]+=(i%5-2)/5;
          if (herzy[i]<sdown-herzs[i] || herzx[i]<sleft-herzs[i] || herzx[i]>sleft+swide-herzs[i]) {
            herz[i].style.visibility="hidden";
            herzy[i]=false;
          }
          else if (herzs[i]>minisize+2 && Math.random()<.5/hearts) break_my_heart(i);
          else {
            if (Math.random()<maxisize/herzy[i] && herzs[i]<maxisize) herz[i].style.fontSize=(++herzs[i])+"px";
            herz[i].style.top=herzy[i]+"px";
            herz[i].style.left=herzx[i]+"px";
          }
        }
        
        function break_my_heart(i) {
          var t;
          herz[i].firstChild.nodeValue=String.fromCharCode(9676);
          herz[i].style.fontWeight='bold';
          herzy[i]=false;
          for (t=herzs[i]; t<=maxisize; t++) setTimeout('herz['+i+'].style.fontSize="'+t+'px"', 60*(t-herzs[i]));
          setTimeout('herz['+i+'].style.visibility="hidden";', 60*(t-herzs[i]));
        }
        
        document.onmousemove=mouse;
        function mouse(e) {
          if (e) {
            y=e.pageY;
            x=e.pageX;
          }
          else {
            set_scroll();
            y=event.y+sdown;
            x=event.x+sleft;
          }
        }
        
        window.onresize=set_width;
        function set_width() {
          var sw_min=999999;
          var sh_min=999999;
          if (document.documentElement && document.documentElement.clientWidth) {
            if (document.documentElement.clientWidth>0) sw_min=document.documentElement.clientWidth;
            if (document.documentElement.clientHeight>0) sh_min=document.documentElement.clientHeight;
          }
          if (typeof(self.innerWidth)=='number' && self.innerWidth) {
            if (self.innerWidth>0 && self.innerWidth<sw_min) sw_min=self.innerWidth;
            if (self.innerHeight>0 && self.innerHeight<sh_min) sh_min=self.innerHeight;
          }
          if (document.body.clientWidth) {
            if (document.body.clientWidth>0 && document.body.clientWidth<sw_min) sw_min=document.body.clientWidth;
            if (document.body.clientHeight>0 && document.body.clientHeight<sh_min) sh_min=document.body.clientHeight;
          }
          if (sw_min==999999 || sh_min==999999) {
            sw_min=800;
            sh_min=600;
          }
          swide=sw_min;
          shigh=sh_min;
        }
        
        window.onscroll=set_scroll;
        function set_scroll() {
          if (typeof(self.pageYOffset)=='number') {
            sdown=self.pageYOffset;
            sleft=self.pageXOffset;
          }
          else if (document.body && (document.body.scrollTop || document.body.scrollLeft)) {
            sdown=document.body.scrollTop;
            sleft=document.body.scrollLeft;
          }
          else if (document.documentElement && (document.documentElement.scrollTop || document.documentElement.scrollLeft)) {
            sleft=document.documentElement.scrollLeft;
            sdown=document.documentElement.scrollTop;
          }
          else {
            sdown=0;
            sleft=0;
          }
        }
        
        function createDiv(height, width) {
          var div=document.createElement("div");
          div.style.position="absolute";
          div.style.height=height;
          div.style.width=width;
          div.style.overflow="hidden";
          div.style.backgroundColor="transparent";
          return (div);
        }
       
        </script>
    <style>
        .produtos {
    display: inline-block;
    margin: 0 15px 30px 0;
    padding: 15px;
    border: 4px solid #e0c8d0;
    border-radius: 8%;
    background-color: white;
    width: calc(33.33% - 20px); /* Calcula a largura com margens */
    box-sizing: border-box;
    position: relative;
}


        img {
            border-radius: 10%;
            width: 100%;
        }

        h2 {
            font-size: 30px;
            font-family: serif;
            color: grey;
            margin-top: 0;
        }

        p {
            font-size: 20px;
            font-family: serif;
            color: rgb(167, 67, 167);
            margin: 5px 0;
        }

        .container {
            max-width: 900px;
            margin: 0 auto;
            display: flex;
            flex-wrap: wrap;
            justify-content: space-between;
        }
        
        .botao {
    position: absolute;
    bottom: 10px;
    left: 10px;
    color: #ffffff;
    background-color: #edb8c8;
    font-size: 20px;
    border: 1px solid #edb8c8;
    border-radius: 12px;
    padding: 10px 37px;
    cursor: pointer;
    text-decoration: none;
}

.botao:hover {
    color: #edb8c8;
    background-color: #ffffff;
}

.border {
    border: 9px solid #E5DCDF;
}
        
    </style>
</head>

<body>

<nav class="navbar navbar-expand-lg navbar-light fixed-top" id="blur">
        <div class="container">
          <a class="navbar-brand" href="#">Lumiere</a>
          <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>
      
          <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav ml-auto">
              <li class="nav-item active">
                <a class="nav-link" href="./home.jsp">Home</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="./TelaProduto.jsp" target="_blank">Produtos</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="./contatos.jsp" target="_blank">Contatos</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="./sobrenos.jsp" target="_blank">Sobre Nós</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="./login.jsp"><img src="../img/8324223_ui_essential_app_avatar_profile_icon.png" id="imgnav"></a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="#"><img src="../img/9025885_shopping_cart_icon.png" id="imgnav"></a>
              </li>
            </ul>
          </div>
     
        </div>
      
      </nav>
      
       <br><br><br><br><center>
<div >
      <h1>Nossos Produtos</h1>
    <p>Aroma e aconchego
    <p>Cuide de quem mais merece: você.<p>
</div>
</center>

    <br><br>


<div class="container">
    <%
    List<produtoDTO> listaProdutos = new produtoDAO(conn).listarTodos();
    for (produtoDTO produto : listaProdutos) {
    %>
    <div class="produtos">
        <img src="../img/high-angle-natural-soap-plant-arrangement.jpg" alt="" />
       <br>
        <h2><%=produto.getNomeProduto()%></h2>
        
        <p><%=produto.getTipoProduto()%></p>
        <p><strong>Preço:</strong> <%=produto.getPreco()%></p>
        <br> <br>
       <td><a  class="botao" href="https://wa.me/5521969763424?id=<?php echo $idProduto?>">Comprar</a></td>
        
       

    </div>
    <% } %>
</div>

</body>
<%
if (conn != null) {
    try {
        conn.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
%>
  






 


  <footer class="new_footer_area bg_color">
    <div class="new_footer_top">
        <div class="container">
            <div class="row">
                
                <div class="col-lg-3 col-md-6">
                    <div class="f_widget about-widget pl_70 wow fadeInLeft" data-wow-delay="0.4s" style="visibility: visible; animation-delay: 0.4s; animation-name: fadeInLeft;">
                        <h3 class="f-title f_600 t_color f_size_18">Início</h3>
                        <ul class="list-unstyled f_list">
                            <li><a href="./home.html">Home</a></li>
                            <li><a href="./produto.html" target="_blank">Produtos</a></li>
                            
                          
                        </ul>
                    </div>
                </div>
                <div class="col-lg-3 col-md-6">
                    <div class="f_widget about-widget pl_70 wow fadeInLeft" data-wow-delay="0.6s" style="visibility: visible; animation-delay: 0.6s; animation-name: fadeInLeft;">
                        <h3 class="f-title f_600 t_color f_size_18">Informações</h3>
                        <ul class="list-unstyled f_list">
                            <li><a href="./sobrenos.html" target="_blank">Sobre Nós</a></li>
                            <li><a href="./contatos.html" target="_blank">Contatos</a></li>
                          
                        </ul>
                    </div>
                </div>
                <div class="col-lg-3 col-md-6">
                  <h3 class="f-title f_600 t_color f_size_18">Sobre nós</h3>
                  <h3 class="f-title f_600 t_color f_size_18">
                      Lorem ipsum dolor sit amet consectetur adipisicing elit.
                      Corrupti, magnam ipsam quis natus cumque ad nulla laudantium ex reiciendis
                      consequatur quasi blanditiis dolorum culpa repudiandae consectetur asperiores officia nobis excepturi?
                    </h3>
                    
                </div>
                <div class="col-lg-3 col-md-6">
                  <img src="../img/64c13544e31a508f877ce665b7e659f7-linha-flores-roxas-em-aquarela.png" width="300px"> 
                </div>
                
            </div>
        </div>
        <div class="footer_bg">
            <div class="footer_bg_one"></div>
            <div class="footer_bg_two"></div>
        </div>
    </div>
   
</footer>


</html>
