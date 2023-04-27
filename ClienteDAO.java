
package DAO;

import ModelBanco.Cliente;
import JDBC.Conexao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClienteDAO {
    private Connection conn;

    public ClienteDAO() {
        this.conn = new Conexao().getConnection();
    }

    
    public boolean add(Cliente cliente) throws SQLException {
        String inserirPSQL = "INSERT INTO Cliente (CPF, Nome, DataNascimento, Cidade, Estado, Email, Telefone) VALUES (?,?,?,?,?,?,?)";
        try {
            PreparedStatement statement = conn.prepareStatement(inserirPSQL);
            statement.setInt(1, cliente.getCpf());
            statement.setString(2, cliente.getNome());
            statement.setString(3, cliente.getDataNascimento());
            statement.setString(4, cliente.getCidade());
            statement.setString(5, cliente.getEstado());
            statement.setString(6, cliente.getEmail());
            statement.setString(7, cliente.getTelefone());
            statement.executeUpdate();
            statement.close();
            conn.close();
            return true;

        }catch (SQLException e) {

            System.out.println("Couldn't connect to database " + e.getMessage());
            e.printStackTrace();
            return false;

        }
    }
    
    public boolean update (Cliente cliente) {
        String atualizarPSQL = "UPDATE Cliente SET CPF = ?, Nome = ?,  DataNascimento = ?, Cidade = ?, Estado = ?, Email = ?, Telefone = ? WHERE CPF =?";
        try {
            PreparedStatement statement = conn.prepareStatement(atualizarPSQL);
            statement.setInt(1, cliente.getCpf());
            statement.setString(2, cliente.getNome());
            statement.setString(3, cliente.getDataNascimento());
            statement.setString(4, cliente.getCidade());
            statement.setString(5, cliente.getEstado());
            statement.setString(6, cliente.getEmail());
            statement.setString(7, cliente.getTelefone());
            statement.execute();
            statement.close();
            conn.close();

            return true;

        }catch (SQLException e) {

            System.out.println("Couldn't connect to database " + e.getMessage());
            e.printStackTrace();
            return false;

        }
    }
    
    
    public boolean delete(Cliente cliente) {
        String atualizarPSQL = "DELETE FROM Cliente WHERE CPF = ?";
        try {
            PreparedStatement statement = conn.prepareStatement(atualizarPSQL);
            statement.setInt(1, cliente.getCpf());
            statement.execute();
            statement.close();
            conn.close();

            return true;

        }catch (SQLException e) {

            System.out.println("Couldn't connect to database " + e.getMessage());
            e.printStackTrace();
            return false;

        }

    }
    
    public List<Cliente> getList(){

        List<Cliente> cli = new ArrayList<>();
        String listSQL = "SELECT * FROM Cliente";
        try {
            PreparedStatement statement = conn.prepareStatement(listSQL);
            ResultSet rs = statement.executeQuery();
            while(rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setCpf(rs.getInt("CPF"));
                cliente.setNome(rs.getString("Nome"));
                cliente.setDataNascimento(rs.getString("DataNascimento"));
                cliente.setCidade(rs.getString("Cidade"));
                cliente.setEstado(rs.getString("Estado"));
                cliente.setEmail(rs.getString("Email"));
                cliente.setTelefone(rs.getString("Telefone"));
                cli.add(cliente);
            }
            statement.close();
            rs.close();
            conn.close();
        }catch (SQLException e) {
            e.printStackTrace();
            return null;
        }return cli;
    }
    
     public static void main(String[] args) {
    // bla bla bla
    }
}
