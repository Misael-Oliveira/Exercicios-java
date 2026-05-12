
package universidade.prova;

public abstract class ProvaUniversidade {
    protected double av1;
    protected double av2;
    protected double av3;
    protected int peso1;
    protected int peso2;
    protected int peso3;
    protected double mediaMinima;
    protected boolean indicador;
    
    public ProvaUniversidade(double av1, double av2, double av3, boolean indicador){
      
        this.av1 = av1;
        this.av2 = av2;
        this.av3 = av3;
        
        this.indicador = indicador;
    }
    
    public abstract double calcularMedia();
    public abstract ProvaFinalUniversidade getProvaFinalUniversidade();
    
    public boolean aprovado (){
        return calcularMedia() >= mediaMinima;
    }

  
}
