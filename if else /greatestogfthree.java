import java.util.*;


public class greatestogfthree {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
        System.out.print("first nomber : ");
        int a = sc.nextInt();
        System.out.print("second nomber: ");
          int b = sc.nextInt();
          System.out.print("third third : ");
        int c = sc.nextInt();
         if(a>b && a>c){System.out.println(a);}
 else if(b>a && b>c){System.out.println(b);}
else {System.out.println(c);}
        }
}