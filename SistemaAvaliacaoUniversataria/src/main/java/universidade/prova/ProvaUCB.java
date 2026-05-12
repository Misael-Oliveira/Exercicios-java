
package universidade.prova;


public class ProvaUCB extends ProvaUniversidade  {

    public ProvaUCB(double av1, double av2, double av3, boolean indicador) {
        super(av1, av2, av3, indicador);
        
        this.mediaMinima=7;
        
        this.peso1=1;
        this.peso2=1;
        this.peso3=1;
    }

    @Override
    public double calcularMedia() {
        double nota1 = av1;
        double nota2 = av2;
        
        if(indicador) {
            if(nota1<=nota2){
                nota1= av3;
                return (nota1*peso3+nota2*peso2);
            }
            else{
                nota2= av3;
                return (nota1*peso1+nota2*peso3);
            }
        }else{
            return (nota1*peso1+nota2*peso2);
        }
    }

    

    @Override
    public ProvaFinalUniversidade getProvaFinalUniversidade() {
        return new ProvaAV3UCB(this);
    }

}
