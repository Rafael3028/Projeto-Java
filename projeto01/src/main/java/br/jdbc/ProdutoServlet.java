package br.jdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import br.jdbc.dao.*;
import br.jdbc.dto.*;
/**
 * Servlet implementation class ProdutoServlet
 */
@WebServlet("/ProdutoServlet")
public class ProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	private produtoDAO produtoDAO = new produtoDAO(null);	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProdutoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nomeProduto = request.getParameter("nomeProduto");
		Integer volume = (Integer.parseInt(request.getParameter("volume")));
		String preco = request.getParameter("preco");
		String tipoProduto = request.getParameter("tipoProduto");
		
		produtoDTO produtoDTO = new produtoDTO();
		
		produtoDTO.setNomeProduto(nomeProduto);
		produtoDTO.setVolume(volume);
		produtoDTO.setPreco(preco);
		produtoDTO.setTipoProduto(tipoProduto);
		
		produtoDAO.inserir(produtoDTO);
		
		 
		response.setContentType("text/html");
	    PrintWriter out = response.getWriter();
	    out.println("<html><body><script>alert('Cadastro realizado com sucesso!'); window.location.href='CadastrarProduto.jsp';</script></body></html>");
	}
		
		
	
	}
