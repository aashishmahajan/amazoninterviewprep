package prep1.youtubeVideopractice;

public class knapsack {
    knapsack(int weight, int[]wt, int[]val){
        /*validate, if lengths are equal,
        * validate, non -negative
        * */
        knapsack(weight, wt, val, 0);
    }

    int knapsack(int wt, int[]weta, int[]val, int inx){
        if(inx >= weta.length) return 0;
        if(wt -weta[inx] < 0){
            knapsack(wt, weta, val, inx+1);
        }
        return Math.max(knapsack(wt-weta[inx], weta, val, inx+1) + val[inx],
                knapsack(wt, weta, val, inx+1));
    }

    /* 2^n is the time complexity, we can have cache or dp
     to be implemented for better solution*/
}
