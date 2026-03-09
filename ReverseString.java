import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[] words = s.split(" ");

        for(int i = words.length-1; i >= 0; i--){
            String w = words[i];

            for(int j = w.length()-1; j >= 0; j--){
                System.out.print(w.charAt(j));
            }

            System.out.print(" ");
        }
    }
}
