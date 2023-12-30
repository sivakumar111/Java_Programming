//Java Program to remove duplicate element in an Array
public class Remove_Dulipcates {
    public static void main(String[] args){
        int[] arr = new int[]  {10,20,20,30,30,40,50,50};
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    arr[j]=-1;
                }
            }
        }
        System.out.println("Remove the duplicate Number :");
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=-1){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
/*Output:
 * Remove the duplicate Number :
    10 20 30 40 50 
 */
