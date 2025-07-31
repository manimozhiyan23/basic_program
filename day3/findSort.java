import java.util.Scanner;

public class findSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int as=0,ds=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                as=1;
            }
            else{
                ds=1;
            }
        }
        if(as==0){
            System.out.println("Ascending");
        }
        else if(ds==0){
            System.out.println("Descending");
        }
        else{
            System.out.println("unsort");
        }
    }
}
