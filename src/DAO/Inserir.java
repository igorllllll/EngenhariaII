

package DAO;


import Controle.Conexao;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class Inserir {
    
    public String _nome,
    _idade,
    _cpf,
    _tel,
    _sex,
    _end,
    _usuario,
    _senha;
    private final Connection connect;
    
    public Inserir(String nome, String _idade, String _cpf, String _tel, String _sex, String _end, String _usuario, String _senha) throws SQLException {
        
        this._nome = nome;
        this._idade = _idade;
        this._cpf = _cpf;
        this._tel = _tel;
        this._sex = _sex;
        this._end = _end;
        this._usuario = _usuario;
        this._senha = _senha;
        
        this.connect = Conexao.getConnection();
        insertClientes();
    }
    
    


   
    private void insertClientes() throws SQLException{

        Statement stat = connect.createStatement();
        String Data  = "insert into clientes (_nome, _idade, _cpf, _tel, _sex, _end, _usuario, _senha) values ('"
                + ""+_nome+"',"
                + "'"+_idade+"',"
                + "'"+_cpf+"','"
                + ""+_tel+"','"
                + ""+_sex+"','"
                + ""+_end+"','"
                + ""+_usuario+"','"
                + ""+_senha+""
                + "');";
        stat.execute(Data);
        connect.close();
    }   
}