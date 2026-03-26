import java.util.*;

public class CountPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;

        while (num > 0) {
            int digit = num % 10;

            if (isPrime(digit)) {
                count++;
            }

            num = num / 10;
        }

        System.out.println(count);
    }

    static boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }
}