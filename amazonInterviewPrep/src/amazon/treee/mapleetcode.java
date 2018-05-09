package treee;

import java.util.LinkedHashMap;
import java.util.Map;

public class mapleetcode {
    Map<String , Integer> records ;

    mapleetcode(){
        records = new LinkedHashMap<>();
    }

    void insert(String key, int val){
        if(records.containsKey(key)){
            records.put(key, val);
        }else{
            records.put(key, val);
        }
    }

    int sum(String prefix){
        int preLen = prefix.length();
        int sum = 0;
        for(String key: records.keySet()){
            if(key.substring(0,preLen).equals(prefix)){
                sum +=records.get(key);
            }
        }
        return sum;
    }
}
