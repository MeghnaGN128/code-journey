import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 1st Number");
        int a= sc.nextInt();sc.nextLine();
        System.out.println("Enter 2nd Number");
        int b= sc.nextInt();sc.nextLine();
        System.out.println("Enter the operator");
        char op= sc.nextLine().charAt(0);

        if(op == '+'){
            System.out.println(a+" "+op+" "+b+" = "+(a+b));
        }else if(op == '-'){
            System.out.println(a+" "+op+" "+b+" = "+(a-b));
        }else if(op == '*'){
            System.out.println(a+" "+op+" "+b+" = "+(a*b));
        }else if(op == '/'){
            System.out.println(a+" "+op+" "+b+" = "+(a/b));
        }else {
            System.out.println("Invalid input");
        }

    }
}
