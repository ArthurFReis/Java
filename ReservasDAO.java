

package DAO;

import ModelBanco.Reserva;
import JDBC.Conexao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReservasDAO {
    private Connection conn;

    public ReservasDAO() {
        this.conn = new Conexao().getConnection();
    }

    
    public boolean add(Reserva reserva) throws SQLException {
        String inserirPSQL = "INSERT INTO Cliente (CPF, TipoReserva, DataReserva, DataEntrega, Valor, ValorTotal, HoraReserva, HoraEntrega, NomeCliente, Categoria, NomeCarro) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement statement = conn.prepareStatement(inserirPSQL);
            statement.setInt(1, reserva.getCpf());
            statement.setString(2, reserva.getTipoReserva());
            statement.setString(3, reserva.getDataReserva());
            statement.setString(4, reserva.getDataEntrega());
            statement.setDouble(5, reserva.getPreco());
            statement.setDouble(6, reserva.getPrecoTotal());
            statement.setString(7, reserva.getHoraReserva());
            statement.setString(8, reserva.getHoraEntrega());
            statement.setString(9, reserva.getNomeCliente());
            statement.setString(10, reserva.getCarroCategoria());
            statement.setString(11, reserva.getNomeCarro());
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
    
    public boolean update (Reserva reserva) {
        String atualizarPSQL = "UPDATE Reserva SET CPF =?, TipoReserva =?, DataReserva =?, DataEntrega =?, Valor =?, ValorTotal =?, HoraReserva =?, HoraEntrega =?, NomeCliente =?, Categoria =?, NomeCarro =? WHERE CPF =?";
        try {
            PreparedStatement statement = conn.prepareStatement(atualizarPSQL);
           statement.setInt(1, reserva.getCpf());
            statement.setString(2, reserva.getTipoReserva());
            statement.setString(3, reserva.getDataReserva());
            statement.setString(4, reserva.getDataEntrega());
            statement.setDouble(5, reserva.getPreco());
            statement.setDouble(6, reserva.getPrecoTotal());
            statement.setString(7, reserva.getHoraReserva());
            statement.setString(8, reserva.getHoraEntrega());
            statement.setString(9, reserva.getNomeCliente());
            statement.setString(10, reserva.getCarroCategoria());
            statement.setString(11, reserva.getNomeCarro());
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
    
    
    public boolean delete(Reserva reserva) {
        String atualizarPSQL = "DELETE FROM Reserva WHERE CPF = ?";
        try {
            PreparedStatement statement = conn.prepareStatement(atualizarPSQL);
            statement.setInt(1, reserva.getCpf());
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
    
    public List<Reserva> getList(){

        List<Reserva> res = new ArrayList<>();
        String listSQL = "SELECT * FROM Cliente";
        try {
            PreparedStatement statement = conn.prepareStatement(listSQL);
            ResultSet rs = statement.executeQuery();
            while(rs.next()) {
                Reserva reserva = new Reserva();
                reserva.setCpf(rs.getInt("CPF"));
                reserva.setTipoReserva(rs.getString("TipoReserva"));
                reserva.setDataReserva(rs.getString("DataReserva"));
                reserva.setDataEntrega(rs.getString("DataEntrega"));
                reserva.setPreco(rs.getDouble("Valor"));
                reserva.setPrecoTotal(rs.getDouble("ValorTotal"));
                reserva.setHoraReserva(rs.getString("HoraReserva"));
                reserva.setHoraEntrega(rs.getString("HoraEntrega"));
                reserva.setNomeCliente(rs.getString("NomeCliente"));
                reserva.setCarroCategoria(rs.getString("Categoria"));
                reserva.setNomeCarro(rs.getString("NomeCarro"));
                res.add(reserva);
            }
            statement.close();
            rs.close();
            conn.close();
        }catch (SQLException e) {
            e.printStackTrace();
            return null;
        }return res;
    }
    
     public static void main(String[] args) {
    // bla bla bla
    }
}
