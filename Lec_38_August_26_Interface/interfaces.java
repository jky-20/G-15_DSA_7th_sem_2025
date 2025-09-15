package Lec_38_August_26_Interface;

interface example{

    int a = 10;
    // example(){
        // cannot have constructors
    // }
    void print();   // abstract method 
    void display(); 
    default void show(){
        System.out.println("default method");
    }
}

public class interfaces {
    public static void main(String[] args){

        // example obj = new example(); // cannot make objects of interface

        // annonymous class
        example obj = new example() {
            public void display(){}
            public void print(){}
        };
    }
}
