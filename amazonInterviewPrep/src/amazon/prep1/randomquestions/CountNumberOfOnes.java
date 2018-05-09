package prep1.randomquestions;

public class CountNumberOfOnes {
    public static void main(String[] args) {
        int[][] matrix = new int[2][5];
        matrix[0][0] = 1;
        matrix[0][1] = 1;
        matrix[0][2] = 1;
        matrix[0][3] = 1;
        matrix[0][4] = 0;
        matrix[1][0] = 0;
        matrix[1][1] = 1;
        matrix[1][2] = 1;
        matrix[1][3] = 1;
        matrix[1][4] = 1;

        System.out.println(calculateMax(matrix, 2, 5 ));
    }

    private static int calculateMax(int[][] matrix, int row, int col) {
        int[][]countMap = new int[2][2];
        for(int i =0; i < row ; i++){
            int count = 0;
            for(int j =0; j < col ; j++){
                if(matrix[i][j] == 1){
                    count++;
                }
            }
            countMap[i][0] = i;
            countMap[i][1] = count;
        }
        int max =0;
        int maxSum =0;
        for(int i =0; i <row ;i++){
            if(countMap[i][1] > maxSum ){
                maxSum = countMap[i][1];
                max = i;
            }
        }
        return max+1;
    }
}
