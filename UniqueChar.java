
import java.util.Scanner;

public class UniqueChar {
    public static  void  main(String[] args){
        Scanner sc=new Scanner(System.in);
//        String input=sc.nextLine().toLowerCase();
        String s=sc.nextLine().toLowerCase();
        String temp=" ";
        for(int i=0;i<s.length();i++){
            if(!temp.contains(Character.toString(s.charAt(i)))){
//                temp=temp+input.charAt(i);
                temp+=s.charAt(i);
            }
        }
        System.out.println(temp);
        sc.close();
    }
}
