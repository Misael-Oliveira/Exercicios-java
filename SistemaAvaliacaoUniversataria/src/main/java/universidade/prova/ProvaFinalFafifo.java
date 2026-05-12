
package universidade.prova;

public class ProvaFinalFafifo extends ProvaFinalUniversidade {
    
    public ProvaFinalFafifo(ProvaUniversidade referencia){
        super(referencia);
        this.pesoProvaFinal =3;
    }
    
    @Override
    public boolean habilitadoRealizarProva() {
        return referencia.calcularMedia() <6;
    }
    
}
