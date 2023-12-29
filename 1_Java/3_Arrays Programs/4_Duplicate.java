//Program to print the duplicate elements of an array
public class DulicateElement{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,2,7,8,8,3};
        logic(arr);
    }
    public static void logic(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
/* Output:
 * 2
 * 3
 * 8
 */
