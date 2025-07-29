import java.util.Scanner;

public class two_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt(),y=sc.nextInt();
        int result=x>y? x:y;
        System.out.println(result);
    }
}
