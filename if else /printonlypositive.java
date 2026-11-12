import java.util.*;

public class printonlypositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        if (s>= 0) System.out.println(s);
        else{
            System.out.println(-s);
        }
    }
}
