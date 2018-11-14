
package DAO;

import java.sql.SQLException;

public class teste {
    
    public static void main(String [] args) throws SQLException{
        
        Login login = new DAO.Login();
        if(login.checkLogin("mpgx5.c","hacker@x5")){
            System.out.println("Login Realizado!");
        }else{
            System.out.println("Login Falhou!");
        }
        //Inserir inserir = new DAO.Inserir("Mateus", "22", "067.908.453-30", "(89) 98134-4567", "Masculino", "Rua. Mário Martíns", "mpgx5.c", "hacker@x5");
    }
}
