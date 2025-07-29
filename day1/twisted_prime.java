import java.util.Scanner;

public class twisted_prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(isPrime(n)){
            int rev=reverse(n);
            if(isPrime(rev)){
                System.out.println("prime number");
            }
            else{
                System.out.println("not a prime");
            }
        }
    }
        
    
    public static int reverse(int a){
        int r,s=0;
        while(a>0){
            r=a%10;
            s=s*10+r;
            a=a/10;
        }
        return s;
    }

    public static boolean isPrime(int m){
        for(int i=2;i<m;i++){
            if(m%i==0){
                return false;
            }
        }
        return true;
    }
}

