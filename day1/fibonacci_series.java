import java.util.Scanner;

public class fibonacci_series {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),first=0,last=1;
        for(int i=0;i<n;i++){
            System.out.println(first);
            int temp=first+last;
            first=last;
            last=temp;
        }
        
    }
}
