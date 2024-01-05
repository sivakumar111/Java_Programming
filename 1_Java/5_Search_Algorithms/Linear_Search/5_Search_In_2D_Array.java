//Search in a 2D Array
import java.util.*;

public class D_Array_Search{
    public static void main(String[] args){
        Scanner sc  = new Scanner (System.in);
        System.out.print("Enter the size of the array :");
        int num=sc.nextInt();
        int[][] arr = new int[num][num];
        for(int i=0; i<num; i++){
            for(int j=0; j<num; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println(Arrays.toString(search(arr,sc)));
    }
    public static int[] search(int[][] arr, Scanner sc){
        System.out.print("Enter the target Value :");
        int num=sc.nextInt();

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[i][j]==num){
                    return new int[]{i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }
}
/*Output:
Enter the size of the array :3
1 2 3 4 5 6 7 8 9 
Enter the target Value :5
Element was found*/
