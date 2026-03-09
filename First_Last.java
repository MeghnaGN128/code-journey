import java.util.Scanner;

public class First_Last {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine().toLowerCase();
        String[] str = s.split(" ");
        int count = 0;
        for(int i=0;i< str.length;i++)
        {
            if(str[i].charAt(0)==str[i].charAt(str[i].length()-1)){
                count++;
            }
        }
        if(count>0){
            System.out.println(count);
        }else {
            System.out.println("Word not found");
        }
    }
}
