import java.util.*;

public class tringleornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("first side length ");
        int a = sc.nextInt();
        System.out.println("second size ");
          int b = sc.nextInt();
          System.out.println("third side length ");
        int c = sc.nextInt();
         if(a+b>c && b+c >a && a+c>b){
            System.out.println("it is the traingle");

         } else{
            System.out.println("not a traingle");
         }

         

    }
}
