import java.io.IOException;
import java.util.Scanner;

// https://judge.beecrowd.com/pt/problems/view/1010

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        int qtd1, qtd2;
        double val1, val2, total;
        
        Scanner input = new Scanner(System.in);

        input.nextInt();
        
        qtd1 = input.nextInt();
        val1 = input.nextDouble();
        
        input.nextInt();
        
        qtd2 = input.nextInt();
        val2 = input.nextDouble();
        
        total = qtd1 * val1 + qtd2 * val2;
        
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
        
 
    }
 
}
