import java.util.Scanner;

public class ArmStrong {
  public  static void main(String[] args){
      Scanner sc= new Scanner(System.in);
      String s= sc.nextLine();
      int sum=0;
      for(int i=0;i<s.length();i++){
          sum+=Math.pow(Integer.parseInt(String.valueOf(s.charAt(i))),3);
      }

          if(sum==Integer.parseInt(s)){
              System.out.println("yes,the number is ArmStong number");
      }else {
              System.out.println("No");
          }
  }


}
