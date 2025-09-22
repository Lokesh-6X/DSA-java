
public class Recursion
{   
    
    public static void main(String[] args){
        display(3);
    }

    static void display(int n){
	    if(n<=0){
	        return;
	    }
        System.out.print(n+" ");
        display(n-1);
        System.out.print(n+" ");
	  
	}
}