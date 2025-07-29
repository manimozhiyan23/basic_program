import java.util.Scanner;

public class sum_even_till_singledigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),r,sum=0;
        while(n>0||sum>9){
            if(n==0){
                n=sum;
                sum=0;
            }
            r=n%10;
            if(r%2==0){
                sum=sum+r;
            }
            n=n/10;
        }
        System.out.println(sum);
    }
}
