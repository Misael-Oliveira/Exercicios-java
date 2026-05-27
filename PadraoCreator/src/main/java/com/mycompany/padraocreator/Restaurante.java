/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.padraocreator;

/**
 *
 * @author misael.oliveira
 */
public class Restaurante {
    private String nomeRestaurante;
    
    public Restaurante (String nomeRestaurante){
        this.nomeRestaurante = nomeRestaurante;   
    }
    
    public Prato prepararPrato(String nome, String ingredientes){
        System.out.println(nomeRestaurante + " está preparando o prato " +nome);
        return new Prato (nome, ingredientes);
    }
    
}
