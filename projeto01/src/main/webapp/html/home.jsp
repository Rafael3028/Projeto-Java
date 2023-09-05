<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>P�gina Inicial</title>
    <link rel="stylesheet" href="../css/bootstrap.min.css">
    <link rel="stylesheet" href="../js/bootstrap.min.js">
    <link rel="stylesheet" href="../css/owl.carousel.min.css">
    <link rel="stylesheet" href="../css/owl.theme.default.min.css">
    <link rel="stylesheet" href="../css/estilo.css">
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
        // ]]>
        </script>
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
                <a class="nav-link" href="./sobrenos.jsp" target="_blank">Sobre N�s</a>
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
      
      
    
        <div id="carouselExampleFade" class="carousel slide carousel-fade" data-ride="carousel">
          <div class="carousel-inner">
            <div class="carousel-item active" >
              <img class="d-block w-100" src="../img/crop.jpg" alt="Primeiro Slide" id="img2">
              <div class="carousel-caption d-none d-md-block">
                <div class="texto">
                <h1 id="banner">Lumi�re</h1>
                <p id="p1">Poesia que acende</p>
              </div>
              </div>
            </div>
            <div class="carousel-item">
              <img class="d-block w-100" src="../img/sabonetes.png" alt="Segundo Slide" id="img2">
              <div class="carousel-caption d-none d-md-block">
                <h1  id="banner">Lumi�re</h1>
                <p id="p1">Poesia que acende</p>
              </div>
            </div>
            <div class="carousel-item">
              <img class="d-block w-100" src="../img/capa01.png" alt="Terceiro Slide" id="img2">
              <div class="carousel-caption d-none d-md-block">
                <h1 id="banner">Lumi�re</h1>
                <p id="p1">Poesia que acende</p>
              </div>
            </div>
          </div>
          <a class="carousel-control-prev" href="#carouselExampleFade" role="button" data-slide="prev">
            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
            <span class="sr-only">Anterior</span>
          </a>
          <a class="carousel-control-next" href="#carouselExampleFade" role="button" data-slide="next">
            <span class="carousel-control-next-icon" aria-hidden="true"></span>
            <span class="sr-only">Pr�ximo</span>
          </a>
        </div>
  <br>
 <h1 id="h1"> Velas e Sabontes Artesanais</h1><br>
  <div class="linha">
  <div class="coluna3" style="background-color:#fcdcee;" >
    <img id="img" src="../img/vela2.png">
  </div>
  <div class="coluna3">
    <h2 id="h2">Vela Arom�tica<p><p></p>
   
    Ajuda a criar um clima agrad�vel, relaxante e promove bem-estar. 
    Ensinamos todos os passos de como usar em casa
     e aproveitar ao m�ximo todas as vantagens desse objeto desejado do momento!<br>

    </h2>
   <a class="a" href="./produto.html" style="width: 100%; margin-left: 70%;">
    Ver Mais <img src="../img/seta.png" style="width:5% ;"></a>
  </div>
</div>
<div class="linha">
  <div class="coluna3" >
    <h2 id="h2">Vela arom�tica x Vela comum<p></p>

    As velas comuns n�o possuem aroma, j� as velas arom�ticas, os aromas fazem parte da composi��o 
    e ajudam a transmitir sensa��es de bem-estar </h2>
    <a class="a" href="./produto.html" style="width: 100%; margin-left: 70%;">
      Ver Mais <img src="../img/seta.png" style="width:5% ;"></a>
  </div>
  <div class="coluna3" style="background-color:#fcdcee;" >
    <img id="img" src="../img/vela7.png">
  </div>
