
package universidade.prova;


public abstract class ProvaFinalUniversidade {
    protected double notaProvaFinal;
    protected int pesoProvaFinal;
    protected boolean indicador;
    protected ProvaUniversidade referencia;
    
    public ProvaFinalUniversidade (ProvaUniversidade referencia){
        this.referencia = referencia;
    }
    
    public abstract boolean habilitadoRealizarProva();
}
