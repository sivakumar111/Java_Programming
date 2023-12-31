public class Speral_Matrix {
    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3, 4},
                       {5, 6, 7, 8},
                       {9, 10, 11, 12},
                       {13, 14, 15, 16}};

        int minrow=0;
        int maxrow=arr.length-1;
        int mincol=0;
        int maxcol=arr[0].length-1;

        int count=0;
        int size=arr.length*4;

        while(count<size){
            //Print left part
            for(int i=minrow, j=mincol; i<=maxrow; i++){
                System.out.print(arr[i][j]+" ");
                count++;
            }
            mincol++;

            //Print bottom 
            for(int i=mincol, j=maxrow; i<=maxcol; i++){
                System.out.print(arr[j][i]+" ");
                count++;
            }
            maxrow--;

            //Print rigth
            for(int i=maxrow, j=maxcol; i>=minrow; i--){
                System.out.print(arr[i][j]+" ");
                count++;
            }
            maxcol--;

            //Print Top
            for(int i=maxcol, j=minrow; i>=mincol; i--){
                System.out.print(arr[j][i]+" ");
                count++;
            }
            minrow++;
        }
    }
}
/*Output:
 * 1 5 9 13 14 15 16 12 8 4 3 2 6 10 11 7
 */
