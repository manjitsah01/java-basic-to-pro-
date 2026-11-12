public class secondmax {
    public static void main(String[] args){
        int [] arr = { 6,9,78,34,23,};
        int max = Integer.MIN_VALUE;
int smax = Integer.MIN_VALUE;
// CALculate max 
for(int i= 0; i< arr.length; i++){
    if(arr[i]> max) max =arr[i];

}
// calculating 2nd max 
for(int i=0; i<arr.length; i++){
    if(arr[i]>smax && arr[i]!= max)
 smax = arr[i];
}
System.out.println(max);
System.out.println(smax);


    }
}
