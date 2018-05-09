package prep1.youtubeVideopractice;

/*
 * given a list of array from 1 <=i<=n ,
 * find the duplicates,
 *
 *  way, iterate for the array, add to hashset, compare size,
 *  u ill get to know, but or to keep a track if exist, remove and then add,
 *
 *  second approch, except the index itself, do index on over subArray
 *  i compare with i+1, length
 *
 *  third : sort and compare adjacent value
 *
 *  fourth:
 *
 *  */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class findDuplicates {
    static List<Integer> findDups(int[] inp) {
        Set<Integer> dups = new HashSet<>();
        for(int i = 0; i < inp.length; i++){

            // set the index :
            int index = Math.abs(inp[i])- 1 ;

            // check if the index value is <0 if yes, add to set else, negative the index value
            if(inp[index] < 0 ){
                dups.add(Math.abs(inp[i]));
            } else {
                inp[index] = -inp[index];
            }
        }
        return new ArrayList(dups);
    }
    public static void main(String[] args) {
        int[] inp ={2,1,2,1};
        System.out.println(findDups(inp));
    }
}
