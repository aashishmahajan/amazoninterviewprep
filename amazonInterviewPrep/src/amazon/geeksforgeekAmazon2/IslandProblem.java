package geeksforgeekAmazon2;

public class IslandProblem {
    static int row=5;
    static int col=5;
    
    
    int countIslan(int[][] inp){
        boolean[][] isVisited =new boolean[row][col];
        int count =0;
        for(int i =0; i < row;i++){
            for(int j=0; j < col; j++){
                if(inp[i][j] ==1 && !isVisited[i][j]){
                    dfs(inp, i, j, isVisited);
                    count++;
                }
            }
        }return count;
    }

    private void dfs(int[][] inp, int i, int j, boolean[][] isVisited) {
        int[] rowbr ={-1,-1,0,0,1,1,1};
        int[] colbr ={-1,0,1,-1,1,-1,1};
    }

    public static void main(String[] args) {
        int[][] inp = {{1,1,0,0,0},
                        {0,1,0,0,1},
                        {1,0,0,1,1},
                        {0,0,0,0,0},
                        {1,0,1,0,1}};
    }
}
