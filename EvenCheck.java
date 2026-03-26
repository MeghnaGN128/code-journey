import java.util.Scanner;

public class EvenCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(Integer.parseInt(String.valueOf(s.charAt(i)))%2==0){
                count++;
            }
        }
        if(count>=3){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}
