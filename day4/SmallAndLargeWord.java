import java.util.Scanner;

public class SmallAndLargeWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine(),word="",small="",large="";
        String[] words=new String[50];
        str=str+" ";
        int index=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                word+=str.charAt(i);
            }
            else{
                words[index++]=word;
                word="";
            }
        }
        small=large=words[0];
        for(int i=1;i<index;i++){
            if(small.length()>words[i].length()){
                small=words[i];
            }
            if(large.length()<words[i].length()){
                large=words[i];
            }
            
           
        }
         System.out.println("small  "+small);
            System.out.println("large  "+large);
    }
}
