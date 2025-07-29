import java.util.Scanner;

public class count_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        System.out.println(count);
    }
}
