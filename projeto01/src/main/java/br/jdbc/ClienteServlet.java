package br.jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.jdbc.dao.*;
import br.jdbc.dto.clienteDTO;

/**
 * Servlet implementation class ClienteServlet
 */
@WebServlet("/ClienteServlet")
public class ClienteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	private clienteDAO clienteDAO = new clienteDAO();	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClienteServlet() {
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
		String nomeCliente = request.getParameter("nomeCliente");
		String emailCliente = request.getParameter("emailCliente");
		String senhaCliente = request.getParameter("senhaCliente");
		String enderecoCliente = request.getParameter("enderecoCliente");
		Integer telefoneCliente = (Integer.parseInt(request.getParameter("telefoneCliente")));
		
		

		
		clienteDTO clienteDTO = new clienteDTO();
		
		
		
	
		
		clienteDTO.setNomeCliente(nomeCliente);
		clienteDTO.setEmailCliente(emailCliente);
		clienteDTO.setSenhaCliente(senhaCliente);
		clienteDTO.setEnderecoCliente(enderecoCliente);
		clienteDTO.setTelefoneCliente(telefoneCliente);
	
	
		

        try {
        	clienteDAO.inserir(clienteDTO);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("erro na inserção");
		}
	
    
}
}
