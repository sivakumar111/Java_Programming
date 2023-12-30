//Matrix Program
import java.util.*;
public class Matirx{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println("Enter the Inputs :");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}

/*Output:
 * Enter the Inputs :
 * 1 2 3 4 5 6 7 8 9
 * 1 2 3 
 * 4 5 6 
 * 7 8 9 
 */
