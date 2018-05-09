package yahoo;

public class SumTwoPrime {
    public static void main(String[] args) {
        int i= 33274;
        fintwoPrime(i);
    }

    private static void fintwoPrime(int n) {
        boolean[] isPrime = new boolean[n+1];
        genPrimes(n, isPrime);
        for(int i =2; i <= n;i++){
            if(isPrime[i] && isPrime[n-i]){
                System.out.println(i +" "+(n-i));
                return;
            }
        }
    }

    private static boolean genPrimes(int n, boolean[] isPrime) {
        isPrime[0] = false;
        isPrime[1] = false;
        for(int i=2; i <= n; i++ ){
            isPrime[i] = true;
        }

        for(int i =2; i * i <= n; i ++){
            if(isPrime[i]){
                for(int j = 2 * i; j<=n; j+= i) {
                    isPrime[j] = false;
                }
            }
        }
        return false;
    }
}
