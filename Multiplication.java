
import java.util.Scanner;

public class Multiplication {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            System.out.println(m + " x " + i + " = " + (m*i));
        }
    }
}
