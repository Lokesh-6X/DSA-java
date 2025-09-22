
import java.util.Scanner;

public class PowerFunction {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.print("Enter the power: ");
        int p = sc.nextInt();
        System.out.println("Power of the given number is: "+power(n,p));
    }
    
    public static int power(int n, int p){
        if(p==0){
            return 1;
        }
        return n*power(n,p-1);
    }
}
