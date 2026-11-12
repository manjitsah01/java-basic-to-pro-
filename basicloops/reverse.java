package basicloops;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number : ");
int n = sc.nextInt();
int original = n ;

int rev = 0;
while(n!=0){
    rev*=10;
    rev+= (n%10);
    n/=10;
}
int sum = original  + rev;

System.out.println(" reverse number "+rev);
System.out.println("sum of original and reverse " + sum );
    }
}
