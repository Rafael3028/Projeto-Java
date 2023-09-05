package br.jdbc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.jdbc.dao.produtoDAO;

@WebServlet("/excluirProdutoServlet")
public class excluirProdutoServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public excluirProdutoServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Redirecione para a página de listagem de produtos
        response.sendRedirect("ProdutoServlet");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtenha o ID do produto a ser excluído a partir dos parâmetros da solicitação
        int idProduto = Integer.parseInt(request.getParameter("idProduto"));

        // Chame o método de exclusão do produto do seu DAO
        produtoDAO dao = new produtoDAO(null);
        dao.remover(idProduto);

        // Redirecione para a página de listagem de produtos após a exclusão
        response.sendRedirect("ProdutoServlet");
    }

}
