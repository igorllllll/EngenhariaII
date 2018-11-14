
package DAO;

import Bean.Cliente;
import java.sql.SQLException;

public class TesteDAO {
    
    public static void main(String [] args) throws SQLException{
        
        
        Cliente make = new Cliente("Novo", "22", "067.908.453-30", "(89) 98134-4567", "Feminino", "Rua. Mário Martíns", "admin", "admin");
        Inserir inserir = new DAO.Inserir(make);

    }
}
