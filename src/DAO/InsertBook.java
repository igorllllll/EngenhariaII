package DAO;


import Bean.Livro; ///
import Controle.Conexao;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class InsertBook {
    
    private final Connection connect;
    
    public InsertBook(Livro book) throws SQLException {
        this.connect = Conexao.getConnection();
        insertClientes(book);
    }
    
    private void insertClientes(Livro book) throws SQLException{

        Statement stat = this.connect.createStatement();
        String Data  = "insert into livro (_titulo ,_autor ,_genero , _ano, _valor) values ('"
                + ""+book.getTitulo()+"',"
                + "'"+book.getAutor()+"',"
                + "'"+book.getGenero()+"','"
                + ""+book.getAno()+"','"
                + ""+book.getValor()+"');";
        stat.execute(Data);
        connect.close();
    } 
}