</div>
<br>
        <div class="linha"style="background-color: #fcdcee; box-shadow: 0 -10px 10px -10px rgba(0, 0, 0, 0.5)">
          <h2 style="margin-left: 9%;"><br>Como usar a vela arom�tica de forma correta?</h2></div>
          
          <div class="linha"style="background-color: #fcdcee; box-shadow: 0 10px 10px -10px rgba(0, 0, 0, 0.5);">
            <div class="coluna">
          <p style="margin-left: 9%;">A vela arom�tica precisa de cuidados especiais para exalar o aroma de forma correta, 
            o primeiro passo � deixar a vela acesa durante 30 minutos, o pavio apagado deve ter no m�nimo 4mm de altura, se a chama estiver muito alta, acima de 2cm, 
            corte o pavio antes de acender a vela. Nunca deixe sua vela queimando por mais de 4 horas seguidas, e sempre com a supervis�o de um adulto! N�o toque na cera enquanto a vela estiver acesa. 
            N�o utilize mais a vela quando tiver � de cera no fundo.
        </div>
      
          <div class="coluna2">
          <p><img src="../img/1676553702353.png" width="50%" style="margin-right: 10%;"></p>
          </div>
          </div>
     
  <br> <br>
  <div class="linha" style="position:relative; z-index:0; top:0; left:0; margin-left: 9%;"> 
  <h2>Benef�cios dos sabonetes Lumi�re</h2></div><br>
    <div class="container">
    <div class="owl-carousel owl-theme">
        <div class="item">
          <div class="card" style="width: 18rem;" id="borda">
            <img class="card-img-top" src="../img/soap.png" width="100%" alt="Imagem de capa do card">
            <div class="card-body">
              <p class="card-text">A ess�ncia de frutas silvestres proporciona 
                relaxamento e energiza��o. O aroma favorece a lucidez de ideias produzindo um ambiente afrodis�aco suave.</p>
              <br>
            </div>
        </div>
        </div> <br>
        <div class="item" ><div class="card" style="width: 18rem;" id="borda">
          <img class="card-img-top" src="../img/soap2.png" alt="Imagem de capa do card">
          <div class="card-body">
            <p class="card-text">A ess�ncia de Bamboo alivia o estresse, traz prote��o, serenidade e calma e tamb�m � capaz de refrescar seus ambientes sem sobrecarregar os sentidos por ser um aroma c�trico suave.</p>
          </div>
        </div></div> <br>
        <div class="item" ><div class="card" style="width: 18rem;" id="borda">
          <img class="card-img-top" src="../img/soap3.png" alt="Imagem de capa do card">
          <div class="card-body">
            <p class="card-text">A ess�ncia do Capim Lim�o auxilia na concentra��o e ajuda contra a ins�nia tamb�m, podendo ser saud�vel at� para crian�as hiperativas ou com problemas durante o sono.</p>
          </div>
        </div></div> <br>
        <div class="item" ><div class="card" style="width: 18rem;" id="borda">
          <img class="card-img-top" src="../img/soap4.png" alt="Imagem de capa do card">
          <div class="card-body">
            <p class="card-text">A ess�ncia de Algod�o, por ter uma nota florada adocicada, proporciona a tranquilidade mental e muito boa para combater a ins�nia.</p>
          </div>
        </div></div> <br>
        <div class="item"><div class="card" style="width: 18rem;" id="borda">
          <img class="card-img-top" src="../img/soap1.png" alt="Imagem de capa do card">
          <div class="card-body">
            <p class="card-text">A ess�ncia Flor de Algod�o possui um intenso toque floral c�trico que transmite frescor e energia ao ambiente e harmoniza bem com ambientes como �reas de circula��o, lavabos e ambientes cl�nico</p>
          </div>
        </div></div><br>
       
    </div>
  </div>

  
  
      
      
  <div class="whats">
    <a href="https://wa.me/5521979249199" target="_blank">
    <img src="../img/whats1.png" width="60" alt="Fale Conosco pelo Whatsapp" title="Fale Conosco pelo Whatsapp" />
  </a>
  </div>
  

  <script src="../js/jquery.min.js"></script>
  <script src="../js/owl.carousel.min.js"></script>
  <script src="../js/setup.js"></script>


  <footer class="new_footer_area bg_color">
    <div class="new_footer_top">
        <div class="container">
            <div class="row">
                
                <div class="col-lg-3 col-md-6">
                    <div class="f_widget about-widget pl_70 wow fadeInLeft" data-wow-delay="0.4s" style="visibility: visible; animation-delay: 0.4s; animation-name: fadeInLeft;">
                        <h3 class="f-title f_600 t_color f_size_18">In�cio</h3>
                        <ul class="list-unstyled f_list">
                            <li><a href="./home.html">Home</a></li>
                            <li><a href="./produto.html" target="_blank">Produtos</a></li>
                            
                          
                        </ul>
                    </div>
                </div>
                <div class="col-lg-3 col-md-6">
                    <div class="f_widget about-widget pl_70 wow fadeInLeft" data-wow-delay="0.6s" style="visibility: visible; animation-delay: 0.6s; animation-name: fadeInLeft;">
                        <h3 class="f-title f_600 t_color f_size_18">Informa��es</h3>
                        <ul class="list-unstyled f_list">
                            <li><a href="./sobrenos.html" target="_blank">Sobre N�s</a></li>
                            <li><a href="./contatos.html" target="_blank">Contatos</a></li>
                          
                        </ul>
                    </div>
                </div>
                <div class="col-lg-3 col-md-6">
                  <h3 class="f-title f_600 t_color f_size_18">Sobre n�s</h3>
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

</body>
</html>