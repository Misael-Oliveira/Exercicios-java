
package com.mycompany.pooencapsulamento;

/**
 *
 * @author misael.oliveira
 */
public class Pessoa {
    private String nome;
    private int idade;
    
    
    // Construtor padrão
    public Pessoa() {
    this.nome = "Sem nome";
    this.idade = 0;
    }
    // Construtor parametrizado
    public Pessoa(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
    }
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    
}
