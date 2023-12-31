import java.util.*;
public class ProductOfMatrix {
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

        int arr3[][] = new int[3][3];
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                for(int k=0; k<3; k++){
                    arr3[i][j]+=arr1[i][k]*arr2[k][j];
                }
            }
        }

        for(int i=0; i<arr3.length; i++){
            for(int j=0; j<arr3[0].length; j++){
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
/*Output:
 * Enter the First Inputs matrix :
 * 1 3 2 3 1 1 1 2 2 
 * Enter the second Inputs matrix :      
 * 2 1 1 1 0 1 1 3 1 
 * 
 * Product of two matriecs :
 * 7 7 6
 * 8 6 5
 * 6 7 5
 */
