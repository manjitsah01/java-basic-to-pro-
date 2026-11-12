package mrthod;

public class returntype {
 public static int manjit (){
    System.out.println("pragati");
    System.out.println("sah");
    return 9;

 }

     public static void main(String[] args) {
        manjit();    //ye krne pe return peint nhi hoga 
       System.out.println(manjit()); //ye krne pe 9 bhi print hoga 
int m = manjit();
System.out.println(5*m);  // esme sab ayega or nomber 5 se multy hoga
// integar jaisa use kr sakty hai
     }
}
