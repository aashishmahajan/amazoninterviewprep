package prep1.randomquestions;

import java.util.LinkedHashSet;
import java.util.Set;

/*
 * Input : Set hash_Set = new HashSet();
 *       hash_Set.add("Geeks");
 *       hash_Set.add("For");
 * Output : String arr[] = {"Geeks", "for"}
 * */
public class HashSetTreeSetToStirng {
    public static void main(String[] args) {
        Set<String> set  = new LinkedHashSet<>();
        set.add("asd");
        set.add("dfg");
        set.add("xcv");
        set.add("zxc");
        set.add("bnm");
        set.add("qwer");
        String[] setToString =new String[set.size()];
        int i=0;
        for(String s : set){
            setToString[i] = s;
            i++;
        }
        for(String s : setToString){
            System.out.println(s);
        }
    }
}
