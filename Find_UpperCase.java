import java.util.Scanner;

public class Find_UpperCase {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String[] s= sc.nextLine().split(" ");
        System.out.println("The letter Starts with capital number: ");
        for(int i=0;i<s.length;i++){
            if(s[i].charAt(0)>='A'&&s[i].charAt(0)<='Z'){
                System.out.print(s[i]);
                if (i < s.length - 1) {
                    System.out.print(", ");
                }

            }
        }
    }
}
