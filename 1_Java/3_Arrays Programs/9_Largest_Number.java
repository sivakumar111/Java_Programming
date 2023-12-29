//Program to print the largest element in an array
public class Largest_Element {
    public static void main(String[] args){
        int arr[] = new int[] {25,4,555,45,56,6};
        int max=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
/*Output:
 * 555
 */
