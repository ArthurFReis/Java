
package JDBC;

import java.sql.*;
import java.util.List;
import java.util.ArrayList;

public class Conexao {
    public static final String NOME_DB = "reserva.db";
    public static final String STRING_CONEXAO = "jdbc:sqlite:C:/Users/Arthur Reis/Desktop/Reservas de carro/LocadoraAutomoveis/src/" + NOME_DB;
    


    public Connection getConnection() {

        try{
            
            
            return DriverManager.getConnection(STRING_CONEXAO);
            

        }catch (SQLException e) {
            System.out.println(" Não foi possível conectar com a banco de dados");
            throw new RuntimeException(e);
        }

    } 

       
public static void main(String[] args) {

}

}
