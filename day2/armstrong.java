import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),count=0,m=n,r,pow=1,sum=0;
        while(n>0){
            n/=10;
            count++;
        }
        n=m;
        while(n>0){
            r=n%10;
            for(int i=0;i<=count;i++){
                pow*=r;
            }
            sum+=pow;
            pow=1;
            n=n/10;
        }
        if(sum==m){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("not armsyrong");
        }
    }
}
