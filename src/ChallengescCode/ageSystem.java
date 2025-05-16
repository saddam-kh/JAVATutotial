package ChallengescCode;

import java.util.Scanner;

public class ageSystem {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome to Age calculator");
        System.out.print("Please enter your age: ");
        int age = userInput.nextInt();

        if (age>=60){
            System.out.println("You are senior citizen");
        } else if (age<60 & age>19)
        //

        {
            System.out.println("You are Adult");
        } else if ( age>=13 & age <20) {
            System.out.println("You are teen");
        }else {
            System.out.println("You are Child");
        }
    }
}
