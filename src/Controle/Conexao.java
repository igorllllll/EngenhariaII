

package Controle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Conexao {
    
    private static final String url = "jdbc:mysql://localhost/biblioteca";
    private static Connection connnect = null;
    
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            connnect = DriverManager.getConnection(url, "root", "");

        } catch (ClassNotFoundException ex) {
            System.out.println("Driver mysql nao encontrado");
        } catch (SQLException ex) {
            System.out.println("Erro ao tentar conectar ao mysql");
        }
        System.err.println("Conectado!");
        return connnect;
    }
    
    public static PreparedStatement getPreparedStatement(String sql){
        if(connnect == null){
            connnect = getConnection();
        }
        try{
            return connnect.prepareStatement(sql);
        }catch(SQLException error){
            System.out.println("Erro de sql: " + error.getMessage());
        }
        return null;
    }
    
}