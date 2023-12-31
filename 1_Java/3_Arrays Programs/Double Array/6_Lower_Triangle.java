//Java Program to display the lower triangular matrix
public class Display_Lower_Triangle_Matriecs {
    public static void main(String[] args){
        int[][] arr = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int row=arr.length;
        int col = arr[0].length;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(i>=j){
                    System.out.print(arr[i][j]+"  ");
                }else{
                    System.out.print(" 0 ");
                }
            }
            System.out.println();
        }
    }
}
/*1   0  0 
 *4  5   0
 *7  8  9 */

 
