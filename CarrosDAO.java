
package DAO;

import ModelBanco.Carro;
import JDBC.Conexao;
import java.util.*;
import java.sql.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CarrosDAO {
    private Connection conn;

    public CarrosDAO() {
        this.conn = new Conexao().getConnection();
    }

    
    public boolean addCarro(Carro carro) throws SQLException {
        String inserirPSQL = "INSERT INTO Carro (Nome, Marca, Ano, Placa, Categoria, Alugado, Preco) VALUES (?,?,?,?,?,?,?)";
        try {
            PreparedStatement statement = conn.prepareStatement(inserirPSQL);
            statement.setString(1, carro.getNome());
            statement.setString(2, carro.getMarca());
            statement.setInt(3, carro.getAno());
            statement.setString(4, carro.getPlaca());
            statement.setString(5, carro.getCategoria());
            statement.setString(6, carro.getAlugado());
            statement.setDouble(7, carro.getPreco());
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
    
    public boolean update (Carro carro) {
        String atualizarPSQL = "UPDATE Carro SET Nome = ?, Marca = ?,  Ano = ?, Placa = ?, Categoria = ?, Alugado = ?, Preco = ? WHERE Placa =?";
        try {
            PreparedStatement statement = conn.prepareStatement(atualizarPSQL);
           statement.setString(1, carro.getNome());
            statement.setString(2, carro.getMarca());
            statement.setInt(3, carro.getAno());
            statement.setString(4, carro.getPlaca());
            statement.setString(5, carro.getCategoria());
            statement.setString(6, carro.getAlugado());
            statement.setDouble(7, carro.getPreco());
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
    
    
    public boolean delete(Carro carro) {
        String atualizarPSQL = "DELETE FROM Carro WHERE Placa = ?";
        try {
            PreparedStatement statement = conn.prepareStatement(atualizarPSQL);
            statement.setString(1, carro.getPlaca());
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
    
    public List<Carro> getList(){

        List<Carro> car = new ArrayList<>();
        String listSQL = "SELECT * FROM Carro";
        try {
            PreparedStatement statement = conn.prepareStatement(listSQL);
            ResultSet rs = statement.executeQuery();
            while(rs.next()) {
               Carro carro = new Carro();
                carro.setNome(rs.getString("Nome"));
                carro.setMarca(rs.getString("Marca"));
                carro.setAno(rs.getInt("Ano"));
                carro.setPlaca(rs.getString("Placa"));
                carro.setCategoria(rs.getString("Categoria"));
                carro.setAlugado(rs.getString("Alugado"));
                carro.setPreco(rs.getDouble("Preco"));
                car.add(carro);
            }
            statement.close();
            rs.close();
            conn.close();
        }catch (SQLException e) {
            e.printStackTrace();
            return null;
        }return car;
    }
 public static void main(String[] args) {
    // bla bla bla
    }

    }


