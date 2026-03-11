import java.util.Scanner;

public class exe2 {
    public static void main(String[] args) {
        Scanner meuScanner = new Scanner(System.in);

        System.out.println("Entre com 3 notas:");

        float result;
        float num1 = meuScanner.nextFloat();
        float num2 = meuScanner.nextFloat();
        float num3 = meuScanner.nextFloat();
        

        result = (num1 + num2 + num3)/3;

        System.out.println("O resultado é:" + result);
    }
}
