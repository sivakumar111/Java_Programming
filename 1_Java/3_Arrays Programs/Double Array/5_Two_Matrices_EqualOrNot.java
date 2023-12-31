//Java Program to determine whether two matrices are equal
import java.util.*;
public class EqualOrNot{
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

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(arr1[i][j]!=arr2[i][j]){
                    System.out.println("The two matrix are not equal");
                    System.exit(0);
                }
            }
        }
        System.out.println("The two matrix are equal");
        sc.close();
    }
}

/*Output:
 * Enter the First Inputs matrix :
 * 1 2 3 4 5 6 7 8 9
 * Enter the second Inputs matrix :
 * 1 2 3 4 5 6 7 8 9 
 * The two matrix are equal
 */
