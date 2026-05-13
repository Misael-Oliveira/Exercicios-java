
package com.mycompany.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class BDConexao {
    private static final String URL = "jdbc:mysql://localhost:3307/bd_poo";
    private static final String USUARIO = "root";
    private static final String SENHA = "catolica";
    
    public Connection obterConexao() throws Exception {
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        Connection conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
        System.out.println("Conexão estabelecida com o banco de dados!");
        return conexao;
    }catch (ClassNotFoundException e){
        throw new Exception("Driver JSBC do MySQL não encontrado "+ e.getMessage());
    } catch (SQLException e){
         throw new Exception("Erro ao conectar ao banco de dados: "+ e.getMessage());
    }catch (Exception e){
        System.out.print("Exceção não identifica "+e.getMessage());
        return null;
    }
    }
    
}

    

