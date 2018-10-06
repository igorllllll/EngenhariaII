

package DAO;


import Controle.Conexao;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class Inserir {
    
    
    public String peso;
    public String altura;
    public String imc;
    public String user_fk;
    private final Connection connect;

    public Inserir(String peso, String altura, String imc, String user_fk) throws SQLException {
        
        this.peso = peso;
        this.altura = altura;
        this.imc = imc;
        this.user_fk = user_fk;
        this.connect = Conexao.getConnection();
        insertData();
    }
   
    private void insertData() throws SQLException{
        
        Statement stat = connect.createStatement();
        String Data  = "insert into hist (_peso, _altura, _imc, FK_USER) values ('"+peso+"','"+altura+"','"+imc+"','"+user_fk+"');";
        stat.execute(Data);
        connect.close();
    }   
}