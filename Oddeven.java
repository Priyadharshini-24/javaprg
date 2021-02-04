package array;
import java.util.Scanner;
public class Oddeven {
	



	    public static void main(String[] args) {

	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int n = s.nextInt();
	       s.close();
	        if(n % 2 == 0)
	            System.out.println(n + " is even");
	        else
	            System.out.println(n + " is odd");
	    }
	}


