package ChallengescCode;

import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome in the MarkSheet");
        System.out.print("Please enter your Percentage: ");
        float percentage = input.nextFloat();

        if (percentage>=90){
            System.out.println("you got A++");
        } else if (percentage>=75) {
            System.out.println("you got A+");
        } else if (percentage >=60) {
            System.out.println("You got A");
        } else if (percentage <=45) {
            System.out.println("You need to work hard ");
        }

    }
}
