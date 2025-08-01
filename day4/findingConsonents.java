import java.util.Scanner;

public class findingConsonents {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int count=0;
        char[] ch=str.toCharArray();
        for(int i=0;i<str.length();i++){
            if(!(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U')){
                count++;
            }
        }
        System.out.println(count);
    }
}
