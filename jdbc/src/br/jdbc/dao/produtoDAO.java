package br.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.jdbc.ConexaoUtil;
import br.jdbc.dto.produtoDTO;

public class produtoDAO {
	
	public void inserir(br.jdbc.dto.produtoDTO produtoDTO) {
		try {
		
		Connection connection = ConexaoUtil.getInstance().getConnection();
		
		String sql = "INSERT INTO produtos(nomeProduto, volume, preco, tipoProduto) VALUES(?, ?, ?, ?) ";
		
			PreparedStatement statement = connection.prepareStatement(sql);
			
			
			statement.setString(1, produtoDTO.getNomeProduto());
			statement.setInt(2, produtoDTO.getVolume());
			statement.setString(3, produtoDTO.getPreco());
			statement.setString(4, produtoDTO.getTipoProduto());
			
			statement.execute();
			connection.close();
			
			System.out.println("Inserido com sucesso");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void remover(int idProduto) {
		try {
			Connection connection = ConexaoUtil.getInstance().getConnection();
			
			String sql = "DELETE FROM PRODUTOS WHERE idProduto = ?";
			
			PreparedStatement statement = connection.prepareStatement(sql);
			
			statement.setInt(1, idProduto);
			
			statement.execute();
			statement.close(); 
			
			System.out.println("Removido com sucesso");
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<produtoDTO> listarTodos () {
		List<produtoDTO> listaProdutos = new ArrayList<produtoDTO>();
		try {
			Connection connection = ConexaoUtil.getInstance().getConnection();
			
			String sql = "SELECT * FROM produtos";
			
			PreparedStatement statement = connection.prepareStatement(sql);
			
			ResultSet resultset = statement.executeQuery();
			
			while(resultset.next()) {
				produtoDTO produtoDTO = new produtoDTO();
				produtoDTO.setIdProduto(resultset.getInt("idProduto"));
				produtoDTO.setNomeProduto(resultset.getNString("nomeProduto"));
				produtoDTO.setVolume(resultset.getInt("volume"));
				produtoDTO.setPreco(resultset.getNString("preco"));
				produtoDTO.setTipoProduto(resultset.getNString("tipoProduto"));
				
				listaProdutos.add(produtoDTO);
			}
			connection.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listaProdutos;
	}
	
	
	public void atualizar(produtoDTO produtoDTO) {
		try {
			Connection connection = ConexaoUtil.getInstance().getConnection();
			
			String sql = "UPDATE produtos SET nomeProduto = ?, volume = ?,"
					+ " preco = ?, tipoProduto = ?  WHERE idProduto = ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			
			
			statement.setString(1, produtoDTO.getNomeProduto());
			statement.setInt(2, produtoDTO.getVolume());
			statement.setString(3, produtoDTO.getPreco());
			statement.setString(4, produtoDTO.getTipoProduto());
			statement.setInt(5, produtoDTO.getIdProduto());
			
			statement.execute();
			statement.close();
			
		System.out.println("Atualizado com sucesso");	
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main (String[] args) {
		
		produtoDAO produtoDAO = new produtoDAO();
		
		List<produtoDTO> listaProdutos = new ArrayList<>();
		
		listaProdutos = produtoDAO.listarTodos ();
		
		for (int i = 0; i < listaProdutos.size() ; i++ ) {
			System.out.println(listaProdutos.get(i));
		}
		
		
	}
	
	
	
}

