

package DAO;


import Controle.ConexaoBD;
import java.sql.Connection;



public class DAO {
    private Connection con = null;
    private Object ConexaoBD;
    
    public DAO(){
        con = ConexaoBD.Connection();
    }
    
}

