package yahoo;

public class largestPrimeFactor {
    public static void main(String[] args) {
        int num= 9009;
        System.out.println(isPrime(num));
    }

    static long isPrime(int num){
        long maxprime =-1;
        while(num%2 ==0){
            maxprime =2;
            num/=2;
        }
        for( int i =3; i <= Math.sqrt(num); i ++){
            while(num%i==0){
                maxprime =i;
                num/=i;
            }
        }
        if (num>2) {
            return num;
        }

        return maxprime;
    }
}
