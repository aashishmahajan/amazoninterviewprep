package geeksforgeekAmazon2;

public class FindMinPath {

    public static void main(String[] args) {
        int[][] pathMatrix = {{1,2,3},{4,8,2},{1,5,3}};

        findMinPath(pathMatrix);
    }

    private static void findMinPath(int[][] pathMatrix) {

        int[][] solMat = new int[pathMatrix.length][pathMatrix.length];

        solMat[0][0] = pathMatrix[0][0];

        for(int i =1; i < pathMatrix.length; i++){
            solMat[0][i] = pathMatrix[0][i]+ solMat[0][i-1];
        }

        for(int i =1; i < pathMatrix.length; i++){
            solMat[i][0] = pathMatrix[i][0]+ solMat[i-1][0];
        }

        for(int i =1; i <pathMatrix.length; i++){
            for(int j=1; j< pathMatrix.length;j++){
                solMat[i][j] = pathMatrix[i][j] +
                        Math.min( solMat[i-1][j-1] ,
                                Math.min(solMat[i][j-1],solMat[i-1][j]));
            }
        }
        System.out.println(solMat[2][2]);
    }
}
