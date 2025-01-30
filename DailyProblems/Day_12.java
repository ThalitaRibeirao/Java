import java.io.IOException;
import java.util.Scanner;

// https://judge.beecrowd.com/pt/problems/view/1011

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner input = new Scanner(System.in);
        int raio;
        double vol, pi;
        
        raio = input.nextInt();
        pi = 3.14159;
        
        vol = (4/3.0) * pi * raio * raio * raio;
        
        
        System.out.printf("VOLUME = %.3f%n", vol);
        
 
    }
 
}
