/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.padraocreator;

/**
 *
 * @author misael.oliveira
 */
public class PadraoCreator {

    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante("Restaurante Saboroso");
        
        Prato prato1 = restaurante.prepararPrato("Lasanha", "Massa, Queijo, Molho de Tomate");
        
        prato1.exibirDetalhes();
        
        Produto produto1 = new Produto("Arroz", 30.99);
        Produto produto2 = new Produto("Feijão", 19.99);
        Produto produto3 = new Produto("Açucar", 20.99);
        
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        
        carrinho.adicionarProduto(produto1);
        carrinho.adicionarProduto(produto2);
        carrinho.adicionarProduto(produto3);
        
        double total = carrinho.calccularTotal();
        System.out.println("Valor tatal das compras: R$ "+total);
    }
}
