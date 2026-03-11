import java.util.Scanner;

public class exe4 {
     public static void main(String[] args) {
        Scanner meuScanner = new Scanner(System.in);

        System.out.println("Digite o salário:");
        float salario = meuScanner.nextFloat();
        

        float novoSalario = salario * 25/100 + salario;

        System.out.println("Seu salário com aumento de 25% é:" + novoSalario);
    }    
}
