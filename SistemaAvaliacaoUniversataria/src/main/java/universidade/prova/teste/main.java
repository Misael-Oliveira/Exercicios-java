/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidade.prova.teste;

import universidade.prova.ProvaFafifo;
import universidade.prova.ProvaUCB;
import universidade.prova.ProvaUniversidade;


/**
 *
 * @author Usuário
 */
public class main {

    public static void main(String[] args) {
        ProvaUniversidade s1 = new ProvaUCB(3.4, 2.9, 3.7, true);
       
        System.out.println(s1.calcularMedia());
        System.out.println(s1.aprovado());
        
        ProvaUniversidade s2 = new ProvaFafifo(3.4, 1.4, 3.7, true);
        
        System.out.println(s2.calcularMedia());
        System.out.println(s2.aprovado());
        
       
    }
}
