package javaprg04;
import java.util.Scanner;
public class Nhfpyramid {
	public static void main(String[] args) {
		  Scanner s=new Scanner(System.in);
	    int n,i,j;
      System.out.println("Enter no of Rows:");
      n=s.nextInt();
      s.close();
	    for ( i = 1; i <=n; i++) {
	      for ( j = 1; j <= i;j++) {
	        System.out.print(j+" ");
	        
	      }
	      System.out.println();
	    }
	  }



}
