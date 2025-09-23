import java.util.Scanner;

public class binarySearch {
	public static void main(String[] args) {
// 		int[] arr = {1,2,3,4,5,6,7,8,9};
// 		int ele = 8;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		int ele = sc.nextInt();
		int left = 0;
		int right = arr.length-1;

		System.out.println("Element found at index: "+ binarySearch(left,right,arr,ele));
	}

	public static int binarySearch(int left, int right, int[] arr, int ele) {

		if(left>right) {
			return -1;
		}

		int mid = (left+right)/2;

		if(arr[mid] == ele) {
			return mid;
		}
		if(arr[mid]>ele) {
			return binarySearch(left, mid-1, arr, ele);
		} else {
			return binarySearch(mid+1, right, arr, ele);
		}
	}
}

