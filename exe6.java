import java.util.Scanner;

public class exe6 {
    public static void main(String[] args) {
        Scanner meuScanner = new Scanner(System.in);

        System.out.println("Digite o salário base:");
        double salario = meuScanner.nextDouble();
        
        double gratificacao = 5/100.0;
        double imposto = 7/100.0;

        double novoSalario = salario * gratificacao + salario;
        novoSalario = novoSalario - novoSalario * imposto;

        System.out.println("Seu salário com gratificação e imposto é: " + novoSalario);
    }    
}
