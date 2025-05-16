package BitwiseOperator;

import java.util.Scanner;

public class AndOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing Bitwise Operator");
        System.out.print("Enter the Frist Number: ");
        int firstNumb = input.nextInt();
        System.out.print("Enter the Second Number");
        int secondNumb = input.nextInt();

        int result = firstNumb & secondNumb;
        System.out.println("Result is: " + result);


    }
}
