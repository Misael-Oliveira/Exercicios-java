import java.util.Scanner;

public class exe5 {
    public static void main(String[] args) {
        Scanner meuScanner = new Scanner(System.in);

        System.out.println("Digite o salário e o percentual de aumento:");
        float salario = meuScanner.nextFloat();
        float percentual = meuScanner.nextFloat();
        

        float novoSalario = salario * percentual/100 + salario;

        System.out.println("Seu salário com aumento de "+ percentual +"% é: " + novoSalario);
    }    
}
