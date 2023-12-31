public class Frequence_Of_Odd_Even {
    public static void main(String[] args){
        int[][] arr = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int[] result = logic(arr);
        System.out.println("Number of even numbers: "+result[0]);
        System.out.println("Number of odd Number :"+result[1]);
    }
    public static int[] logic(int[][] arr){
        int even=0, odd=0;
        int row=arr.length;
        int col = arr[0].length;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(arr[i][j]%2==0){
                    even++;
                }else{
                    odd++;
                }
            }
        }
        return new int[] {even,odd};
    }
}
