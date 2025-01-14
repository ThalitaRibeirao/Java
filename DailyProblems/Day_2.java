import java.io.IOException;
import java.util.Scanner;

// https://judge.beecrowd.com/pt/problems/view/1001

public class Main {
 
    public static void main(String[] args) throws IOException {
        int a, b;
        Scanner input = new Scanner(System.in);
        
        a = input.nextInt();
        b = input.nextInt();
  
        System.out.printf("X = %d\n", a+b);
    }
 
}
