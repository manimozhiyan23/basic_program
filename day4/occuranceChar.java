import java.util.Scanner;

public class occuranceChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char[] ch=str.toCharArray();
        int n=ch.length;
        int freq[]=new int[256];

        for(int i=0;i<n;i++){
            freq[ch[i]]++;
        }

        for(int j=0;j<n;j++){
            for(int i=0;i<256;i++){
                if(freq[i]>0 && ch[j]==i){
                    System.out.println(ch[j]+"-"+freq[i]);
                    freq[i]=0;
                }
            }
        }
    }
}
