//Java Program to print the sum of all the items of the array
public class SumOfArray {
    public static void main(String[] args){
        int[] arr=new int[] {1,2,3,4,5};
        int ans = 0;
        for(int i=0; i<arr.length; i++){
            ans+=arr[i];
        }
    System.out.println("Sum of all Elements in array :"+ans);
    }
}
/*Output:
 * Sum of all Elements in array :15
 */
