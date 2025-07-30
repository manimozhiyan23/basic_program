import java.util.Scanner;

public class binarytodecimal {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),r,dec=0,base=1;
        while(n>0){
            r=n%10;
            dec=dec+r*base;
            n=n/10;
            base=base*2;
        }
        System.out.println(dec);
    }
}
