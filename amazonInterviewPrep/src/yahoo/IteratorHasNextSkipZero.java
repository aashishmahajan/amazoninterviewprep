package yahoo;

import java.util.LinkedList;
import java.util.List;

public class IteratorHasNextSkipZero {
    static List<Integer> list ;

    IteratorHasNextSkipZero(){
        list= new LinkedList<>();
    }
    static class Iterator{

        boolean hasNext() {
            return list.size() > 0 ? true: false;
        }

        int next(){
            if(hasNext()){
                int i = list.get(0);
                list.remove(0);
                if(i == 0){
                   return next();
                }
                return i;
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        IteratorHasNextSkipZero i = new IteratorHasNextSkipZero();
        list.add(10);
        list.add(0);
        list.add(11);
        list.add(1);
        list.add(4);
        list.add(5);
        list.add(0);
        Iterator it = new Iterator();
        while(it.hasNext()){
            System.out.print( it.next()+" ");
        }
    }
}
