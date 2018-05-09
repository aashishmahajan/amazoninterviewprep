package godaddy;

public class TicTacToe {
    int[][] matrix;

    TicTacToe(int n) {
        matrix = new int[n][n];
    }

    public int move(int row, int col, int player){
        matrix[row][col] =player;

        boolean win = true;


        for(int i=0; i <matrix.length; i++){
            if(matrix[row][i] != player){
                win = false;
                break;
            }
        }
        if(win) return player;

        for(int i=0; i <matrix.length; i++){
            if(matrix[i][col] != player){
                win = false;
                break;
            }
        }
        if(win) return player;

        win=true;
        for(int i=0; i<matrix.length; i++){
            if(matrix[i][i] != player){
                win=false;
                break;
            }
        }
        if(win) return player;

        for(int i=0; i<matrix.length; i++){
            if(matrix[i][matrix.length-i-1] != player){
                win=false;
                break;
            }
        }
        if(win) return player;
        return 0;
    }
    public static void main(String[] args) {
        TicTacToe  t = new TicTacToe(3);

        System.out.println(t.move(0,0,1));
        System.out.println(t.move(0,1,2));
        System.out.println(t.move(1,1,1));
        System.out.println(t.move(1,2,2));
        System.out.println(t.move(2,2,1));
        System.out.println(t.move(0,2,2));
    }
}
