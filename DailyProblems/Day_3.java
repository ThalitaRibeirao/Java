import java.io.IOException;
import java.util.Scanner;

// https://judge.beecrowd.com/pt/problems/view/1002

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        double a, n, area;
        String output;
        
        n = 3.14159;
        
        a = input.nextDouble();
        area = a * a * n;
        
        output = String.format("%.4f", area);
        System.out.printf("A=%s\n", output);
    }
}
