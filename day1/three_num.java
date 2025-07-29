import java.util.*;
public class three_num{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt(),y=sc.nextInt(),z=sc.nextInt();
        int temp=x>y? x:y;
        int result=temp>z? temp:z;
        System.out.println(result);
    }
}