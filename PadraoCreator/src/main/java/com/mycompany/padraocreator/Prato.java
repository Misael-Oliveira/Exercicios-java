/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.padraocreator;


public class Prato {
    private String nome;
    private String ingredientes;
    
    public Prato (String nome, String ingredientes){
        this.nome = nome;
        this.ingredientes = ingredientes;
    }
    
    public void exibirDetalhes () {
        System.out.println("Prato: " + nome + " | ingredientes: "+ ingredientes);
    }
    
}
