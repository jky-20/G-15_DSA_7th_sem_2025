package Lec_38_August_26_Interface;

public class strings {
    public static void main(String[] args) {
        
        String s1 = new String("abc");
        String s2 = new String("abc");
        StringBuilder sb1 = new StringBuilder("abc");
        StringBuilder sb2 = new StringBuilder("abc");
        StringBuffer sb3 = new StringBuffer("abc");

        System.out.println(s1.equals(s2));  // true
        System.out.println(s1 == s2);   // false

        System.out.println(sb1.equals(sb2));    // false
        System.out.println(sb3.equals(sb2));    // false
        System.out.println(s1.equals(sb3));     // false

        System.out.println(s1 instanceof String);   // true
    }
}
