package AmazonPrepGeeks;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
*  given a set of integer, check if they are contiguous*/
public class checkIfArrayIsContinguousInt {
    boolean isContiguous(int[]inp){
        Arrays.sort(inp);
        boolean flag = true;
        for(int i =0; i < inp.length-1; i++){
            if(Math.abs(inp[i+1]- inp[i]) >1 ){
                flag = false;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        checkIfArrayIsContinguousInt c = new checkIfArrayIsContinguousInt();
        int[] inp= new int[]{5, 2, 3, 6, 4, 4, 6, 6};
        int[] inp2= new int[]{10, 14, 10, 12, 12, 13, 15};
        if(c.isContiguous(inp)){
            System.out.println("yes");
        }else{
            System.out.println("No");
        }
        if(c.isContiguous(inp2)){
            System.out.println("yes");
        }else{
            System.out.println("No");
        }

        System.out.println(c.approachTwo(inp2, inp2.length));
        System.out.println(c.nComplexitySol(inp2));
    }



    boolean approachTwo(int[] inp, int length){
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MAX_VALUE;

        for(int i = 0; i < length ; i++){
            maxValue = Math.max(maxValue, inp[i]);
            minValue = Math.min(minValue, inp[i]);
        }

        int conArray = maxValue - minValue +1;

        // if diff greater than length, surely displaced varriables
        if(conArray > length) return false;

        boolean conVisted[] = new boolean[length];

        for (int i = 0; i < length; i++) {
            conVisted[inp[i] - minValue] = true;
        }
        // If any element is not
        // marked, all elements
        // are not contiguous.
        for (int i = 0; i < conArray; i++) {
            if (conVisted[i] == false)
                return false;
        }
        return true;
    }

    boolean nComplexitySol ( int[] inp){
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < inp.length; i ++){
            set.add(inp[i]);
        }

        int count = 0;
        int curEleement = inp[0]-1;

        while(set.contains(curEleement) == true){
            count++;
            curEleement--;
        }
        while(set.contains(curEleement) ==true){
            count++;curEleement++;
        }
        return (count == set.size());
    }
}
