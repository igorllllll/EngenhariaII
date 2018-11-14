

package DAO;


import Bean.Cliente;
import Controle.Conexao;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class InsertCliente {
    
    private final Connection connect;
    
    public InsertCliente(Cliente vars) throws SQLException {
        this.connect = Conexao.getConnection();
        insertClientes(vars);
    }
    
    private void insertClientes(Cliente client) throws SQLException{

        Statement stat = this.connect.createStatement();
        String Data  = "insert into clientes (_nome, _idade, _cpf, _tel, _sex, _end, _usuario, _senha) values ('"
                + ""+client.getNome()+"',"
                + "'"+client.getIdade()+"',"
                + "'"+client.getCpf()+"','"
                + ""+client.getTel()+"','"
                + ""+client.getSex()+"','"
                + ""+client.getEnd()+"','"
                + ""+client.getUsuario()+"','"
                + ""+client.getSenha()+""
                + "');";
        stat.execute(Data);
        connect.close();
    }   
}