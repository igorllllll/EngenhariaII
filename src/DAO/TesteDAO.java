
package DAO;

import java.sql.SQLException;

public class TesteDAO {
    
    public static void main(String [] args) throws SQLException{
        /*
        Login login = new DAO.Login();
        String user = "mpgx5.c",
                pwd = "hacker@x5";
        
        if(login.checkLogin(user, pwd)){
            System.out.println("Login Realizado!");
        }else{
            System.out.println("Login Falhou!");
        }
        */
        Inserir inserir = new DAO.Inserir("Tiago", "22", "067.908.453-30", "(89) 98134-4567", "Feminino", "Rua. Mário Martíns", "admin", "admin");
    }
}
