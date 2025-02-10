import java.io.IOException;
import java.util.Scanner;

/** https://judge.beecrowd.com/pt/problems/view/1014 */
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner (System.in);
        
        int dis;
        double comb;
        
        dis = input.nextInt();
        comb = input.nextDouble();
        
        System.out.printf("%.3f km/l%n", dis/comb);
    }
}
