import java.util.*;
public class Factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.printf("Factorial of %d is: %d\n", n, factorial(n));
    }

    static int factorial(int n){
	    if(n==1){
	        return 1;
	    }
	    return n*factorial(n-1);
	}
}
