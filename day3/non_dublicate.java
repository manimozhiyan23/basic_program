import java.util.Scanner;

public class non_dublicate {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int freq[]=new int[256];
        for(int i=0;i<n;i++){
            freq[arr[i]]++;
        }
        for(int j=0;j<n-1;j++){
            for(int i=0;i<256;i++){
                if(freq[i]==1 && arr[i]==i){
                    System.out.println(i+"-"+freq[i]);
                    freq[i]=0;
                }
                
            }
        }
    }
}
