package prep1.ArrayList;

public class basics {
    static int[][]convertMatrixToArray(int[][] inp,int n, int m, int row, int col){
        if(inp ==null || row*col ==0){
            System.out.println("Cannot transform the matrix");
            return inp;
        }
        if(n*m != row*col){
            System.out.println("number of input element given and row col cannot fit");
            return inp;
        }else{
            int[][] reshaped = new int[row][col];
            int i = 0;
            int j = 0;
            int inpn = 0;
            int inpC = 0;

            while(i < row){
                while(j < col){
                    if(inpC == m){
                        inpC =0;
                        inpn++;
                    }
                    reshaped[i][j] = inp[inpn][inpC];

                    j++;inpC++;
                    continue;
                }
                i++;
            }
            return reshaped;
        }
    }

    public static void main(String[] args) {
        int[][] inp = new int[2][2];
        for(int i = 0; i <2 ; i ++){
            for( int j=0; j<2; j++){
                inp[i][j] = i+j+2;
            }
        }
        System.out.println(inp);
        System.out.println(convertMatrixToArray(inp,2,2, 2,4));
    }
}
