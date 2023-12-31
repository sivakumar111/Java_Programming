//Java Program to find the sum of each row and each column of a matrix
public class SummOfRow {
    public static void main(String[] args){
        int[][] arr = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0; i<arr.length; i++){
            int count=0;
            for(int j=0; j<arr[0].length; j++){
                count=count+arr[i][j];
            }
            System.out.println("Sum of "+i+" row :"+count);
        }
    }
}

/*Output:
 * Sum of 0 row :6
 * Sum of 1 row :15
 * Sum of 2 row :24
 */
