import java.io.IOException;
import java.util.Scanner;

//https://judge.beecrowd.com/pt/problems/view/1004

public class Main {
    public static void main(String[] args) throws IOException {
        int a, b, prod;  
        Scanner input = new Scanner(System.in);
        
        a = input.nextInt();
        b = input.nextInt();
        prod = a * b;
        
        System.out.printf("PROD = %d\n", prod);
    }
}
