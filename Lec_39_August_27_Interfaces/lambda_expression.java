package Lec_39_August_27_Interfaces;

import java.util.Arrays;

interface example{
    void print();
}

interface maths{
    int operation(int a, int b);
}

public class lambda_expression {
    public static void main(String[] args) {
        
        // annonymous class
        example obj1 = new example() {
            public void print(){
                System.out.println("hello");
            }
        };

        // lambda expression
        example obj = () -> System.out.println("hello");

        maths add = (x, y) -> x + y;

        int a = 10, b = 20;
        int sum = add.operation(a, b);

        // lambda expression for multiply
        maths multiply = (x, y) -> x * y;
        multiply.operation(a, b);


        // sort 2-D array using a sigle column
        int[][] arr = {{1,2,3} , {2,4,2} , {4,3,2}};

        // sort on col 1
        Arrays.sort(arr, (a1, a2) -> Integer.compare(a1[1], a2[1]));

        // sort on col 1, if it's equal sort on col 2, if it's equal too, sort on col 0
        Arrays.sort(arr, (a1, a2) -> {
            if(a1[1] != a2[1]){
                return Integer.compare(a1[1], a2[1]);
            }
            else if(a1[2] != a2[2]){
                return Integer.compare(a1[2], a2[2]);
            }
            else{
                return Integer.compare(a1[0], a2[0]);
            }
        });
    }
}
