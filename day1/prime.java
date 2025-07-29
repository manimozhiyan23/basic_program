import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),r,s=0;
        while(n>0){
            r=n%10;
            if(r==2||r==3||r==5||r==7){
                s=s+r;
            }
            n=n/10;
        }
        System.out.println(s);
    }
}
