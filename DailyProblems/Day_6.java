import java.io.IOException;
import java.util.Scanner;

// https://judge.beecrowd.com/pt/problems/view/1005

public class Main {
 
    public static void main(String[] args) throws IOException {
        double a, b, med;
        Scanner input;
        
        input = new Scanner(System.in);
        
        a = input.nextDouble();
        b = input.nextDouble();
        med = (a * 3.5 + b * 7.5) / 11;
        
        System.out.printf("MEDIA = %.5f\n", med);
    }
 
}
