/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pooencapsulamento;

/**
 *
 * @author misael.oliveira
 */
public class POOencapsulamento {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        
        p1.setNome("Misael");
        p1.setIdade(23);
        System.out.println("Meu nome "+ p1.getNome());
        
       Pessoa p2 = new Pessoa("João", 26);
        
        //System.out.println("Meu nome "+p2.nome);
        
       //Calculadora s = new Calculadora();
        //System.out.println(s.somar(2,5));
    }
}
