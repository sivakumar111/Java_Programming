public class Sparse_matrix {
    public static void main(String[] args){
        int[][] arr = new int[][] {{1,0,0}, {0,0,2}, {0,0,1}};
        int count=0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j]==0){
                    count++;
                }
            }
        }
        int size= arr.length*arr[0].length;

        if(count>(size/2)){
            System.out.println("The given matrix was Sparse Matrix");
        }else{
            System.out.println("The given matrix was not Sparse Matrix");
        }
    }
}

/*Output:
 * The given matrix was Sparse Matrix
 */
