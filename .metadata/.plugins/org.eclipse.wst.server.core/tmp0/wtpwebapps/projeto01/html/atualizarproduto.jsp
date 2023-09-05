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
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Lumiére</title>
    <link rel="stylesheet" href="../css/bootstrap.min.css">
    <link rel="stylesheet" href="../js/bootstrap.min.js">
    <link rel="stylesheet" href="../css/estilo.css">
    <link rel="stylesheet" href="../css/owl.carousel.min.css">
    <link rel="stylesheet" href="../css/owl.theme.default.min.css">
    <link rel="icon" href="../img/CC_20230209_103124.png">
</head>
<body>
<style>

body{
    font-family: Arial, Helvetica, sans-serif;
    background-image: url(../img/velacanto.png);
  }

.navbar{
    background-color: #E5DCDF;
}
.navbar-toggler-icon{
    background-color: #e0c8d0;
}
.navbar-nav {
  margin-left: -130%;
}
h1 {
    font-size: 60px;
    font-family: Arial, Helvetica, sans-serif;
   
    color: pink;
    text-shadow: none;
    border: none;
}
.btn-sm {
    margin-left: 32%;
    margin-right: -20%;
    border-radius: 5px;
    background-color: #DDA0DD;
    color: #fff;
    border: none;
}
.btn-sm:hover {
    background-color:  #E5DCDF;
    color: #000;
}
</style>

<br><br>
<center><h1>Produto alterado com sucesso.</h1></center>

<br>

<a href="admEditar.jsp" role="button" class="btn btn-sm">Cadastrar novo produto</a>

<a href="TelaProduto.jsp" role="button" class="btn btn-sm ">Voltar à tela de produtos</a>
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
</html>