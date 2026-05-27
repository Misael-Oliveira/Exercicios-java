
package com.mycompany.padraocreator;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Produto> produtos;
    
    public CarrinhoDeCompras(){
        produtos = new ArrayList<>();
    }
    
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println(produto.getNome() + " adicionado ao carrinho");
    }
    
    public double calccularTotal(){
        double total =0;
        for (Produto produto: produtos) {
            total += produto.getPreco();
        }
        return total;
    }
    
}
