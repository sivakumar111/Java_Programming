import java.util.*;
public class Identity_matrix{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[][] {{1,0,0}, {0,1,0}, {0,0,1}};
        boolean flag = true;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(i==j&&arr[i][j]!=1){
                    flag=false;
                    break;
                }

                if(i!=j&&arr[i][j]!=0){
                    flag=false;
                    break;
                }
            }
        }
        if(flag){
            System.out.println("The matrix was Identity matrix");
        }else{
            System.out.println("The matrix was not Identity matrix");
        }
        sc.close();
    }
}
/*Output:
 * The matrix was Identity matrix
 */
