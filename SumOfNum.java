import java.util.Scanner;

public class SumOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         String s = sc.nextLine();
        int sum=0,n=0;
    //    String s="123njh678hdgdvve78eg";
         
        for(int i=0; i<s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                n = n*10 +Integer.parseInt(Character.toString(s.charAt(i)));
            } else {
                sum += n;
                n = 0;
            }
        }
        sum += n; 
        System.out.println(sum);
        sc.close();
    }
}   