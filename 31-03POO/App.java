/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poo;

/**
 *
 * @author misael.oliveira
 */
public class App {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("João", 23);
        p1.mostrarDados();
        
        Funcionario f1 = new Funcionario("Maria", 35,2800);
        f1.mostrarDados();
        
        ChefeDeDepartamento cd = new ChefeDeDepartamento("Paulo", 23, 3900,"T.I.");
        cd.mostrarDados();
        
    }
}
