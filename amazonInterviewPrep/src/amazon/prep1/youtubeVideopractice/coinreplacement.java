package prep1.youtubeVideopractice;

/*
 * without cache, exponential, 2^ number of coins  because it would calculate
 * with cache , quadratic, dp functionality to reduce the look up and calculation
 * */
public class coinreplacement {
    int change(int x, int[] coins){
        int[] cache = new int[x];
        for(int i =1; i < cache.length ;i ++){
            cache[i] = -1;
        }
        return change(x, coins, cache);
    }

    int change(int x, int[]coins, int[]cache){
        int min=x;
        if(x==0) return 0;

        for(int coin : coins){
            if(x-coin>=0){
                int c;
                if(cache[x-coin] != -1){
                    c = cache[x-coin];
                }else{
                    c = change(x-coin, coins, cache);
                    cache[x-coin] = c;
                }
                if(min> c+1){
                    min = c +1;
                }
            }
        }
        return min;
    }
}
