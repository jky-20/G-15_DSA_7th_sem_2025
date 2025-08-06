package Lec_28_JCF;

class G15{
    String name;
    int roll;
    static int total_students;
    G15(){
        total_students++;
    }
}
public class strings {
    public static void main(String[] args) {
        
        System.out.println(G15.total_students);

        G15 s1 = new G15();
        System.out.println(s1.total_students);

        String a = "Jai";   // creates in string pool
        String b = "Jai";   // creates in string pool

        if(a == b){ // compares the value in ref var (basically address)
            System.out.println("Same address");
        }

        String c = new String("Jai");   // new memory is allocated
        String d = new String("Jai");   // new memory is allocated
        
        if(c == d){
            System.out.println("Same address");
        }
        else{
            System.out.println("New address is allocated");
        }

        String str = "abc";
        str = str.concat("def");
        System.out.println(str);

        // convert string to string builder
        StringBuilder sb = new StringBuilder(str);
    }
}
