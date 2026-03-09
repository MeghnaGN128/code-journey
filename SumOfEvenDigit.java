import java.util.Scanner;
public class SumOfEvenDigit {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();         
        int sum=0;  
        for(int i=0; i<s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                int n = Integer.parseInt(Character.toString(s.charAt(i)));
                if(n%2==0){
                    sum += n;
                }
            }
        }
        System.out.println(sum);
        sc.close();
}
}
