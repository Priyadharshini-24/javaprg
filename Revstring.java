package string;
import java.util.Scanner;
public class Revstring {

	public static void main(String[] args) {
		String n,rev="";
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a String:");
		n=input.nextLine();
		int l=n.length();
		for(int i=l-1;i>=0;i--)
		{
			rev=rev+n.charAt(i);
		}
      System.out.println("Reverse String is:"+rev);
      input.close();
	}

}


output:
Enter a String:
Priya Dharshini
Reverse String is:inihsrahD ayirP
