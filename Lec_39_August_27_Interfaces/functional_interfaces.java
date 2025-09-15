package Lec_39_August_27_Interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class student implements Comparable<student>{
    String name;
    int marks;
    int rollNo;

    public student(String name, int roll, int marks) {
        this.name = name;
        this.marks = marks;
        this.rollNo = roll;
    }
    public int compareTo(student obj2){
        return Integer.compare(this.marks, obj2.marks);
    }
}

class compareByName implements Comparator<student>{
    public int compare(student s1, student s2){
        return s1.name.compareTo(s2.name);
    }
}

public class functional_interfaces {
    public static void main(String[] args) {
        
        student s1 = new student("abcd", 123, 45);
        student s2 = new student("abas", 126, 71);
        student s3 = new student("dffg", 128, 87);

        List<student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        Collections.sort(list, new compareByName());

        // sort by name using lambda expression
        Collections.sort(list, (obj1, obj2) -> obj2.name.compareTo(obj1.name));

        // sort by roll no
        Collections.sort(list, (obj1, obj2) -> Integer.compare(obj1.rollNo, obj2.rollNo));

    }
}
