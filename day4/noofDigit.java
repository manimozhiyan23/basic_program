import java.util.Scanner;

public class noofDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int count=0;
        char[] ch=str.toCharArray();
        for(int i=0;i<str.length();i++){
            if(ch[i]>='0'&&ch[i]<='9'){
                count++;
            }
        }
        System.out.println(count);
    }
}
