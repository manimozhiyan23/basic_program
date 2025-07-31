import java.util.Scanner;

public class secondHalfReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),i;
        int arr[]=new int[n];
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        if(n%2==0){
            i=n/2;
        }
        else{
            i=n/2+1;
        }
        for(int j=n-1;i<j;i++,j--){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        for(i=0;i<n;i++){
            System.out.print(arr[i]);
        }
    }
}
