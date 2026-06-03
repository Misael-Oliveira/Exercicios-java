
package com.mycompany.grasp.hotel;

public class Main {
    public static void main(String[] args) {
        Recepcionista recepcionista = new Recepcionista();
        Camareiro camareiro = new Camareiro();
        Gerente gerente = new Gerente();
        
        recepcionista.fazerCheckIn("João");
        camareiro.limparQuarto(151);
        gerente.gerenciarReservas();
        
        
    }
}
