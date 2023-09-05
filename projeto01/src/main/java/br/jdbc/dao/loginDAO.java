package br.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.jdbc.ConexaoUtil;
import br.jdbc.dto.loginDTO;

public class loginDAO {
    public void inserir(loginDTO loginDTO) {
        try {
            Connection connection = ConexaoUtil.getInstance().getConnection();

            String sql = "INSERT INTO clientes(emailCliente, senhaCliente) VALUES(?, ?)";

            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setString(1, loginDTO.getEmailCliente());
            statement.setString(2, loginDTO.getSenhaCliente());

            statement.execute();
            connection.close();

            System.out.println("Inserido com sucesso");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void remover(int idCliente) {
        try {
            Connection connection = ConexaoUtil.getInstance().getConnection();

            String sql = "DELETE FROM clientes WHERE idCliente = ?";

            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setInt(1, idCliente);

            statement.execute();
            statement.close();

            System.out.println("Removido com sucesso");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<loginDTO> listarTodos() {
        List<loginDTO> listaClientes = new ArrayList<loginDTO>();
        try {
            Connection connection = ConexaoUtil.getInstance().getConnection();

            String sql = "SELECT * FROM clientes";

            PreparedStatement statement = connection.prepareStatement(sql);

            ResultSet resultset = statement.executeQuery();

            while (resultset.next()) {
                loginDTO loginDTO = new loginDTO();
                loginDTO.setIdCliente(resultset.getInt("idCliente"));
                loginDTO.setEmailCliente(resultset.getString("emailCliente"));
                loginDTO.setSenhaCliente(resultset.getString("senhaCliente"));

                listaClientes.add(loginDTO);
            }
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaClientes;
    }

    public void atualizar(loginDTO loginDTO) {
        try {
            Connection connection = ConexaoUtil.getInstance().getConnection();

            String sql = "UPDATE clientes SET emailCliente = ?, senhaCliente = ? WHERE idCliente = ?";

            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setString(1, loginDTO.getEmailCliente());
            statement.setString(2, loginDTO.getSenhaCliente());
            statement.setInt(3, loginDTO.getIdCliente());

            statement.execute();
            statement.close();

            System.out.println("Atualizado com sucesso");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean validarLogin(loginDTO loginDTO) throws ClassNotFoundException {
        try {
            Connection connection = ConexaoUtil.getInstance().getConnection();

            String sql = "SELECT COUNT(*) FROM clientes WHERE emailCliente = ? AND senhaCliente = ?";

            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setString(1, loginDTO.getEmailCliente());
            statement.setString(2, loginDTO.getSenhaCliente());

            ResultSet resultSet = statement.executeQuery();

            resultSet.next();
            int count = resultSet.getInt(1);

            connection.close();

            return count > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
