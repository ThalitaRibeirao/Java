import java.io.IOException;
import java.util.Scanner;

// https://judge.beecrowd.com/pt/problems/view/1007

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner input;
        int a, b, c, d, dif;
        
        input = new Scanner(System.in);
        
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();
        
        dif = (a * b) - (c * d);
        
        System.out.printf("DIFERENCA = %d\n", dif);
 
    }
 
}
