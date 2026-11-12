public class linearsearch {
    public static void main(String[] args){
        int [] arr = {12,13,144,155,6,66,7,8};
        int target = 77;
        boolean flag = false; // false means target array me nhi hai
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == target ){
                flag = true ; // true mean target mai arrays hai
            break;
}}
                
                
              if(flag==true)  System.out.print("targest exist in arrays");
            else{
                System.out.print("target not exist");

            }
        }

        
    }

