import java.util.*;
public class decimaltooctal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),r,oct=0,base=1;
        while(n>0){
            r=n%8;
            oct=oct+r*base;
            n=n/8;
            base=base*10;
        }
        System.out.println(oct);
    }
}
