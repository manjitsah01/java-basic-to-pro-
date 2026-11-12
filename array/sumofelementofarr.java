import java.util.Scanner;

public class sumofelementofarr {
    public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("inter nomber.:");
//     int n = sc.nextInt();
// sum and product 




int [] arr = {-6 ,8 ,14, -2 ,23,47,-7 };
int sum =0;
int mul =1;
for(int i =0 ; i<arr.length; i++){
 sum+=arr[i];
mul *=arr[i];

} System.out.println(sum);
System.out.println(mul);



}
}