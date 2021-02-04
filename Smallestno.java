package array;

import java.util.Scanner;
public class Smallestno
{
    public static void main(String[] args) 
    {
        int n1, n2, n3, r, t;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number:");
        n1 = scanner.nextInt();
        System.out.println("Enter Second Number:");
        n2 = scanner.nextInt();
        System.out.println("Enter Third Number:");
        n3 = scanner.nextInt();
        scanner.close();
        
        
        t = n1 < n2 ? n1:n2;
        r = n3 < t ? n3:t;
        System.out.println("Smallest Number is:"+r);
    }
}

