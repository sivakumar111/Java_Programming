//Java Program to add two matrices
import java.util.*;
public class AddTwoMatrix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] arr1 = new int[3][3];
        System.out.println("Enter the First Inputs matrix :");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                arr1[i][j]=sc.nextInt();
            }
        }

        int[][] arr2 = new int[3][3];
        System.out.println("Enter the second Inputs matrix :");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                arr2[i][j]=sc.nextInt();
            }
        }

        int[][] arr3 = new int[3][3];
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                arr3[i][j]=arr1[i][j]+arr2[i][j];
            }
        }

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(arr3[i][j]+"  ");
            }
            System.out.println();
        }
        sc.close();
    }
}

/*Output:
 * Enter the First Inputs matrix :
 * 1 2 3 4 5 6 7 8 9 
 * Enter the second Inputs matrix :
 * 1 2 3 4 5 6 7 8 9 
 * 2  4  6
 * 8  10  12
 * 14  16  18
 */
