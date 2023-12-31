//Java Program to display the upper triangular matrix
public class DisplayUpperTriangle {
    public static void main(String[] args){
        int[][] arr = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int row=arr.length;
        int col = arr[0].length;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(i<=j){
                    System.out.print(arr[i][j]+"  ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
/*Output:
 * 1  2  3  
 * 0 5  6
 * 0 0 9
 */
