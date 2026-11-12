package basicloops;

import java.util.Scanner;

public class ntoone {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("inter nomber : ");
        int n = sc.nextInt();

        for (int i =n; i>=1; i--) {
           System.out.println(i); 
        }
    }
}
