import java.util.Scanner;

public class binarytooctal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),r,dec=0,base=1,oct=0;
        while(n>0){
            r=n%10;
            dec=dec+r*base;
            n=n/10;
            base=base*2;
        }
        n=dec;
        base=1;
        while(n>0){
            r=n%8;
            oct=oct+r*base;
            n=n/8;
            base=base*10;
        }
        System.out.println(oct);
    }
}
