package basicloops;

import java.util.Scanner;

public class araisetopowerb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
int paw =1;
for (int i = 1; i <=b; i++) {
    paw *= a;

    
}
System.out.println( a + " raise to the power " + b + " is " + paw);
    }
}
