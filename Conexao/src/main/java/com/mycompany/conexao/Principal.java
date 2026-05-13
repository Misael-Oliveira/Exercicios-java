/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conexao;

import java.sql.Connection;

/**
 *
 * @author misael.oliveira
 */
public class Principal {

    public static void main(String[] args) {
        BDConexao banco = new BDConexao();
        Connection conexao = null;
        
        try {
            conexao = banco.obterConexao();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
