import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

//https://judge.beecrowd.com/pt/problems/view/1013

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        
        int a, b, c, aux, maior;
        
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        aux = (a + b + Math.abs(a - b))/2;
        maior = (c + aux + Math.abs(c - aux))/2;
        System.out.printf("%d eh o maior%n", maior);
 
    }
 
}
