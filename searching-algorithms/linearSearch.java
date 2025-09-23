import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
        int pos = -1;

		for(int i=0;i<n;i++){
		    arr[i] = sc.nextInt();
		}

		int ele = sc.nextInt();
		for(int i=0; i<n; i++){
		    if(arr[i] == ele){
		        //System.out.println("Element found at index: "+i);
                //Finding latest postion if there is any duplicate elements
                pos = i;
		    }
		}

        if(pos!=-1){
            System.out.println("Element found at index: "+pos);
        }else{
            System.out.println("Element not found");
        }

	}
}
