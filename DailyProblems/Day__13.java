import java.io.IOException;
import java.util.Scanner;

// https://judge.beecrowd.com/pt/problems/view/1012

public class Main {
 
    public static void main(String[] args) throws IOException {
            Scanner input = new Scanner(System.in);
            double a, b, c;
            
            a = input.nextDouble();
            b = input.nextDouble();
            c = input.nextDouble();
            
            System.out.printf("TRIANGULO: %.3f%n", (a * c)/2.0);
            System.out.printf("CIRCULO: %.3f%n", c * c * 3.14159);
            System.out.printf("TRAPEZIO: %.3f%n", (a + b)/2.0 * c);
            System.out.printf("QUADRADO: %.3f%n", b *b);
            System.out.printf("RETANGULO: %.3f%n", a * b);
    }
 
}
