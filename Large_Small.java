import java.util.Arrays;
import java.util.Scanner;

public class Large_Small {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of integers:");
        int n = sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter an interger"+(i+1)+":");
            arr[i]= sc.nextInt();sc.nextLine();
        }
        Arrays.sort(arr);
        System.out.println("Smaller integer"+arr[0]);
        System.out.println("largest integer"+arr[n-1]);
    }
}
