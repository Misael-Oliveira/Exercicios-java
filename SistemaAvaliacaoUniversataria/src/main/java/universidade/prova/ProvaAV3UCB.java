/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidade.prova;

public class ProvaAV3UCB extends ProvaFinalUniversidade {
    
    public ProvaAV3UCB(ProvaUniversidade referencia){
        super(referencia);
        this.pesoProvaFinal =1;
    }

    @Override
    public boolean habilitadoRealizarProva() {
        return true;
    }
}
