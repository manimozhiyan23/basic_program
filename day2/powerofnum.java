import java.util.Scanner;

public class powerofnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),result=1;
        for(int i=1;i<=b;i++){
            result*=a;
        }
        System.out.println(result);
    }
}
