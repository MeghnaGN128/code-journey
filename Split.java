import java.util.Scanner;

public class Split {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n= sc.nextLine();
        String[] data=ExtractElement(n);
        if(data!=null){
            int i=0;
            System.out.println("GSI prefix:"+data[i++]);
            System.out.println("Group identification:"+data[i++]);
            System.out.println("Publisher code:"+data[i++]);
            System.out.println("Item number:"+data[i++]);
            System.out.println("Check digit:"+data[i++]);
        }

    }

    private static String[] ExtractElement(String data) {
        String[] num=data.split("-");
        if(num.length == 5){
            return num;
        }
        return null;
    }
}
