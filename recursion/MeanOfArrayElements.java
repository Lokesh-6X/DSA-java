import java.util.Scanner;

public class MeanOfArrayElements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.printf("Mean of given array elements is: %d\n",mean(arr, n)/n);
    }
    
    public static int mean(int arr[], int n){
        if(n==0){
            return 0;
        }
        return arr[n-1]+mean(arr, n-1);
    }
}
