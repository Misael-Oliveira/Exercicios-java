/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidade.prova;


public class ProvaFafifo extends ProvaUniversidade {

    public ProvaFafifo(double av1, double av2, double av3, boolean indicador) {
        super(av1, av2, av3, indicador);
        
        this.mediaMinima=6;
        
        this.peso1=1;
        this.peso2=1;
        this.peso3=3;
    }

    @Override
    public double calcularMedia() {
         double media =av1*peso1+av2*peso2;
        if(indicador && media <6 ) {
            return(av1*peso1+av2*peso2+av3*3);
        }else{
            return media;
        }
    
    }

    @Override
    public ProvaFinalUniversidade getProvaFinalUniversidade() {
        return new ProvaFinalFafifo(this);
    }

    
}