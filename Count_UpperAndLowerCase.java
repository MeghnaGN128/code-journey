import java.util.Scanner;

public class Count_UpperAndLowerCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        int count1=0;
        int count2=0;
        for(int i=0;i<s.length();i++){
            if(Character.isLowerCase(s.charAt(i))){
               count1++;
            }else if(Character.isUpperCase(s.charAt(i))){
                count2++;
            }
        }
        if(count1 == 0){
            System.out.println("No lowercase");
        }else {
            System.out.println("lowercase="+count1);
        }
        if(count2==0){
            System.out.println("No uppercase");
        }else {
            System.out.println("uppercase="+count2);
        }

    }
}
