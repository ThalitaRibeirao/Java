import java.io.IOException;
import java.util.Scanner;

// https://judge.beecrowd.com/pt/problems/view/1003

public class Main {
 
    public static void main(String[] args) throws IOException {
        int a, b, soma;
        Scanner input = new Scanner(System.in);
        
        a = input.nextInt();
        b = input.nextInt();
        soma = a + b;
        
        System.out.printf("SOMA = %d\n", soma);
    } 
}
