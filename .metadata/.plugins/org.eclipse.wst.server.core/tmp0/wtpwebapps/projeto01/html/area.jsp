<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <title>Área Administrativa</title>
  <style>
    body {
      margin: 0;
      padding: 0;
      font-size:20px;
    }
    
    .navbar {
      width: 200px;
      background-color: #9b59b6;
      height: 100vh;
      color: #fff;
      display: flex;
      flex-direction: column;
    }
    
    .logo {
      padding: 20px;
    }
    
    .logo img {
      width: 100%;
      height: auto;
    }
    
    .nav-links {
      list-style: none;
      padding: 0;
      margin: 0;
    }
    
    .nav-links li {
      padding: 10px 20px;
    }
    
    .nav-links li a {
      color: #fff;
      text-decoration: none;
    }
    
    .nav-links li a:hover {
      color: #ccc;
    }
  </style>
</head>
<body>
  <div class="navbar">
    <div class="logo">
      <img src="../img/64c13544e31a508f877ce665b7e659f7-linha-flores-roxas-em-aquarela.png" alt="Logo">
     
    </div>
    <ul class="nav-links">
      <li><a href="../CadastrarProduto.jsp">Adicionar Produto</a></li>
      <li><a href="./admEditar.jsp">Alterar Produto</a></li>
    </ul>
  </div>
  
  <!-- Conteúdo da página -->
  
  <script src="script.js"></script>
</body>
</html>
