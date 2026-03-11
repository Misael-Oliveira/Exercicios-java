import java.util.Scanner;

public class exe1 {
    public static void main(String[] args) {
        Scanner meuScanner = new Scanner(System.in);

        System.out.println("Entre com 4 números:");

        int result;
        int num1 = meuScanner.nextInt();
        int num2 = meuScanner.nextInt();
        int num3 = meuScanner.nextInt();
        int num4 = meuScanner.nextInt();

        result = num1 + num2 + num3 + num4;

        System.out.println("O resultado é:" + result);
    }
}
