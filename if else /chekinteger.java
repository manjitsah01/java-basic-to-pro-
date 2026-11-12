import java.util.*;

public class chekinteger {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       double  n = sc.nextDouble();
       int x = (int)n;  // dono ko ek kreke if( n == (int)n )

       if(n -x ==0) System.out.println("is an  integer ");
       else {
        System.out.println(" not an integer ");
       } 
    }
}
// esko ese bhi likh sakty pura short scanner ky bad 
// if(n == (int)n ) sout is integer 
// else not 