package Lec_36_August_22_JCF;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class sets {
    public static void main(String[] args) {
        
        Set<Integer> hashset = new HashSet<>();
        Set<Integer> linkedSet = new LinkedHashSet<>();
        Set<Integer> treeSet = new TreeSet<>();

        hashset.add(10);
        hashset.add(20);
        hashset.add(13);
        hashset.add(18);
        
        linkedSet.add(10);
        linkedSet.add(20);
        linkedSet.add(13);
        linkedSet.add(18);
        
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(13);
        treeSet.add(18);

        for(int val : hashset){
            System.out.print(val + "  ");
        }
        System.out.println();
        
        for(int val : linkedSet){
            System.out.print(val + "  ");
        }
        System.out.println();

        for(int val : treeSet){
            System.out.print(val + "  ");
        }
        System.out.println();
    }
}
