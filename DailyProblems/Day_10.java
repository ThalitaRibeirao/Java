import java.io.IOException;
import java.util.Scanner;

//https://judge.beecrowd.com/pt/problems/view/1009

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner (System.in);
        String nome;
        double sal, vendas;
        
        
        nome = input.nextLine();
        sal = input.nextDouble();
        vendas = input.nextDouble();
        
        System.out.printf("TOTAL = R$ %.2f%n", sal + vendas * 0.15);
        
 
    }
 
}
