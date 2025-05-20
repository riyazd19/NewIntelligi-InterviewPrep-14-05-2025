package org.example.randomProg;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class DuplicateKeyInMap {
    public static void main(String[] args) {
        HashMap<Integer,String> hs= new HashMap<>();
        hs.put(1,"abcd");
        hs.put(2,"abcd");
        hs.put(3,"abcd");
        hs.put(4,"abcd");
        Iterator<Map.Entry<Integer,String>> iterator= hs.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
