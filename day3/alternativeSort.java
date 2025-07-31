import java.util.Scanner;

public class alternativeSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        int j=n-1,k=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                System.out.print(arr[j--]+" ");
            }
            else{
                System.out.print(arr[k++]+" ");
            }
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
    }
}
