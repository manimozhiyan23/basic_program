import java.util.Scanner;

public class strong {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt(),r,fact=1,sum=0,m=n;;
        while(n>0){
            r=n%10;
            for(int i=1;i<=r;i++){
                fact*=i;
            }
            sum+=fact;
            fact=1;
            n=n/10;
        }
        if(m==sum){
            System.out.println("Strong number");
        }
        else{
            System.out.println("not a strong number");
        }
    }
}
