//Program to print the elements of an array present on even position
public class Even_Position {
    public static void main(String[] args){
        String[] arr = new String[] {"a","b","c","d","e","f","g"};
        for(int i=0; i<arr.length; i++){
            if((i+1)%2==0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
/*Output:
 * b d f 
 */
