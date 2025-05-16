package LoopInJava;

import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
//        int num = 1;  // initialization
//        while ( num < 10){  // Condition
//            System.out.println(num); // actual work
//            num= num+1;   // updating the condition
//        }

        // reverse counting.

//        int count = 500;
//        while(count >= 200){
//            System.out.println(count);
//            count = count -1;
//        }

        Scanner userInput = new Scanner(System.in);
        int i = 0;
        while(i <9){
            int inp = userInput.nextInt();
            System.out.println("The Number is: ");
            i++;
        }

    }
}
