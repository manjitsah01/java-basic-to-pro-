 import java.util.*;

public class profitloss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("inter cost price : "  );
        int n = sc.nextInt();
        System.out.println("inter selling price : ");
        int s = sc.nextInt();
        if(s> n) {System.out.println("profit  is "+ (s-n) );
     
        } else if (s==n) {System.out.println(" no profit no loss " + (s-n)); 
            
    }else {      System.out.println("loss is " + (s-n) );}

    
}}
