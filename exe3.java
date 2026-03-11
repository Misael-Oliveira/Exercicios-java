import java.util.Scanner;

public class exe3 {
    public static void main(String[] args) {
        Scanner meuScanner = new Scanner(System.in);

        System.out.println("Entre com 1 nota e o peso:");
        float nota1 = meuScanner.nextFloat();
        int peso1 = meuScanner.nextInt();

        System.out.println("Entre com 2 nota e o peso:");
        float nota2 = meuScanner.nextFloat();
        int peso2 = meuScanner.nextInt();

        System.out.println("Entre com 3 nota e o peso:");
        float nota3 = meuScanner.nextFloat();
        int peso3 = meuScanner.nextInt();
        

        float result = (nota1*peso1 + nota2*peso2 + nota3*peso3)/(peso1 + peso2 + peso3);

        System.out.println("O resultado é:" + result);
    }    
}
