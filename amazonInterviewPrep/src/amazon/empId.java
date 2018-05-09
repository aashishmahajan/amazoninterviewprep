package amazon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class empId {
    private String name;
    private int id;
    private float sal;

    empId(String name, int id, float sal) {
        this.name = name;
        this.id = id;
        this.sal = sal;
    }

    public int compareTo(empId e) {
        return -(int) (this.sal - e.sal);
    }

    static class RateByMovie implements Comparator<empId> {
        @Override
        public int compare(empId o1, empId o2) {
            int i = o1.name.compareTo(o2.name);
            if(i==0){
                return o1.compareTo(o2);
            }return i;
        }
    }


    static class rateBySaMovieSal implements Comparator<empId>{
        @Override
        public int compare(empId e1, empId e2){
            return e1.name.compareTo(e2.name);
        }
    }

    public static void main(String[] args) {
        ArrayList<empId> e = new ArrayList<empId>();
        e.add(new  empId("Aashish", 12, 11.50f));
        e.add(new  empId("Aashish", 10, 10.50f));
        e.add(new  empId("Priya", 0, 15.50f));
        e.add(new  empId("shivani", 1, 12.50f));
        e.add(new  empId("sherry", 20, 1.50f));

/*
        Collections.sort(e);
        for(empId esort: e){
            System.out.println(esort.id +" "+ " "+esort.name+" "+esort.sal);
        }
*/

        RateByMovie r = new RateByMovie();
        Collections.sort(e, r);
        for(empId esort: e){
            System.out.println(esort.id +" "+ " "+esort.name+" "+esort.sal);
        }

    }
}
