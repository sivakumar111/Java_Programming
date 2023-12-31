import java.util.*;
public class JaggedArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row's :");
        int n = sc.nextInt();
        int[][] arr = new int[n][];
        for(int i=0; i<n; i++){
            System.out.println("Enter the size of "+i+" col");
            arr[i]=new int[sc.nextInt()]; //See this input
        }

        System.out.println("Enter the element :");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("This jagged array :");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
/*Output:
 * Enter the number of row's :3
Enter the size of 0 col
1 
Enter the size of 1 col
2
Enter the size of 2 col
3
Enter the element :
1
2 3 
4 5 6
This jagged array :
1
2 3
4 5 6
 */
