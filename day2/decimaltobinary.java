import java.util.*;
public class decimaltobinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),r,bi=0,base=1;
        while(n>0){
            r=n%2;
            bi=bi+r*base;
            n=n/2;
            base=base*10;
        }
        System.out.println(bi);
    }
}
