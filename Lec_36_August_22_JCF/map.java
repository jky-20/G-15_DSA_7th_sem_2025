package Lec_36_August_22_JCF;

import java.util.HashMap;

public class map {
    public static void main(String[] args) {
        

        HashMap<Integer, String> hmap = new HashMap<>();

        hmap.put(2, "Abc");
        // hmap.remove(1);

        String str = hmap.get(1);
        System.out.println(str);

        hmap.getOrDefault(2, "");

        // traverse on map
        for(var entry : hmap.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        for(int key : hmap.keySet()){
            System.out.println(key + " : " + hmap.get(key));
        }

        for(String val : hmap.values()){
            System.out.println(val);
        }
    }
}
