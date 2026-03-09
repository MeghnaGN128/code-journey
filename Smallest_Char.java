import java.util.Scanner;

public class Smallest_Char {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        char c= s.charAt(0);
        for(int i=0;i<s.length();i++){
            for(int j=i+1;i<s.length();i++){
                if(Character.compare(c,s.charAt(j))>0){
                      c=s.charAt(j);
                }
            }
        }
        System.out.println(c);
    }
}
