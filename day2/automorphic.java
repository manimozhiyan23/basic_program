import java.util.Scanner;

public class automorphic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),r,d=1,m=n;
        while(n>0){
            n=n/10;
            d*=10;
        }
        if(m%d==(m*m)%d){
            System.out.println("Automorphic number");
        }
        else{
            System.out.println("not automorphic number");
        }
    }
}
