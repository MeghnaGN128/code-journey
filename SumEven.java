import java.util.Scanner;

public class SumEven {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();     // take full input
        String[] numbers = input.split(",");

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {

            int num = Integer.parseInt(numbers[i].trim());

            if (num % 2 == 0) {
                sum += num;
            }
        }

        System.out.println(sum);
        sc.close();
    }
}