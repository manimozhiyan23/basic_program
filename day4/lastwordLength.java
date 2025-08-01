import java.util.Scanner;

public class lastwordLength {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        //int count=0;
        str=" "+str;
        int n=str.length(),count=0;
        for(int i=n-1;str.charAt(i)!=' ';i--){
            count++;
        }
        System.out.println(count);
    }
}
