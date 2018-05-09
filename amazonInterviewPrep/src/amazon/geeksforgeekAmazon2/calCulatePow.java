package geeksforgeekAmazon2;

public class calCulatePow {
    public static void main(String[] args) {
        System.out.println(pow(5,4));
    }

    private static int pow(int number, int power) {
        if(power ==0){
             return 1;
        }
        int i =1;
        int sum = number;
        while(i < power){
            sum = sum * number;
            i++;
        }
        return sum;
    }
}
