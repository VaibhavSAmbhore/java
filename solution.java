import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         int i = scan.nextInt();
         double d = scan.nextDouble();
        // System.out.println("Enter a string is:");
           scan.nextLine();
           
           String s= scan.nextLine();
       //  String s = ("Welcome to HackerRank's java tutorials!");
        // String s= scan.nextLine();
        // String s = (Welcome to HackerRank's java tutorials!);

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        }
        }