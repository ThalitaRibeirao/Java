import java.io.IOException;
import java.util.Scanner;

// https://judge.beecrowd.com/pt/problems/view/1006

public class Main {
 
    public static void main(String[] args) throws IOException {
        double a, b, c, med;
        Scanner input;
        
        input = new Scanner(System.in);
        
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
 
        med = (a * 2 + b * 3 + c * 5)/ 10;
        
        System.out.printf("MEDIA = %.1f\n", med);
    }
 
}
