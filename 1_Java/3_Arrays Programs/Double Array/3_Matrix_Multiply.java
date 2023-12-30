import java.util.*;
public class MultipleTwoMatrix {
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
                for(int k=0; k<3; k++){
                arr3[i][j]+=arr1[i][k]*arr2[k][j];
                }
            }
        }

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(arr3[i][j]+"   ");
            }
            System.out.println();
        }
        sc.close();
    }
}
/*Output:
 * Enter the First Inputs matrix :
 * 1 1 1 2 2 2 3 3 3 
 * Enter the second Inputs matrix :
 * 1 1 1 2 2 2 3 3 3 
 * 6   6   6
 * 12   12   12
 * 18   18   18
 */
